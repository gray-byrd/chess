package games.chess.model;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.stream.IntStream;

@Data
public class Board {
    private int size = 8;
    private ArrayList<ArrayList<PieceEnum>> board;

    public Board() {
        this.board = new ArrayList<>();
        IntStream.range(0,size).forEach(i -> board.add(new ArrayList<>()));
        IntStream.range(0,size*size).forEach(i ->
                board.get(i/size).add(PieceEnum.EMPTY));
        setBoard();
        System.out.println(printBoard());
    }

    public void setBoard() {
        IntStream.range(0,8).forEach(i -> {
            board.get(1).set(i, PieceEnum.BLACK_PAWN);
            board.get(6).set(i, PieceEnum.WHITE_PAWN);
            switch (i) {
                case 0: case 7:
                    board.get(0).set(i, PieceEnum.BLACK_ROOK);
                    board.get(7).set(i, PieceEnum.WHITE_ROOK);
                    break;
                case 1: case 6:
                    board.get(0).set(i, PieceEnum.BLACK_KNIGHT);
                    board.get(7).set(i, PieceEnum.WHITE_KNIGHT);
                    break;
                case 2: case 5:
                    board.get(0).set(i, PieceEnum.BLACK_BISHOP);
                    board.get(7).set(i, PieceEnum.WHITE_BISHOP);
                    break;
                case 3:
                    board.get(0).set(i, PieceEnum.BLACK_QUEEN);
                    board.get(7).set(i, PieceEnum.WHITE_QUEEN);
                    break;
                case 4:
                    board.get(0).set(i, PieceEnum.BLACK_KING);
                    board.get(7).set(i, PieceEnum.WHITE_KING);
                    break;
            }
        });
    }

    public void setSquare(int i, int j, PieceEnum penum) {
        board.get(i).set(j, penum);
    }

    @Override
    public String toString() {
        return "Board{board=" + printBoard() + '}';
    }

    private String printBoard () {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n  --------------------------");
        for (int i = 1; i <= size; i++) {
            stringBuilder.append("\n" + (9 - i) + " |");
            for (int j = 1; j <= size; j++) {
                PieceEnum penum = board.get(i - 1).get(j - 1);
                stringBuilder.append(" ").append(StringUtils.isNotBlank(penum.getUnicode()) ? penum.getUnicode() : ".").append(" ");
            }
            stringBuilder.append("|");
        }
        stringBuilder.append("\n  --------------------------");
        stringBuilder.append("\n    A  B  C  D  E  F  G  H  ");
        return stringBuilder.toString();
    }
}

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
                board.get(i/size).add(PieceEnum.WHITE_PAWN));
        System.out.println(printBoard());
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

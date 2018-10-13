package games.chess.model;

public enum PieceEnum {
    EMPTY(" ", " "),
    WHITE_KING("\u2654", "&#9812"),
    WHITE_QUEEN("\u2655", "&#9813"),
    WHITE_ROOK("\u2656", "&#9814"),
    WHITE_BISHOP("\u2657", "&#9815"),
    WHITE_KNIGHT("\u2658", "&#9816"),
    WHITE_PAWN("\u2659", "&#9817"),
    BLACK_KING("\u265A", "&#9818"),
    BLACK_QUEEN("\u265B", "&#9819"),
    BLACK_ROOK("\u265C", "&#9820"),
    BLACK_BISHOP("\u265D", "&#9821"),
    BLACK_KNIGHT("\u265E", "&#9822"),
    BLACK_PAWN("\u265F", "&#9823");

    private String unicode;
    private String html;

    PieceEnum(String unicode, String html){
        this.unicode = unicode;
        this.html = html;
    }

    public String getUnicode() {
        return unicode;
    }

    public  String getHtml() {
        return html;
    }
}

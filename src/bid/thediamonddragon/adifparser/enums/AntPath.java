package bid.thediamonddragon.adifparser.enums;

public enum AntPath {
    G('G', "grayline"),
    O('O', "other"),
    S('S', "short path"),
    L('L', "long path");

    private char key;
    private String meaning;

    AntPath(char key, String meaning){
        this.key = key;
        this.meaning = meaning;
    }

    public char getKey() {
        return key;
    }

    public String getMeaning() {
        return meaning;
    }
}

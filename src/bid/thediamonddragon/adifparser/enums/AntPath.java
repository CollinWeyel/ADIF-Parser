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

    public static AntPath getByKey(char key){
        for (AntPath antPath : AntPath.values()){
            if (antPath.getKey() == key){
                return antPath;
            }
        }
        return null;
    }

    public static AntPath getByMeaning(String meaning){
        for (AntPath antPath : AntPath.values()){
            if (antPath.getMeaning().equalsIgnoreCase(meaning)){
                return antPath;
            }
        }
        return null;
    }
}

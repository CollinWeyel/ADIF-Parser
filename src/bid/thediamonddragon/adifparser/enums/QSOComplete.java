package bid.thediamonddragon.adifparser.enums;

public enum QSOComplete {

    Y("Y", "yes"),
    N("N", "no"),
    NIL("NIL", "not heard"),
    UNCERTAIN("?", "uncertain");

    private String abbreviation;
    private String meaning;

    QSOComplete(String abbreviation, String meaning){
        this.abbreviation = abbreviation;
        this.meaning = meaning;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getMeaning() {
        return meaning;
    }

    public static QSOComplete getByAbbreviation(String abbreviation){
        for (QSOComplete qsoComplete : QSOComplete.values()){
            if (qsoComplete.getAbbreviation().equalsIgnoreCase(abbreviation)){
                return qsoComplete;
            }
        }
        return null;
    }
}

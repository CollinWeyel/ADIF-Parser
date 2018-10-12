package bid.thediamonddragon.adifparser.enums;

public enum QSLMedium {

    CARD("CARD", "QSO confirmation via paper QSL card"),
    EQSL("EQSL", "QSO confirmation via eQSL.cc"),
    LOTW("LOTW", "QSO confirmation via ARRL Logbook of the World");

    private String medium;
    private String description;

    QSLMedium(String medium, String description){
        this.medium = medium;
        this.description = description;
    }

    public String getMedium() {
        return medium;
    }

    public String getDescription() {
        return description;
    }

    public static QSLMedium getByMedium(String medium){
        for (QSLMedium qslMedium : QSLMedium.values()){
            if (qslMedium.getMedium().equalsIgnoreCase(medium)){
                return qslMedium;
            }
        }
        return null;
    }
}

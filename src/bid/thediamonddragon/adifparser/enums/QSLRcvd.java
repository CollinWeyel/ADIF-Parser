package bid.thediamonddragon.adifparser.enums;

public enum QSLRcvd {

    Y("Y", "yes", "an incoming QSL card has been received"),
    N("N", "no", "an incoming QSL card has not been received"),
    R("R", "requested", "the logging station has requested a QSL card"),
    I("I", "ignore or invalid", null),
    V("V", "verified", "DXCC (award) credit granted");

    private String status;
    private String meaning;
    private String description;

    QSLRcvd(String status, String meaning, String description){
        this.status = status;
        this.meaning = meaning;
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public String getMeaning() {
        return meaning;
    }

    public String getDescription() {
        return description;
    }

    public static QSLRcvd getByStatus(String status){
        for (QSLRcvd qslRcvd : QSLRcvd.values()){
            if (qslRcvd.getStatus().equalsIgnoreCase(status)){
                return qslRcvd;
            }
        }
        return null;
    }

    public static QSLRcvd getByMeaning(String meaning){
        for (QSLRcvd qslRcvd : QSLRcvd.values()){
            if (qslRcvd.getMeaning().equalsIgnoreCase(meaning)){
                return qslRcvd;
            }
        }
        return null;
    }
}

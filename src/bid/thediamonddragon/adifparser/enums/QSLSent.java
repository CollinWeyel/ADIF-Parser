package bid.thediamonddragon.adifparser.enums;

public enum QSLSent {

    Y("Y", "yes", "an outgoing QSL card has been sent"),
    N("N", "no", "do not send an outgoing QSL card"),
    R("R", "requested", "the contacted station has requested a QSL card"),
    Q("Q", "queued", "an outgoing QSL card has been selected to be sent"),
    I("I", "ignore", null);

    private String status;
    private String meaning;
    private String description;

    QSLSent(String status, String meaning, String description){
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

    public static QSLSent getByStatus(String status){
        for (QSLSent qslSent : QSLSent.values()){
            if (qslSent.getStatus().equalsIgnoreCase(status)){
                return qslSent;
            }
        }
        return null;
    }

    public static QSLSent getByMeaning(String meaning){
        for (QSLSent qslSent : QSLSent.values()){
            if (qslSent.getMeaning().equalsIgnoreCase(meaning)){
                return qslSent;
            }
        }
        return null;
    }
}

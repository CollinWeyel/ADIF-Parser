package bid.thediamonddragon.adifparser.enums;

public enum QSLVia {

    B("B", "bureau"),
    D("D", "direct"),
    E("E", "electronic"),
    M("M", "manager");

    private String via;
    private String description;

    QSLVia(String via, String description){
        this.via = via;
        this.description = description;
    }

    public String getVia() {
        return via;
    }

    public String getDescription() {
        return description;
    }

    public static QSLVia getByVia(String via){
        for (QSLVia qslVia : QSLVia.values()){
            if (qslVia.getVia().equalsIgnoreCase(via)){
                return qslVia;
            }
        }
        return null;
    }
}

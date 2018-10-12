package bid.thediamonddragon.adifparser.enums;

public enum PropagationMode {

    AS("AS", "Aircraft Scatter"),
    AUE("AUE", "Aurora-E"),
    AUR("AUR", "Aurora"),
    BS("BS", " Back scatter"),
    ECH("ECH", "EchoLink"),
    EMW("EME", "Earth-Moon-Earth"),
    ES("ES", "Sporadic E"),
    F2("F2", "F2 Reflection"),
    FAI("FAI", "Field Aligned Irredularities"),
    INTERNET("INTERNET", "Internet-assisted"),
    ION("ION", "Ionoscatter"),
    IRL("IRL", "IRLP"),
    MS("MS", "Meteor scatter"),
    RPT("RPT", "Terrestrial or atmospheric repeater or transponder"),
    RS("RS", "Rain scatter"),
    SAT("SAT", "Satellite"),
    TEP("TEP", "Trans-equatorial"),
    TR("TR", "Tropospheric ducting");

    private String code;
    private String description;

    PropagationMode(String code, String description){
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static PropagationMode getByCode(String code){
        for (PropagationMode propagationMode : PropagationMode.values()){
            if (propagationMode.getCode().equalsIgnoreCase(code)){
                return propagationMode;
            }
        }
        return null;
    }
}

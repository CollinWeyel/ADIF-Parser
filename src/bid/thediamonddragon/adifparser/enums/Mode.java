package bid.thediamonddragon.adifparser.enums;

public enum Mode {

    AM("AM"),
    ARDOP("ARDOP"),
    ATV("ATV"),
    C4FM("C4FM"),
    CHIP("CHIP"),
    CLO("CLO"),
    CONTESTI("CONTESTI"),
    CW("CW"),
    DIGITALVOICE("DIGITALVOICE"),
    DOMINO("DOMINO"),
    DSTAR("DSTAR"),
    FAX("FAX"),
    FM("FM"),
    FSK441("FSK441"),
    FT8("FT8"),
    HELL("HELL"),
    ISCAT("ISCAT"),
    JT4("JT4"),
    JT6M("JT6M"),
    JT9("JT9"),
    JT44("JT44"),
    JT65("JT65"),
    MFSK("MSFK"),
    MSK144("MSK144"),
    MT63("MT63"),
    OLIVIA("OLIVIA"),
    OPERA("OPERA"),
    PAC("PAC"),
    PAX("PAX"),
    PKT("PKT"),
    PSK("PSK"),
    PSK2K("PSK2K"),
    Q15("Q15"),
    QRA64("QRA64"),
    ROS("ROS"),
    RTTY("RTTY"),
    RTTYM("RTTYM"),
    SSB("SSB"),
    SSTV("SSTV"),
    T10("T10"),
    THOR("THOR"),
    THRB("THRB"),
    TOR("TOR"),
    V4("V4"),
    VOI("VOI"),
    WINMOR("WINMOR"),
    WSPR("WSPR");

    private String name;

    Mode(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Mode getByName(String name){
        for (Mode mode : Mode.values()){
            if (mode.getName().equalsIgnoreCase(name)){
                return mode;
            }
        }
        return null;
    }
}

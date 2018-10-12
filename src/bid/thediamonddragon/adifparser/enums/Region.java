package bid.thediamonddragon.adifparser.enums;

public enum Region {

    //TODO: replace numbers with dxcc entity code objects
    NONE(-1, "Not within a WAE or CQ region that is within a DXCC entity", null),
    IV(206, "ITU Vienna", "4U1V"),
    AI(248, "African Italy", "IG9"),
    SY(248, "Sicily", "IT9"),
    BI(259, "Bear Island", "JW/B"),
    SI(279, "Shetland Islands", "GM/S"),
    KO(296, "Kosovo", "Z6"),
    ET(390, "European Turkey", "TA1");

    private int dxcc;
    private String region;
    private String prefix;

    Region(int dxcc, String region, String prefix){
        this.dxcc = dxcc;
        this.region = region;
        this.prefix = prefix;
    }

    public int getDxcc() {
        return dxcc;
    }

    public String getRegion() {
        return region;
    }

    public String getPrefix() {
        return prefix;
    }

    public static Region getByDXCC(int dxcc){
        for (Region region : Region.values()){
            if (region.getDxcc() == dxcc){
                return region;
            }
        }
        return null;
    }

    public static Region getByPrefix(String prefix){
        for (Region region : Region.values()){
            if (region.getPrefix().equalsIgnoreCase(prefix)){
                return region;
            }
        }
        return null;
    }
}

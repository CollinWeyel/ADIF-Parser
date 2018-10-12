package bid.thediamonddragon.adifparser.enums;

public enum DXCCEntityCode {
    //TODO: Add remaining codes
    NULL(0, "None"),
    ONE(1, "CANADA"),
    TWO(2, "ABU AIL IS."),
    THREE(3, "AFGHANISTAN"),
    FOUR(4, "AGALEGA & ST. BRANDON IS."),
    FIVE(5, "ALAND IS."),
    SIX(6, "ALASKA"),
    SEVEN(7, "ALBANIA"),
    EIGHT(8, "ALDABRA"),
    NINE(9, "AMERICAN SAMOA"),
    TEN(10, "AMSTERDAM & ST. PAUL IS."),
    ELEVEN(11, "ANDAMAN & NICOBAR IS."),
    TWELVE(12, "ANGUILLA"),
    THIRTEEN(13, "ANTARCTICA"),
    FOURTEEN(14, "ARMENIA"),
    FIVETEEN(15, "ASIATIC RUSSIA"),
    SIXTEEN(16, "NEW ZEALAND SUBANTARCTIC ISLANDS"),
    SEVENTEEN(17, "AVES I."),
    EIGHTTEEN(18, "AZERBAIJAN"),
    NINETEEN(19, "BAJO NUEVO"),
    TWENTY(20, "BAKER & HOWLAND IS."),
    TWENTYONE(21, "BALEARIC IS."),
    TWENTYTWO(22, "PALAU"),
    TWENTYTHREE(23, "BLENHEIM REEF"),
    TWENTYFOUR(24, "BOUVET"),
    TWENTYFIVE(25, "BRITISH NORTH BORNEO"),
    TWENTYSIX(26, "BRITISH SOMALILAND"),
    TWENTYSEVEN(27, "BELARUS"),
    TWENTYEIGHT(28, "CANAL ZONE"),
    TWENTYNINE(29, "CANARY IS.");

    private int code;
    private String name;

    DXCCEntityCode(int code, String name){
        this.code = code;
        this.name= name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static DXCCEntityCode getByCode(int code){
        for (DXCCEntityCode dxccEntityCode : DXCCEntityCode.values()){
            if (dxccEntityCode.getCode() == code){
                return dxccEntityCode;
            }
        }
        return null;
    }

    public static  DXCCEntityCode getByName(String name){
        for (DXCCEntityCode dxccEntityCode : DXCCEntityCode.values()){
            if (dxccEntityCode.getName().equalsIgnoreCase(name)){
                return dxccEntityCode;
            }
        }
        return null;
    }
}

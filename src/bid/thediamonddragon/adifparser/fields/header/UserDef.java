package bid.thediamonddragon.adifparser.fields.header;

import bid.thediamonddragon.adifparser.interfaces.AdifHeader;

public class UserDef implements AdifHeader {

    private final int FIELDNUMBER;
    private final String DATA;

    public UserDef(int number, String data){
        this.FIELDNUMBER = number;
        this.DATA = data;
    }

    @Override
    public String get() {
        return DATA;
    }

    public int getNumber(){
        return FIELDNUMBER;
    }
}

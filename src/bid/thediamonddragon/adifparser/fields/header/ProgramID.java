package bid.thediamonddragon.adifparser.fields.header;

import bid.thediamonddragon.adifparser.interfaces.AdifHeader;

public class ProgramID implements AdifHeader {

    private final String ID;

    public ProgramID(String id){
        this.ID = id;
    }

    public String get(){
        return ID;
    }
}

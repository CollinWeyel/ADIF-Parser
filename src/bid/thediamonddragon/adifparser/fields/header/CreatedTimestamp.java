package bid.thediamonddragon.adifparser.fields.header;

import bid.thediamonddragon.adifparser.interfaces.AdifHeader;

public class CreatedTimestamp implements AdifHeader {

    private final String CREATEDTIMESTAMP;

    public CreatedTimestamp(String createdTimestamp){
        this.CREATEDTIMESTAMP = createdTimestamp;
    }

    public String get() {
        return CREATEDTIMESTAMP;
    }
}

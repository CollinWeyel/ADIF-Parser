package bid.thediamonddragon.adifparser.fields.header;

import bid.thediamonddragon.adifparser.interfaces.AdifHeader;

public class AdifVer implements AdifHeader {

    private final String ADIFVER;

    public AdifVer(String adifVer){
        this.ADIFVER = adifVer;
    }

    public String get() {
        return ADIFVER;
    }
}

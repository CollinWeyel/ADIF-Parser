package bid.thediamonddragon.adifparser.fields.header;

import bid.thediamonddragon.adifparser.interfaces.AdifHeader;

public class ProgramVersion implements AdifHeader {

    private final String VERSION;

    public ProgramVersion(String version){
        this.VERSION = version;
    }

    @Override
    public String get() {
        return VERSION;
    }
}

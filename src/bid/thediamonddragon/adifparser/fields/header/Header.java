package bid.thediamonddragon.adifparser.fields.header;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Header {

    private final AdifVer VERSION;
    private final CreatedTimestamp CREATED;
    private final ProgramID PROGRAMID;
    private final ProgramVersion PROGRAMVERSION;
    private final ArrayList<UserDef> USERDEFS;

    public Header(AdifVer version, CreatedTimestamp created, ProgramID id, ProgramVersion programVersion, UserDef... userDefs){
        this.VERSION = version;
        this.CREATED = created;
        this.PROGRAMID = id;
        this.PROGRAMVERSION = programVersion;
        this.USERDEFS = (ArrayList<UserDef>) Arrays.asList(userDefs);
    }

    public AdifVer getVersion() {
        return VERSION;
    }

    public CreatedTimestamp getCreated() {
        return CREATED;
    }

    public ProgramID getProgramID() {
        return PROGRAMID;
    }

    public ProgramVersion getPprogramVersion() {
        return PROGRAMVERSION;
    }

    public ArrayList<UserDef> getUserDefs() {
        return USERDEFS;
    }
}

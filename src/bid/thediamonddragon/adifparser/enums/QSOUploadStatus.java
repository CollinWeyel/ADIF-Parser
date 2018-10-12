package bid.thediamonddragon.adifparser.enums;

public enum QSOUploadStatus {

    Y("Y", "the QSO has been uploaded to, and accepted by, the online service"),
    N("N", "do not upload the QSO to the online service"),
    M("M", "the QSO has been modified since being uploaded to the online service");

    private String status;
    private String description;

    QSOUploadStatus(String status, String description){
        this.status = status;
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public static QSOUploadStatus getByStatus(String status){
        for (QSOUploadStatus qsoUploadStatus : QSOUploadStatus.values()){
            if (qsoUploadStatus.getStatus().equalsIgnoreCase(status)){
                return qsoUploadStatus;
            }
        }
        return null;
    }
}

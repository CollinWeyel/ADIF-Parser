package bid.thediamonddragon.adifparser.enums;

public enum Band {
    TWOTHAUSANDONEHUNDRETNINETYMETRES("2190m", 0.1357, 0.1378),
    SIXHUNDREDTHIRTYMETRES("630m", 0.472, 0.479),
    FIVEHUNDREDSIXTYMETRES("560m", 0.501, 0.504),
    ONEHUNDREDSIXTYMETRES("160m", 1.8, 2.0),
    EIGHTYMETRES("80m", 3.5, 4.0),
    FOURTYMETRES("40m", 7.0, 7.3),
    THIRTYMETRES("30m", 10.1, 10.15),
    TWENTYMETRES("20m", 14.0, 14.35),
    SEVENTEENMETRES("17m", 18.068, 18.168),
    FIFTEENMETRES("15m", 21.0, 21.45),
    TWELVEMETRES("12m", 24.890, 24.99),
    TENMETRES("10m", 28.0, 29.7),
    SIXMETRES("6m", 50.0, 54.0),
    FOURMETRES("4m", 70.0, 71.0),
    TWOMETRES("2m", 144.0, 148.0),
    ONEPOINTTWOFIVEMETRES("1.25m", 222.0, 225.0),
    SEVENTYCENTYMETRES("70cm", 420.0, 450.0),
    THIRTYTHREECENTIMETRES("33cm", 902.0, 928.0),
    TWNTYTHREECENTIMETRES("23cm", 1240.0, 1300.0),
    NINECENTIMETRES("9cm", 3300.0, 2500.0),
    SIXCENTIMETRES("6cm", 5650, 5925.0),
    THREECENTIMETRES("3cm", 10000.0, 10500.0),
    ONEPOINTTWOFIVECENTIMETRES("1.25cm", 24000.0, 24250.0),
    SIXMILIMETRES("6mm", 47000.0, 47200.0),
    FOURMILIMETRES("4mm", 75500.0, 81000.0),
    TWOPOINTFIVEMILIMETRES("2.5mm", 119980.0, 120020.0),
    TWOMILIMETRES("2mm", 142000.0, 149000.0),
    ONEMILIMETRES("1mm", 241000.0, 250000.0);

    private String name;
    private double lowerFrequency;
    private double upperFrequency;

    Band(String name, double lowerFrequency, double upperFrequency){
        this.name = name;
        this.lowerFrequency = lowerFrequency;
        this.upperFrequency = upperFrequency;
    }

    public String getName() {
        return name;
    }

    public double getLowerFrequency() {
        return lowerFrequency;
    }

    public double getUpperFrequency() {
        return upperFrequency;
    }

    public Band getByName(String name){
        for (Band band : Band.values()){
            if (band.getName().equalsIgnoreCase(name)){
                return band;
            }
        }
        return null;
    }

    public Band getByFrequency(double frequency){
        for (Band band : Band.values()){
            if (frequency >= band.getLowerFrequency() && frequency <= band.getUpperFrequency()){
                return band;
            }
        }
        return null;
    }
}

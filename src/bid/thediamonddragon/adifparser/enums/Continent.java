package bid.thediamonddragon.adifparser.enums;

public enum Continent {

    NA("NA", "North America"),
    SA("SA", "South America"),
    EU("EU", "Europe"),
    AF("AF", "Africa"),
    OC("OC", "Oceana"),
    AS("AS", "Asia"),
    AN("AN", "Antarctica");

    private String abbreviation;
    private String name;

    Continent(String abbreviation, String name){
        this.abbreviation = abbreviation;
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getName() {
        return name;
    }

    public Continent getByAbbreviation(String abbreviation){
        for (Continent continent : Continent.values()){
            if (continent.getAbbreviation().equals(abbreviation)){
                return continent;
            }
        }
        return null;
    }

    public Continent getByName(String name){
        for (Continent continent : Continent.values()){
            if (continent.getName().equalsIgnoreCase(name)){
                return continent;
            }
        }
        return null;
    }
}

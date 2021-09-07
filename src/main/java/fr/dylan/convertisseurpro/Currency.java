package fr.dylan.convertisseurpro;

public enum Currency {
    Euro("euro", "€" ,1),
    Dollar("dollar","$", 0.85),
    Livre("livre","\u00A3", 1.16),
    Yen("yen", "\u00A5" ,0.0077),
    Zloty("zloty","Z", 0.22);


    private String name;
    private String symbol;
    private double euroConversionRate;

    Currency(String name, String symbol, double euroConversionRate){
        this.name = name;
        this.symbol = symbol;
        this.euroConversionRate = euroConversionRate;
    }

    public String getName(){
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getEuroConversionRate() {
        return euroConversionRate;
    }

}

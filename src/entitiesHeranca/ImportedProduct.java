package entitiesHeranca;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct() {

    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public String priceTag() {
        return getName()
                + " $ "
                + String.format("%.2f", totalPrice())
                + " (Customs fee: $ "
                + String.format("%.2f", customsFee)
                + ")";
    }

    private Double totalPrice() {
        return getPrice() + customsFee;
    }

    /**
     * @return the customsFee
     */
    public Double getCustomsFee() {
        return customsFee;
    }

    /**
     * @param customsFee the customsFee to set
     */
    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
}

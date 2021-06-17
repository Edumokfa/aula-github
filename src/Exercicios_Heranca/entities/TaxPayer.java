package Exercicios_Heranca.entities;

public abstract class TaxPayer {

    private String name;
    private Double anualIncome;

    public abstract Double tax();

    public TaxPayer() {

    }

    public TaxPayer(String name, Double anualIncome) {
        this.anualIncome = anualIncome;
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the anualIncome
     */
    public Double getAnualIncome() {
        return anualIncome;
    }

    /**
     * @param anualIncome the anualIncome to set
     */
    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

}

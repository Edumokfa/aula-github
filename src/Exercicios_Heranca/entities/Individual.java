package Exercicios_Heranca.entities;

/**
 *
 * @author P. Godoy
 */
public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual() {

    }

    public Individual(String name, double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        if (healthExpenditures < 20000.00) {
            return getAnualIncome() * 0.15 - healthExpenditures * 0.5;
        } else {
            return getAnualIncome() * 0.25 - healthExpenditures * 0.5;
        }
    }

}

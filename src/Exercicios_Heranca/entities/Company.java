package Exercicios_Heranca.entities;

public class Company extends TaxPayer {

    private int numberOfEmployees;

    public Company() {

    }

    public Company(String name, double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    /**
     * @return the numberOfEmployees
     */
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    /**
     * @param numberOfEmployees the numberOfEmployees to set
     */
    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        if (numberOfEmployees < 10) {
            return 0.16 * getAnualIncome();
        } else {
            return 0.14 * getAnualIncome();
        }

    }

}

package app.Components;


public class BankBean {
    private double principle;
    private int years;
    private String person;


    public String getperson() {
        return person;
    }
    public void setperson(String n) {
        person = n;
    }

    public double getPrinciple() {
        return principle;
    }
    public void setPrinciple(double v) {
        principle = v;
    }

    public int getYears() {
        return years;
    }
    public void setYears(int v) {
        years = v;
    }

    double rate = years > 5 ? 10.5 : 8.5;

    public double getInterest() {
        return principle * rate * years / 100;
    }

    public double gettotal() {
        return getInterest() + principle;
    }
    


}
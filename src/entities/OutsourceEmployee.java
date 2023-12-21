package entities;

//class OutsourceEmployee is a subclass and extendes a class Employee.
public class OutsourceEmployee extends Employee{

    private Double additionalCharge;

    public OutsourceEmployee() {
        super();
    }

    public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    //this method override the method payment of class Employee.
    // returns the super payment + 110% of atribute additionalCharged.
    @Override
    public double payment() {
        return super.payment() + additionalCharge *1.10;
    }

}

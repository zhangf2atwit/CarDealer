package newpackage;


import newpackage.Cars;
import static java.lang.Math.round;

public class VipService extends Cars {

    private double taxRate;
    private double discount;

    VipService() {
        double taxRate = 1.0;
        double discount = 1.0;
    }

    // constructor (thing that builds or instantiates car class)
    VipService(int id, String bra, String mod, String col, int seat, double pri, char n, double taxR, double disco) {
        super(id, bra, mod, col, seat, pri, n);
        this.taxRate = taxR;
        this.discount = disco;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getDiscount() {
        return discount;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double calTax() {

        double dis = this.calDiscount(this.price, this.discount);
        double tax = (this.price - dis) * (this.taxRate * 0.01);
        return Math.round(tax * 100) / 100;
    }

    public double calDiscount(double pri, double disco) {

        if (pri >= 100000) {                          // get VIP rate    
            disco = (this.discount * 0.01) + 0.05;   //  0.005+0.003 = 8%

        } else if (pri >= 80000) {
            disco = (this.discount * 0.01) + 0.03;

        } else if (pri >= 50000) {
            disco = (this.discount * 0.01) + 0.01;

        } else {
            disco = (this.discount * 0.01);
        }
        return pri * disco;
    }

    public double finalPrice() {
        double tax = calTax();
        double dis = calDiscount(this.price, this.discount);
        double fPrice = this.price - dis + tax; // total = price - discount saved + tax (after discount) 

        return Math.round(fPrice * 100) / 100;
    }

    @Override
    public String toString() {
        String message = "------------------------------------------------------\n"
                + "VID Discout:  " + getDiscount() + "% + Price Discount" + " \n" + "Discount saved: $" + calDiscount(this.price, this.discount) + "\n"
                + "-----------------------------------------------------\n"
                + "Tax Rate: " + getTaxRate() + "% \n" + "Pay Tax: $" + calTax() + "\n\n"
                + "Final price: $" + finalPrice() + "\n";

        return message;
    }

}

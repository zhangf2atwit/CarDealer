package newpackage;


public class Cars {

    private int register_id;
    private String brand;
    private String model;
    private String color;
    private int num_seats;
    public double price;
    private char brandNew;

    Cars() {   //default constructor
        register_id = 0;
        brand = "";
        model = "";
        color = "";
        num_seats = 0;
        price = 0.0;
        brandNew = 'y';
    }

// constructor
    Cars(int id, String bra, String mod, String col, int seat, double pri, char n) {
        this.register_id = id;
        this.brand = bra;
        this.model = mod;
        this.color = col;
        this.num_seats = seat;
        this.price = pri;
        this.brandNew = n;
    }

    public void setRegister_id(int register_id) {
        this.register_id = register_id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNum_seats(int num_seats) {
        this.num_seats = num_seats;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBrandNew(char brandNew) {
        this.brandNew = brandNew;
    }

    public int getRegister_id() {
        return register_id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getNum_seats() {
        return num_seats;
    }

    public double getPrice() {
        return price;
    }

    public char getBrandNew() {
        return brandNew;
    }

    @Override
    public String toString() {
        String message = "\nThere is the imformation for Car: \n\n"
                + "Register ID: " + this.register_id + "\n"
                + "Brand: " + this.brand + "\n"
                + "Model: " + this.model + "\n"
                + "Color: " + this.color + "\n"
                + "Price: $" + this.price + "\n"
                + "Number of Seats: " + this.num_seats + "\n"
                + "Brand New: " + this.brandNew + " ('y'for New, 'N' for used.) \n";

        return message;
    }
}

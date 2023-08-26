public class Products {
    private int id;
    private String productName;
    private int price;
    private double kg;

    public Products(int id, String productName, int price, double kg) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.kg = kg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public void printCustomer(Customer newCustomer) {
        System.out.println(newCustomer.getCash() + " " + newCustomer.getName());
    }
}

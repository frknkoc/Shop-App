import java.util.Scanner;

public class Customer {
    private String name;
    private int cash;

    Scanner input = new Scanner(System.in);
    public Customer(String name, int cash) {
        this.name = name;
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void printCustomerInfo(){
        System.out.println("Merhaba " + getName() + " mevcut bakiyen : " + getCash() + " TL'dir.\n");
    }

    public void shop(){
        while(getCash() >= 0 ){
            Products[] products = {new Apple(), new Pear(), new Orange(), new Milk()};
            System.out.println("~~ ÜRÜNLER ~~\n");
            for (Products product: products
            ) {
                System.out.println(product.getId() +"- \t Ürün adı : " +  product.getProductName() + "\t Ürünün Fiyatı : " + product.getPrice() + "/kg");
            }
            System.out.println("5- \t Çıkış Yap");
            double total = 0.0;
            int selectProduct = input.nextInt();
            switch (selectProduct){
                case 1:
                    System.out.println("\nKaç kilo almak istediğiniz giriniz...");
                    int manyKg = input.nextInt();
                    total = manyKg * products[0].getPrice();
                    if (getCash() - total >= 0){
                        System.out.println(manyKg + "kg " + products[0].getProductName() + " aldınız.");
                    } else {
                        System.out.println("Maalesef bakiyen " + getCash() +" olduğu için işlem gerçekleşmedi :(");
                        addCash();
                    }
                    break;
                case 2:
                    System.out.println("\nKaç kilo almak istediğiniz giriniz...");
                    manyKg = input.nextInt();
                    total = manyKg * products[1].getPrice();
                    if (getCash() - total >= 0){
                        System.out.println(manyKg + "kg " + products[1].getProductName() + " aldınız.");
                    } else {
                        System.out.println("Maalesef bakiyen " + getCash() +" olduğu için işlem gerçekleşmedi :(");
                        addCash();
                    }
                    break;
                case 3:
                    System.out.println("\nKaç kilo almak istediğiniz giriniz...");
                    manyKg = input.nextInt();
                    total = manyKg * products[2].getPrice();
                    if (getCash() - total >= 0){
                        System.out.println(manyKg + "kg " + products[2].getProductName() + " aldınız.");
                    } else {
                        System.out.println("Maalesef bakiyen " + getCash() +" olduğu için işlem gerçekleşmedi :(");
                        addCash();
                    }
                    break;
                case 4:
                    System.out.println("\nKaç kilo almak istediğiniz giriniz...");
                    manyKg = input.nextInt();
                    total = manyKg * products[3].getPrice();
                    if (getCash() - total >= 0){
                        System.out.println(this.name + ", " + manyKg + "kg " + products[3].getProductName() + " aldınız.");
                    } else {
                        System.out.println("Maalesef bakiyen " + getCash() +" olduğu için işlem gerçekleşmedi :(");
                        addCash();
                    }
                    break;
                default:
                    System.out.println("Geçerli bir sayı giriniz...");
            }
            cash -= total;
            printCustomerInfo();
        }
    }
    public void addCash(){
        System.out.println("Bakiyenize ne kadar para yüklemek istediğiniz giriniz...");
        int addMoney = input.nextInt();
        this.setCash(cash + addMoney);
    }
}
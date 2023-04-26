package app.product;

public class Product {
    private int id;
    private String name;
    private int price;
    private int kcal;
    public Product(int id, String name, int price, int kcal){
        this.id =id;
        this.name=name;
        this.price=price;
        this.kcal=kcal;
    }
    public Product(String name, int price, int kcal) {
        this.name = name;
        this.price = price;
        this.kcal = kcal;
    }
    // getter setter
    public int getId(){return id;}
    public void  setId(){this.id = id;}
    public String getName(){return name;}
    public void setName(){this.id=id;}
    public int getPrice(){return price;}
    public void setPrice(){this.price=price;}
    public int getKcal(){return kcal;}
    public void setKcal(){this.kcal=kcal;}
}

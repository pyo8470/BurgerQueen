package app.product.subproduct;

import app.product.Product;

public class BurgerSet extends Product {
    // 햄버거 세트에 들어가는 햄버거, 사이드, 음료(포함관계)
    private Hamburger hamburger;
    private Side side;
    private Drink drink;
    public BurgerSet(String name, int price, int kcal,
                     Hamburger hamburger, Side side,Drink drink){
        super(name,price,kcal);
        this.hamburger=hamburger;
        this.side=side;
        this.drink=drink;
    }
    public Hamburger getHamburger(){
        return this.hamburger;
    }
    public Side getSide(){
        return this.side;
    }
    public Drink getDrink(){
        return this.drink;
    }
}

package app;

import app.product.Product;
import app.product.subproduct.Drink;
import app.product.subproduct.Hamburger;
import app.product.subproduct.Side;

public class Menu {
    // 출력해주는 기능 필요.
    // -> 전체 상품에 대한 정보를 가지고 있어야 합니다.
    // 따라서, 전체 상품 정보를 필드로 가지고 있을 필요가 있습니다.
    private Product[] products;
    public Menu(Product[] products){
        this.products=products;
    }
    public void printMenu(){
        System.out.println("[🔻] 메뉴");
        System.out.println("-".repeat(60));

        System.out.println("🍔 햄버거");
        // 햄버거 출력
        printHamburgers(true);
        System.out.println();

        System.out.println("🍟 사이드");
        // 사이드 출력
        printDrinks(true);
        System.out.println();

        System.out.println("🥤 음료");
        // 음료 출력
        printSides(true);
        System.out.println();

        System.out.println();
        System.out.println("🧺 (0) 장바구니");
        System.out.println("📦 (+) 주문하기");
        System.out.println("-".repeat(60));
        System.out.print("[📣] 메뉴를 선택해주세요 : ");
    }

    protected void printSides(boolean printPrice) {
        for(Product product: products){
            if(product instanceof Side){
                printEachMenu(product,printPrice);
            }
        }
    }

    protected void printDrinks(boolean printPrice) {
        for(Product product: products){
            if(product instanceof Drink){
                printEachMenu(product,printPrice);
            }
        }
    }

    protected void printHamburgers(boolean printPrice) {
        for(Product product: products){
            if(product instanceof Hamburger){
                printEachMenu(product,printPrice);
            }
        }
    }

    private static void printEachMenu(Product product,boolean printPrice) {
        if (printPrice)System.out.printf("\t(%d) %s %5dKcal %5d원\n",
                product.getId(), product.getName(), product.getKcal(), product.getPrice());
        else System.out.printf("\t(%d) %s %5dKcal\n",
                product.getId(),product.getName(),product.getKcal());
    }
}

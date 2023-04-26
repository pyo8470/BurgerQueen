package app;

import app.product.Product;
import app.product.ProductRepository;
import java.util.*;

public class OrderApp {
    private ProductRepository productRepository;
    private Menu menu;
    private Cart cart;
    private Order order;
    public OrderApp(ProductRepository productRepository, Menu menu, Cart cart, Order order){
        this.productRepository = productRepository;
        this.menu = menu;
        this.cart = cart;
        this.order = order;
    }
    public void start(){
        Scanner scanner = new Scanner(System.in);
        // 저장소에서 물품 목록을 받아

        System.out.println("\uD83C\uDF54 BurgerQueen Order Service");
        while(true){
            menu.printMenu();
            String input = scanner.nextLine();

            if(input.equals("+")){
                // 주문 내역 출력
                order.makeOrder();
                break;
            }
            else{
                int menuNumber = Integer.parseInt((input));
                if(menuNumber == 0) cart.printCart();
                else if (1<=menuNumber && menuNumber <= productRepository.getProducts().length)
                    cart.addToCart(menuNumber);
            }
        }
    }
}

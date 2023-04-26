package app.product;

import app.product.subproduct.*;

public class ProductRepository {
    // 상품 목록들
    /*
    배열은 동일한 타입의 데이터들만 담을 수 있는데, 배열에 넣을 상품들의 타입이 다르다.
    -> 다형성 사용
    Hamburger, Side, Drink 클래스는 Product 클래스를 상속
        -> Product 클래스가 이들의 상위클래스
        따라서 Hamburger, Side, Drink 인스턴스는 아래와 같이 Product 타입의 변수에 할당 가능
        -> 업캐스팅
     */
    Product[] products={
            new Hamburger(1, "새우버거", 3500, 500, false, 4500),
            new Hamburger(2, "치킨버거", 4000, 600, false, 5000),
            new Side(3, "감자튀김", 1000, 300, 1),
            new Side(4, "어니언링", 1000, 300, 1),
            new Drink(5, "코카콜라", 1000, 200, true),
            new Drink(6, "제로콜라", 1000, 0, true),
    };

    public Product[] getProducts() {
        return products;
    }

    public Product findById(int productId){
        for(Product product : products){
            if(product.getId() == productId) return product;
        }
        return  null;
    }
}

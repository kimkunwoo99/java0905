package chp08.ex8_9;


public class CoffeeTest {
    public static void main(String[] args) {
        Coffee c = new Coffee("아메리카노", 3000); // new 뒤에 점(.) 제거
        System.out.printf("%s(%d원) -> ", c.getName(), c.getPrice());
        c.setPrice(c.getPrice() + 500); // 500원 가격 인상
        System.out.printf("%s(%d원)\n", c.getName(), c.getPrice()); // 괄호 위치 수정 및 서식 지정 문자열 수정
    }
}

class Coffee {
    private String name;
    private int price;

    public Coffee(String n, int p) {
        name = n;
        price = p;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int p) {
        price = p;
    }
}
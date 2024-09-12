package chp08.ex8_2;

public class Drink {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;

    }

    public Drink() { //default 생성자
        System.out.println("Drink constructor 호출");

        System.out.println();
    }
}

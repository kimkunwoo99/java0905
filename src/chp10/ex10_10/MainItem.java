package chp10.ex10_10;

public class MainItem {
    public static void main(String[] args) {
        Item item = new Item("쓸데없이 큰 지팡이",1200);


        System.out.println("아이템명 : " + item.getName());
        System.out.println("가격 : " + item.getPrice());

//        Item item1 = new Item();
//        System.out.println("아이템명 : " + item1.getName());
//        System.out.println("가격 : " + item1.getPrice());

        Item item2 = new Item("BF소드",1300,40);
        System.out.println("아이템명 : " + item2.getName());
        System.out.println("가격 : " + item2.getPrice());
        System.out.println("파워 : " + item2.getPower());
    }
}

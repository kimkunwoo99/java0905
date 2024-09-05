package chp07;

public class MainDog {

    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        d1.setName("레옹");
        d1.setBreeds("말티즈");
        d1.setAge(15);

        d2.setName("그레이");
        d2.setBreeds("골든리트리버");
        d2.setAge(17);

        System.out.printf("d1 => (name: %s,breeds: %s, age:%d)\n", d1.getName(),d1.getBreeds(),d1.getAge());
        System.out.printf("d2 => (name: %s,breeds: %s, age:%d)\n", d2.getName(),d2.getBreeds(),d2.getAge());

        d1.wag();
        d2.wag();

        d1.bark();
        d1.bark(3,"컹컹컹");

        d2.bark();
        d2.bark(3,"컹컹컹");

    }
}

package chp10.ex10_1;

public class RPGGameTest {
    public static void main(String[] args) {
        Wizard w1 = new Wizard();
        w1.name = "간달프";
        w1.hp = 100;
        w1.mp = 80;
        w1.punch();
        w1.fireball();

        Warrior wa1 = new Warrior();
        wa1.name = "아라곤";
        wa1.hp = 170;
        wa1.stamina = 100;
        wa1.punch();
        wa1.slash();
    }
}

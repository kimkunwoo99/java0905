package chp10.ex10_5;

public class MainArcher {
    public static void main(String[] args) {
        Archer archer1 = new Archer();
        MasterArcher ma = new MasterArcher();
        Archer archer2 = new MasterArcher();
        Archer archer3 = (Archer) new MasterArcher();

        archer1.shoot(); // Archer의 shoot()
        ma.shoot(); // Master Archer의 shoot()
        archer2.shoot(); // Master Archer의 shoot()
        archer3.shoot(); // Master Archer의 shoot()

    }
}

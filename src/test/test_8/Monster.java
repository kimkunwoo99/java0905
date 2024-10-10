package test.test_8;

class Monster {
    private String name;
    private int hp;
    private static int maxHp = 30;

    public Monster(String s) {
    this.name = s;
    this.hp = maxHp;
    }

    public String getName() {
        return name;
    }

    public void attack(Monster enemy){
        enemy.hp -= 10;
        System.out.println(this.name + "의 공격 -> " + enemy.name + "의 체력 :" + enemy.hp +"/30");

    }

    public static void battle(Monster a,Monster b){
        while (a.hp > 0 && b.hp > 0){
            Monster attacker = (Math.random() > 0.5) ? a: b;
            Monster defender = (attacker == a) ? b : a;
            attacker.attack(defender);
        }
    }
}
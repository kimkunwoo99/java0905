package chp10.ex10_1;

import chp08.ex8_1.Hero;

public class Warrior extends Novice {
    int stamina;
    void slash(){
        System.out.printf("%s(HP %d, Stamina: %d)의 칼로 베기\n", name, hp,stamina );

    }

}

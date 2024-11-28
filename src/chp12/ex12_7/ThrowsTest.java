package chp12.ex12_7;

import chp12.ex12_7.MyAgeException2;

public class ThrowsTest {

    public void test1() throws MyAgeException2{
        System.out.println("test1() 호출됨.");
        test2();
    }

    public void test2() throws MyAgeException2{
        System.out.println("* test2() 호출됨.");
        throw new MyAgeException2("나이를 잘못 입력했어요.");
    }
}

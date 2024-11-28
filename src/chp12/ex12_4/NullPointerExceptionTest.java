package chp12.ex12_4;

import java.util.ArrayList;

public class NullPointerExceptionTest {
    ArrayList<String> listNames = new ArrayList<String>();

    public void addName(String name) {
        listNames.add(name);
    }

    public void printAllNames() {
        for (String name : listNames) {
            System.out.println(name);
        }
    }
}

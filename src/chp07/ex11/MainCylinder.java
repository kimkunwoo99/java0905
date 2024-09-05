package chp07.ex11;

public class MainCylinder {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.radius = 4;
        c.height = 5;

        System.out.printf("원기둥의 부피는 %.2f\n",c.getVolume());
        System.out.printf("원기둥의 겉넓이는 %.2f\n",c.getSuRfaceArea());

    }
}

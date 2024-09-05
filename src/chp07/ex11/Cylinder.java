package chp07.ex11;

public class Cylinder {
    int radius;
    int height;

    //      원기둥의 부피
    double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    //      원기둥의 겉넓이
    double getSuRfaceArea(){
        double circleArea = Math.PI * Math.pow(radius, 2);
        double rectangleArea = 2 * Math.PI * radius * height;

        return 2 * circleArea + rectangleArea;
    }
}

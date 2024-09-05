package chp07.lab1;

public class MainSquare {
   public static void main(String[] args) {
       square sq1 = new square();
       sq1.setLength(15);
       int result1 = sq1.area();

       square sq2 = new square();
       sq2.setLength(7);
       int result2 = sq2.area();

       System.out.printf("길이가 %d㎝인 정사각형의 면적은 %d㎠ 입니다.\n",sq1.getLength(),result1);
       System.out.printf("길이가 %d㎝인 정사각형의 면적은 %d㎠ 입니다.\n",sq2.getLength(),result2);

   }
}

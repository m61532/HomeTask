package Package_1_3;

import java.util.Scanner;

public class Hometask_1_3 {

    public static void main(String[] args) {
        System.out.println("Введите значия границ [a,b] и шаг h в формате a b h");
        Scanner in1 = new Scanner(System.in);
        String input = in1.nextLine();
        System.out.println(input);
        String[] numbers = input.split(" ");
        double a = Double.parseDouble(numbers[0]);
        double b = Double.parseDouble(numbers[1]);
        double h = Double.parseDouble(numbers[2]);

            for(double i = a; i <= b; i=i+h){
                double y = Math.tan(2*i)-3;
                System.out.println("f(x)="+String.format("%.3f", y)+" x="+String.format("%.3f", i));
            }


    }

}

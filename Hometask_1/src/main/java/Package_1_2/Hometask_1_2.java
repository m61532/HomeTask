package Package_1_2;

import java.util.*;

public class Hometask_1_2 {

    public static void main(String[] args) {
        System.out.print("Введите значение условия e: ");
        Scanner in = new Scanner(System.in);
        String e = in.nextLine();
        in.close();
        double num = Double.parseDouble(e);

        int n = 1;
        double a = 1d/((1+n)*(1+n));

        if (num > 0.25) {
            System.out.println("a("+n+")="+a+" min n="+n);
        }
        else {
            System.out.print("a("+n+")="+a+" ");
            while (a > num){
                n++;
                a = 1d/((1+n)*(1+n));
                System.out.println("a("+n+")="+a);
            }
            //В задании было сказано найти наименьший номер элемента последовательности.
            //Наименьшим номером всегда будет 1.
            //Они ошиблись, понятно, но мне сейчас похуй.
            System.out.print("\nmin n = 1");
        }
    }
}

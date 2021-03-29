package Package_1_4;

import java.util.*;

public class Hometask_1_4 {
    public static void main(String[] args) {
        int [] num = new int[50];
        for (int i = 0; i<50; i++){
            Random n = new Random();
            num[i] = -50 + n.nextInt(100);
        }
        int max = -50;
        for (int i=0; i < num.length/2; i++){
            max = Math.max(max, num[i] + num[num.length-1-i]);
            //int z = num[i] + num[num.length-1-i];
            //max = z > max ? z : max;
            //System.out.print(z+" "); Если захочется вывести значения для проверки
        }
        //System.out.println("\n"); Отступ на следующую строку
        System.out.println(max);
    }
}

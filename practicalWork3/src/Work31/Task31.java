package Work31;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        System.out.print("Введите вес фунтах -> ");
        Scanner weightFt = new Scanner(System.in);
        int ft = weightFt.nextInt();
        double weightKg = ( ft * 0.4535923745);
        int kg = (int)weightKg;
        double gramm = (weightKg %1)*1000;
        System.out.println("ft: " +ft + " = " + "Kg: "+kg + "   gramms: " + (int)gramm);
        System.out.println(weightKg);

    }
}

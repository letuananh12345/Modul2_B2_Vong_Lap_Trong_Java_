package B1_TH_Kiem_Tra_So_Nguyen_To;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra :");
        int num = sc.nextInt();

        if (num < 2) {
            System.out.println(num + " : không phải là số nguyên tố");
        } else {
            int i = 2;
            boolean check = true;
            while (i < num) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check) {
                System.out.println(num + " : là số nguyên tố");
            } else {
                System.out.println(num + " : không phải là số nguyên tố");
            }

        }
    }
}

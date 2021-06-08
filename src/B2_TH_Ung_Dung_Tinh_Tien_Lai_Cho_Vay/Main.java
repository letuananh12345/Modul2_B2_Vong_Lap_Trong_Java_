package B2_TH_Ung_Dung_Tinh_Tien_Lai_Cho_Vay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi :");
        double money = sc.nextDouble();

        int month ;
        do {
            System.out.println("Nhập số tháng gửi :");
            month = sc.nextInt();

        }while (month==0 || month>12);

        System.out.println("Nhập lãi suất :");
        double laiSuat = sc.nextDouble();

        double laiSuatNhanDuoc = 0;
        for (int i =0;i<month;i++){
            laiSuatNhanDuoc+=money * (laiSuat/100)/12 *money;
        }
        System.out.println("Tổng lãi suất nhận được : " + laiSuatNhanDuoc);


    }

}

package B3_TH_Tim_Uoc_Chung_Lon_Nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhập số a");
        int a=sc.nextInt();
        System.out.println("Nhập số b");
        int b=sc.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==0 && b==0){
            System.out.println("không có ucln");
        }else if(a==0 & b !=0) {
            System.out.println("ước chung lớn nhất là : " + b );
        }else if(a!=0 && b==0){
            System.out.println("ước chung lớn nhất là : " + a);
        }else {
            while (a!=b){
                if(a>b) {
//                    System.out.println("ucln là : " + (a-b));
                    a=a-b;
//                    break;
                }else {
//                    System.out.println("ucln là :" + (b-a));
//                    break;
                    b=b-a;
                }
            }
            System.out.println("ucln" + a);
        }

    }

}

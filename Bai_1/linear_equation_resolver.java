package Bai_1;
import java.util.Scanner;
public class linear_equation_resolver {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap a");
    double a = scanner.nextDouble();
    System.out.println("nhap b");
    double b = scanner.nextDouble();
    System.out.println("nhap c");
    double c = scanner.nextDouble();
    if(a !=0){
        double answer = (c-b)/a;
        System.out.println("nghiem la: "+ answer);
    } else {
        if (b==c){
            System.out.println("phuong trinh co vo so nghiem");
        } else {
            System.out.println("phuong trinh vo nghiem");
        }
    }
    scanner.close();
}
}

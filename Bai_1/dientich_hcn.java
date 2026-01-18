package Bai_1;
import java.util.Scanner;
public class dientich_hcn {
public static void main(String[] args) {
    float width;
    float high;
    Scanner scanner = new Scanner(System.in);
    System.out.println("nhap chieu rong: ");
    width = scanner.nextFloat();
    System.out.println("nhap chieu cao");
    high = scanner.nextFloat();
    float area = width*high;
    System.out.println("dien tich la: "+area);
    scanner.close();
}
}

import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, delta, d, e;
        System.out.print("nhap a:");
        a = input.nextInt();
        System.out.print("nhap b:");
        b = input.nextInt();
        System.out.print("nhap c:");
        c = input.nextInt();
        delta = Math.pow(b, 2) - 4 * a * c;
        //d la can bac 2 cua delta
        d = Math.sqrt(delta);
        //e la so lam tron cua delta
        e = (double) Math.round(d * 10) / 10;
        System.out.print(+e);
        if (a == 0) {
            System.out.print("phuong trinh co 1 nghiem duy nhat la:" + (-c / b));
        } else if (a != 0) {
            if (delta < 0) {
                System.out.print("phương trình vô nghiệm");
            } else if (delta == 0) {
                System.out.print("phương trình có nghiệm kép x=" + (-b) / 2 * a);
            } else if (delta > 0) {
                System.out.println("phương trình có 2 nghiệm phân biệt");
                System.out.print("x1=" + (-b + d) / 2 * a);
                System.out.print("x2=" + (-b - d) / 2 * a);
            }
        }
    }
}

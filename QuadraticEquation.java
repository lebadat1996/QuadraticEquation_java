package ptbac2;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public void EnterAbc() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        this.a = scanner.nextDouble();
        System.out.print("Enter b: ");
        this.b = scanner.nextDouble();
        System.out.print("Enter c: ");
        this.c = scanner.nextDouble();
    }

    public double delta() {
        return (this.b * this.b) - 4 * (a * c);
    }

    public void Equation() {
        if (this.a == 0) {
            if (this.b == 0) {
                System.out.println("phuong trinh vo nghiem");
            } else {
                System.out.println("phuong trinh co nghiem x= " + -c / b);
            }
        } else {
            if (delta() < 0) {
                System.out.println("phuong trih vo nghiem");
            }
            if (delta() == 0) {
                System.out.println("phuong trinh co nghiem duy nhat x = " + -b / a);
            }
            if (delta() > 0) {
                System.out.println("phuong trinh co 2 nghiem x1,x2: " +
                        "\nx1 = " + (-b + Math.sqrt(delta())) / 2 * a +
                        "\nx2 = " + (-b - Math.sqrt(delta())) / 2 * a);
            }

        }
    }
}

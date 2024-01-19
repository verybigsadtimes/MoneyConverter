import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dollars = sc.nextDouble();
        System.out.println("Dollars: $" + dollars);

        double quarters = Math.floor(dollars / 0.25);
        double qremainder = dollars % 0.25;
        double dimes = Math.floor(qremainder / 0.10);
        double dremainder = qremainder % 0.10;
        double nickels = Math.floor(dremainder / 0.05);
        double nremainder = dremainder % 0.05;
        double pennies = Math.floor(nremainder / 0.01);

        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);

        double hkdollars = dollars * 7.82;
        System.out.println("HK Dollars: $" + hkdollars);
        double hou = Math.floor(hkdollars / 0.10);
        double hremainder = hkdollars % 0.10;
        double sin = Math.floor(hremainder / 0.01);
        double sremainder = hremainder % 0.01;
        double manh = Math.floor(sremainder / 0.001);

        System.out.println("Hou: " + hou);
        System.out.println("Sin: " + sin);
        System.out.println("Manh: " + manh);
        }
    }
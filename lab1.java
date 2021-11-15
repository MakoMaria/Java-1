import java.util.Scanner;

import static java.io.FileDescriptor.in;

public class lab1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 4 числа:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        int x = 0;
        if (a < b) {
            if (a < c) {
                if (a < d)
                    x = a;
            } else if (b < a) {
                if (b < c)
                    if (b < d)
                        x = b;
            } else if (c < a) {
                if (c < b)
                    if (c < d)
                        x = c;
            } else if (d < b) {
                if (d < c)
                    if (d < a)
                        x = d;
            }
            System.out.println("Наименьшее число:");
            System.out.println(x);
        }
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите кординаты отрезков через пробел: ");
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();

        if (a2 == b1) {                                                                                    //(a1 < a2 &&
            System.out.println("Пересекаются в точке: " + a2);
        } else if (b2 == a1) {                                                                             //(b2 < b1 &&
            System.out.println("Пересекаются в точке: " + b2);

        } else if ((b1 < a2 && b1 < b2) || (a2 < a1 && b2 < a1)) {
            System.out.println("Пересечения нет");

        } else if (a2 <= a1 && b2 < b1) {
            System.out.println("Пересекаются на отрезке с кординатами: " + a1 + ", " + b2);
        } else if (a2 <= a1 && b1 < b2) {
            System.out.println("Пересекаются на отрезке с кординатами: " + a1 + ", " + b1);
        } else if (a1 <= a2 && b2 < b1) {
            System.out.println("Пересекаются на отрезке с кординатами: " + a2 + ", " + b2);
        } else if (a1 <= a2 && b1 < b2) {
            System.out.println("Пересекаются на отрезке с кординатами: " + a2 + ", " + b1);

        } else {                                                                             //if (a1 == a2 && b1 == b2)
            System.out.println("Пересекаются на отрезке с кординатами: " + a1 + ", " + b1);
        }
        scanner.close();
    }
}


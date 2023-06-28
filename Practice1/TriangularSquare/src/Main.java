import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TriangularSquare tisq = new TriangularSquare();
        System.out.print("Введите число n: ");
        int n = new Scanner(System.in).nextInt();

        System.out.println("Произведение треугольника: " + tisq.getTriangular(n));

    }
}



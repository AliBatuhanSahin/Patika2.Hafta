import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        desenMetot(sayi);
    }

    static void desenMetot(int sayi) {
        if (sayi <= 0) {
            System.out.print(sayi + " ");
            return;
        }

        System.out.print(sayi + " ");
        sayi -= 5;
        desenMetot(sayi);

        sayi += 5;
        System.out.print(sayi + " ");
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi <= 1) {
            System.out.println("Lütfen 2 veya daha büyük bir pozitif sayı girin.");
        } else if (asalMi(sayi, 2)) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }
    }

    public static boolean asalMi(int sayi, int bölen) {
        if (sayi <= 2) {
            return (sayi == 2);
        }

        if (sayi % bölen == 0) {
            return false;
        }

        if (bölen * bölen > sayi) {
            return true;
        }

        return asalMi(sayi, bölen + 1);
    }
}
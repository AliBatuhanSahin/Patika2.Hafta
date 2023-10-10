
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin boyutu : ");
        int n = inp.nextInt();
        int[] arrays = new int[n];

        System.out.println("Dizinin elemanlarını giriniz : ");

        for (int i = 0; i < arrays.length; i++) {
            System.out.print((i+1) + " . Elemanı : ");
            arrays[i] = inp.nextInt();
        }
        Arrays.sort(arrays);
        System.out.println(Arrays.toString(arrays));
    }
}
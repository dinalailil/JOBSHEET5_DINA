import java.util.Scanner;
public class PemilihanPercobaan109 {

    public static void main (String[] args) {
        Scanner input09 = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input09.nextInt();
        if (angka > 0 )
            System.out.println("Angka "+angka+" bilangan positif");
        else
            System.out.println("Angka "+angka+" bukan bilangan positif");
    }
}

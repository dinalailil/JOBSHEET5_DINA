import java.util.Scanner;
public class PemilihanPercobaan309 {

    public static void main (String[] args) {
        Scanner input09 = new Scanner(System.in);
        double angkal, angka2, hasil;
        char operator;

        Scanner input09  = new Scanner(System.in);
        System.out.println("Masukkan angka pertama: ");
        angkal = input09.nextDouble();
        System.out.println("Masukkan angka kedua: ");
        angka2 = input09.nextDouble();
        System.out.println("Masukkan operator (+ - * /): ");
        operator = input09.next().charAt(0); 

        switch (operator) {
            case '+':
                hasil = angkal + angka2;
                System.out.println(angkal + " + " + angka2 + "=" + hasil);
                break;
            case '_':
                hasil = angkal - angka2;
                System.out.println(angkal + " _ " + angka2 + "=" + hasil);
            case '*':
                hasil = angkal * angka2;
                System.out.println(angkal + " * " + angka2 + "=" + hasil);
            case '/':
                hasil = angkal / angka2;
                System.out.println(angkal + " / " + angka2 + "=" + hasil);
                break;
        }
    }
}
import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("masukkan angka = ");
        double a = in.nextDouble();
        System.out.println("masukkan Aritmatika+/-/*//");
        char op = in.next().charAt(0);
        System.out.println("masukkan angka kedua = ");
        double b = in.nextDouble();

switch (op) {

    case '+': System.out.println(a + b); break;
    case '-': System.out.println(a - b); break;
    case '*': System.out.println(a * b); break;
    case '/':
    if (b == 0)
        System.out.println("Tidak bisa dibagi nol");
    else
        System.out.println(a / b);
        break;
        default: System.out.println("Operator tidak dikenal");
    }

    in.close();
    }
    
}

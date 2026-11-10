import java.util.Scanner;

public class positif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("angkanya berapa? ");
        int angka = in.nextInt();
        
        if (angka > 0) {
        System.out.println("Positif");
    } else if (angka < 0) {
        System.out.println("Negatif");
    } else {
        System.out.println("Nol");

    }
    in.close();
    }
}

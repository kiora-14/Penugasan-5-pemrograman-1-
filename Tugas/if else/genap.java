import java.util.Scanner;

public class genap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("nilainya berapa? ");
        int nilai= in.nextInt();
        if (nilai >= 10) {
            System.out.println("Genap");
        }else {
            System.out.println("Ganjil");
        }
        in.close();
    }
    
}

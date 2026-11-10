import java.util.Scanner;

public class segitiga {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("masukkan sisi pertama");
        double sisi1 = in.nextDouble();
        System.out.println("masukkan sisi kedua");
        double sisi2 = in.nextDouble();
        System.out.println("masukkan sisi ketiga");
        double sisi3 = in.nextDouble();
         System.out.print("Masukkan sisi ketiga: ");
        
         if (sisi1<= 0 || sisi2<= 0 || sisi3<= 0) {
            System.out.println("Bukan segitiga");
        }
        else if (sisi1 + sisi2<= sisi3 || sisi1 + sisi3 <= sisi2 || sisi2 + sisi3 <= sisi1) {
            System.out.println("Bukan segitiga");
        }
        else if (sisi1 == sisi2 && sisi2 == sisi3) {
            System.out.println("Segitiga sama sisi");
        }
        else if (sisi1 == sisi2 || sisi1 == sisi3 || sisi2 == sisi3) {
            System.out.println("Segitiga sama kaki");
        }
        else {
            System.out.println("Segitiga sembarang");
        }
        in.close();
    }
    
}

import java.util.Scanner;

public class diskon {
    public static void main(String[] args) {
      Scanner  in = new Scanner (System.in);
      System.out.println("total belanjaan : ");
      double total = in.nextDouble();
      

      System.out.println("apakah member?(true/false) ");
      boolean member = in.nextBoolean();
      if (member) {
        total = total - 5000;
    }else {
        total = total +5000;
    }
      System.out.println("total akhir = "+total);
      in.close();
    }
    
}

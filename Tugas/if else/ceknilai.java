import java.util.Scanner;

public class ceknilai {
    public static void main(String[] args) {
        String grade;

        Scanner in = new Scanner(System.in);
        
        System.out.println("berapa nilainya?");
        double total = in.nextDouble();
        String status =
        
        total >= 55 ? "Lulus" : "Tidak lulus";
        
        if (total >= 85){
            grade = "A";
        }else if (total >= 75){
            grade = "B";
        }else if (total >= 60){
            grade = "C";
        } else if (total >=55){
            grade = "D";
        } else if (total >= 45){
            grade = "E";
        } else
            grade = "F";
        System.out.println("Grade nya adalah " + grade);
        System.out.println("Anda dinyatakan " + status);
        in.close();
    }
}

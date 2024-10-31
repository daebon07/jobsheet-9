import java.util.Scanner;
public class arraynilai20 {
    public static void main(String[] args) {
        int [] nilaiakhir= new int [10];
        Scanner sc = new Scanner (System.in); 

        for (int i = 0; i <10; i++){
            System.out.print("masukan nilai akhir ke " + i + " = ");
            nilaiakhir[i] = sc.nextInt ();
        }
        for (int i = 0; i <10; i++){
            System.out.println("nilai akhir ke " + i + " adalah " + nilaiakhir[i]);
            
        }
    }
}

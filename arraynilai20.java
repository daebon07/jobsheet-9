import java.util.Scanner;
public class arraynilai20 {
    public static void main(String[] args) {
        int [] nilaiakhir= new int [10];
        Scanner sc = new Scanner (System.in); 

        for (int i = 0; i <nilaiakhir.length; i++){
            System.out.print("masukan nilai akhir ke " + i + " = ");
            nilaiakhir[i] = sc.nextInt ();
        }
        for (int i = 0; i <10; i++){
           if (nilaiakhir[i]>70 ) {
            System.out.println("mahasiswa ke " + i + " lulus " );
            }
            else  System.out.println("mahasiswa ke " + i + " tidak lulus " );{}
    }
    }
}

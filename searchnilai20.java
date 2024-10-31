import java.util.Scanner;

public class searchnilai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahElemen = sc.nextInt();

        
        int[] arrNilai = new int[jumlahElemen];

        
        System.out.println("Masukkan " + jumlahElemen + " nilai:");
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Nilai ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        int hasil = -1; 
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i; 
                break; 
            }
        }

        
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ditemukan di indeks ke-" + hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan.");
        }
    }
}

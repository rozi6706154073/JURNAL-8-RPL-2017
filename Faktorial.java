
import java.util.Scanner;
public class PiramidaTerbalik {
    public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
        System.out.print("Maukkan Angka: \t");
        int n =input.nextInt();
		
        for (int i = 1; i <= 1; i++) { //untuk menentukan tinggi piramida
            for (int j = 1; j <=i; j++) { //membentuk spasi
                System.out.print(" ");
            }
            for (int k = 9-((i*2)-2); k >= 1; k--) { //mencetak karakter bintang
                System.out.print("*");
            }
            System.out.println(""); //pindah baris
        }
    }
}
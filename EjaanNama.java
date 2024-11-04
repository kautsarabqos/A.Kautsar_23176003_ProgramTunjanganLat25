import java.util.Scanner;

public class EjaanNama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama depan anda untuk di eja: ");
        String nama = scanner.nextLine();
        
        System.out.println("Ejaan untuk \"" + nama + "\" adalah:");
        
        // Mengeja setiap huruf dalam nama
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + ": " + nama.charAt(i));
        }
        
        scanner.close();
    }
}
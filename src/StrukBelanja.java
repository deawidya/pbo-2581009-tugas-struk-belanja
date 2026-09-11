import java.sql.SQLOutput;
import java.util.Scanner;
public class StrukBelanja {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int hargaBuku = 5000;
        int hargaPulpen = 3000;
        int hargaPenghapus = 2000;

        System.out.print("Nama Barang 1 : ");
        String namaBarang1 = scanner.nextLine();
        System.out.print("Jumlah    : ");
        int jumlah1 = scanner.nextInt();

        System.out.print("Nama Barang 2 : ");
        String namaBarang2 = scanner.nextLine();
        System.out.print("Jumlah    : ");
        int jumlah2 = scanner.nextInt();

        System.out.print("Nama Barang 3 : ");
        String namaBarang3 = scanner.nextLine();
        System.out.print("Jumlah    : ");
        int jumlah3 = scanner.nextInt();


    }
}
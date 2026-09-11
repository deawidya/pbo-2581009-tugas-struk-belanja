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
        scanner.nextLine();

        System.out.print("Nama Barang 2 : ");
        String namaBarang2 = scanner.nextLine();
        System.out.print("Jumlah    : ");
        int jumlah2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nama Barang 3 : ");
        String namaBarang3 = scanner.nextLine();
        System.out.print("Jumlah    : ");
        int jumlah3 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Uang di Bayar : ");
        int uangdibayar = scanner.nextInt();

        int subtotal1 = hargaBuku * jumlah1;
        int subtotal2 = hargaPulpen * jumlah2;
        int subtotal3 = hargaPenghapus * jumlah3;

        int totalBelanja = subtotal1 + subtotal2 + subtotal3;
        int kembalian = uangdibayar - totalBelanja;

        System.out.println();
        System.out.println("===== STRUK BELANJA =====");
        System.out.println(namaBarang1 + "   " + jumlah1 + " x " + hargaBuku + "  = " + subtotal1);
        System.out.println(namaBarang2 + "   " + jumlah2 + " x " + hargaPulpen + "  = " + subtotal2);
        System.out.println(namaBarang3 + "   " + jumlah3 + " x " + hargaPenghapus + "  = " + subtotal3);
        System.out.println("-------------------------");
        System.out.println("Total belanja          = " + totalBelanja);
        System.out.println("Uang dibayar           = " + uangdibayar);
        System.out.println("Kembalian              = " + kembalian);
    }
}
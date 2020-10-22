import java.util.Scanner;
public class kuisTeori{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String nama;
		int tipe, pilihan, jumlahMeteran, bayar, beban, kembalian, total;
		
		System.out.println("Tipe Rumah beserta Biaya Bebannya: ");
		System.out.println("Tipe Rumah 31 = Rp. 100.000");
		System.out.println("Tipe Rumah 32 = Rp. 125.000");
		System.out.println("Tipe Rumah 33 = Rp. 450.000");
		System.out.println("Tipe Rumah 34 = Rp. 480.000");
		System.out.println("Tipe Rumah 35 = Rp. 500.000");
		System.out.println("Tipe Rumah 40 = Rp. 550.000");
		System.out.println();
		System.out.print("Masukkan Nama = ");
		nama = input.nextLine();
		System.out.print("Masukkan Tipe Rumah = ");
		tipe = input.nextInt();
		
		System.out.println();
		
		if(tipe == 31){
			beban = 100000;
			System.out.println("Nama = "+nama);
			System.out.println("Biaya Beban = Rp. 100.000");
			System.out.print("Masukkan Jumlah Meteran Pemakaian = ");
			jumlahMeteran = input.nextInt();
			
			total = jumlahMeteran * beban;
			System.out.println("Total Harga = "+total);
			System.out.print("Bayar = ");
			bayar = input.nextInt();
			kembalian = bayar - total;
			System.out.println("Kembalian = "+kembalian);
		}
		else if (tipe == 32){
			beban = 125000;
			System.out.println("Nama = "+nama);
			System.out.println("Biaya Beban = Rp. 125.000");
			System.out.print("Masukkan Jumlah Meteran Pemakaian = ");
			
			jumlahMeteran = input.nextInt();
			total = jumlahMeteran * beban;
			System.out.println("Total Harga = "+total);
			System.out.print("Bayar = ");
			bayar = input.nextInt();
			kembalian = bayar - total;
			System.out.println("Kembalian = "+kembalian);
		}
		else if (tipe == 33){
			beban = 450000;
			System.out.println("Nama = "+nama);
			System.out.println("Biaya Beban = Rp. 450.000");
			System.out.print("Masukkan Jumlah Meteran Pemakaian = ");
			jumlahMeteran = input.nextInt();
			total = jumlahMeteran * beban;
			System.out.println("Total Harga = "+total);
			System.out.print("Bayar = ");
			bayar = input.nextInt();
			kembalian = bayar - total;
			System.out.println("Kembalian = "+kembalian);
		}
		else if (tipe == 34){
			beban = 480000;
			System.out.println("Nama = "+nama);
			System.out.println("Biaya Beban = Rp. 480.000");
			System.out.print("Masukkan Jumlah Meteran Pemakaian = ");
			jumlahMeteran = input.nextInt();
			total = jumlahMeteran * beban;
			System.out.println("Total Harga = "+total);
			System.out.print("Bayar = ");
			bayar = input.nextInt();
			kembalian = bayar - total;
			System.out.println("Kembalian = "+kembalian);
		}
		else if (tipe == 35){
			beban = 500000;
			System.out.println("Nama = "+nama);
			System.out.println("Biaya Beban = Rp. 500.000");
			System.out.print("Masukkan Jumlah Meteran Pemakaian = ");
			jumlahMeteran = input.nextInt();
			total = jumlahMeteran * beban;
			System.out.println("Total Harga = "+total);
			System.out.print("Bayar = ");
			bayar = input.nextInt();
			kembalian = bayar - total;
			System.out.println("Kembalian = "+kembalian);
		}
		else if (tipe == 40){
			beban = 550000;
			System.out.println("Nama = "+nama);
			System.out.println("Biaya Beban = Rp. 550.000");
			System.out.print("Masukkan Jumlah Meteran Pemakaian = ");
			jumlahMeteran = input.nextInt();
			total = jumlahMeteran * beban;
			System.out.println("Total Harga = "+total);
			System.out.print("Bayar = ");
			bayar = input.nextInt();
			kembalian = bayar - total;
			System.out.println("Kembalian = "+kembalian);
		}
		else{
			System.out.println("Silahkan Masukkan Tipe Rumah Dengan Benar!!!");
		}
		
	}
}
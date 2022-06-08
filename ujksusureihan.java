import java.util.*;
class ujksusureihan
{
public static void main(String[] args)
{
String kd, mrk;
int ukr;
long hrg = 0, jml, tot;
Scanner input = new Scanner(System.in);
System.out.println(" Sistem Transaksi Penjualan AGEN SUSU REIHAN");
System.out.println("========================================");
System.out.println("A. Susu Dancow");
System.out.println(" 1. Ukuran Kecil");
System.out.println(" 2. Ukuran Sedang");
System.out.println(" 3. Ukuran Besar");
System.out.println("B. Susu Bendera");
System.out.println(" 1. Ukuran Kecil");
System.out.println(" 2. Ukuran Sedang");
System.out.println(" 3. Ukuran Besar");
System.out.println("C. Susu SGM");
System.out.println(" 1. Ukuran Kecil");
System.out.println(" 2. Ukuran Sedang");
System.out.println(" 3. Ukuran Besar");
System.out.print("Masukin kode susunya kk (Pilih Opsi A,B,C) :");
kd = input.nextLine();
System.out.print("Masukin Ukuran Kaleng susunya kk (Pilih Opsi 1,2,3) :");
ukr = input.nextInt();
if ("A".equals(kd))
{
mrk = "Dancow";
switch (ukr)
{
case 1:
hrg = 15000;
break;
case 2:
hrg = 20000;
break;
case 3:
hrg = 25000;
break;
default:
hrg = 0;
}
}
else if ("B".equals(kd))
{
mrk = "Bendera";
switch (ukr)
{
case 1:
hrg = 13500;
break;
case 2:
hrg = 17500;
break;
case 3:
hrg = 20000;
break;
default:
hrg = 0;
}
}
else if ("C".equals(kd))
{
mrk = "SGM";
switch (ukr)
{
case 1:
hrg = 15000;
break;
case 2:
hrg = 18500;
break;
case 3:
hrg = 22000;
break;
default:
hrg = 0;
}
}
else
{
mrk = "Tidak Ada";
}
System.out.println("Susu :" + mrk);
System.out.println("Harga Satuan Barang :" + hrg);
System.out.print("Jumlah Yang Dibeli :");
jml = input.nextInt();
tot = jml * hrg;
System.out.println("Harga Yang Harus Dibayar Sebesar Rp. " + tot);
}
}
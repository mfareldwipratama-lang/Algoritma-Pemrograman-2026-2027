public class variabel {
    public static void main(String[] args) {
        // Deklarasi variabel sesuai tipe datanya
        String nama           = "Muhammad Al Farel Dwi Pratama";
        String tempatTglLahir = "Surakarta, 15 Agustus 2005";
        String jenisKelamin   = "Laki-laki";
        String alamat         = "Jl. Ir. Sutami No. 36, Surakarta";
        String noHp           = "081234567890";  // String agar angka 0 di depan tidak hilang
        long penghasilan      = 1500000;         // bilangan bulat

        System.out.println("Assalamu’alaikum");
        System.out.println("Izinkan saya memperkenalkan diri");
        System.out.printf("%-25s: %s%n", "Nama Lengkap", nama);
        System.out.printf("%-25s: %s%n", "Tempat & Tanggal Lahir", tempatTglLahir);
        System.out.printf("%-25s: %s%n", "Jenis Kelamin", jenisKelamin);
        System.out.printf("%-25s: %s%n", "Alamat Lengkap", alamat);
        System.out.printf("%-25s: %s%n", "No Hp", noHp);
        System.out.printf("%-25s: Rp %d%n", "Penghasilan Sebulan", penghasilan);
    }
}

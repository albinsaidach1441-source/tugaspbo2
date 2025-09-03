package tugssagresi;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Buku (bisa eksis sendiri)
        Buku buku1 = new Buku("Pemrograman Java", "Budi");
        Buku buku2 = new Buku("Struktur Data", "Ani");
        Buku buku3 = new Buku("Basis Data", "Citra");

        // Menggabungkan buku ke dalam koleksi Perpustakaan
        Buku[] koleksi = {buku1, buku2, buku3};
        Perpustakaan perpus = new Perpustakaan("Perpus Lumajang", koleksi);

        // Menampilkan daftar buku di perpustakaan
        perpus.tampilkanKoleksi();
    }
}

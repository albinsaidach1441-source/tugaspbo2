package tugssagresi;

class Perpustakaan {
    private String nama;
    private Buku[] koleksiBuku;

    public Perpustakaan(String nama, Buku[] koleksiBuku) {
        this.nama = nama;
        this.koleksiBuku = koleksiBuku;
    }

    public void tampilkanKoleksi() {
        System.out.println("Perpustakaan: " + nama);
        System.out.println("Daftar Buku:");
        for (Buku b : koleksiBuku) {
            b.infoBuku();
        }
    }
}

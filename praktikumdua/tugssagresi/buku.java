package tugssagresi;

class Buku {
    private String judul;
    private String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public void infoBuku() {
        System.out.println("Judul: " + judul + ", Penulis: " + penulis);
    }
}

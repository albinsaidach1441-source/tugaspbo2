package studi;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        Student s1 = new Student("s001", "12345", "Fauzi", "MHS1001");
        Librarian l1 = new Librarian("l001", "admin", "Ani", "PGW001");

        Book b1 = new Book("B001", "Pemrograman Java", "Budi Santoso");
        Journal j1 = new Journal("J001", "Riset Kecerdasan Buatan", 3);

        lib.addUser(s1);
        lib.addUser(l1);
        lib.addMaterial(b1);
        lib.addMaterial(j1);

        System.out.println("=== Pengguna di Perpustakaan ===");
        lib.showUsers();

        System.out.println("\n=== Materi di Perpustakaan ===");
        lib.showMaterials();

        BorrowTransaction bt = new BorrowTransaction(s1, b1, new Date(), new Date(System.currentTimeMillis() + 7*24*3600*1000L));
        System.out.println("\n=== Transaksi Peminjaman ===");
        System.out.println(bt);
    }
}

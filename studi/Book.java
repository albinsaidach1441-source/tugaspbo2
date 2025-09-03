package studi;

class Book extends Material {
    private String author;

    public Book(String materialID, String title, String author) {
        super(materialID, title);
        this.author = author;
    }

    public String getAuthor() { return author; }

    @Override
    public String toString() {
        return super.toString() + " (Buku oleh " + author + ")";
    }
}

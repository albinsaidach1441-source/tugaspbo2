package studi;

class Journal extends Material {
    private int volume;

    public Journal(String materialID, String title, int volume) {
        super(materialID, title);
        this.volume = volume;
    }

    public int getVolume() { return volume; }

    @Override
    public String toString() {
        return super.toString() + " (Jurnal Vol." + volume + ")";
    }
}

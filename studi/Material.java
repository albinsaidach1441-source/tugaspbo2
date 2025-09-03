package studi;

class Material {
    private String materialID;
    private String title;

    public Material(String materialID, String title) {
        this.materialID = materialID;
        this.title = title;
    }

    public String getMaterialID() { return materialID; }
    public String getTitle() { return title; }

    @Override
    public String toString() {
        return materialID + " - " + title;
    }
}

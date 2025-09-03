package studi;

class Library {
    private List<Material> materials = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addMaterial(Material m) { materials.add(m); }
    public void addUser(User u) { users.add(u); }

    public void showMaterials() {
        for (Material m : materials) {
            System.out.println(m);
        }
    }

    public void showUsers() {
        for (User u : users) {
            System.out.println(u);
        }
    }
}

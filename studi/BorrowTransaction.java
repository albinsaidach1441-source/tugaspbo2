package studi;

class BorrowTransaction {
    private User user;
    private Material material;
    private Date dueDate;  // dienkapsulasi

    public BorrowTransaction(User user, Material material, Date dueDate) {
        this.user = user;
        this.material = material;
        this.dueDate = dueDate;
    }

    public Date getDueDate() {
        return dueDate; }
    public void setDueDate(Date dueDate) { this.dueDate = dueDate; }

    public void showTransaction() {
        System.out.println("\n=== Borrow Transaction ===");
          System.out.println("User: " + user.getUserID() + " : " + user.getName());
          System.out.println("Material: " + material.getMaterialID()+ " : " + material.getTitle());
          System.out.println("Due on: " + dueDate);
    }
}

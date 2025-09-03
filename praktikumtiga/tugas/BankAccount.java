package tugas;

class BankAccount {
    // Enkapsulasi: data sensitif dibuat private
    private String accountNumber;
    private String pin;
    private double balance;

    // Konstruktor
    public BankAccount(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    // Getter hanya untuk membaca saldo (tidak bisa langsung mengubah)
    public double getBalance(String inputPin) {
        if (this.pin.equals(inputPin)) {
            return balance;
        } else {
            System.out.println("PIN salah! Tidak bisa menampilkan saldo.");
            return -1;
        }
    }

    // Setter untuk update saldo dengan kontrol
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Berhasil menabung: Rp" + amount);
        } else {
            System.out.println("Jumlah deposit tidak valid!");
        }
    }

    public void withdraw(double amount, String inputPin) {
        if (!this.pin.equals(inputPin)) {
            System.out.println("PIN salah! Penarikan gagal.");
            return;
        }
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Berhasil tarik tunai: Rp" + amount);
        } else {
            System.out.println("Saldo tidak cukup atau jumlah invalid!");
        }
    }

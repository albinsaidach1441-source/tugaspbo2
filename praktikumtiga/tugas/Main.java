package tugas;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("123456789", "1234", 500000);

        // Coba akses saldo dengan PIN salah
        System.out.println("Saldo: Rp" + acc.getBalance("0000"));

        // Deposit uang
        acc.deposit(200000);

        // Tarik tunai dengan PIN benar
        acc.withdraw(100000, "1234");

        // Cek saldo lagi dengan PIN benar
        System.out.println("Saldo: Rp" + acc.getBalance("1234"));

        // Ganti PIN
        acc.changePin("1234", "5678");
    }
}

import java.util.Scanner;

public class Person {
    public Wallet wallet = new Wallet();

    public int calcTotal(int[] bills) {
        int total = 0;
        for(int bill : bills) {
            total += bill;
        }
        return total;
    }

    public boolean payMoney(int total) {
        if (wallet.acceptMoney(total)) {
            wallet.setMoneyAmount(wallet.getAmount() - total);
            return true;
        }
        return false;
    }

    protected class Wallet {
        private int amount;

        public boolean setMoneyAmount(int amount) {
            if(amount >= 0) {
                this.amount = amount;
                return true;
            }
            return false;
        }

        public boolean acceptMoney(int amount) {
            return this.amount >= amount;
        }

        public int getAmount() {
            return amount;
        }
    }

    public void CheckBill() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so luong hoa don: ");
        int numberOfBills = scanner.nextInt();
        if(numberOfBills <=0) {
            System.out.println("So luong hoa don khong hop le");
            return;
        }
        int[] bills = new int[numberOfBills];

        for (int i = 0; i < numberOfBills; i++) {
            System.out.print("Nhap vao gia tien cua bill " + (i + 1) + ": ");
            bills[i] = scanner.nextInt();
        }

        int totalBill = this.calcTotal(bills);
        System.out.println("Tong gia tri cac hoa don: " + totalBill);

        System.out.print("Nhap vao so tien: ");
        int initialAmount = scanner.nextInt();
        this.wallet.setMoneyAmount(initialAmount);

        if (this.payMoney(totalBill)) {
            System.out.println("Thanh toan thanh cong. So du cua vi: " + this.wallet.getAmount());
        } else {
            System.out.println("Thanh toan that bai. So du khong du");
        }
    }
}

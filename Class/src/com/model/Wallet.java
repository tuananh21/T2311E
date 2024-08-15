package com.model;

public class Wallet {
    /**
     * Money in the wallet.
     */
    private int amount;

    /**
     * Method to add money to the wallet.
     * @param amount Amount to be added to the wallet.
     * @return Status of adding money (true if successful).
     */
    public boolean setMoneyAmount(int amount) {
        if (amount >= 0) {
            this.amount = amount;
            return true;
        }
        return false;
    }

    /**
     * Method to check if there is enough money in the wallet.
     * @param amount Amount to check against the wallet balance.
     * @return Payment status (true if there is enough money, false otherwise).
     */
    public boolean acceptMoney(int amount) {
        return this.amount >= amount;
    }

    /**
     * Method to get the current amount of money in the wallet.
     * @return The current amount.
     */
    public int getAmount() {
        return amount;
    }
}

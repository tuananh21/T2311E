//package com.model;
//
///**
// * This is a class representing the behavior of a Person.
// * @author Student
// * @version 1.0
// */
//public class Person {
//
//    /**
//     * The person's Wallet
//     */
//    public Wallet wallet = new Wallet();
//
//    /**
//     * The method for calculating the total bill.
//     * @param bills Array of bills.
//     * @return Total value of all bills.
//     */
//    public int calcTotal(int[] bills) {
//        int total = 0;
//        for (int bill : bills) {
//            total += bill;
//        }
//        return total;
//    }
//
//    /**
//     * The method for user payment.
//     * @param total Total value of all bills.
//     * @return Payment status (true if payment is successful, false otherwise).
//     */
//    public boolean payMoney(int total) {
//        if (wallet.acceptMoney(total)) {
//            wallet.setMoneyAmount(wallet.getAmount() - total);
//            return true;
//        }
//        return false;
//    }
//
//    /**
//     * This is a nested class for the person's wallet.
//     * @author Student
//     * @version 1.0
//     */
//    protected class Wallet {
//        /**
//         * Money in the wallet.
//         */
//        private int amount;
//
//        /**
//         * Method to add money to the wallet.
//         * @param amount Amount to be added to the wallet.
//         * @return Status of adding money (true if successful).
//         */
//        public boolean setMoneyAmount(int amount) {
//            if (amount >= 0) {
//                this.amount = amount;
//                return true;
//            }
//            return false;
//        }
//
//        /**
//         * Method to check if there is enough money in the wallet.
//         * @param amount Amount to check against the wallet balance.
//         * @return Payment status (true if there is enough money, false otherwise).
//         */
//        public boolean acceptMoney(int amount) {
//            return this.amount >= amount;
//        }
//
//        /**
//         * Method to get the current amount of money in the wallet.
//         * @return The current amount.
//         */
//        public int getAmount() {
//            return amount;
//        }
//    }
//}

package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class Atm {
    public int numberBanknotes100;
    public int numberBanknotes50;
    public int numberBanknotes20;

    Atm(int numberBanknotes100, int numberBanknotes50, int numberBanknotes20) {
        this.numberBanknotes100 = numberBanknotes100;
        this.numberBanknotes50 = numberBanknotes50;
        this.numberBanknotes20 = numberBanknotes20;
    }

    public void addBanknotes100(int number) {
        this.numberBanknotes100 += number;
    }
    public void addBanknotes50(int number) {
        this.numberBanknotes50 += number;
    }
    public void addBanknotes20(int number) {
        this.numberBanknotes20 += number;
    }
    private boolean isPossible(int amount,
                               int currentNumber20,
                               int currentNumber50,
                               int currentNumber100) {
        if (amount < 0 ||
                currentNumber20 > numberBanknotes20 ||
                currentNumber50 > numberBanknotes50 ||
                currentNumber100 > numberBanknotes100) {
            return false;
        }
        if (amount == 0) {
            return true;
        }
        return isPossible(amount - 20, currentNumber20 + 1, currentNumber50, currentNumber100) ||
                isPossible(amount - 50, currentNumber20, currentNumber50 + 1, currentNumber100) ||
                isPossible(amount - 100, currentNumber20, currentNumber50, currentNumber100 + 1);
    }
    public boolean isPossibleIssue(int amount) {
        return isPossible(amount, 0, 0, 0);
    }
}

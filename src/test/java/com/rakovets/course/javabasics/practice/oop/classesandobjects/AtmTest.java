package com.rakovets.course.javabasics.practice.oop.classesandobjects;

public class AtmTest {
    public static void main(String[] args) {
        Atm atm = new Atm(2,3,4);
        System.out.printf("numberBanknotes100 = %d, numberBanknotes50 = %d, numberBanknotes20 = %d\n",
                           atm.numberBanknotes100,
                           atm.numberBanknotes50,
                           atm.numberBanknotes20);
        atm.addBanknotes50(2);
        atm.addBanknotes100(4);
        atm.addBanknotes20(1);
        System.out.printf("numberBanknotes100 = %d, numberBanknotes50 = %d, numberBanknotes20 = %d\n",
                           atm.numberBanknotes100,
                           atm.numberBanknotes50,
                           atm.numberBanknotes20);
        System.out.print("Is Possible Issue For 200: " + atm.isPossibleIssue(200));
    }
}

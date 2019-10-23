package com.edagana;

public class Main {
    public static void main(String[] args) {

        Employee one = new Employee("henok", "Berhe", 2222);
        Employee two = new Employee("Noah", "Keleta", 3333);
        Employee three = new Employee("Agape", "Love", 4444);
        Employee four = new Employee("Bisrat", "Woldeab", 5555);
        HashArrayBacked ht = new HashArrayBacked();
        ht.put("Berhe",one);
        ht.put("Keleta",two);
        ht.put("Love",three);
        ht.put("Woldeab",four);
        ht.printHashTable();
        System.out.println("this is from the get method :"+ht.get("Woldeab"));
    }

}

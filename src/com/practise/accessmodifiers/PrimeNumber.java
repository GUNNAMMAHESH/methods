package com.practise.accessmodifiers;

public class PrimeNumber {
    
    protected static int[] pNumbers(int n) {
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        
        int[] values = new int[n]; 
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                values[count++] = i; // 
                if (i != n / i) { 
                    values[count++] = n / i; 
                }
            }
        }
        
        return values;
    }
    
    // Method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {        
    }
}

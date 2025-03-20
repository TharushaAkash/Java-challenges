package part1;

import java.util.Scanner;

public class FindPrimeNum {
    private int number;
    private int factorCount;
    private int[] prime;


    public FindPrimeNum(int number) {
        this.number = number;
        factorCount = 0;
        prime = new int[number];
    }

    //Find prime number method
    public void primeNum(){
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                factorCount++;
            }
        }
        if(factorCount == 2){
            System.out.println("Factor Count:" + factorCount);
            System.out.print("status: " + number + " is a prime number.");
        }
        else{
            System.out.println("Factor Count:" + factorCount);
            System.out.print("Status: " + number + " is not a prime number.");
        }
    }


    //Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Get user input
        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        System.out.print("\nNumber: " + number + "\n");

        FindPrimeNum Num = new FindPrimeNum(number);

        Num.primeNum();
    }


}

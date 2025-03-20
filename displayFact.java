package Display_Factors;
import java.util.Scanner;

public class displayFact {
    private int number;
    private int factorCount;
    private int[] factors;

    public displayFact(int number) {
        this.number = number;
        factors = new int[number];
        factorCount = 0;

    }

    //Find Prime Number
    public void primeNumber() {
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                factors[factorCount] = i;
                factorCount++;
            }
        }



        if(factorCount == 2){
            System.out.println("Factor Count: " + factorCount);
            System.out.println("Status: " + number + " is prime number");
        }
        else{
            System.out.println("Factor Count: " + factorCount);
            System.out.println("Status: " + number + " is not prime number");
        }
    }

    //display factors
    public void displayFact() {
        System.out.print("Factors: ");
        if(factorCount > 0){
            System.out.print(factors[0]);
        }
        for(int i = 1; i < factorCount; i++){
            System.out.print("," + factors[i]);
        }

    }

    //Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        displayFact prime = new displayFact(number);

        System.out.println("\nnumber: " + number);

        prime.primeNumber();
        prime.displayFact();




    }
}

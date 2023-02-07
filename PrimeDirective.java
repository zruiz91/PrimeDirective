// Import statement:
import java.util.ArrayList;

//future additions to the project
//Build a method that filters an array for odd or even numbers (bonus points if it can do either depending on arguments passed in!).
//Build a method that returns an ArrayList of the first n primes in an array.
//Build a method that returns an ArrayList of the first n Fibonacci numbers.


    class PrimeDirective {

    // Add your methods here:

    //checks if a number is prime and adds it to a list of only prime numbers
    public ArrayList<Integer> onlyPrimes(int[] numbers){
        ArrayList<Integer> primes = new ArrayList<Integer>();

        //forEach loop though numbers to check if numbver is prime and then add it to primes ArrayList if so
        for(int number : numbers){
            if(isPrime(number)){
                primes.add(number);
            }
        }
        return primes;
    }

    public boolean isPrime(int number) {
        //edge cases
        if (number == 2) {
            return true;
        } else if (number < 2) {
            return false;
        }

        //for loop to see if number is not prime
        for(int i = 2; i < number; i++){
            if (number % i == 0) {
                return false;
            }
        }
        //returning true if prime
        return true;

    }

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

        System.out.println(pd.isPrime(28));
        System.out.println(pd.onlyPrimes(numbers));
    }

}
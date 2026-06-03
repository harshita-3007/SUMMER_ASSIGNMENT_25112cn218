public class primenumbersinrange {
    public static void main(String[] args) {
        int lowerBound = 10; 
        int upperBound = 50; 
        System.out.println("Prime numbers between " + lowerBound + " and " + upperBound + ":");
        for (int num = lowerBound; num <= upperBound; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

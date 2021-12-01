package algorithmsdecision.primes;

public class Prime {

    public boolean isPrime(int number) {
        boolean isPrime = true;

        if (number == 1) {
            isPrime = false;
        } else if (number != 2) {
            for (int i = 2; isLessOrEqual(i, Math.sqrt(number)); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    private boolean isLessOrEqual(double value, double upperBound) {
        return value - upperBound <= Math.pow(10d, -5d);
    }
}
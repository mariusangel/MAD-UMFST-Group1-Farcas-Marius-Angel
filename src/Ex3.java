public class Ex3 {
    public static void main(String[] args) {
        System.out.println("Twin prime numbers less than 100:");
        findTwinPrimes(100);
    }

    public static void findTwinPrimes(int limit) {
        for (int i = 2; i < limit; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }
    //verificare numar prim
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        //verifica daca i si i+2 este prim si le va afisa impreuna in metoda findTwinPrimes
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

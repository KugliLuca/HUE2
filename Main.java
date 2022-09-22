import java.awt.print.PrinterException;

public class Main {
    public static void main(String[] args){
        EratosthenesPrimeSieve eps = new EratosthenesPrimeSieve(10000);
        System.out.println(eps.isPrime(2));
        System.out.println(eps.isPrime(3));
        System.out.println(eps.isPrime(4));
        eps.printPrimes();
    }
}

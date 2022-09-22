import java.util.ArrayList;

public class EratosthenesPrimeSieve implements PrimeSieve{

    int cons = 10000;
    ArrayList<Boolean> arr = new ArrayList<>(cons);

    @java.lang.Override
    public boolean isPrime(int p) {
        return false;
    }

    @java.lang.Override
    public void printPrimes() {
        for (boolean b: arr) {b = false;};

        for (int i = 2; i < cons; i++){
            if(arr.get(i) != false){
                System.out.println(i + "\n" + "\r");
                for(int j = i; (j * i) < cons; j++){
                    arr.set(j * i, false);
                }
            }
        }

    }
}

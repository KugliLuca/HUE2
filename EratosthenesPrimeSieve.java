import java.util.ArrayList;

public class EratosthenesPrimeSieve implements PrimeSieve{

    public EratosthenesPrimeSieve(int cons) {
        this.cons = cons;
    }

    int cons;
    ArrayList<Boolean> arr = new ArrayList<>(cons);

    @java.lang.Override
    public boolean isPrime(int p) {
        for (int i = 0; i < cons; i++){
            arr.add(false);
        }

        for (int i = 2; i < cons; i++){
            if(!arr.get(i)){

                for(int j = i; (j * i) < cons; j++){
                    arr.set(j * i, true);
                }
            }
        }

        if(arr.get(p) == false){
            return true;
        }else{
            return false;
        }
    }

    @java.lang.Override
    public void printPrimes() {
        for (int i = 2; i < cons; i++){
            if(!arr.get(i)){
                System.out.println(i + ", ");
            }else{

            }
        }


    }
}

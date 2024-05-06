// Prime or not

public class PrimeOrNot{
    // Basic Approach

    // public static boolean isPrime(int n){
        
    //     boolean isPrime = true;

    //     // Corner cases
    //     if(n == 2){
    //         return true;
    //     }

    //     for(int i = 2; i < n; i++){
    //         if(n % i == 0){
    //             isPrime = false;
    //             break;
    //         }
    //     }

    //     return isPrime;
    // }


// Optimized Approach
public static boolean isPrime(int n) {
    if(n==2){
        return true;
    }

    for(int i = 2; i < Math.sqrt(n); i++){
        if(n%i==0){
            return false;
        }
    }

    return true;
}

    public static void main(String args[]){
        System.out.println(isPrime(221));
    }
}
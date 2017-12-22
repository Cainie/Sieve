import java.util.Arrays;
import java.util.Scanner;

public class Sieve {
    public static void main (String[]args){
        int number=readIntegerFromKeyboard();
        PrimeNumberGenerator(number);
        
    }

    private static void PrimeNumberGenerator(int number) {
        boolean [] isPrime = new boolean[number+1];
        Arrays.fill(isPrime,true);
        for (int i=2; i*i<=number;i++) //2,3,4
            for(int j=i; j*i<=number;j++) //2,3,4
                isPrime[i*j]=false; //2*2,2*3,2*4,3*3,3*4,4*4 = false
        for(int i=2;i<=number;i++)
            if(isPrime[i])
                System.out.println(i);
    }

    private static int readIntegerFromKeyboard() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }
}

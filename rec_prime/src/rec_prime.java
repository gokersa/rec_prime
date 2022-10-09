import java.util.Scanner;

public class rec_prime {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int num = in.nextInt();


        if(isPrime(num, 2))
            System.out.println(num + " asal sayıdır");
        else
            System.out.println(num + "asal sayı değildir");
    }

    private static boolean isPrime(int num, int i){
        if(i==1 || i==2 || i> num/2)
            return true;
        else if(num%i == 0)
            return false;

        return isPrime(num, i+1);

    }
}

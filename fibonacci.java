
import java.util.Scanner;
public class Fibonacci{

    
       
    private static void Fib(int n){
        int p,q,r,i;
        p=0;
        q=1;
        for(i=1;i<=n;i++){
            System.out.print("  "+p);
            r=p+q;
            p=q;
            q=r;
        }
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Maukkan Nilai: \t");
        int N=input.nextInt();
        if (N>=1){
             Fib(N);
        }
        else{
            System.out.println("Nilai harus lebih besar dari 1                                  !!!");
        }
    }
    
}
     


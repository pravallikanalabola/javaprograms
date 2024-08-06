import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int n= sc.nextInt();
       /*int sum =0;
       for(int i=0;i<=n;i++ ){
        sum=sum+i;
       }
       System.out.println(sum);*/
       for(int i=1;i<=n;i++){
        System.out.println(n+"*"+i+"="+ (n*i));
       }

    }
}
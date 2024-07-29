import java.util.Scanner;
public class Userinput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers to calculate sum: ");
        int i,n,sum;
        sum=0;
        for(i=0;i<5;i++){
            n=sc.nextInt();
            sum=sum+n;
        }
        System.out.println("The sum of 5 number entered is: " +sum);
    }
}

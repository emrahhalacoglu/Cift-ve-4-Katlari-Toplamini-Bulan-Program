import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n;
            int sum=0;

            do{
                System.out.print("Input an odd number : ");
                n=input.nextInt();
                if(n%2!=0){
                    System.out.println(n+" is an odd number");}
                    else{if(n%2==0&&n%4==0){sum+=n;}}
            }
            while(n%2==0);

            System.out.println("Sum of multiplies of 4 : "+sum);
        }

        
    }
    
}

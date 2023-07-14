import java.util.Scanner;
//  PRINT PALINDROMIC NUMBER  PYRAMID
public class Advanced_Pattern_13_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Stars: ");
        int n = sc.nextInt();
        // outer loop
        for (int i = 1;i<=n;i++){
            // Space
            for (int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            // first part
            for (int j=i ;j>=1;j--){
                System.out.print(j+" ");
            }
            // second part
            for (int j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*
OUTPUT:
           1
         2 1 2
       3 2 1 2 3
     4 3 2 1 2 3 4
 */

import java.util.Scanner;
// PRINT Number Pyramid
public class Advanced_Pattern_12_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            //Spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //Numbers --> Print row no, row no. times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
/*
      1
     2 2
    3 3 3
   4 4 4 4
  5 5 5 5 5
 */
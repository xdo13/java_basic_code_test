package d;

import java.util.Scanner;

public class Test39 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("몇 개의 *를 표시할까요 :");
        int n = stdIn.nextInt();
        if(n > 0){
            for(int i = 0; i<n / 5; i++)
                System.out.println("*****");
            int rest = n %5;
            if(rest > 0){
                for (int i =0; i < rest; i++)
                    System.out.print("*");
                System.out.println();
            }
        }

    }
}

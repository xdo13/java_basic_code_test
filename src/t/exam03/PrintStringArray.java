package t.exam03;

import java.util.Scanner;

class PrintStringArray {
    static void printStringArray(String[] a){
        for (int i =0; i <a.length; i++){
            for (int j=0; j < a[i].length(); j++)
                System.out.print(a[i].charAt(j));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열의 개수:");
        int n = scanner.nextInt();
        String[] sx = new String[n];
        for (int i =0; i<sx.length; i++){
            System.out.print("sx[" + i+ "] = ");
            sx[i] = scanner.next();
        }
        printStringArray(sx);
    }
}

package Beginner.BinarySearch;


import java.util.Scanner;

public class BS_02_SquareRoot {
    public static int mySqrt(int x) {
        int start = 1;
        int end = x;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
                end = mid;
                break;
            } else if (mid > x / mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return end;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(mySqrt(a));
    }
}

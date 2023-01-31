package array;

import java.util.Arrays;
import java.util.Scanner;

public class JavaArray {
    public static void main(String[] args) {
        int[] myArray = {3, 7, 6, 4, 2, 9};
        myArray[2] = 12;//هرچیزی بخوای میتونی به جای آرایه بدی
        System.out.println(Arrays.toString(myArray));
        int[] myArray2 = new int[6];
        for (int i = 0; i <= 4; i++) {

            System.out.print(myArray[i] + " ");
        }
        for (int itm : myArray) {
            System.out.print(itm + " ");
        }//یه مدل دیگه از چاپ کردن آرایه است
        System.out.println("tedade Array:" + myArray.length);//گرفتن تعداد عضوهای آرایه
        System.out.println(Arrays.toString(myArray));//چاپ آرایه
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));//مرتب کردن عضوهای آرایه


        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = s.nextInt();

        int myArr[] = new int[n];
        System.out.println("Enter all the elements:");

        for (int i = 0; i < n; i++) {
            myArr[i] = s.nextInt();
        }
    }

    public void printMatrix(int[][] mtx) {
        //چاپ آرایه های دوبعدی
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[0].length; j++) {
                System.out.print(mtx[i][j] + " ");
            }
            System.out.println();
        }
    }
}

import java.util.*;

import java.util.Arrays;

public class ArrayRotate {
    public static void main(String[] args) {
        int temp;
        int a[] = {4, 2, 4, 1, -3, 4, -2, -1, 3};
        int x = a[a.length-1];
        int i = 0;
        for (i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
       a[0]=x;

        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"  ");
        }
    }
}

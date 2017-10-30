import java.io.*;
import java.util.*;

/*
* Given a 6 by 6 array, finds the maximum value of any possible "hourglass" in that array.
* Where an hourglass is defined as the graphical representation:
* a b c
*   d
* e f g
* There are 16 possible hourglasses in a 6 by 6 array.
*/

public class Solution {

    public static void main(String[] args) {
        int max = -9999999;
        int[][] array = new int[6][6];
        Scanner s = new Scanner(System.in);
        for (int x=0;x<array.length;x++){
            for (int y=0;y<array[0].length;y++){
                array[x][y]= s.nextInt();
            }
        }
       for (int x=0;x<4;x++){
           for (int y=0;y<4;y++){
               int hourglass=array[x][y]+array[x][y+1]+array[x][y+2]+array[x+1][y+1]+array[x+2][y]+array[x+2][y+1]+array[x+2][y+2];
               if (hourglass>max)
                   max = hourglass;
           }
       }
       System.out.println(max);
        
    }
}

 
import java.util.*;
import java.util.Scanner;

public class Lima {

    public static void main(String[] args) {
        int[] c = {5,13,7,5,9,20,9,5,14,5};
        String panjang = "";
        Arrays.sort(c);
        int total = 0;
        for (int i = 0; i < c.length - 1; i++) {
            if (i < c.length && c[i] == c[i + 1]) {
                panjang = panjang + "[" +c[i]  + "," + c[i+1] + "],";
                total++;
                i = i + 1;
            }
        }
        System.out.println(total + " pasang :");
        System.out.println(panjang);
    }
}
/**
 * Class: ReverseDoubleChar
 * Author: William Chokbengboune
 * Date: 3/25/23
 * Version: 1.0
 * Description: This program takes given input and returns the reverse of it
 */

package MyAssignment;

import java.util.Scanner;

public class ReverseDoubleChar {
    public static void main(String[] args){
        ReverseDoubleChar map = new ReverseDoubleChar();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = map.reverseChar(in.nextLine());
        System.out.println(word);
    }

    public String reverseChar(String word){
        String holder = "";
        for (int i = word.length()-1; i >= 0; i--){
            holder += word.charAt(i) + "" + word.charAt(i);
        }
        return holder;
    }
}


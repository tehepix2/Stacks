import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        char[] openBrace = {'{', '[', '<', '('};
        char[] closedBrace = {'}', ']', '>', ')'};

        ArrayList<Character> characters = new ArrayList<Character>();
        ArrayList<Brace> stack = new ArrayList<Brace>();

        System.out.print("Enter a string: ");
        String str = input.next();
        for (char i : str.toCharArray()) {
            characters.add(i);
        }
        
        for (char i : closedBrace) {
            if (characters.get(0) == i) {
                System.out.println("Invalid");
            }
            else {
                for (int k = 0; k < stack.size(); k++) {
                    for (char j : openBrace) {
                        if (characters.get(k).compareTo(j) == 0) {
                            System.out.println("Gets");
                        }
                    }
                }
            }
        }

        System.out.println(stack);
       
    }    
        

}

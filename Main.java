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
        lib.clearConsole();
        boolean valid = true;

        for (char i : closedBrace) {
            if (characters.get(0) == i) {
                valid = false; 
            }  
            
        }
        for (char i : openBrace) {
            if (characters.get(characters.size() - 1) == i) {
                valid = false;
            } 
        }
    
        if (valid == true) {
            for (int i = 0; i < characters.size() - 1; i++) {
                for (char l : openBrace) {
                    if (characters.get(i) == l) {
                        char set = ')';
                        switch (characters.get(i)) {
                            case '(':
                                set = ')';
                                break;
                            case '[':
                                set = ']';
                                break;
                            case '{':
                                set = '}';
                                break;
                            case '<':
                                set = '>';
                                break;
                        }

                        stack.add(0, new Brace('o', l, i, set));
                    }
                }
            }
        }
        int count = 1;

        for (Brace i : stack) {
            count = 1;
            while (i.getState() == 'o') {  
                if (characters.get(i.getIndex() + count) == i.getClose()) {
                    i.changeState();       
                }  
                else {
                    for (char k : closedBrace) {
                        if (characters.get(i.getIndex() + count) == k) {
                            valid = false;
                        }
                    }
                }
                count++;   
            }
        }

        for (Brace i : stack) {
            if (i.getState() == 'o') {
                valid = false;
            }
        }

        if (valid == true) {
            System.out.println("Valid.");
        }
        else if (valid == false) {
            
            
            for(Brace i : stack) {
                System.out.print(i.getType());
                System.out.println(i.getClose());
            }
        }
       
    }    
        

}

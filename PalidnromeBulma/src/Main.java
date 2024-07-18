import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // Bir cümlenin Palindrom olup olmadığını bulma.
        
        Scanner input = new Scanner(System.in);
        System.out.println("Bir adet cümle giriniz:");
        String cumle = input.nextLine();
        
        Stack<Character> stack = new Stack<Character>();
        
        
        for(int i=0 ; i<cumle.length()/2 ; i++){
            stack.push(cumle.charAt(i));
        }
        
        if(isPalindrom(cumle, stack)){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Palindrom değil.");
        }
   
      
    }
    
    public static boolean isPalindrom(String cumle, Stack<Character> stack){
        
        for(int i=((cumle.length()/2)+1); i<cumle.length(); i++){
            if(cumle.charAt(i)!=stack.pop()){
                return false;
            }
            
        }
        return true;
    }
}

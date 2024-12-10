import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class algorithmsWords{
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException{
        f = new File("words.txt");
        int twoLetters = twoLetters(); 
        int numberofLongest = numberofLongest();
        int palindromes = palindromes();
        System.out.println("Number of two letter words:" + twoLetters);
        System.out.println("Number of Longest Words:" + numberofLongest);
        System.out.println("Number of palindromes:" + palindromes);
    }

    public static int twoLetters() throws FileNotFoundException{
        s = new Scanner(f);
        int twoLetters =0;
        while (s.hasNext()){
            if((s.next()).length() == 2){
                twoLetters ++;
            }
        }
        return(twoLetters);
    }

    public static int numberofLongest() throws FileNotFoundException{
        s = new Scanner(f);
        int greatest  = 0;
        String next; 
        int count = 0; 
        while (s.hasNext()){
            next = s.next(); 
            if((next).length() > greatest) greatest = next.length(); 
        }
        Scanner s2 = new Scanner(f);
        while(s2.hasNext()){
            next = s2.next(); 
            if(next.length() == greatest) count++;
        }
        return(count); 
    }

    public static int palindromes() throws FileNotFoundException{
        s = new Scanner(f);
        int palindromes = 0;
        String next;
        while(s.hasNext()){
            next = s.next();
            if((next).equals(reverseString(next))) palindromes++;
        }
        return palindromes;

    }

    public static String reverseString(String str){
        String newstr = "";
        for(int i = 0; i<str.length(); i++){
            newstr =str.substring(i ,i+1)+newstr;
        }
        return(newstr);
    }

}

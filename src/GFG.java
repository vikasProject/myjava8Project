
import java.util.EnumSet; 
enum Pfg { CODE, LEARN, CONTRIBUTE, QUIZ, MCQ }; 

//Main class 
//EnumSetExample 
public class GFG { 

 // Main driver method 
 public static void main(String[] args) { 

     // Creating a set 
     EnumSet<Pfg> set1, set2, set3, set4; 

     // Adding elements 
     set1 = EnumSet.of(Pfg.QUIZ, Pfg.CONTRIBUTE, 
    		 Pfg.LEARN, Pfg.CODE); 
     set2 = EnumSet.complementOf(set1); 
     set3 = EnumSet.allOf(Pfg.class); 
     set4 = EnumSet.range(Pfg.CODE, Pfg.CONTRIBUTE); 

     // Printing corresponding elements in Sets 
     System.out.println("Set 1: " + set1); 
     System.out.println("Set 2: " + set2); 
     System.out.println("Set 3: " + set3); 
     System.out.println("Set 4: " + set4); 
 } 
}

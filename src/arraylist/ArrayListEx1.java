package arraylist;

import java.util.ArrayList;

public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList<String> Students = new ArrayList<String>();
        
        Students.add("Amy");
        Students.add("Bob");
        Students.add("Cindy");
        Students.add("David");
        System.out.println(Students);
        
        Students.remove(3);
        Students.add(0,"Nick");
        Students.add(1,"Mike");
        System.out.println(Students);
    }
    
}

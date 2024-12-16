package arraylist;
public class CalculatorTest4 {
    public static void main(String[] args) {
        
        Calculator4 calc = new Calculator4();
        
        //Name your friends
        double totalAmount = 0;
        totalAmount += calc.findTotal(10, "Friend 1");
        totalAmount += calc.findTotal(12, "Friend 2");
        totalAmount += calc.findTotal(9,  "Friend 3");
        totalAmount += calc.findTotal(8,  "Friend 4");
        totalAmount += calc.findTotal(7,  "Friend 5");
        totalAmount += calc.findTotal(15, "Alex");
        totalAmount += calc.findTotal(11, "Friend 6");
        totalAmount += calc.findTotal(30, "Forgetful");
        //Find and print the entire table's total, including tax and tip
       System.out.println(totalAmount);
    } 
}

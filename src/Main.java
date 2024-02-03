//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number"); //asks user to enter a number
        int numToExamine = 3; //simulated input
        System.out.println("You entered " + numToExamine); //confirms what user entered
        System.out.println("Enter a second number"); //asks user to enter a second number
        int numToExameine2 = 2; //second simulated input
        System.out.println("You entered " + numToExameine2); //confirms what user entered
        int modOf = numToExamine % numToExameine2; //calculations for variable modOf
        if (modOf == 0){ //if then statement to calculate if number is even or odd
            System.out.println("Number is even");
        }   else {
            System.out.println("Number is odd");
        }
    }
}

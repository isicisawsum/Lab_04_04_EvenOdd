//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        int numToExamine = 3;
        System.out.println("You entered " + numToExamine);
        System.out.println("Enter a second number");
        int numToExameine2 = 2;
        System.out.println("You entered " + numToExameine2);
        int modOf = numToExamine % numToExameine2;
        if (modOf == 0){
            System.out.println("Number is even");
        }   else {
            System.out.println("Number is odd");
        }
    }
}

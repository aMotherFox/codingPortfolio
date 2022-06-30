package codingChallanges.GradingScale;
import MyGradingScaleClass.java;

public class GradingScale {
    public static void main(String[] args) {
        System.out.println("Hello from the grading scale");
        Integer result = giveNumber(100); //calling the method and passing in
        System.out.println("result: " + result);
        sayHello();

        System.out.println("------calling MyGradingScaleClass----------");
        String gradeA = MyGradingScaleClass.calculateGrade(99);
        System.out.println("99 gives you: " + gradeA);
        String gradeB = MyGradingScaleClass.calculateGrade(89);
        System.out.println("89 gives you: " + gradeB);
        String gradeC = MyGradingScaleClass.calculateGrade(79);
        System.out.println("79 gives you: " + gradeC);
        String gradeD = MyGradingScaleClass.calculateGrade(69);
        System.out.println("69 gives you: " + gradeD);
        String gradeF = MyGradingScaleClass.calculateGrade(9);
        System.out.println("9 gives you: " + gradeF);
    }

    public static void sayHello(){
        System.out.println("Hello from sayHello");
    }


    public static Integer giveNumber(Integer grade) { //function definition, recieves ()
            System.out.println("Hello from calculateGrade");
            Integer result = grade;
            return result;
    }


}

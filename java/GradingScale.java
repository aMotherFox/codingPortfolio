
public class GradingScale {
    public static void main(String[] args) {
        System.out.println("Hello from the grading scale");
        Integer result = giveNumber(100); //calling the method and passing in
        System.out.println("result: " + result);
        sayHello();

        System.out.println("------calling MyGradingScaleClass----------");
        MyGradingScaleClass.calculateGrade(99);

    }

    public static void sayHello(){
        System.out.println("Hello from sayHello");
    }


    public static Integer giveNumber(Integer grade) { //function definition, recieves ()
            System.out.println("Hello from calculateGrade");
            Integer result = grade;
            return result;
    }

        // MyGradingScaleClass.caluclateGrade(99);


        //want to call the function and pass in the values
        //sysout the result

        // Integer result = caluclateGrade(99)
        // System.out.println("Your grade is: " + result);

        // String excellent = "A, excellent";
        // String good = "B";
        // String average = "C";
        // String belowAve = "D";
        // String fail = "F";
        // if (grade > 90 && grade < 101) {
        //     return excellent;
        // } else if (grade > 80 && grade < 89) {
        //     return good;
        // } else if (grade > 70 && grade < 79) {
        //     return average;
        // } else if (grade > 60 && grade < 69) {
        //     return belowAve;
        // } else if (grade > 50 && grade < 59) {
        //     return fail;
        // } else {
        //     return "not a grade";
        // }
        
    

    // public static String letterGrade(Integer grade) {
    //     String excellent = "A, excellent";
    //     String good = "B";
    //     String average = "C";
    //     String belowAve = "D";
    //     String fail = "F";
    //     if (grade > 90 && grade < 101) {
    //         return excellent;
    //     } else if (grade > 80 && grade < 89) {
    //         return good;
    //     } else if (grade > 70 && grade < 79) {
    //         return average;
    //     } else if (grade > 60 && grade < 69) {
    //         return belowAve;
    //     } else if (grade > 50 && grade < 59) {
    //         return fail;
    //     } else {
    //         return "not a grade";
    //     }
    // }
}

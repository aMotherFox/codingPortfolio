public class RolePlayClass {
    
    public static String calculateGrade(Integer grade) {
        //will not compile and run bc it doesn't have a main class
        //when file executes it looks for main method
        //Integer grade

        System.out.println("grading");

            if (grade > 89 && grade < 101) {
                return "A - excellent";
            } else if (grade > 79 && grade < 90) {
                return "B - good";
            } else if (grade > 69 && grade < 80) {
                return "C - average";
            } else if (grade > 59 && grade < 70) {
                return "D - below average";
            } else if (grade > 0 && grade < 60) {
                return "F - fail";
            } else {
                return "not a grade";
            }

    }
    
}

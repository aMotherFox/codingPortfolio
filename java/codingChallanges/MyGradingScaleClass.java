package codingChallanges;

public class MyGradingScaleClass {

    public static String caluclateGrade(Integer grade) {

        // String excellent = "A, excellent";
        // String good = "B";
        // String average = "C";
        // String belowAve = "D";
        // String fail = "F";


        for (Integer grade){
            if (grade > 90 && grade < 101) {
                return "A - excellent";
            } else if (grade > 80 && grade < 89) {
                return "B - good";
            } else if (grade > 70 && grade < 79) {
                return "C - average";
            } else if (grade > 60 && grade < 69) {
                return "D - below average";
            } else if (grade > 50 && grade < 59) {
                return "F - fail";
            } else {
                return "not a grade";
            }
        }
    }
    
}

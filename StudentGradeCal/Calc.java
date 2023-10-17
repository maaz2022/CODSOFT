import java.util.ArrayList;

public class Calc {
    public static double calculateAverage(ArrayList<Integer> marks){
        if(marks.isEmpty()){
            return 0.0;
        }
        int sum = 0;
        for (int mark : marks){
            sum += mark;
        }
        return (double) sum/marks.size();
    }
    public static String getGradeString(int marks){
        if(marks >= 90){
            return "A+";
        }
        else if(marks >= 80 ){
            return "A";
        }
         else if(marks >= 70 ){
            return "B";
        }
         else if(marks >= 60 ){
            return "C";
        }
         else if(marks >= 50 ){
            return "D";
        }
        else{
            return "Fail";
        }
    }
}

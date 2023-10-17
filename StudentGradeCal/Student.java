import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String name;
    private int id;
    private ArrayList<Integer> marks;

    
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.marks = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public ArrayList<Integer> getMarks() {
        return marks;
    }
    public void addMarks(int mark){
        marks.add(mark);
    }
    public static void main(String[] args) {
        Calc calculator = new Calc();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = input.nextLine();

        System.out.println("Enter your ID : ");
        int id = input.nextInt();
        
        Student student = new Student(name, id);
        System.out.println("Enter your marks one by one and Write -1 for end");
        while(true){
            System.out.println("Marks : ");
            int mark = input.nextInt();
            if(mark == -1){
                break;
            }
            student.addMarks(mark);
        }
        ArrayList<Integer> marks = student.getMarks();
        double average = calculator.calculateAverage(marks);

        System.out.println("Student: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Grades: " +     marks);
        System.out.println("Average Grade: " + average);
        System.out.println("Letter Grade: " +  calculator.getGradeString((int) average));

        input.close();

    }
}

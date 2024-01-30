import java.util.Scanner;
public class StudentGradeCalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numberOfSubjects;
        int totalMarks = 0;
        String grade = "";
        boolean fail = false;
        

        System.out.println("Enter total number of subjects!");
        numberOfSubjects = scanner.nextInt();

        System.out.println("Enter marks obtained (out of 100) in each subject");
        int[] marksObtained = new int[numberOfSubjects];

        for(int i = 0; i < numberOfSubjects; i++){
            System.out.println("Enter the marks of Subject "+(i+1));

            while (true) {
                int marks;
                //System.out.print("Enter a number between 0 and 100: ");
                if (scanner.hasNextInt()) {
                    marks = scanner.nextInt();
                    if (marks >= 0 && marks <= 100) {
                        marksObtained[i] = marks;
                        break;
                    } 
                    else {
                        System.out.println("Please enter valid marks between 0 and 100 of subject "+(i+1));
                    }
                } 
                else {
                    String invalidMarks = scanner.next(); 
                    System.out.println("Invalid input. Please enter valid marks between 0 and 100 of subject "+(i+1));
                }
            }            
        }

        for(int marks : marksObtained){
            totalMarks+=marks;
    
            if(marks<40){
                fail = true;
            }
        }
        double average = ((double)totalMarks)/((double)numberOfSubjects);
        

        if(average>=90){
            grade = "O";
        }
        else if(average>=80 && average<90){
            grade = "A+";
        }
        else if(average>=70 && average<80){
            grade = "A";
        }
        else if(average>=60 && average<70){
            grade = "B+";
        }
        else if(average>=50 && average<60){
            grade = "B";
        }
        else if(average>=40 && average<50){
            grade = "C";
        }
        else{
            grade = "F";
        }
        if(fail == true){
            grade = "F";
        }
        if(fail != true){
            System.out.println("Total marks obtained: "+totalMarks);
            System.out.println("Average Percentage scored: "+average);
            System.out.println("Grade: "+grade);
        }
        else{
            System.out.println("Grade: "+grade);

        }
        
        
        scanner.close();
    }
}

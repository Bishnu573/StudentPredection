import java.util.Scanner;

class StudentPerformance {
    private double attendance;
    private double assignmentScore;
    private double examScore;

    public StudentPerformance(double attendance, double assignmentScore, double examScore) {
        this.attendance = attendance;
        this.assignmentScore = assignmentScore;
        this.examScore = examScore;
    }

    public double predictPerformance() {
        // Weighted formula: 20% attendance, 30% assignment, 50% exam
        return (attendance * 0.2) + (assignmentScore * 0.3) + (examScore * 0.5);
    }

    public void displayPrediction() {
        double prediction = predictPerformance();
        System.out.println("Predicted Performance Score: " + prediction);
        if (prediction >= 90) {
            System.out.println("Excellent Performance!");
        } else if (prediction >= 75) {
            System.out.println("Good Performance!");
        } else if (prediction >= 50) {
            System.out.println("Average Performance. Needs Improvement.");
        } else {
            System.out.println("Poor Performance. More Effort Required!");
        }
    }
}

public class StudentPrediction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Attendance Percentage (0-100): ");
        double attendance = scanner.nextDouble();
        
        System.out.print("Enter Assignment Score (0-100): ");
        double assignmentScore = scanner.nextDouble();
        
        System.out.print("Enter Exam Score (0-100): ");
        double examScore = scanner.nextDouble();
        
        StudentPerformance student = new StudentPerformance(attendance, assignmentScore, examScore);
        student.displayPrediction();
        
        scanner.close();
    }
}


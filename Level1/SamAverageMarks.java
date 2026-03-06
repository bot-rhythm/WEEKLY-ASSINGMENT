public class PenDistribution {
    public static void main(String[] args) {
        // Variable declarations
        int totalPens = 14;
        int numberOfStudents = 3;
        int pensPerStudent;
        int remainingPens;
        
        // Calculate pens per student and remaining pens
        pensPerStudent = totalPens / numberOfStudents;
        remainingPens = totalPens % numberOfStudents;
        
        // Display output
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}


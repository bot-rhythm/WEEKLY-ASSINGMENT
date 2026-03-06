public class SamAverageMarks {
    public static void main(String[] args) {
        // Variable declarations - Sam's marks
        int mathsMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;
        int totalMarks;
        double averageMark;
        
        // Calculate total and average
        totalMarks = mathsMark + physicsMark + chemistryMark;
        averageMark = totalMarks / 3.0;
        
        // Display output
        System.out.println("Sam's average mark in PCM is " + averageMark);
    }
}


package JavaBasic.VariableAndDataTypes;

public class BasicExample {
    public static void main(String[] args) {
        // Variables and Data Types
        int myAge = 30;
        double myWeight = 72.5;
        char myGrade = 'A';
        boolean isPassing = true;

        // Print variables
        System.out.println("Age: " + myAge);
        System.out.println("Weight: " + myWeight);
        System.out.println("Grade: " + myGrade);
        System.out.println("Passing: " + isPassing);

        // Operators
        int sum = myAge + 5;
        boolean isOlderThan25 = (myAge > 25);
        boolean canApply = isOlderThan25 && (myGrade == 'A');

        // Print operator results
        System.out.println("Age in 5 years: " + sum);
        System.out.println("Is older than 25: " + isOlderThan25);
        System.out.println("Can apply: " + canApply);
    }
}

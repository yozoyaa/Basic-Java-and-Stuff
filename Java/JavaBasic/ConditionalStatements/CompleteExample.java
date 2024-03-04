/*Let's combine everything into a comprehensive example demonstrating conditional statements and loops: */

package JavaBasic.ConditionalStatements;

public class CompleteExample {
    public static void main(String[] args) {
        // If-Else If-Else
        int testScore = 85;
        if (testScore >= 90) {
            System.out.println("Grade: A");
        } else if (testScore >= 80) {
            System.out.println("Grade: B");
        } else if (testScore >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // Switch
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Another day");
        }

        // For Loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Line " + i);
        }

        // While Loop
        System.out.println("While Loop:");
        int i = 1;
        while (i <= 3) {
            System.out.println("Line " + i);
            i++;
        }

        // Do-While Loop
        System.out.println("Do-While Loop:");
        i = 1; // Resetting i to 1
        do {
            System.out.println("Line " + i);
            i++;
        } while (i <= 3);
    }
}


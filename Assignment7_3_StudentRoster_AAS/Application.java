import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        StudentRoster roster = new StudentRoster();

        boolean stop = false;
        
        while (!stop) {
            System.out.println("\nMenu:");
            System.out.println("1. Add new student");
            System.out.println("2. Print the roster");
            System.out.println("3. Search for a student");
            System.out.println("4. Save roster to disk");
            System.out.println("5. Read roster from disk");
            System.out.println("6. Exit program");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter first name: ");
                    String first = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String last = scanner.nextLine();
                    System.out.print("Enter current address: ");
                    String currentAd = scanner.nextLine();
                    System.out.print("Enter home address: ");
                    String homeAd = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter GPA: ");
                    double gpa = scanner.nextDouble();
                    roster.addStudent(new Student(first, last, currentAd, homeAd, phone, gpa));
                    break;                    
                case 2:
                    roster.printRoster();
                    break;                   
                case 3:
                    System.out.print("Enter first name: ");
                    String searchFirst = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String searchLast = scanner.nextLine();
                    roster.searchStudent(searchFirst, searchLast);
                    break;
                case 4:
                    System.out.print("Enter file name: ");
                    String fileName = scanner.nextLine();
                    try {
                    	roster.saveToFile(fileName);
                    } catch (IOException e) {
                    	// TODO Auto-generated catch block
                    	e.printStackTrace();
                    }
                    System.out.println("Roster saved");
                    break;

                case 5:
                    System.out.println("Not done yet");
                    break;                
                case 6:
                    stop = true;
                    System.out.println("Exiting program.");
                    break;
            }
        }
        scanner.close();
    }
}
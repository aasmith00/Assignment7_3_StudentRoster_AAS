import java.io.*;

class StudentRoster {
    private Student[] roster;

    public StudentRoster() {
        roster = new Student[0];
    }

    public void addStudent(Student student) {
        Student[] newRoster = new Student[roster.length + 1];
        for (int i = 0; i < roster.length; i++) {
            newRoster[i] = roster[i];
        }
        newRoster[roster.length] = student;
        roster = newRoster;
        
        System.out.println("Student added successfully.");
    }

    public void printRoster() {
        System.out.println("Student Roster:");
        for (Student student : roster) {
            System.out.println(student);
        }
    }

    public void searchStudent(String first, String last) {
        for (Student student : roster) {
            if (student.getFirst().equals(first) && student.getLast().equals(last)) {
                System.out.println("found:");
                System.out.println(student);
                return;
            }
        }
        System.out.println("not found.");
    }
    
    public void saveToFile(String fileName) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter(fileName));
        for (Student student : roster) {
            writer.println(student.toString());
        }
        writer.close();
    }
    
    public void readFromFile(){
        //I tried but never got this to work :(
    }

}

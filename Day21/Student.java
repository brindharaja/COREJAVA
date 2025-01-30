package MiniProject;

import java.io.*;
import java.util.*;

public class Student {
    int ID;
    String Name;
    int Age;
    char Grade;
    String Email;
    public Student(int ID, String name, int age, char grade, String email) {
        this.ID = ID;
        Name = name;
        Age = age;
        Grade = grade;
        Email = email;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int age) {
        Age = age;
    }
    public char getGrade() {
        return Grade;
    }
    public void setGrade(char grade) {
        Grade = grade;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public static void addStudent(int id, String name, int age, char grade, String email, List<Student> studentList) {
        studentList.add(new Student(id, name, age, grade, email));
    }
    public static void viewStudent(List<Student> studentList) {
        if (studentList.isEmpty()) {
            System.out.println("No students available.");
        } else {
            System.out.println("Sample Details:");
            studentList.stream().sorted(Comparator.comparing(Student::getName).thenComparing(Student::getAge))
                    .forEach(System.out::println);
        }
    }
    public static void searchStudentByID(int searchId, List<Student> studentList) {
        boolean isFound = studentList.stream().filter(s -> s.ID == searchId)
                .peek(System.out::println).findAny().isPresent();
        try {
            if (!isFound) {
                throw new Exception("Not Found");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void searchStudentByGrade(Optional<Character> optionalGrade, List<Student> studentList) {
        optionalGrade.ifPresentOrElse(grade -> {
            List<Student> matchingStudents = studentList.stream().filter(s -> s.getGrade() == grade).toList();
            if (matchingStudents.isEmpty()) {
                System.out.println("No students found with grade " + grade);
            } else {
                matchingStudents.forEach(System.out::println);
            }
        }, () -> System.out.println("Invalid input. Grade cannot be null or empty."));
    }
    public static void deleteStudent(int deleteID, List<Student> studentList) {
        boolean b = studentList.removeIf(student -> student.ID == deleteID);
        if (!b) {
            System.out.println("Invalid ID. No student found with ID: " + deleteID);
        } else {
            System.out.println("Deleted Successfully..");
        }
    }
    public static void saveToCSV(List<Student> studentList, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.append("ID,Name,Age,Grade,Email\n");
            for (Student student : studentList) {
                writer.append(String.valueOf(student.getID())).append(",")
                        .append(student.getName()).append(",")
                        .append(String.valueOf(student.getAge())).append(",")
                        .append(String.valueOf(student.getGrade())).append(",")
                        .append(student.getEmail()).append("\n");
            }
            System.out.println("Student data has been saved to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while saving data: " + e.getMessage());
        }
    }
    public static List<Student> loadFromCSV(String fileName) {
        List<Student> studentList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                char grade = data[3].charAt(0);
                String email = data[4];
                studentList.add(new Student(id, name, age, grade, email));
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("An error occurred while loading data: " + e.getMessage());
        }
        return studentList;
    }
    @Override
    public String toString() {
        return "Sample{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Grade=" + Grade +
                ", Email='" + Email + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = loadFromCSV("students.csv");
        System.out.println("|-----------------------------STUDENT MANAGEMENT SYSTEM----------------------------------|");
        int choice;
        do {
            System.out.println("|----------------------------------------------------------------------------------------|");
            System.out.println("""
                    |1. ADD STUDENT LIST                                                                     |
                    |2. VIEW STUDENT LIST                                                                    |
                    |3. SEARCH STUDENT LIST                                                                  |
                    |4. UPDATE STUDENT LIST                                                                  |
                    |5. DELETE STUDENT LIST                                                                  |
                    |6. EXIT                                                                                 |""");
            System.out.println("|----------------------------------------------------------------------------------------|");
            System.out.println("Enter Your Choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter Sample Details");
                    System.out.println("Enter id : ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name : ");
                    String name = sc.nextLine();
                    System.out.println("Enter Age : ");
                    int age = sc.nextInt();
                    System.out.println("Enter Grade : ");
                    char grade = sc.next().charAt(0);
                    sc.nextLine();
                    String email;
                    boolean isValid;
                    do {
                        System.out.println("Enter Email: ");
                        email = sc.nextLine();
                        isValid = email.matches("^[a-zA-Z0-9][a-zA-Z0-9._-]*@[a-z]+\\.(com|org|net)$");
                        if (!isValid) {
                            System.out.println("Invalid Email Format.");
                        }
                    } while (!isValid);
                    addStudent(id, name, age, grade, email, studentList);
                    System.out.println("Sample List Added Successfully...");
                    saveToCSV(studentList, "students.csv");
                    break;
                }
                case 2: {
                    viewStudent(studentList);
                    break;
                }
                case 3: {
                    System.out.println("Search based on : \n1.Search by ID\n2.Search by Grade\nEnter your choice : ");
                    int searchChoice = sc.nextInt();
                    if (searchChoice == 1) {
                        System.out.println("Enter ID : ");
                        int searchId = sc.nextInt();
                        searchStudentByID(searchId, studentList);
                    } else if (searchChoice == 2) {
                        sc.nextLine();
                        System.out.println("Enter Grade: ");
                        String input = sc.nextLine().trim();
                        if (input.isEmpty() || input.equalsIgnoreCase("null")) {
                            System.out.println("Invalid input. Grade cannot be null or empty.");
                        } else {
                            Optional<Character> optionalGrade = Optional.ofNullable(input.charAt(0));
                            searchStudentByGrade(optionalGrade, studentList);
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println("Enter ID to Update Sample Details: ");
                    int updateID = sc.nextInt();
                    sc.nextLine();
                    Optional<Student> optionalStudent = studentList.stream().filter(s -> s.ID == updateID).findFirst();
                    if (optionalStudent.isEmpty()) {
                        System.out.println("Sample ID not found.");
                        break;
                    }
                    Student studentToUpdate = optionalStudent.get();
                    System.out.println("Update Details: \n1. Sample Name\n2. Sample Age\n3. Sample Grade\n4. Sample Email\n5. Update All");
                    System.out.println("Enter choice: ");
                    int updateChoice = sc.nextInt();
                    sc.nextLine();
                    switch (updateChoice) {
                        case 1: {
                            System.out.println("Enter the Name to Update: ");
                            String updateName = sc.nextLine();
                            studentToUpdate.setName(updateName);
                            System.out.println("Sample Name updated successfully.");
                            break;
                        }
                        case 2: {
                            System.out.println("Enter the Age to Update: ");
                            int updateAge = sc.nextInt();
                            sc.nextLine();
                            studentToUpdate.setAge(updateAge);
                            System.out.println("Sample Age updated successfully.");
                            break;
                        }
                        case 3: {
                            System.out.println("Enter the Grade to Update: ");
                            char updateGrade = sc.next().charAt(0);
                            sc.nextLine();
                            studentToUpdate.setGrade(updateGrade);
                            System.out.println("Sample Grade updated successfully.");
                            break;
                        }
                        case 4: {
                            System.out.println("Enter the Email to Update: ");
                            String updateEmail = sc.nextLine();
                            studentToUpdate.setEmail(updateEmail);
                            System.out.println("Sample Email updated successfully.");
                            break;
                        }
                        case 5: {
                            System.out.println("Enter new Name, Age, Grade, and Email to Update:");
                            String updateName = sc.nextLine();
                            int updateAge = sc.nextInt();
                            sc.nextLine();
                            char updateGrade = sc.next().charAt(0);
                            sc.nextLine();
                            String updateEmail = sc.nextLine();
                            studentToUpdate.setName(updateName);
                            studentToUpdate.setAge(updateAge);
                            studentToUpdate.setGrade(updateGrade);
                            studentToUpdate.setEmail(updateEmail);
                            System.out.println("All details updated successfully.");
                            break;
                        }
                        default:
                            System.out.println("Invalid choice. Please select a valid option.");
                            break;
                    }
                    saveToCSV(studentList, "students.csv");
                    break;
                }
                case 5: {
                    System.out.println("Enter ID to Delete Sample: ");
                    int deleteID = sc.nextInt();
                    deleteStudent(deleteID, studentList);
                    saveToCSV(studentList, "students.csv");
                    break;
                }
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 7);
    }
}
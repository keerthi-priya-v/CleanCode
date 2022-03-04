package com.javaassignment12;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student(111, "Jiya Brein", 17, "Female",
                "Computer Science", 2018, 70.8));
        studentList.add(new Student(122, "Paul Niksui", 18, "Male",
                "Mechanical", 2016, 50.2));
        studentList.add(new Student(133, "Martin Theron", 17, "Male",
                "Electronic", 2017, 90.3));
        studentList.add(new Student(144, "Murali Gowda", 18, "Male",
                "Electrical", 2018, 80));
        studentList.add(new Student(155, "Nima Roy", 19, "Female",
                "Textile", 2016, 70));
        studentList.add(new Student(166, "Iqbal Hussain", 18, "Male",
                "Security", 2016, 70));
        studentList.add(new Student(177, "Manu Sharma", 16, "Male",
                "Chemical", 2018, 70));
        studentList.add(new Student(188, "Wang Liu", 20, "Male",
                "Computer Science", 2015, 80));
        studentList.add(new Student(199, "Amelia Zoe", 18, "Female",
                "Computer Science", 2016, 85));
        studentList.add(new Student(200, "Jaden Dough", 18, "Male",
                "Security", 2015, 82));
        studentList.add(new Student(211, "Jasna Kaur", 20, "Female",
                "Electronic", 2019, 83));
        studentList.add(new Student(222, "Nitin Joshi", 19, "Male",
                "Textile", 2016, 60.4));
        studentList.add(new Student(233, "Jyothi Reddy", 16, "Female",
                "Computer Science", 2015, 45.6));
        studentList.add(new Student(244, "Nicolus Den", 16, "Male",
                "Electronic", 2017, 95.8));
        studentList.add(new Student(255, "Ali Baig", 17, "Male",
                "Electronic", 2018, 88.4));
        studentList.add(new Student(266, "Sanvi Pandey", 17, "Female",
                "Electrical", 2019, 72.4));
        studentList.add(new Student(277, "Anuj Chettiar", 18, "Male",
                "Computer Science", 2017, 57.5));


        StudentStream studentStream = new StudentStream(studentList);

        System.out.println("All departments in the College :");
        studentStream.printAllDepartments();
        System.out.println("\nAll Students enrolled after 2018 :");
        studentStream.printEnrolledAfter(2018);
        System.out.println("\nAll Male students in computer science department :");
        studentStream.printGenderInDept("Male", "Computer Science");
        System.out.println("\nNumber of male and female students :");
        studentStream.countMaleAndFemaleStudents();
        System.out.println("\nAverage of male and female students :");
        studentStream.averageMaleAndFemaleAge();
        System.out.println("\nHighest students having highest pecentage :");
        studentStream.printHighestPercentStudent();
        System.out.println("\nNumber of students in each department :");
        studentStream.printDeptCount();
        System.out.println("\nAverage percentage achieved in each department :");
        studentStream.averagePerInDepts();
        System.out.println("\nYoungest male student in electronic department :");
        studentStream.youngestMaleElectronics();
        System.out.println("\nNumber of male and female students in computer science department :");
        studentStream.printGenderCountInCse();
    }
}
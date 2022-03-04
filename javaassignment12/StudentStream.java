package com.javaassignment12;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentStream {

    private ArrayList<Student> source;

    public StudentStream(ArrayList<Student> source)
    {
        this.source = source;
    }

    private Stream<Student> newStream()
    {
        return source.stream();
    }

    public void printAllDepartments()
    {
        Stream<Student> studentStream = newStream();

        Stream<String> uniqueDepartments = studentStream.map(Student::getEngDepartment).distinct();
        uniqueDepartments.forEach(allDepts -> System.out.println(allDepts));
    }

    public void printEnrolledAfter(int year)
    {
        Stream<Student> enrolledAfter = newStream().filter(p -> p.getYearOfEnrollment()>year);

        enrolledAfter.forEach(student -> System.out.println(student.getName()));
    }

    public void printGenderInDept(String gender, String dept)
    {
        Stream<Student> genderInDept = newStream().filter(p -> p.getGender().equals(gender) &&
                p.getEngDepartment().equals(dept));

        genderInDept.forEach(student -> System.out.println(student.getName()));
    }

    public void countMaleAndFemaleStudents()
    {
        int maleCount = countStudentsByGender("Male");
        int femaleCount = countStudentsByGender("Female");
        System.out.println("Males: " + maleCount);
        System.out.println("Females: " + femaleCount);
    }

    public void averageMaleAndFemaleAge()
    {
        int maleCount = countStudentsByGender("Male");
        int maleAge = countAgeByGender("Male");
        double maleAvg = (double) maleAge/maleCount;

        int femaleCount = countStudentsByGender("Female");
        int femaleAge = countAgeByGender("Female");
        double femaleAvg = (double) femaleAge/femaleCount;

        System.out.println("Male average: " + maleAvg);
        System.out.println("Female average: " + femaleAvg);
    }

    public int countAgeByGender(String gender) {
        Stream<Student> studentGender = newStream().filter(p -> p.getGender().equals(gender));

        Stream<Integer> studentAges = studentGender.map(Student::getAge);

        return studentAges.reduce(0, Integer::sum);
    }

    public int countStudentsByGender(String gender) {
        Stream<Student> studentGender = newStream().filter(p -> p.getGender().equals(gender));

        return (int) studentGender.count();
    }

    public void printHighestPercentStudent()
    {
        Student newStudent = new Student(0, null, 0, null,
                null, 0, 0);

        Student highestStudent = newStream().reduce(newStudent,
                (p, q) -> (p.getPerTillDate() > q.getPerTillDate()) ? p : q);

        System.out.println(highestStudent.getName());

    }

    public void printDeptCount()
    {
        System.out.println(newStream().collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.counting())));
    }

    public void youngestMaleElectronics()
    {
        Stream<Student> deptStream= newStream().filter(p -> p.getEngDepartment().equals("Electronic"));
        Student youngest = deptStream.min(Comparator.comparing(Student::getAge)).get();
        System.out.println(youngest.getName());
    }

    public void averagePerInDepts()
    {
        Map<String, Double> deptAvgPer = newStream().collect(Collectors.groupingBy(Student::getEngDepartment,
                Collectors.averagingDouble(Student::getPerTillDate)));

        for (String dept :
                deptAvgPer.keySet()) {
            System.out.println(dept + " average percentage: " + deptAvgPer.get(dept));
        }
    }

    public void printGenderCountInCse()
    {
        Stream<Student> males = newStream().filter(p -> p.getEngDepartment().equals("Computer Science"))
                                            .filter(p -> p.getGender().equals("Male"));
        Stream<Student> females = newStream().filter(p -> p.getEngDepartment().equals("Computer Science"))
                                            .filter(p -> p.getGender().equals("Female"));

        System.out.println("Males: " + males.count() + "\nFemales: " + females.count());
    }
}
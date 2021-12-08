package com.java12_14.fundamentals;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class StudentRoster {
    private String firstName;
    private String lastName;
    private String studentId;
    private int numberOfCourses=0;
    //private String course
    private String course =null;
    private Double costPercorse =400.0;
    private Double payment;
    private static int id = 1000;
    private double marks;
    private String gradeLevel;
    private int courseCredit;
    Scanner scanner;
    // enrollment;
    //check status
    //pay tution
    // commulative gpa



    //methods enrollment for couses.
    //check status;
    //Gpa;
    //payment
    /*
    *enter the grade he got in the previous semister
    * check prequizit courses
    * calculate the comulative gpa
    * check balance
    *
     */

    public StudentRoster() {
        //this.studentid = setStudentId();
        //id++;
        scanner = new Scanner(System.in);
        System.out.print("enter first name:");
        this.firstName = scanner.next();
        System.out.print("enter last name:");
        this.lastName = scanner.next();
        System.out.print("1-freshman\n2-sophomore\n3-junior\n4-senior\n enter grade level:");
        this.gradeLevel = scanner.next();
        this.course=course;
        this.courseCredit = courseCredit;
        this.payment= payment;
        setStudentId();

        System.out.println(firstName + " " + lastName + " " + gradeLevel + "" + " " + studentId);
        registration();

        // uniqueId++;
    }

    public Double getCostPercorse() {
        return costPercorse=400.0;
    }

    private void setStudentId() {
        id++;
        this.studentId = lastName+ id;

    }

    public String getStudentid() {
        return studentId = this.lastName + id++;
    }



    public void setMarks(double marks) {
        this.marks = marks;
    }


       // public String getCourse () {
            //return "math101";
     //   }

        public double getMarks () {
            return marks;
        }

       // public int getCourseCredit () {return 4;}
        public void registration () {
            Date now = new Date();
            SimpleDateFormat smt = new SimpleDateFormat("E MMMM dd,yyyy");
            String format = smt.format(now);
            System.out.println(format);
        checkstatus();
        calculateComulativeGpa();
        makePyment();

        }

    private void makePyment() {
        System.out.println("12");
        //payment=payment+costperCourse
        //cost of per course
        //payment = payment for math+payment comp+payment chem+
        //payment bio+payment english;
        // balnce = total payment-paid;
        //
    }


    private void calculateComulativeGpa() {
        Scanner scanner = new Scanner(System.in);

        while (numberOfCourses<3){
            System.out.println("enter courses here");

            scanner.next();
            numberOfCourses++;
            payment=payment+costPercorse;

        }

        //enter name of student here
        // enter the course he registered. math101,comp101,chem101,bio101,Eng101
        //math101 credit =4,com101 credit=3,chem101 credit=3,bio101 3,Eng101 credit 3
        //totl credit =16
        //gpa=getmat101 g*4+ getcom101 g*3+getchem101 g*3+getbio101*3+getEng101*3/16
        //A=16,B=12,c=9,D=6,F=3,//for 3 credit A=12,B=9,C=6,D=3,F=0
        // get each course
        // get credit forbnech course
        // find the totla sum of credit hour
        //totl mark= the sum of credit hour *grade poit divided by total credit.

    }

    private void checkstatus() {
    }

    @Override
        public String toString () {
            return getClass().getSimpleName() + "\n"
                    + gradeLevel;

        }
    }


package com.java12_14.addedfeatures;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class StudentRoster {
    private String firstName;
    private String lastName;
    private String studentId;
    private double balance;
    private double price;
    // private String courses;
    //we will copy here
    private String math = "Math101";
    private final int mathCredit = 4;
    private String comp = "Comp101";
    private final int compCredit = 3;
    private String chem = "Chem101";
    private final int chemCredit = 3;
    private String eng = "English101";
    private String math2 = "Math201";
    private String comp2 = "Comp201";
    private String chem2 = "Chem201";
    private String eco = "Economics112";
    private final int math2Credit = 4;
    private final int comp2Credit = 4;
    private final int chem2Credit = 3;
    private final int eco2Credit = 3;
    // Scanner scanner1;
    private final int engCredit = 3;
    private char mathGrade;
    private double gpa;
    private char chemGrade;
    private char engGrade;
    private char CompGrade;


    //we wil copp in the bove
    private String course = null;
    private Double costPercorse = 400.0;
    private Double payment = 0.0;
    private static int id = 1000;
    private double marks;
    private String gradeLevel;
    private String semister;
    private int courseCredit;
    Scanner scanner;


    public StudentRoster() {
        this.course = course;
        this.balance = balance;
        scanner = new Scanner(System.in);
        System.out.print("enter first name:");
        this.firstName = scanner.next();
        System.out.print("enter last name:");
        this.lastName = scanner.next();
        System.out.print("1-freshman\n2-sophomore\n3-junior\n4-senior\n enter grade level:");
        this.gradeLevel = scanner.next();
        System.out.println("1-semister1" + "\n2-semister2");
        this.semister = scanner.next();
        this.course = course;
        this.payment = payment;
        this.gpa = gpa;
        setStudentId();

        System.out.println(firstName + " " + lastName + " " + gradeLevel + "" + " " + studentId);
        System.out.println("here are the courses you have taken ");
        System.out.println("math-Math101" + "\ncomp-Comp101" + "\nchem-Chem101" + "\neng-English101");
       /*we have to create data base for the grade and the courses
       *create one function that calculates GPa
       * get the courses and the copresponding grade and credit hour
       *
        */


        int mathValue = mathMethod();
        int compValue=compMethod();
        int chemValue=chemMethod();
        int engValue= engMethod();



        calculateGpa(mathValue,chemValue,compValue,engValue);
        checkstatus();
        registration();

        //calculateGpa();


    }

    private void setStudentId() {
        id++;
        this.studentId = lastName + id;

    }

    public String getStudentid() {
        return studentId = this.lastName + id++;
    }


    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    // public int getCourseCredit () {return 4;}
    public void registration() {

        System.out.println("These are the the courses you will be taking it");
        System.out.println("math2-Math201" + "\ncomp2 -Comp201" + "\nchem2 -Chem201" + "\neco-Economics201");
        System.out.println("Enter courses");

        for (int i = 1; i < 5; i++) {
            this.course = scanner.next();
            this.payment = payment + getCostPercorse();
            System.out.println(payment);

        }

        decision();
        currentDate();
        makePyment();
    }

    public void decision() {
        System.out.println("Do you want to proceed?");
        System.out.println("yes" + "\nno");
        String response = scanner.next();
        switch (response.toLowerCase()) {
            case "yes" -> System.out.println("make your payment");
            case "no" -> System.out.println("try another time");

        }
    }

    private Double getCostPercorse() {
        return costPercorse;
    }

    public void currentDate() {
        Date now = new Date();
        SimpleDateFormat smt = new SimpleDateFormat("E MMMM dd,yyyy");
        String format = smt.format(now);
        System.out.println(format);

    }

    private void makePyment() {
        /*get every course credit  hour and multiply cost per credit hour
         *getMathcredit*100 +
         * cost per credit=100
         *
         */
        balance = balance + payment;
    }


    public char getChemGrade() {
        return chemGrade;
    }

    //  public void setChemGrade(char chemGrade) {}

    public char getEngGrade() {
        return engGrade;
    }

    //   public void setEngGrade(char engGrade) {this.engGrade = scanner1.next().charAt(0);}

    public char getGrade1() {
        return CompGrade;
    }

    //public void setcompGrade(char compGrade) {this.CompGrade = scanner1.next().charAt(0);}

    //public void setMathGrade(char MathGrade){this.mathGrade=scanner1.next().charAt(0);}
    public char getGrade() {
        return mathGrade;
    }


    public String getMath() {
        return "Math101";
    }

    public int getMathCredit() {
        return 4;
    }

    public String getComp() {
        return "Comp101";
    }

    public int getCompCredit() {
        return 3;
    }

    public String getChem() {
        return "Chem101";
    }

    public int getChemCredit() {
        return 3;
    }

    public String getEng() {
        return "English101";
    }

    public int getEngCredit() {
        return 3;
    }


    public String getMath2() {
        return "Math201";
    }

    public String getComp2() {
        return "Comp201";
    }

    public String getChem2() {
        return "Chem201";
    }

    public String getEco() {
        return "Economics112";
    }

    public int getMath2Credit() {
        return 4;
    }

    public int getCom2Credit() {
        return 3;
    }

    public int getChem2Credit() {
        return 3;
    }

    public int getEco2Credit() {
        return 3;
    }

    public int mathMethod() {
        System.out.println("Enter math grade");
        this.mathGrade = scanner.next().charAt(0);
        int value = 0;
        //System.out.println(mathGrade);
        switch (mathGrade) {
            case 'A':
            case 'a':
                value = 4;
                break;
            case 'B':
            case 'b':
                value = 3;
                break;
            case 'C':
            case'c':
                value = 2;
                break;
            case 'D':
            case 'd':
                value = 1;
                break;
            case 'F':
            case 'f':

                value = 0;
                break;
            default: System.out.println("it is in valid grade");
                mathMethod();
                break;


        }
        return value;
    }

    public int compMethod() {
        int value1 = 0;
        System.out.println("enter comp grade here");
        this.CompGrade = scanner.next().charAt(0);
        switch (CompGrade) {
            case 'A':
            case 'a':
                value1 = 4;
                break;
            case 'B':
            case'b':
                value1 = 3;
                break;
            case 'C':
            case 'c':
                value1 = 2;
                break;
            case 'D':
            case 'd':
                value1 = 1;
                break;
            case 'F':
            case 'f':
                value1 = 0;
                break;
           default: System.out.println("it is invalid grade");
               compMethod();
               break;


        }
        return value1;

    }

    public int chemMethod() {
        int value2 = 0;
        System.out.println("enter chem grade");
        this.chemGrade = scanner.next().charAt(0);

        switch (chemGrade) {
            case 'A':
            case 'a':
                value2 = 4;
                break;
            case 'B':
            case'b':
                value2 = 3;
                break;
            case 'C':
            case'c':
                value2 = 2;
                break;
            case 'D':
            case'd':
                value2 = 1;
                break;
            case 'F':
            case'f':
                value2 = 0;
                break;
            default: System.out.println("it is not valid grade");
                chemMethod();
                break;

        }
        return value2;


    }

    public int engMethod() {
        int value3 = 0;
        System.out.println("enter english grade here");
        this.engGrade = scanner.next().charAt(0);
        switch (engGrade) {
            case 'A':
                value3 = 4;
                break;
            case 'B':
                value3 = 3;
                break;
            case 'C':
                value3 = 2;
                break;
            case 'D':
                value3 = 1;
                break;
            case 'F':
                value3 = 0;
                break;
           default: System.out.println("it is invalid grade");
               engMethod();
               break;

        }
        return value3;
    }

    public void calculateGpa(int math,int comps,int chems,int engs) {

        double totalCredit = mathCredit + compCredit + chemCredit + engCredit;
        this.gpa = (getMathCredit() * math+ getChemCredit() * chems + getCompCredit() * comps
                + getEngCredit() * engs) / totalCredit;
        // System.out.println(totalCredit);
        System.out.println(gpa);


    }

    public void checkstatus() {
        if (gpa >= 3.8) {
            System.out.println("Vey great distinction");
        } else if (gpa >= 3.5 && gpa < 3.8) {
            System.out.println("Great distinction");
        } else if (gpa > 3.0 && gpa < 3.5) {
            System.out.println("Distinction");
        } else if (gpa > 2.75 && gpa < 3.0) {
            System.out.println("Good");
        } else if (gpa > 2.0 && gpa < 2.75) {
            System.out.println("pass");
        } else if (gpa > 1.8 && gpa < 2.0) {
            System.out.println("Warning");
        } else {
            System.out.println("Failed");
            System.out.println("your are not allowed to take the next courses");
        }

    }

    public String toString() {
        return getClass().getSimpleName() + "\n" + firstName + " " + lastName + " " + gradeLevel + "" + " " + studentId +
                "\n" + this.math2 + "\n" + this.comp2 + "\n" + this.chem2 + "\n" + this.eco +
                "\n" + "total payment=" + " " + this.payment;


    }


}


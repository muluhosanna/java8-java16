package com.java12_14.addedfeatures;

import java.util.ArrayList;
import java.util.Scanner;

public class FeaturesAboutSwitchExpression {
    private static DaysOfTheweek day;
    private char grade;

    public static void main(String[] args) {
        // switchMethod1(DaysOfTheweek.SATURDAY);
        //alternativeSwitchMethod();
        //gradeEvaluation();
        // System.out.println(gradeEvaluation());
        // System.out.println(gradeEvaluation('E'));
        // checkMonth("August");
        // System.out.println(checkMonth("August"));
        // yielding("red");
        // document();
       // instanceOfTest();
       // testOnRecord();
        //testOnroster();

        // examplesOnRoster();
        // switchaAlternative("Monday");
        //  System.out.println(switchAlternative2(DaysOfTheweek.FRIDAY));
    }
    public static void testOnroster(){
        StudentRoster roster = new StudentRoster();
        StudentRoster roster1= new StudentRoster();
        StudentRoster roster2= new StudentRoster();
        StudentRoster roster3= new StudentRoster();
        StudentRoster roster4= new StudentRoster();
        ArrayList<StudentRoster> student1  = new ArrayList<>();
        student1.add(roster);
        student1.add(roster1);
        student1.add(roster2);
        student1.add(roster3);
        student1.add(roster4);
        System.out.println(student1);
    }

    public FeaturesAboutSwitchExpression() {
        this.grade = grade;
    }

    public static void examplesOnRoster() {
        StudentRoster stdentRos = new StudentRoster();

    }

    public static void switchMethod1(DaysOfTheweek day) {

        switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                System.out.println(6);
                break;
            case TUESDAY:
                System.out.println(7);
                break;
            case THURSDAY:
            case SATURDAY:
                System.out.println(8);
                break;
            case WEDNESDAY:
                System.out.println(9);
                break;
            default:
                System.out.println("invalid day");
        }
    }

    public static int switchAlternative2(DaysOfTheweek day1) {
        int numberLetter = 0;
        if (day1 == null) {
            return numberLetter;
        }

        switch (day1) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                numberLetter = 6;
            case TUESDAY:
                numberLetter = 7;
            case THURSDAY:
            case SATURDAY:
                numberLetter = 8;
            case WEDNESDAY:
                numberLetter = 9;

        }
        return numberLetter;
    }

    public static void alternativeSwitchMethod(DaysOfTheweek day) {
        switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> System.out.println(6);
            case TUESDAY -> System.out.println(7);
            case THURSDAY, SATURDAY -> System.out.println(8);
            case WEDNESDAY -> System.out.println(9);
        }

    }

    public static String gradeEvaluation() {
        Scanner scam = new Scanner(System.in);
        String description;
        System.out.println("Enter grade here");
        char grade = scam.next().charAt(0);

        switch (grade) {
            case 'E' -> description = "excellent";
            case 'V' -> description = "very good";
            case 'G' -> description = "good";
            case 'A' -> description = "average";
            case 'F' -> description = "failed";
            default -> description = "not valid grade";
        }
        return description;
    }

    public static int checkMonth(String month) {

        int monthNumber = 0;

        if (month == null) {
            return monthNumber;
        }

        switch (month.toLowerCase()) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "may":
                monthNumber = 5;
                break;
            case "june":
                monthNumber = 6;
                break;
            case "july":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
            default:
                monthNumber = 0;
                break;
        }

        return monthNumber;
    }

    public static void yielding(String color) {
        int result = switch (color) {
            case "red":
                yield 7;
            case "blue":
                yield 2;
            default:
                System.out.println("Niether red nor blue");
                yield 0;
        };
    }

    public static void document() {
        //using one dimensional string literal
        String html = "<html>\n" +
                "<body>\n" + "<p> hello,world</p>\n" + "</body>\n" + "</html>\n";
        // Using two dimension block of text.
        String html2 = """
                <html>
                    <body>
                        <p>Hello, world</p>
                    </body>
                </html>
                """;

        System.out.println(html2);

        String story = """
                  "When I use a word," Humpty Dumpty said,
                  in rather a scornful tone, "it means just what I
                  choose it to mean - neither more nor less."
                  "The question is," said Alice, "whether you
                  can make words mean so many different things."
                  "The question is," said Humpty Dumpty,
                  "which is to be master - that's all."
                """;
        System.out.println(story);
        String htmlpparagraph =
                """
                        html lang="en">
                          <head>
                            <meta charset="UTF-8" />
                            <meta name="viewport" content="width=device-width, initial-scale=1.0" />
                            <title>contact us</title>
                            <style>
                                        body {
                                    background-color: chartreuse;
                                }
                            </style>
                            <style>
                                        h1 {
                                    color: darkorchid;
                                }
                            </style>
                          </head>
                          <body>
                                <p id="odd" class="odd">
                                        Video provides a powerful way to help you prove your point. When you click
                                Online Video, you can paste in the embed code for the video you want to
                                add. You can also type a keyword to search online for the video that best
                                fits your document.
                                        </p>
                            <p id="even" class="even">
                                        Video provides a powerful way to help you prove your point. When you click
                                Online Video, you can paste in the embed code for the video you want to
                                add. You can also type a keyword to search online for the video that best
                                fits your document.
                                        </body>
                                     </html>
                                """;
        System.out.println(htmlpparagraph);
        Object obj = (Object) "abc";
        String str1 = (String) obj;//we will this line by pattern matching.
        if (obj instanceof String str) {
            System.out.println(str.isEmpty());//isinstance operator
        }


    }

    public static void instanceOfTest() {
        Mammal mobj = new Mammal();
        Animal aobj = new Animal();

        // Is `child` class instance of `child` class?
        if (mobj instanceof Mammal)
            System.out.println("mobj is instance of Mammal");
        else
            System.out.println("mobj is NOT instance of Mammal");

        // Is `child` class instance of `parent` class?
        if (mobj instanceof Animal) {
            System.out.println("mobj is instance of Animal");
        } else {
            System.out.println("mobj is NOT instance of Animal");
        }

        // Is `parent` class instance of `child` class?
        if (aobj instanceof Mammal) {
            System.out.println("mobj is instance of Animal");
        } else {
            System.out.println("mobj is NOT instance of Animal");
        }
        Animal child = new Mammal();//upcasting
        Animal parent = child;//how ?

        // using instance of to check validity before
        // typecasting
        if (parent instanceof Mammal) {
            System.out.println("Name of accessed class is: "
                    + ((Mammal) parent).name);//the out put is Mammal.
        }


    }

    public static void testingCasting() {
        Animal jen = new Mammal();
        jen.sleep();
        jen.eat();
        Animal animal1 = new Animal();
        Mammal mam1 = new Mammal();
        ((Mammal) jen).bread();
        Mammal mam2 = (Mammal) jen;//true the reference variable jen points the mammal.and the reference variable mam2
        //points to mammal.

    }
    /*
     *The following content illustrates how data record is generate and tested
     * from the Vehicle Pojo
     * the records are vehicle1 and Vehicle2
     *
     */

    public static void testOnRecord() {
        String brand = "Mercedes";
        String licencePlate = "Ux 1238 A95";
        int numberOfSeats = 6;
        String color = "Silver";
        Vehicle2 vehicle2_1 = new Vehicle2(brand, licencePlate);
        vehicle2_1.brandAsLowerCase();
        System.out.println(vehicle2_1.brandAsLowerCase());

        Vehicle1 vehicle = new Vehicle1(brand, licencePlate, numberOfSeats, color);
        System.out.println(vehicle.equals(vehicle2_1));
        System.out.println(vehicle.brand());
        System.out.println(vehicle.licensePlate());
        System.out.println(vehicle.toString());
    }

}



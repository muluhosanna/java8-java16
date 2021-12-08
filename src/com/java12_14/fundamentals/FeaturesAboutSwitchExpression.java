package com.java12_14.fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class FeaturesAboutSwitchExpression {
    private static DaysOfTheweek day;
    private char grade;

    public static void main(String[] args){
       // switchMethod1(DaysOfTheweek.SATURDAY);
        //alternativeSwitchMethod();
       //gradeEvaluation();
      // System.out.println(gradeEvaluation());
       // System.out.println(gradeEvaluation('E'));
       // checkMonth("August");
       // System.out.println(checkMonth("August"));
        yielding("red");
        document();

       // examplesOnRoster();
       // switchaAlternative("Monday");
      //  System.out.println(switchAlternative2(DaysOfTheweek.FRIDAY));
    }
    public FeaturesAboutSwitchExpression(){
        this.grade = grade;
    }
    public static void  examplesOnRoster(){
        StudentRoster stdentRos = new StudentRoster();

    }

    public static void switchMethod1(DaysOfTheweek day){

        switch (day){
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
            default:System.out.println("invalid day");

        }
    }
    public static int switchAlternative2(DaysOfTheweek day1){
        int numberLetter=0;
        if (day1==null){
            return numberLetter;

        }

        switch (day1){
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                numberLetter=6;
            case TUESDAY:
                numberLetter=7;
            case THURSDAY:
            case SATURDAY:
                numberLetter=8;
            case WEDNESDAY:
                numberLetter=9;

        }
        return numberLetter;
    }
    public static void alternativeSwitchMethod(DaysOfTheweek day ){
        switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> System.out.println(6);
            case TUESDAY                -> System.out.println(7);
            case THURSDAY, SATURDAY     -> System.out.println(8);
            case WEDNESDAY              -> System.out.println(9);
        }

    }
    public static String gradeEvaluation() {
        Scanner scam = new Scanner(System.in);
        String description;
        System.out.println("Enter grade here");
        char grade = scam.next().charAt(0);

       switch (grade) {
            case 'E'->description="excellent";
            case 'V'->description= "very good";
            case 'G'->description= "good";
            case 'A'->description="average";
            case 'F'->description="failed";
            default->description="not valid grade";
        }
        return description;
    }
        public static int  checkMonth(String month){

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
    public static void yielding(String color){
        int result =switch (color){
            case "red":
                yield 7;
            case "blue":
                yield 2;
            default:System.out.println("Niether red nor blue");
            yield 0;
        };
    }
    public static void document(){
        //using one dimensional string literal
        String html= "<html>\n" +
                "<body>\n" +"<p> hello,world</p>\n" +"</body>\n" +"</html>\n";
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
        
    }


}

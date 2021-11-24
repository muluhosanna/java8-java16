package com.java8.fundamentals;


import java.util.Comparator;

public class CastingAndLambda {
    public static void main(String[] args) {
        moreOnLambda();
        LambdaExpression.StaticNestedClass os= new LambdaExpression.StaticNestedClass();//instantiating the static nested class
        os.accessMembers();//accessing the methods of the static nested class


        System.out.println("hello java8");
        String name ="bro";
        char symbol ='!';
        MyInterface myInterface = (x,y)-> {
            System.out.println("it is nice day" + name);
            System.out.println("hello world");
            System.out.println("it is nice day :" +name + symbol);
        };
            myInterface.message(name,symbol);

        }
        public static void moreOnLambda() {
            LambdaExpression lambdaExpression = new LambdaExpression();

            LambdaExpression.IntegerMath addition = (a, b)-> a+b;// we can create the interface and the lambda expression with in one class
            // and create the in stance of the class under the main and run.
            LambdaExpression.IntegerMath subtraction =(a, b)-> a-b;
            System.out.println("40+2="+ lambdaExpression.operationBinary(40,2,addition));
            System.out.println("20-10="+lambdaExpression.operationBinary(20,10,subtraction));
            lambdaExpression.someMethod();

            LambdaExpression.Inner innerObject = lambdaExpression.new Inner();
            innerObject.innerMethod(23);
            LambdaExpression lambdaExpression1 = new LambdaExpression();
            Runnable myAnonymousRunnable = new Runnable() {//this declaring anonymous class
                @Override
                public void run() {
                    System.out.println("I am an anonymous runnable");

                }
            };
            myAnonymousRunnable.run();
            Comparator<String> stringComparator = new Comparator<String>() {//ow we create anonymous this is how we create anonymous class
                @Override
                public int compare(String o1, String o2) {
                    return o1.compareTo(o2);
                }
            };
            int comparasion = stringComparator.compare("hello", "world");
            System.out.println(comparasion);
            Comparator<String> stringComparatorLambda = (String o1, String o2) -> {
                return o1.compareTo(o2);
            };//this is how
            // we create lambda expression
            int lambdacomparasion = stringComparatorLambda.compare("hello", "world");
            System.out.println(lambdacomparasion);
            //void someMethod () {
              //  StringStuff exite = (happy) -> happy + "!";
               // StringStuff question = (what) -> what + "?";
              //  someFormat("java is cool" + exite);
              //  someFormat("java is cool" + question);
           // exite.update("enter");
          //  System.out.println(exite.update("enter"));

            }



            }









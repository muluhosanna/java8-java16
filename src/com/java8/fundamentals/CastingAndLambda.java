package com.java8.fundamentals;


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
        public static void moreOnLambda(){
        LambdaExpression lambdaExpression =new LambdaExpression();
        //lambdaExpression.methods();
       LambdaExpression.Inner innerObject = lambdaExpression.new Inner();
        innerObject.innerMethod();
            LambdaExpression lambdaExpression1 = new LambdaExpression();
            Runnable myAnonymousRunnable =new Runnable() {
                @Override
                public void run() {
                    System.out.println("I am an anonymous runnable");

                }
            };
            myAnonymousRunnable.run();



        }





    }




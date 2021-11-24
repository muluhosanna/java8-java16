package com.java8.fundamentals;
/*
* under this section we will see the nested class
* if the nested class is inner it can has access to the the members of the outte class.
* to instantiate the inner class first we have to instantiate the outer class .
* then , create the inner object with in the outer object the syntax
* outerclass outerobject new outer class()
* outer class.inner class innerObject = outerObject.new InnerClass()
* to access the members of the static nested class fir ehave to instanciated the staticnested class
* this can be done the outer class.inner class name = new outer class.inner cass
* then to access the members name.membes
 */
public class LambdaExpression {
    private String name;
    private String gender;
    String outerfeild  ="outerField";
    static String staticOuterField = "static outer field";
    int age;

    public class Inner{
        public void innerMethod(){
            System.out.println("nmae and gender"+name + gender);
            System.out.println(outerfeild);
            System.out.println(staticOuterField);

        }

    }
    static class StaticNestedClass {
        void accessMembers() {
            //compiler error can not make a static reference to the non -static
            //System.out.println();
            // Systemy.out.println()
            System.out.println(staticOuterField);
            System.out.println(staticOuterField);


        }



    }






    }






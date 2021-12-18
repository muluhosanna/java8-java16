package com.java15_16.addedfeatures;

public class Nurse {
    private String fName;
    private String lName;
    private int id;
    private int age;
    private double salary;
    public Nurse(String fName,String lName,int id,int age,double salary){
        this.fName =fName;
        this.lName = lName;
        this.id = id;
        this.salary = salary;
    }
    public String getfName(){return fName;}
    public String getlName(){return  lName;}
    public int getId(){return id;}
    public double getSalary(){return salary;}
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;}

            Nurse nurse = (Nurse) obj;
        Nurse nurse1 = (Nurse) obj;

            return nurse==nurse1;
        //id == nurse.id && obj.equals(((Nurse) obj).age);
        }
        @Override
        public int hashCode(){return this.fName.hashCode()+this.lName.hashCode();}
    public String toString(){
        return getClass().getSimpleName() +"["+this.getfName() +" "+ this.lName + "\n"
                +"id:"+ this.id+ "salary:"+ this.salary +"]";}

    }




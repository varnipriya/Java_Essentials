package com.varnipriya;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String name;
        int date,month,year,age;
        long salary,annual,tax;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee name" );
        name=sc.nextLine();
        System.out.println("Enter your birth date ");
        date=sc.nextInt();
        System.out.println("Enter your birth month");
        month=sc.nextInt();
        System.out.println("Enter your birth year ");
        year=sc.nextInt();
        System.out.println("Enter your monthly  salary ");
        salary=sc.nextLong();
        age=2020-year;
        if (month>10 ){
            age--;
        }
        System.out.println("Yname:"+name);
        System.out.println("age:"+age);
        annual=salary*12;
        System.out.println("Annual Salary:"+annual);
        if(annual>=500000){
            tax=annual*20/100;
            System.out.println("tax:"+tax);
        }
        else if(annual<500000 && annual>=400000){
            tax=annual*15/100;
            System.out.println("tax:"+tax);
        }
        else if(annual<400000 && annual>=300000){
            tax=annual*10/100;
        }
        else if(annual<300000 && annual>=200000)
        {
            tax=annual*5/100;
            System.out.println("tax:"+tax);
        }
        else
        {
            System.out.println("No tax");
        }
    }
}

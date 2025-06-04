package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Cat {
    private String name;
    private int age;

    public Cat(String name,int age) throws IllegalArgumentException {
        if (name.length()>=2 && !name.matches(".*[0-9].*") && age>0 && age<20) {
            this.name = name;
            this.age = age;
        }else
            throw new IllegalArgumentException("Invalid input! Name must be at least 2 characters long and the age must be between 0 and 20");
    }

    public void setName(String name){
        if (name.length()>=2 && !name.matches(".*[0-9].*")) {
                    this.name = name;
        }else{
            throw new IllegalArgumentException("Illegal input! Name has to be at least 2 characters long and cannot include numbers");
        }
    }

    public void setAge(int age){
        if (age>0 && age<20) {
                    this.age = age;
        }else{
            throw new IllegalArgumentException("Invalid input! Age has to be between 0 and 20.");
        }

    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public static void main(String[] args){
        ArrayList<Cat> catArrayList = new ArrayList<Cat>();
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter your cats name");
            String catName = in.nextLine();

            System.out.println("Please enter " + catName + "s age");
            int catAge = in.nextInt();
            in.nextLine();

            Cat newCat = new Cat(catName, catAge);
            catArrayList.add(newCat);
            System.out.println("-----------------------------");
            System.out.println(catArrayList.getFirst().getAge() + " year old " + catArrayList.getFirst().getName() + " says: meow!");
            System.out.println("-----------------------------");

            System.out.println("Would you like to breed more cats? (Y/n)");
            String answer = in.nextLine();
            while(answer.toLowerCase().equals("y") || answer.isEmpty()) {
                //Cat name
                System.out.println("Please enter your cats name");
                catName = in.nextLine();

                //Cat Age
                System.out.println("Please enter " + catName + "s age");
                catAge = in.nextInt();

                //Creating cat object with name and age
                newCat = new Cat(catName, catAge);
                in.nextLine();

                //Adding cat to ArrayList
                catArrayList.add(newCat);

                //Printing important messages to the user
                System.out.println("-----------------------------");
                System.out.println(catAge + " year old " + catName + " says: meow!");
                System.out.println("-----------------------------");

                //Asking if the user wants to view all their cat data
                System.out.println("Do you want to get an overview of your cats? (Y/n)");
                answer = in.nextLine();
                if(answer.toLowerCase().equals("y") || answer.isEmpty()){
                    System.out.println("-----------------------------");
                    for(int i=0;i<catArrayList.size();i++){
                        System.out.println(catArrayList.get(i).getName() + ": " + catArrayList.get(i).getAge() + " years old");
                    }
                    System.out.println("-----------------------------");
                }else{
                    System.out.println("That's OK!");
                    System.out.println("");
                    continue;
                }

                //Asking if the user wants to add more cats
                System.out.println("Would you like to breed more cats? (Y/n)");
                answer = in.nextLine();
                if (!answer.toLowerCase().equals("y") && !answer.isEmpty()) {
                    System.out.println("OK, quitting...");
                    break;
                }
            }
        in.close();
        } catch (Exception e) {
            throw e;
        }
    }
}

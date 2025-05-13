package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Cat {
    private String name;
    private int age;

    public Cat(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String setName(String name){
        this.name = name;
        return this.name;
    }

    public int setAge(int age){
        this.age = age;
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public static void main(String[] args){
        ArrayList<Cat> catArrayList = new ArrayList<Cat>();
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
    }
}

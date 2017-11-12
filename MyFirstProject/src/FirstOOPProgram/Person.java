package FirstOOPProgram;

import java.util.Scanner;

class Person {
    private String name;
    private int age;
    private String height;
    private String institute;
    private String hobby;

    Person(String personName, int personAge, String personHt, String personInstitute, String personHobby) {
        name = personName;
        age = personAge;
        height = personHt;
        institute = personInstitute;
        hobby = personHobby;
    }

    Person() {
        Scanner printer = new Scanner(System.in);
        System.out.println("Enter your name:");
        this.name = printer.nextLine();
        System.out.println("Enter your age:");
        this.age = printer.nextInt();
        printer.nextLine();
        System.out.println("Enter your institute:");
        this.institute = printer.nextLine();
        System.out.println("Enter your hobby:");
        this.hobby = printer.nextLine();
        System.out.println("Enter your height:");
        this.height = printer.nextLine();
    }

    /**
     * A function to display the contents of object
     * returns void
     */
    void display() {
        System.out.println("My name is: \t " + this.name);
        System.out.println("My age is:  \t " + this.age);
        System.out.println("I study in: \t " + this.institute);
        System.out.println("My height is\t " + this.height);
        System.out.println("My hobby:   \t " + this.hobby);
    }
}

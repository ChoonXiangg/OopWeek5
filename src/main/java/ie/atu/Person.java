package ie.atu;
import java.util.Scanner;
public class Person {
    String firstName;
    String lastName;
    int age;
    //Default constructor to initialize default values
    public Person(){
        this.firstName="John";
        this.lastName="Doe";
        this.age=30;
    }
    //Constructor
    public Person(String firstName,String lastName,int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    //Method to get user input
    public void getUserInput(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter first name: ");
        this.firstName=scanner.nextLine();
        System.out.print("Enter last name: ");
        this.lastName=scanner.nextLine();
        System.out.print("Enter age: ");
        this.age=scanner.nextInt();
    }
    public void displayInfo(){
        System.out.println("name: "+firstName+" "+lastName+", Age: "+age);
    }
}

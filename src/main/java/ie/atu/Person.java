package ie.atu;
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
    public void displayInfo(){
        System.out.println("name: "+firstName+" "+lastName+", Age: "+age);
    }
}

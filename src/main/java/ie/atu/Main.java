package ie.atu;

public class Main {
    public static void main(String[] args){
        //Create a new person object
        Person user=new Person();
        //Get user input
        user.getUserInput();
        //Call the displayInfo method
        user.displayInfo();
    }
}
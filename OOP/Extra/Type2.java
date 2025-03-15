/* ***User Input*** */
import java.util.Scanner;
class Lion{
    String name;
    int age;
    Lion(){
        this.name = "No name";
        this.age = 0;
    }
    Lion (String name){
        this.name = name;
        this.age = 0;
    }
    Lion (String name, int age){
        this.name = name;
        this.age = age;
    }
    public void info(){
        if (age == 0) System.out.println("This is " + name);
        else System.out.println("This is " + name + " Aged " + age);
    }
}
public class Type2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter Age (0 if not known): ");
        int age = sc.nextInt();
        Lion lion;
        if (age == 0){
            lion = new Lion (name);
        }
        else{
            lion = new Lion (name, age);
        }
        lion.info();
    }
}

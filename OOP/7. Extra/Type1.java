/* ***Overloaded Constructors*** */
/*
 * Overloaded constructors allow a class to have multiple constructors 
 * with different parameters (similar to polymorphism just for constructors), 
 * enabling flexibility in object creation.
 */
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
        System.out.println("This is " + name + " Aged " + age);
    }
}
public class Type1 {
    public static void main(String[] args) {
        Lion lion1 = new Lion();
        lion1.info();

        Lion lion2 = new Lion("Simba");
        lion2.info();

        Lion lion3 = new Lion("Simba", 4);
        lion3.info();
        /*
         * Here you can see, each of the constructors are getting called
         * based on their matching parameters
         */
    }
}

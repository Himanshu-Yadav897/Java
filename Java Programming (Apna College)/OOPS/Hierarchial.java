// Hierarchial Inheritance 
public class Hierarchial{
    public static void main(String args[]){
        Dog dobby = new Dog();
        Human man = new Human();
        Mammal Mam = new Mammal();

    }
}
// Parent Class
class Animals{
    String Color= " Grey";
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}


// Derived Class A
class Mammal extends Animals{
 void  Breathe(){
    System.out.println("Breathe");
   }
}

// Derived Class B
class Dog extends Animals{
    void Bark(){
        System.out.println("Barks");
    }
}

// Derived Class c
class Human extends Animals{
     Void walk(){
        System.out.println("Walk");
     }
}


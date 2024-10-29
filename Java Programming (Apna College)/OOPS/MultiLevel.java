// Multi Level Inheritance 
public class MultiLevel{
    public static void main(String args[]){
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs= 4;
        dobby.Breed = "Lebra";
        System.out.println(dobby.legs);
        System.out.println(dobby.Breed);

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
    int legs;
}

// Derived Class B
class Dog extends Mammal{
    String Breed;
}

// Single Level Inheritance
public class Inheritance{
    public static void main(String args[]){
        Fish Shark = new Fish();
        Shark.eat();
    }
}
class Animals{
    String Color= " Grey";
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}
class Fish extends Animals{
    int fin = 9;
    void Swims(){
        System.out.println("Swims In Water");
    }
}
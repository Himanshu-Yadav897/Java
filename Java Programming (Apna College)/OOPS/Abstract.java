public class Abstract {
    public static void main(String args[]){
        Hen h = new Hen();
       
    }

}

abstract class Animal{
    Animal(){
        System.out.println("Animal Constructor called");
    }
    void eat(){
        System.out.println("eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor Called");
    }
    void walk(){
        System.out.println("Walk on four legs");
    }
}
class Hen extends Horse{
    Hen(){
        System.out.println("Hen Constructor Called");
    }
    void walk(){
        System.out.println("Walk on Two legs");
    }
}
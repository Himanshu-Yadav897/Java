public class SuperKeyword {
    public static void main(String args[]){
        Horse H = new Horse(); 
        System.out.println(H.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("Animal Constructor Called");
    }
}
class Horse extends Animal{
    Horse(){
        super.color = "Blue";
    System.out.println("Horse Constructor Called");
    }
}

public class Multiple {
    public static void main(String args[]){
        Beer b = new Beer();
        b.eat();
    }
}
interface Herbivores{
 public void eat();
}

interface Carnivores{
    public void eat();
}
class Beer implements Herbivores,Carnivores{
    public void eat(){
        System.out.println("eats both");
    }
}
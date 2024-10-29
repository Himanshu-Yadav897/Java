public class Getter{
    public static void main(String args[]){
        Pen p1 = new Pen(); // Created a pen object called p1.
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(6);
        System.out.println(p1.getTip());
    }
}
class Pen{
    private String color;
    private int tip;
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newcolor){
        this.color = newcolor;
    }
    void setTip(int tip){
        this.tip = tip;
    }

}
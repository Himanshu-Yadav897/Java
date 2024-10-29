public class Interfaces {
    public static void main(String args[]){
Queen q = new Queen();
q.moves();
    }
}
interface Chessplayer{
    void moves();
}

class Queen implements Chessplayer {
   public void moves(){
        System.out.println("up, down, left , right (in all four Direction)");
    }
}
class King implements Chessplayer {
    public void moves(){
        System.out.println("up, down, left , right (in all four Direction) - by one step");
    }
}
package CoreJava;

public class GamePlayer {
    protected void play(String game){
        System.out.println("Game name:"+game);
    }
    protected void play(String game,int hours){
        System.out.println("Game name :"+game+" Hours played: "+hours);
    }
    protected void play(String game, int hours, int score){
        System.out.println("Game name :"+game+" Hours played: "+hours+" Score: "+score);
    }

    public static void main(String[] args) {
        GamePlayer gamePlayer=new GamePlayer();
        gamePlayer.play("Minecraft");
        gamePlayer.play("Minecraft",5);
        gamePlayer.play("Minecraft",5,100);
    }
}


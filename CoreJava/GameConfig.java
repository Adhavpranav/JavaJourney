package CoreJava;

public class GameConfig {
    static final int MAX_PLAYERS=4;
    static final String GAME_NAME="Minecraft";
    int currentPlayers;

    protected void joinGame(){
        if(currentPlayers<MAX_PLAYERS)
            currentPlayers++;
    }

    protected void showStatus(){
        System.out.println("Game name:" +GAME_NAME);
        System.out.println("Max players: "+MAX_PLAYERS);
        System.out.println("Current players :"+currentPlayers);
    }

    public static void main(String[] args) {
        GameConfig[] gameConfig =new GameConfig[3];
        for (int i=0;i<3;i++){
            gameConfig[i]=new GameConfig();
        }

        gameConfig[0].joinGame();
        gameConfig[0].joinGame();
        gameConfig[0].joinGame();

        gameConfig[0].showStatus();

//        GameConfig.MAX_PLAYERS=10;  error: java: cannot assign a value to static final variable MAX_PLAYERS
    }

}

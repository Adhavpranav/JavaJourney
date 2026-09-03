package CoreJava;

public class ScoreBoard {
    final int [] scores={10,20,30};


    public static void main(String[] args) {
        ScoreBoard scoreBoard=new ScoreBoard();
        scoreBoard.scores[0]=50;

//        scoreBoard.scores=new int[]{1,2,3};  java: cannot assign a value to final variable scores
        for(int i=0;i<scoreBoard.scores.length;i++){
            System.out.println(scoreBoard.scores[i]);
        }
    }
}

package CoreJava;

public class VotingEligibility {
    private String name;
    private int age;

    private boolean checkEligibility(){
        return age>=18;
    }

    public void show(){
        if(checkEligibility()){
            System.out.println("You are eligible ");
            return ;
        }
        System.out.println("You are not  eligible ");
    }

    public static void main(String[] args) {
        VotingEligibility obj1=new VotingEligibility();
        VotingEligibility obj2=new VotingEligibility();

        obj1.name="Pranav";
        obj1.age=20;

        obj2.name="Ayushi";
        obj2.age=17;

        obj1.show();
        obj2.show();
    }

}

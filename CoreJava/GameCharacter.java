package CoreJava;

class Warrior extends GameCharacter{
    @Override
    protected  void attack(){
        System.out.println("Warrior attacks with sword");
    }
}

class Archer extends GameCharacter{
    @Override
    protected  void attack(){
        System.out.println("Archer attacks with bow");
    }
}

class Mage extends GameCharacter{
    @Override
    protected  void attack(){
        System.out.println("Mage attacks with magic");
    }
}

public class GameCharacter {
    protected  void attack(){
        System.out.println("Character attacks");
    }

    public static void main(String[] args) {
        GameCharacter c1 = new Warrior();
        GameCharacter c2 = new Archer();
        GameCharacter c3 = new Mage();

        // Reference type decides what you can access, actual object decides which overridden method runs.
        c1.attack();
        c2.attack();
        c3.attack();
    }
}

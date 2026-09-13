package CoreJava;

interface Camera{
    void takePhoto();
}

interface MusicPlayer{
    void playMusic();
}

class SmartPhone implements  Camera,MusicPlayer{// its multiple inheritance 
    @Override
    public void takePhoto() {
        System.out.println("Taking Photo");
    }
    @Override
    public void playMusic() {
        System.out.println("Playing Music");
    }
}

public class InterfaceMultipleAbilities {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();

        Camera camera = new SmartPhone();
        MusicPlayer player = new SmartPhone();

        smartPhone.takePhoto();
        smartPhone.playMusic();

        camera.takePhoto();
        player.playMusic();
    }
}

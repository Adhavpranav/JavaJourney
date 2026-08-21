package CoreJava;

import java.util.Scanner;

class Instagram extends SocialMedia{
    @Override
    protected void post() {
        System.out.println("Posting a photo on Instagram");
    }
}

class YouTube extends SocialMedia{
    @Override
    protected void post(){
        System.out.println("Uploading a video on YouTube");
    }
}

class Twitter extends SocialMedia{
    @Override
    protected void post() {
        System.out.println("Posting a tweet on Twitter");
    }
}

public class SocialMedia {
    protected void post(){
        System.out.println("Posting on social media");
    }

    public static void main(String[] args) {
        SocialMedia socialMedia1 =new SocialMedia();
        SocialMedia socialMedia2=new Instagram();
        SocialMedia socialMedia3=new YouTube();
        SocialMedia socialMedia4=new Twitter();

        socialMedia1.post();
        socialMedia2.post();
        socialMedia3.post();
        socialMedia4.post();
    }
}

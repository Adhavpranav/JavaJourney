package CoreJava;

public class AccessToken {
    final String tokenId;
    final long createdAt;
    String owner;

    AccessToken(String tokenId,long createdAt,String owner){
        this.tokenId=tokenId;
        this.createdAt=createdAt;
        this.owner=owner;
        //u must assign it before use it before constructor finish or init block finish 
    }
    protected void display(){
//        tokenId=111; this gives error
        System.out.println("Token Id:"+tokenId);
        System.out.println("Created At:"+createdAt);
        System.out.println("Owner : "+owner);
    }

    public static void main(String[] args) {
        AccessToken[] accessToken =new AccessToken[3];
        accessToken[0]=new AccessToken("1",123,"Pranav");
        accessToken[1]=new AccessToken("2",999,"Ayushi");
        accessToken[2]=new AccessToken("3",666,"Dyanu");

        accessToken[0].display();
        accessToken[1].display();
        accessToken[2].display();

    }
}

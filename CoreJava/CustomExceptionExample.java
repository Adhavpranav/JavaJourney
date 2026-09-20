package ExceptionHandling;

class InvalidAgeException extends  Exception{// it makes InvalidAgeException checked exception
    InvalidAgeException(String message){
        super(message);//Exception constructor
        //Call the constructor of the parent class (Exception) and give it this message.
    }
}

public class CustomExceptionExample {
    static void checkAge(int age) throws  InvalidAgeException{
        if(age<18){
            throw  new InvalidAgeException("Invalid Age");
            //InvalidAgeException constructor runs
        }
        System.out.println("Your age is valid");
    }

    public static void main(String[] args) {
        try{
            checkAge(18);
            checkAge(12);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

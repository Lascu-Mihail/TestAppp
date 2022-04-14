package TestApp.example.TestApp.Exceptions;

public class UserAlreadyExistException  extends RuntimeException{

    public UserAlreadyExistException(String message){
        super("User already exist");
    }
}

package Backend.Exception;

public class UserNotDoundException extends RuntimeException{
    public UserNotDoundException(Long id){
        super("Could not found the user with id " + id);
    }
}

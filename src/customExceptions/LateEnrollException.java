package customExceptions;

public class LateEnrollException extends Exception{

    public LateEnrollException(){
        super("You cannot enroll past week 2");
    }
    
}

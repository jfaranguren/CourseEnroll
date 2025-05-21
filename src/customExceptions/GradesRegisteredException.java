package customExceptions;

public class GradesRegisteredException extends Exception{

    public GradesRegisteredException(){
        super("Student cannot be unrolled, they have at least 50% of grades registered");
    }
    
}

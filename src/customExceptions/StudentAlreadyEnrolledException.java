package customExceptions;

public class StudentAlreadyEnrolledException extends Exception{

    public StudentAlreadyEnrolledException(){
        super("The student is already enrolled in your course");
    }
    
}

package IJP;

// This is to create unchecked exception
public class CustomExceptionClass extends RuntimeException{
    public CustomExceptionClass(String message) {
        super(message);
    }
}

// This is to create checked exception
// public class CustomExceptionClass extends Exception{
//    public CustomExceptionClass(String message) {
//        super(message);
//    }
//}
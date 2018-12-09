package image;

public class NotSupportedException extends RuntimeException {

    public NotSupportedException (String message) {
        System.out.println(message);
    }
}

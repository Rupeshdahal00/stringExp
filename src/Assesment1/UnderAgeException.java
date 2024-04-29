package Assesment1;

//Custom exception class
class UnderAgeException extends RuntimeException {
    public UnderAgeException() {
        super("You must be at least 18 years old.");
    }
}


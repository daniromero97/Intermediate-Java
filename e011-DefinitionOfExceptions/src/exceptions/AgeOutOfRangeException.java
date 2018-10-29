package exceptions;

public class AgeOutOfRangeException extends RuntimeException
{
    public AgeOutOfRangeException(String message)
    {
        super(message);
    }
}
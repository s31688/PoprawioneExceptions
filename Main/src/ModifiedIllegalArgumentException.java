public class ModifiedIllegalArgumentException extends IllegalArgumentException {
    public ModifiedIllegalArgumentException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
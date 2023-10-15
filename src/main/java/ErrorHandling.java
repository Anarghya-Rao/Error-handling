import javax.swing.text.html.Option;
import java.io.FileNotFoundException;
import java.util.Optional;

class ErrorHandling {

    void handleErrorByThrowingIllegalArgumentException(){
        throw new IllegalArgumentException();
    }

    void handleErrorByThrowingIllegalArgumentExceptionWithDetailMessage(String message) {
        throw new IllegalArgumentException(message);
    }

    void handleErrorByThrowingAnyCheckedException() throws FileNotFoundException{
        throw new FileNotFoundException();
    }

    void handleErrorByThrowingAnyCheckedExceptionWithDetailMessage(String message) throws FileNotFoundException{
        throw new FileNotFoundException(message);
    }

    void handleErrorByThrowingAnyUncheckedException() {
        throw new ArrayIndexOutOfBoundsException();
    }

    void handleErrorByThrowingAnyUncheckedExceptionWithDetailMessage(String message) {
        throw new ArrayIndexOutOfBoundsException(message);
    }

    void handleErrorByThrowingCustomCheckedException() throws CustomCheckedException {
        throw new CustomCheckedException();
    }

    void handleErrorByThrowingCustomCheckedExceptionWithDetailMessage(String message) throws CustomCheckedException {
        throw new CustomCheckedException(message);
    }

    void handleErrorByThrowingCustomUncheckedException() {
        throw new CustomUncheckedException();
    }

    void handleErrorByThrowingCustomUncheckedExceptionWithDetailMessage(String message) {
        throw new CustomUncheckedException(message);
    }

    Optional<Integer> handleErrorByReturningOptionalInstance(String integer) {
        Optional<Integer> optional;

        try {
            optional = Optional.of(Integer.valueOf(integer));
        } catch(Exception e){
            optional = Optional.empty();
        }

        return optional;
    }

}

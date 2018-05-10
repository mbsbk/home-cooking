package dbgirl.homecooking.common.exception;

/**
 * Created by mengbo on 2017/6/19.
 */


public class CollectionException extends RuntimeException {


    public CollectionException(ExceptionCode exceptionCode) {
        super("code: " + exceptionCode.getCode() + " " + exceptionCode.getMsg());
    }


    public CollectionException(ExceptionCode exceptionCode, Throwable cause) {
        super("code: " + exceptionCode.getCode() + " " + exceptionCode.getMsg(), cause);

    }


}
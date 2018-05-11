package dbgirl.homecooking.common.exception;

/**
 * Created by mengbo on 2017/6/19.
 */


public class UserException extends RuntimeException {


    public UserException(ExceptionCode exceptionCode) {
        super("code: " + exceptionCode.getCode() + " " + exceptionCode.getMsg());
    }


    public UserException(ExceptionCode exceptionCode, Throwable cause) {
        super("code: " + exceptionCode.getCode() + " " + exceptionCode.getMsg(), cause);

    }


}
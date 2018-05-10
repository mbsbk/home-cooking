package dbgirl.homecooking.common.exception;

/**
 * Created by mengbo on 2017/6/19.
 */


public class RecommendException extends RuntimeException {


    private static final long serialVersionUID = -3620827627955393815L;

    public RecommendException(ExceptionCode exceptionCode) {
        super("code: " + exceptionCode.getCode() + " " + exceptionCode.getMsg());
    }


    public RecommendException(ExceptionCode exceptionCode, Throwable cause) {
        super("code: " + exceptionCode.getCode() + " " + exceptionCode.getMsg(), cause);

    }


}
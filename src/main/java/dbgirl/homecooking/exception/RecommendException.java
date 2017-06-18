package dbgirl.homecooking.exception;

/**
 * Created by mengbo on 2017/6/19.
 */

import dbgirl.homecooking.common.ErrorCode;


public class RecommendException extends RuntimeException {


    private static final long serialVersionUID = -3620827627955393815L;

    public RecommendException(ErrorCode errorCode) {
        super(errorCode.getMsg());
    }


    public RecommendException(ErrorCode errorCode, Throwable cause) {
        super(errorCode.getMsg(), cause);
    }


}
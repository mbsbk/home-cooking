package dbgirl.homecooking.common.exception;

/**
 * Created by mengbo on 2017/6/19.
 */
public enum ExceptionCode {

    UNKNOWN(-1, "unknown"),
    ILLEGAL_PARAMETER(1,"illegal parameter"),
    WX_AUTHORIZATION_FAILED(2,"微信授权失败");
    private int code;
    private String msg;

    ExceptionCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

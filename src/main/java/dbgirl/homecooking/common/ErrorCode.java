package dbgirl.homecooking.common;

/**
 * Created by mengbo on 2017/6/19.
 */
public enum ErrorCode {

    UNKNOWN(-1, "unknow");


    private int code;
    private String msg;

    ErrorCode(int code, String msg) {
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

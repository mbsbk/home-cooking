package dbgirl.homecooking.common;


import java.io.Serializable;

/**
 * Created by mengbo on 2017/6/21.
 */
public class ResponseCode implements Serializable {
    private static final long serialVersionUID = -8847515411119701892L;

    private static final String SUCCESS = "success";

    private String code;

    private ResponseCode(String code) {
        this.code = code;
    }

    public static ResponseCode success() {
        return new ResponseCode(SUCCESS);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

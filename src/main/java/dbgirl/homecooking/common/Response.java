package dbgirl.homecooking.common;


import java.io.Serializable;

/**
 * Created by mengbo on 2017/6/21.
 */
public class Response implements Serializable {
    private static final long serialVersionUID = -8847515411119701892L;

    private static final String SUCCESS = "success";

    private static final String FAILED = "failed";

    private String msg;

    private Object data;

    private Response(String msg) {
        this.msg = msg;
    }

    private Response(String msg, Object data) {
        this.msg = msg;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }



    public static Response success() {
        return new Response(SUCCESS);
    }

    public static Response failed() {
        return new Response(FAILED);
    }


    public static Response success(Object data) {
        return new Response(SUCCESS,data);
    }

    public static Response failed(Object data) {
        return new Response(FAILED);
    }

}

package dbgirl.homecooking.pojo.mini_program;

import java.io.Serializable;

public class WXAuthorization implements Serializable{
    private String appid;
    private String secret;
    private String js_code;
    private String grant_type;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getJs_code() {
        return js_code;
    }

    public void setJs_code(String js_code) {
        this.js_code = js_code;
    }

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }

    @Override
    public String toString() {
        return "WXAuthorization{" +
                "appid='" + appid + '\'' +
                ", secret='" + secret + '\'' +
                ", js_code='" + js_code + '\'' +
                ", grant_type='" + grant_type + '\'' +
                '}';
    }
}

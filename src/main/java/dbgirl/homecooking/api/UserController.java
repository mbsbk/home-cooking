package dbgirl.homecooking.api;

import dbgirl.homecooking.common.Response;
import dbgirl.homecooking.common.exception.ExceptionCode;
import dbgirl.homecooking.common.exception.UserException;
import dbgirl.homecooking.core.collection.manual.BookService;
import dbgirl.homecooking.pojo.mini_program.WXAuthorization;
import dbgirl.homecooking.pojo.mini_program.WXAuthorizationResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mengbo on 2017/6/21.
 */
@Api(value = "/user", description = "Operations about user")
@RestController
@RequestMapping("/user")
public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @ApiOperation(
            value = "login/miniprogram", notes = "微信小程序登录入口"
    )
    @RequestMapping(value = "/login/miniprogram", method = {RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Response login(HttpServletRequest servletRequest, @RequestBody WXAuthorization authorization) {
        logger.info(authorization.toString());

        try {

            //访问微信凭证
            //https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code
            RestTemplate restTemplate = new RestTemplate();

            restTemplate.getMessageConverters().add(
                    new WxMappingJackson2HttpMessageConverter()
            );//解析json
            String url = "https://api.weixin.qq.com/sns/jscode2session?appid=" + authorization.getAppid() + "&secret=" + authorization.getSecret() +
                    "&js_code=" + authorization.getJs_code() + "&grant_type=" + authorization.getGrant_type();
            ResponseEntity<WXAuthorizationResponse> response = restTemplate.getForEntity(url, WXAuthorizationResponse.class);

            logger.info(response.getBody().toString());

            if (response.getBody().getSession_key() != null) {//授权成功
                servletRequest.getSession().setAttribute("wx_session_key", response.getBody().getSession_key());
                servletRequest.getSession().setAttribute("wx_user_id", response.getBody().getOpenid());

                //登录用户入库 TODO

                return Response.success();
            }
        } catch (Exception e) {
            logger.error(ExceptionCode.WX_AUTHORIZATION_FAILED.getMsg());
            return Response.failed();
        }


        return Response.failed();
    }


}

class WxMappingJackson2HttpMessageConverter extends MappingJackson2HttpMessageConverter {
    public WxMappingJackson2HttpMessageConverter() {
        List<MediaType> mediaTypes = new ArrayList<>();
        mediaTypes.add(MediaType.TEXT_PLAIN);
        setSupportedMediaTypes(mediaTypes);
    }
}

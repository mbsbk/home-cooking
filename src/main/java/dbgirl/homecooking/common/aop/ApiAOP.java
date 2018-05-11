package dbgirl.homecooking.common.aop;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * Created by mengbo on 2017/6/21.
 */
@Component
@Aspect
@Order(-1)
public class ApiAOP {
    private final static Logger logger = LoggerFactory.getLogger(ApiAOP.class);


    /**
     * 切入 dbgirl.homecooking.api 包及其子包下以 RequestMapping 注解的 public 方法
     */
    @Pointcut(value = "execution(@org.springframework.web.bind.annotation.RequestMapping public * dbgirl.homecooking.api..*.*(..))")
    public void aspect() {
    }


    @Before("aspect()")
    public void before(JoinPoint joinPoint) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        String method = request.getMethod();
        String requestURI = request.getRequestURI();
        //TODO 获取请求参数，ajax json post时无法获取参数
        logger.info(method + " " + requestURI);

    }

    @AfterReturning(value = "aspect()", returning = "rvt")
    public void after(JoinPoint joinPoint, Object rvt) {
        String rt = "";
        try {
            rt = new ObjectMapper().writeValueAsString(rvt);
        } catch (JsonProcessingException e) {
            logger.error(e.getMessage(), e);
        }
        logger.info("return " + rt);
    }


    @AfterThrowing(value = "aspect()",throwing="ex")
    public void after(JoinPoint joinPoint, Throwable ex) {
        logger.info("exception " + ex.getMessage());
    }



}

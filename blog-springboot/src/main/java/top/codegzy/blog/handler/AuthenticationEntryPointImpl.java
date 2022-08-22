package top.codegzy.blog.handler;

import com.alibaba.fastjson.JSON;
import top.codegzy.blog.vo.Result;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;
import top.codegzy.blog.constant.CommonConst;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 用户未登录处理
 *
 */
@Component
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException {
        httpServletResponse.setContentType(CommonConst.APPLICATION_JSON);
        httpServletResponse.getWriter().write(JSON.toJSONString(Result.fail("用户未登录")));
    }

}

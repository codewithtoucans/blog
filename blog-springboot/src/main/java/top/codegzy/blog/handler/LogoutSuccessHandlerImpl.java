package top.codegzy.blog.handler;

import com.alibaba.fastjson.JSON;
import top.codegzy.blog.vo.Result;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;
import top.codegzy.blog.constant.CommonConst;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 注销处理
 *
 */
@Component
public class LogoutSuccessHandlerImpl implements LogoutSuccessHandler {

    @Override
    public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException {
        httpServletResponse.setContentType(CommonConst.APPLICATION_JSON);
        httpServletResponse.getWriter().write(JSON.toJSONString(Result.ok()));
    }

}

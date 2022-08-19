package com.ytzf.demo.test.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "authFilter", urlPatterns = "/*")
@Order() //测试好像这个参数不生效，实际生效的是Filter扫描到的顺序（所以起名很重要）
class AuthFilter implements Filter {
    private  final Logger log = LoggerFactory.getLogger(AuthFilter.class);

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.debug("start to auth request validate...111");
        HttpServletRequest req = (HttpServletRequest) request;
        String token = req.getHeader("token");
        chain.doFilter(request, response);
//        if (token != null) {
//            //    :TODO check token
//            log.info("auth success");
//            chain.doFilter(request, response);
//        } else {
//            log.error("auth failed");
//        }
    }
}
package com.example.demo.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author wtf
 * @date 2019/4/16 14:49
 * @description: 定义一个过滤器
 */
public class TimeFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("=======初始化过滤器=========");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long start = System.currentTimeMillis();

        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("=======filter 耗时：=========" + (System.currentTimeMillis() - start));
    }

    @Override
    public void destroy() {
        System.out.println("=======销毁过滤器=========");
    }
}

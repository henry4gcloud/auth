package com.giaothoa.auth.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("*")
public class ResponseErrorHandler implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        try{
            filterChain.doFilter(servletRequest, servletResponse);
        }catch (Throwable throwable){
            System.out.println(throwable.getStackTrace());
        }

    }
}

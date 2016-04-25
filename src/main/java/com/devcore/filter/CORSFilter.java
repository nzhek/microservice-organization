package com.devcore.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CORSFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletResponse resp = (HttpServletResponse) response;

        resp.setHeader("Access-Control-Allow-Origin", "*");
        resp.setHeader("Access-Control-Allow-Credentials", "true");
        resp.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        resp.setHeader("Access-Control-Max-Age", "3600");
        resp.setHeader("Access-Control-Allow-Headers", "Content-Type, Access-Control-Allow-Headers, Authorization, X-Requested-With, Origin, Accept, X-Requested-With, Access-Control-Request-Method, Access-Control-Request-Headers");

        request.setCharacterEncoding("UTF-8");

        chain.doFilter(request, resp);
    }

    @Override
    public void destroy() {
    }

}

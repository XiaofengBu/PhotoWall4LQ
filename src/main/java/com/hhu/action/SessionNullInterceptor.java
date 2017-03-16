package com.hhu.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * Created by buxiaofeng on 17/3/16.
 */
public class SessionNullInterceptor extends MethodFilterInterceptor{
    private static final long serialVersionUID = 1L;
    @Override
    public void init(){
        System.out.println("开始执行:\t========>>");
    }

    @Override
    public String doIntercept(ActionInvocation invocation) throws Exception {
        String userName=(String) ActionContext.getContext().getSession().get("username");
        if(userName!=null){
            System.out.println("放行"+userName);
            return invocation.invoke();
        }
        return "sessionNull";
    }
    @Override
    public void destroy(){
        System.out.println("结束执行:\t========>>");
    }
}

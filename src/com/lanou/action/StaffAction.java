package com.lanou.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class StaffAction extends ActionSupport {
    private String verifyCode;

    @Override
    public String execute() throws Exception {
        /*跳转到员工列表首页时需要进行的操作
        * 1，获取所有员工
        * 2，获取所有部门*/

        return SUCCESS;
    }


    public String login() {

        return SUCCESS;
    }


    public void validateLogin() {
        String code = (String) ActionContext.getContext()
                .getApplication().get("verifyCode");

        System.out.println("存储的：" + code + " 输入的：" + verifyCode);

        if (!code.equalsIgnoreCase(verifyCode)) {
            addActionError("验证码输入错误");
        }
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }
}

package com.lanou.util;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;
import org.apache.struts2.ServletActionContext;

import java.awt.image.BufferedImage;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class VerifyResult implements Result {
    @Override
    public void execute(ActionInvocation actionInvocation) throws Exception {
        VerifyCode verifyCode = new VerifyCode();
        BufferedImage image = verifyCode.getImage();

        ActionContext.getContext().getApplication()
                .put("verifyCode",verifyCode.getText());

        VerifyCode.output(image,
                ServletActionContext.getResponse().getOutputStream());

    }
}

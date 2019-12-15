package com.imooc.o2o.util;

import javax.servlet.http.HttpServletRequest;

/**
@version 创建时间:2019年1月21日 上午11:45:08
*/

public class CodeUtil {
	public static boolean checkVerifyCode(HttpServletRequest request){
		String verifyCodeExpected = (String)request.getSession()
				.getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
		String verifyCodeActual = HttpServletRequestUtil.getString(request, "verifyCodeActual");
		if(verifyCodeActual==null || !verifyCodeActual.equals(verifyCodeExpected)){
			return false;
		}
		return true;
	}
}

package com.sample.app;

import com.sample.app.util.StringUtil;

public class App {

	public static void main(String args[]) {
		StringUtil stringUtil = new StringUtil();

		String msg = stringUtil.welcomeUser();

		System.out.println("msg : " + msg);
	}

}

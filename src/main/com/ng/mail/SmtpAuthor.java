package com.ng.mail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * 邮箱账号和密码
 * @author  ZhengWei
 * @version 2013年11月20日上午11:07:06
 * @since   JDK1.6 
 */
public class SmtpAuthor extends Authenticator {
	private String userName;
	private String password;

	public SmtpAuthor() {
	}

	public SmtpAuthor(String username, String password) {
		this.userName = username;
		this.password = password;
	}

	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(userName, password);
	}
}

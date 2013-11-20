package com.ng.test.mail;

import com.ng.mail.MailContent;
import com.ng.mail.MailSender;

public class MailSendTest {
	
	private static String fromMail = "testmailpublic@163.com";
//	private static String fromMail = "zhengwei@163.com";
	private static String fromMailPasswd = "zhengwei";
	private static String toMail = "testmailpublic2@163.com";
	private static String toMailPasswd = "zhengwei";
	private static String mailServerHost = "smtp.163.com";
	private static String mailServerPort = "25";
	
	public static void main(String[] args) {
		MailContent mailInfo = new MailContent();
		mailInfo.setMailServerHost(mailServerHost);
		mailInfo.setMailServerPort(mailServerPort);
		mailInfo.setValidate(true);
		mailInfo.setUserName(fromMail);
		mailInfo.setPassword(fromMailPasswd);
		mailInfo.setFromAddress(fromMail);
		mailInfo.setToAddress(toMail);
		mailInfo.setSubject("测试");
		mailInfo.setContent(fromMail);
		mailInfo.setAttachFileNames(
				new String[] { 
						"E:\\myproject\\javamail\\src\\test\\com\\ng\\test\\mail\\MailSendTest.java",
						"E:\\myproject\\javamail\\src\\main\\com\\ng\\mail\\MailSender.java"
				});
		
		MailSender.sendHtmlMail(mailInfo);
		
		System.out.println("邮件发送成功");
	}
}

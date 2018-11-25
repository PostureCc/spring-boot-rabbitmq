package com.chan.springbootdemo.service;


import com.chan.springbootdemo.po.Mail;

public interface Producer {
	public void sendMail(String queue, Mail mail);//向队列queue发送消息
}

package com.oyxy.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String pwd;
	private String isadmin;
	private List<String> list;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public String getIsadmin() {
		return isadmin;
	}

	public void setIsadmin(String isadmin) {
		this.isadmin = isadmin;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String login() {
		HttpServletRequest request = ServletActionContext.getRequest();
		list = new ArrayList<String>();
		list.add("�񱩾���");
		list.add("����С����");
		list.add("����A��");
		if (username.equals("admin") && pwd.equals("123")) {
			isadmin = "yes";
			return "loginShow";
		}
		if (username.equals("123") && pwd.equals("123")) {
			isadmin = "no";
			return "loginShow";
		}
		request.setAttribute("MESSAGE", "�û������������");
		return "error";

	}

}

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
		list.add("狂暴巨兽");
		list.add("宠物小精灵");
		list.add("多啦A梦");
		if (username.equals("admin") && pwd.equals("123")) {
			isadmin = "yes";
			return "loginShow";
		}
		if (username.equals("123") && pwd.equals("123")) {
			isadmin = "no";
			return "loginShow";
		}
		request.setAttribute("MESSAGE", "用户名或密码错误");
		return "error";

	}

}

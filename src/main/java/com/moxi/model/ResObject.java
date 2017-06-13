package com.moxi.model;

import java.util.List;

public class ResObject<T> {

	private String resCode;
	private String resMessage;
	private Object resObject;
	private List<T> resList;

	public ResObject(String resCode,String resMessage,Object resObject,List<T> resList){
		this.resCode = resCode;
		this.resMessage = resMessage;
		this.resObject = resObject;
		this.resList = resList;
	}

	public Object getResObject() {
		return resObject;
	}

	public void setResObject(Object resObject) {
		this.resObject = resObject;
	}

	public String getResCode() {
		return resCode;
	}

	public void setResCode(String resCode) {
		this.resCode = resCode;
	}

	public String getResMessage() {
		return resMessage;
	}

	public void setResMessage(String resMessage) {
		this.resMessage = resMessage;
	}

	public List<T> getResList() {
		return resList;
	}

	public void setResList(List<T> resList) {
		this.resList = resList;
	}


}

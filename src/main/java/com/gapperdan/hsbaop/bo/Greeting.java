package com.gapperdan.hsbaop.bo;

public class Greeting {

	public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }	
	private long id;
	private String content;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}

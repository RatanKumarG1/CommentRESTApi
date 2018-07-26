package com.example.comment.pojo;

import org.springframework.stereotype.Service;

@Service
public class CommentPojo {

	private int productId;
	private String comment;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public CommentPojo(int productId, String comment) {
		this.productId = productId;
		this.comment = comment;
	}

	public CommentPojo(){}
	
	@Override
	public String toString() {
		return "CommentPojo [productId=" + productId + ", comment=" + comment + "]";
	}

}

package com.example.comment.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.comment.pojo.CommentPojo;
import com.example.comment.service.CommentService;

@RestController("/comment")
public class CommentEndpoint {

	@Autowired
	private CommentService commentService;
	
	@PostMapping
	public CommentPojo postComment(@RequestBody CommentPojo commentPojo) throws Exception{
		boolean isCommentObjectionable = commentService.validate(commentPojo);
		if(isCommentObjectionable){
			commentPojo.setComment("The above comment contains objectionable content !!!");
		} else {
			commentPojo.setComment("Thank you for the valuable comment/feedback");
		}
		return commentPojo;
	}
	
}

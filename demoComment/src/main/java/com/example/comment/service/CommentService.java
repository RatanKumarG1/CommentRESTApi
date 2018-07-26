package com.example.comment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import com.example.comment.pojo.CommentPojo;

@Service
public class CommentService {

	public boolean validate(CommentPojo commentPojo) throws Exception {
		
		if(!IsProductExists(commentPojo.getProductId())){
			throw new Exception();
		}

		List<String> objectionableWords = getObjectionableWords();
		
		for(String word: objectionableWords){
			word = ".*"+ word +".*";
			if(Pattern.matches(word, commentPojo.getComment())){
				return true;
			}
		}
		return false;
	}
	
	public List<String> getObjectionableWords(){
		List<String> wordsList = new ArrayList<>();
		wordsList.add("aaa");
		wordsList.add("111");
		wordsList.add("ccc");
		return wordsList;
	}
	
	public boolean IsProductExists(int productId){
		if(productId == 1 || productId == 2 || productId == 3){
			return true;
		}
		return false;
	}
	
public static void main(String[] args) throws Exception {
	CommentPojo  cp = new CommentPojo(6, "a1aa zzz");
	
	CommentService cs = new CommentService();
	System.out.println(cs.validate(cp));
}
	
}

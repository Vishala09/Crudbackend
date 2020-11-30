package com.example.crud;

public class BeanClass {
	private int id;
	private String name;
	private String review;
	private int rating;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public BeanClass(int id, String name, int rating,String review) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.review=review;
	}
}

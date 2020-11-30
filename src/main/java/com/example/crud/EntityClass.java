package com.example.crud;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Reviews")
public class EntityClass {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int rating;
	private String review;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public EntityClass(String name, int rating,String review) {
		super();
		this.name = name;
		this.rating = rating;
		this.review = review;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
}

package com.tka.entity;

import jakarta.annotation.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="song")/* using this we we can change when we gives 
                    wrong name in data base in table then we change here*/
public class Song {
	
	@Column(name="songid")/*when we give different name in database 
	                      then using @column we gives a write name to column*/

@Id       // it indicates a primary key
@GeneratedValue(strategy=GenerationType.IDENTITY)//auto increment 
 int id;      /* field, property*/
	
 String name;
 
 @Column(name="singer")
 String artist;
 
 public  Song(){
	 
 }
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
public String getArtist() {
	return artist;
}
public void setArtist(String artist) {
	this.artist = artist;
}
@Override
public String toString() {
	return "Song [id=" + id + ", name=" + name + ", artist=" + artist + "]";
}
 
 
}

package com.zhan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class House {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    
	private String name;
	private String address;
	private String longitude;
	private String latitude;
	private String phone;
	private String stage;
	private String building;
	private String room;
	private String introduce;
	private String type;
	private String structure;
	private String images;
	private String area;
	private String price;
	private String room0;
	private String room1;
	private String room2;
	private String room3;
	private String room4;
	private String room5;
	private String room6;
	private String room7;
	private String room8;
	private String room9;
	private String attribute0;
	private String attribute1;
	private String attribute2;
	private String attribute3;
	private String attribute4;
	private String attribute5;
	private String attribute6;
	private String attribute7;
	private String attribute9;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStructure() {
		return structure;
	}
	public void setStructure(String structure) {
		this.structure = structure;
	}
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getRoom0() {
		return room0;
	}
	public void setRoom0(String room0) {
		this.room0 = room0;
	}
	public String getRoom1() {
		return room1;
	}
	public void setRoom1(String room1) {
		this.room1 = room1;
	}
	public String getRoom2() {
		return room2;
	}
	public void setRoom2(String room2) {
		this.room2 = room2;
	}
	public String getRoom3() {
		return room3;
	}
	public void setRoom3(String room3) {
		this.room3 = room3;
	}
	public String getRoom4() {
		return room4;
	}
	public void setRoom4(String room4) {
		this.room4 = room4;
	}
	public String getRoom5() {
		return room5;
	}
	public void setRoom5(String room5) {
		this.room5 = room5;
	}
	public String getRoom6() {
		return room6;
	}
	public void setRoom6(String room6) {
		this.room6 = room6;
	}
	public String getRoom7() {
		return room7;
	}
	public void setRoom7(String room7) {
		this.room7 = room7;
	}
	public String getRoom8() {
		return room8;
	}
	public void setRoom8(String room8) {
		this.room8 = room8;
	}
	public String getRoom9() {
		return room9;
	}
	public void setRoom9(String room9) {
		this.room9 = room9;
	}
	public String getAttribute0() {
		return attribute0;
	}
	public void setAttribute0(String attribute0) {
		this.attribute0 = attribute0;
	}
	public String getAttribute1() {
		return attribute1;
	}
	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}
	public String getAttribute2() {
		return attribute2;
	}
	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}
	public String getAttribute3() {
		return attribute3;
	}
	public void setAttribute3(String attribute3) {
		this.attribute3 = attribute3;
	}
	public String getAttribute4() {
		return attribute4;
	}
	public void setAttribute4(String attribute4) {
		this.attribute4 = attribute4;
	}
	public String getAttribute5() {
		return attribute5;
	}
	public void setAttribute5(String attribute5) {
		this.attribute5 = attribute5;
	}
	public String getAttribute6() {
		return attribute6;
	}
	public void setAttribute6(String attribute6) {
		this.attribute6 = attribute6;
	}
	public String getAttribute7() {
		return attribute7;
	}
	public void setAttribute7(String attribute7) {
		this.attribute7 = attribute7;
	}
	public String getAttribute9() {
		return attribute9;
	}
	public void setAttribute9(String attribute9) {
		this.attribute9 = attribute9;
	}

	
	
	
	
}

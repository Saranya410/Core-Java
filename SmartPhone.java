package com.deloitte;

public class SmartPhone {
 String name;
 int price;
Applications app;
public Applications getApp() {
	return app;
}
public void setApp(Applications app) {
	this.app = app;
}
//SmartPhone(Applications app1) //constructor bbased
//{
//	this.app=app1;
//}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}

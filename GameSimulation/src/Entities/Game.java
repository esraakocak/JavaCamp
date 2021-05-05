package Entities;

import Abstract.Entity;

public class Game implements Entity{
    
	  int ›d;
	public  String GameName;
	public  double Price;
	  
	public Game() {
		
	}
	
	
	public Game(int id, String gameName, double price) {
		super();
		›d = id;
		GameName = gameName;
		Price = price;
	}
	public int get›d() {
		return ›d;
	}
	public void set›d(int id) {
		›d = id;
	}
	public String getGameName() {
		return GameName;
	}
	public void setGameName(String gameName) {
		GameName = gameName;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
}

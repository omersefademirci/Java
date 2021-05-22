package entities.conctretes;

import entities.abstracts.IGame;

public class Game implements IGame{
	private int id;
	private int gameId;
	private String gameName;
	private float gamePrice;
	private Gamer gamer;
	public Game() {
		this.id=0;
		this.gameId=0;
		this.gameName=" ";
		this.gamePrice=0;
		this.gamer=null;
	}
	public Game(int id, int gameId, String gameName, int gamePrice, Gamer gamer) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
		this.gamer = gamer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public float getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(int gamePrice) {
		this.gamePrice = gamePrice;
	}
	public Gamer getGamer() {
		return gamer;
	}
	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}
	

}

package tn.esprit.alternance;

public class Gamers {
private int id;
private String username;
private int level;
private int wins;
public Gamers(int id, String username, int level, int wins) {
	super();
	this.id = id;
	this.username = username;
	this.level = level;
	this.wins = wins;
}
public Gamers() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public int getLevel() {
	return level;
}
public void setLevel(int level) {
	this.level = level;
}
public int getWins() {
	return wins;
}
public void setWins(int wins) {
	this.wins = wins;
}
@Override
public String toString() {
	return "Gamers [id=" + id + ", username=" + username + ", level=" + level + ", wins=" + wins + "]";
}




}

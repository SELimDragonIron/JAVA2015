package entity;
import java.io.Serializable;
import java.util.Vector;


public class CGangjwa implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//attribute
	private int ID;
	private String name;
	private int suganginwon;
	private Vector<String> times;  // Array of String
	private int gyosuID;
	private int gwmokID;
	
	
	//set&get
	public int getID() {return ID;}
	public void setID(int iD) {ID = iD;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getSuganginwon() {return suganginwon;}
	public void setSuganginwon(int suganginwon) {this.suganginwon = suganginwon;	}
	public Vector<String> getTimes() {return times;}
	public void setTimes(Vector<String> times) {this.times = times;}
	public int getGyosuID() {return gyosuID;}
	public void setGyosuID(int gyosuID) {this.gyosuID = gyosuID;}
	public int getGwmokID() {return gwmokID;}
	public void setGwmokID(int gwmokID) {this.gwmokID = gwmokID;}
	
	
	
}

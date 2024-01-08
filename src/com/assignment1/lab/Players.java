package com.assignment1.lab;
/*Author: Najmun Nahar
 * Lab Assignment-1
 * Course: COMP228-004
 * Date: 20-05-2021
 */

public class Players{
	
	//Declaring Variables
	int playerId;
	String playerName;
	String teamName;
	String birthDate;
	String playerAppearances;
	
	//Null Constructor 
	public Players()
	{
		playerId = 0;
	}
	
	//Parameterized Constructor with 1 argument
	public Players(int id)
	{
		playerId = id;
	}
	
	//Parameterized Constructor with 2 arguments
	public Players(int id, String name)
	{
		playerId = id;
		playerName = name;
	}
	
	//Parameterized Constructor with 3 arguments
	public Players(int id, String name, String tName)
	{
		playerId = id;
		playerName = name;
		teamName = tName;
	}
	
	//Parameterized Constructor with 4 arguments
	public Players(int id, String name, String tName, String date)
	{
		playerId = id;
		playerName = name;
		teamName = tName;
		birthDate = date;
	}
	
	//Parameterized Constructor with 5 arguments
	public Players(int id, String name, String tName, String date, String appearance)
	{
		playerId = id;
		playerName = name;
		teamName = tName;
		birthDate = date;
		playerAppearances = appearance;
	}
	
	//Getter methods
	
	public int getId()
	{
		return playerId;
	}
	public String getName()
	{
		return playerName;
	}
	public String getTeamName()
	{
		return teamName;
	}
	public String getDate()
	{
		return birthDate;
	}
	public String getAppearance()
	{
		return playerAppearances;
	}
	
	
	//Setters
	public void setId(int pId)
	{
		playerId = pId;
	}
	public void setName(String pName)
	{
		playerName = pName;
	}
	public void setTeamName(String tmName)
	{
		teamName = tmName;
	}
	public void setDate(String bDate)
	{
		birthDate = bDate;
	}
	public void setAppearances(String pAppearance)
	{
		playerAppearances = pAppearance;
	}
	
	//Setter method with multiple variables
	public void setAllData(int id, String name, String tName, String date, String appearance)
	{
		playerId = id;
		playerName = name;
		teamName = tName;
		birthDate = date;
		playerAppearances = appearance;
	}

}


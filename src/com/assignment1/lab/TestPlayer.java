package com.assignment1.lab;

public class TestPlayer {

	public static void main(String[] args) {
		
		//Instantiate an object
		Players hockeyPlayer = new Players();
		
		//Display the Default values
		System.out.println("\tThe Default Values are as follows\n\t");
		System.out.println("Player's Id: " +hockeyPlayer.getId());
		System.out.println("Player's Name: " +hockeyPlayer.getName());
		System.out.println("Player's Team Name: " +hockeyPlayer.getTeamName());
		System.out.println("Player's Birth date: " +hockeyPlayer.getDate());
		System.out.println("Player's appearance: " +hockeyPlayer.getAppearance());
		
		//Assigning Values to Class variables using setter methods
		hockeyPlayer.setId(101);
		hockeyPlayer.setName("Max");
		hockeyPlayer.setTeamName("Team A");
		hockeyPlayer.setDate("25/07/1996");
		hockeyPlayer.setAppearances("Height: 5'4\" Weight: 70kg");
		//hockeyPlayer.setAllData(30, "Max", "Team A", "25/07/1996","Height: 5'4\" Weight: 70Kg");
			
		
		//Display the values after setting them using setter methods
		System.out.println("\n\tAfter Setting the values the data is as follows\n\t");
		System.out.println("Player's Id: " +hockeyPlayer.getId());
		System.out.println("Player's Name: " +hockeyPlayer.getName());
		System.out.println("Player's Team Name: " +hockeyPlayer.getTeamName());
		System.out.println("Player's Birth date: " +hockeyPlayer.getDate());
		System.out.println("Player's appearance: " +hockeyPlayer.getAppearance());

	}

}


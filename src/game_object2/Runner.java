package game_object2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;


public class Runner {

 

    public static void main(String [] args){
	
    
	
	
	//test Puzzle object andn values from PuzzleController class.
	try {
		PuzzleController.setPuzzleFromText();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		String errorMessage = "Error writing from file : Puzzle.txt";
		e.printStackTrace();
		System.out.println(errorMessage);
		
	}
	System.out.println("From: " + PuzzleController.class.getName());
	System.out.println(PuzzleController.getPuzzleR8().getPuzzleMap().get("Riddle"));
	System.out.println(PuzzleController.getPuzzleR1().getPuzzleMap());
    
	

	//test Room object andn values from PuzzleController class.
	try {
		RoomController.setRoomFromText();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		String errorMessage = "Error writing from file : Puzzle.txt";
		e.printStackTrace();
		System.out.println(errorMessage);
		
	}
	System.out.println("From: " + RoomController.class.getName());
	//System.out.println(RoomController.getRoomB3().getRoomMap().get("Riddle"));
	//System.out.println(RoomController.getRoomB3().getRoomMap());
	//System.out.println(RoomController.getRoomA2().toString());
	//System.out.println(RoomController.a2Map);
	//System.out.println(RoomController.b1Map);
	System.out.println(RoomController.roomA2);
	System.out.println(RoomController.roomB1);
	System.out.println(RoomController.roomB2);
	System.out.println(RoomController.roomC1);
	System.out.println(RoomController.roomC2);
	System.out.println(RoomController.roomA3);
	System.out.println(RoomController.roomA4);
	System.out.println(RoomController.roomB3);
	System.out.println(RoomController.roomB4); 
	System.out.println(RoomController.roomB5); // first 10 rooms
	
	
	System.out.println(RoomController.roomD2);
	System.out.println(RoomController.roomD1);
	System.out.println(RoomController.roomD3);
	System.out.println(RoomController.roomE2);
	System.out.println(RoomController.roomE3);
	System.out.println(RoomController.roomC4);
	System.out.println(RoomController.roomA4);
	System.out.println(RoomController.roomC5);
	System.out.println(RoomController.roomD4);
	System.out.println(RoomController.roomD5);
	System.out.println(RoomController.roomE4); // second 10 rooms
	
	System.out.println(RoomController.roomA1); 
	System.out.println(RoomController.roomE1); 
	System.out.println(RoomController.roomA5); 
	System.out.println(RoomController.roomE5); //4
	
	
	System.out.println(RoomController.entranceChamberRoom); 
	System.out.println(RoomController.connectingChamberRoom); 
	System.out.println(RoomController.spiralStaircaseRoom); 
	System.out.println(RoomController.guardLockedDoorRoom); 
	System.out.println(RoomController.sorcererBossFightRoom); 
	System.out.println(RoomController.stairsB1FRoom); 
	System.out.println(RoomController.necromancerRoom); //7 special
	
	System.out.println(RoomController.necromancerRoom); // First 10 Rooms being printed in console for testing purposes. 
 //System.out.println(RoomController.toString());//testing the get method from the Room class to see if an object is actually created. You can aslo change the filed to whicheevr you want. 

		
	
	
    }
	
}




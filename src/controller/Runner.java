package controller;

import model.Monster;

import java.io.IOException;

public class Runner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ItemController.setItemFromText();//This gets item from text, store in map and relates to item object
  // System.out.println(ItemController.getItemW1().getItemID());
   //System.out.println(ItemController.getItemW1().getItemMap());
   //System.out.println(ItemController.getItemW2().getItemMap());
   //PuzzleController.setPuzzleFromText();
   //System.out.println(ItemController.itemW2);
   System.out.println(ItemController.getItemk15());
		//System.out.println(MonsterController.getM2Monster());
		MonsterController.setMonsterFromText();
	}

}
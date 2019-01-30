

# Citadel of Storms : A text based game.
<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->
**Table of Contents**  
- [Citadel of Storms : A text based game.](#citadel-of-storms--a-text-based-game)
 - [Game screenshot](#game-screenshot)
  - [Motivation](#motivation)
  - [Contributors](#contributors)
      - [Project Roles:](#project-roles)
  - [Technology and tools](#technology-and-tools)
  - [Code Snippet](#code-snippet)
  - [Acknowledgments](#acknowledgments)
  - [License & copyright](#license--copyright)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->


## Game screenshot


### Uer Login Screen
|             |
|:-----------:|
|![Login][]| 

### Post Game Login
|             | 
|:-----------:|
|![DisplayA][]| 

### Game Map and Instruction
|             | 
|:-----------:|
|![DisplayC][]| 

### Game GUI
|             | 
|:-----------:|
|![DisplayB][]| 




Code and document details for whack-an-animal users and interested developers. Suggestions, 
and recommendations are welcome.

## Motivation
Citadel of storms is a text - based adventure  game.

In fulfillment of expectation for STEC 3860 : Software development I, at Georgia Gwinnett College.

[comment]: #---
## Contributors
 Aaleyah Joseph, Adefemi Kolawole, Scott Nguyen.
 
#### Project Roles:
   **1. Aaleyah Joseph -** _Graphics Designer_   
   **2. Adefemi Kolawole -** _Team Lead_   
   **3. Scott Nguyen -** _Documentation Lead._ 

[comment]: #---

## Technology and tools

 * Programming Language : __Java__. You can view Java's *[documentation][]* . You can also download  Java's _version 8_ Jdk *[here][]*

---

## Code Snippet
	package view;
	import controller.GameController;
	import javafx.application.Application;
	import javafx.scene.Scene;
	import javafx.stage.Stage;

	public class GUI extends Application {

	private static Stage stage;
	 private static Scene scene;


	 @Override
	 public void start(Stage primaryStage) throws Exception {
        stage = primaryStage; //link our primaryStage variable to the GUI's primary stage so we can be able to acces it in the                  contoroller. 
        GameController guiController = new GameController(); //instance of gui controller which controlls all instances of gui-view and          classes-model
        //guiController.setNodesForGui();
        guiController.setSceneAndStageForGUI(); // this updates GUi accordingly...
        guiController.getUserInputFromTextField();
        guiController.setRoomDetails();
        // show the gui upon running the app
        primaryStage.show();
    }
	    public static void main(String[] args) {
		Application.launch(args);
	    }

	    // static getters and setters
	    public static Stage getStage() {
		return stage;
	    }

	    public static void setStage(Stage stage) {
		GUI.stage = stage;
	    }


	    public static Scene getScene() {
		return scene;
	    }

	    public static void setScene(Scene scene) {
		GUI.scene = scene;
	    }

	}



## Acknowledgments
Special thanks to the following faculty member who helped in directing us in this project.
 * Dr. Rahaf Barakat


## License & copyright

*© Adefemi Kolawole, Aaleyah Joseph, Scott Nguyen.* Georgia Gwinnett College.

[comment]: # (the following are footnotes and links)

[processing.js]: https://processing.org/  "Processing Homepage"
[here]: https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html  "Java 8 Download"
[documentation]: https://docs.oracle.com/en/java/javase/11/
[displayA]: https://github.com/ElijahKolawole/Team_Avengers_Fall2018/blob/master/src/image/page-one.PNG  "Login Image"
[displayB]: https://github.com/ElijahKolawole/Team_Avengers_Fall2018/blob/master/src/image/page-two.PNG  "Game UI Image"

[displayC]: https://github.com/ElijahKolawole/Team_Avengers_Fall2018/blob/master/src/image/page-three.PNG "Map and Instruction"

[login]: https://github.com/ElijahKolawole/Team_Avengers_Fall2018/blob/master/src/image/login.PNG "User Login"












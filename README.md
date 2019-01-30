# Citadel of Storms : A text based game.

|Loading Game | Game UI      |
|:-----------:|:----------:  |
|![DisplayA][]| ![DisplayB][]|


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
		void setup() { //This is the setUp method that is ran only once in the game to  
		  initiate every other processes in the draw method
		  seconds =0; 
		  minutes =33;
		  randomlyCreateBunnies = false; 
		  textFont = createFont("data.Consolas-48.vlw", 48); //our new font to write text 
		  //drawBunny = false;
		  scoreBunny = false;
		  score = 0; //initial value of score
		  ArrayList holeArray =  new ArrayList<Holes>(); //This arrayList stores the six hole objects, so we can create the six circles from the same (1) Hole object instead of creating six different circles
		  holeArray.add(hole1a);//adds hole1 to the ArrayList, name holeArray
		  holeArray.add(hole1b);//adds hole2 to the ArrayList
		  holeArray.add(hole1c);//adds hole3 to the ArrayList
		  holeArray.add(hole2a);//adds hole4 to the ArrayList
		  holeArray.add(hole2b);//adds hole5 to the ArrayList
		  holeArray.add(hole1c);//adds hole6 to the ArrayList
		  start=3;
		  mouseClicked =0;//initial value of mouseClicked

		  size (594, 842);//The width and heigth of the game window

		  //frameRate(250);//the rate/speed with which the images are displayed when the game is run.
		  background =  loadImage ("background.png");//stores the background  image into background variable
		  goodBunny = loadImage("goodBunny.png");//stores a bunny image into the goodBunny variable
		  goodBunny.resize(85, 85);//resize the bunny image to specified width and heigth
		  hammer = loadImage("hammer.png");//stores an hammer image into hammer variable
		  background.resize(594, 842);//resizes the background image
		  font1 = loadFont("AgencyFB-Bold-48.vlw");
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

[displayC]: https://github.com/ElijahKolawole/https://github.com/ElijahKolawole/Team_Avengers_Fall2018/blob/master/src/image/page-three.PNG  "Map and Instruction"












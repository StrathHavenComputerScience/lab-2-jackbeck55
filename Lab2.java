public class Lab2
{
  public static void cleanSquare()
  {
    Robot.load("square.txt");
    Robot.setDelay(0.1);    
    cleaningTheWholeSquare();
    cleaningTheWholeSquare();
    cleaningTheWholeSquare();
    cleaningTheWholeSquare();
  }
  
  public static void moveAndlight()
  {
    //before: Robot has not moved or made a block light
    //after: The robot moves one space and makes it light
    Robot.move();
    Robot.makeLight();
  }
  
  public static void moveAndlight5()
  {
      //before: None of the blocks are light
      //after: Robot makes five of the blocks light
      moveAndlight();
      moveAndlight();
      moveAndlight();
      moveAndlight();
      moveAndlight();      
  }
   
  public static void cleaningTheWholeSquare()
  {
    //before: None of the spaces are light and the robot hasn't turned left at the end of the line
    //after: moves the robot six spaces and lights the first five spaces and then at the end of the sixth space it turns left
    moveAndlight5();
    Robot.move();
    Robot.turnLeft();
  }
  
 
  
  
  
  
  public static void darkenComb()
  {
    Robot.load("comb.txt");
    Robot.setDelay(0.05);
    darkBackNew();
    darkBackNew();
    darkBackNew();
    darkBackNew();
    DarkLine();
    Robot.makeDark();
          }
  
  public static void darkBackNew()
  {
    //before: None of the squares have been darkened
    //after: Robot darks a string of squares and then goes back to the begging and starts a new line
    DarkLine();
    goBack();
    startNewLine();
  }
  
  public static void DarkLine()
  {
   //before: Robot has not turned and none of them have been darkened
   //after: robot turns right at the begining and then moves forward and one block and darkens that block six times
   turnRight();   
   darkAndMoveTwoSquares();
   darkAndMoveTwoSquares();
   darkAndMoveTwoSquares();
   darkAndMoveTwoSquares();
   darkAndMoveTwoSquares();
   darkAndMoveTwoSquares();
  }
  
  public static void darkAndMoveTwoSquares()
  {
      //before: spot isn't dark
      //after: makes a spot dark and moves forward one
      Robot.makeDark();
      Robot.move();
    }
  
  public static void turnRight()
  {
      Robot.turnLeft();
      Robot.turnLeft();
      Robot.turnLeft();
  }
  
  public static void goBack()
  {
      //before: The last block isn't dark and the robot hasn't gone back to the start
      //after: makes the last block dark and turn around and go back six blocks
      Robot.makeDark();
      Robot.turnLeft();
      Robot.turnLeft();
      backSix();
  }
  
  public static void backSix()
  {
      Robot.move();
      Robot.move();
      Robot.move();
      Robot.move();
      Robot.move();
      Robot.move();
  }
  
  public static void startNewLine()
  {
      //before: robot has not moved forward and the block it should darken has not been darkend
      //after: turns the robot to the right has it move forward one mand ake a dark block and then move forward again    
      turnRight();
      Robot.move();
      Robot.makeDark();
      Robot.move();
        }
  
    
    
    
  public static void makeCheckered()
  {
    Robot.load("blank.txt");
    Robot.setDelay(0.05);
    repeatEachCheckLine();
    repeatEachCheckLine();
    repeatEachCheckLine();
    checkLine1();
    shadeNotshaded();
    shadeNotshaded();
    shadeNotshaded();
    Robot.makeDark();
  }
  
  public static void checkLine1()
  {
      //before: None of the first two lines have been shaded
      //after: makes the type of line where it starts with it being shaded and turns it around into the second type of line where it starts not shaded
      shadeNotshaded();
      shadeNotshaded();
      shadeNotshaded();
      Robot.makeDark();
      Robot.move();
      turnRight();
      Robot.move();
      turnRight();
  }
  
  public static void checkLine2()
  {
     //before: None of the first two lines have been shaded
     //after: makes the type of line where it starts with it not being shaded then turns aroung into the other type of line
     shadeNotshaded();
     shadeNotshaded();
     shadeNotshaded();
     Robot.makeDark();
     Robot.move();
     Robot.turnLeft();
     Robot.move();
     Robot.turnLeft();
  }
  
  public static void shadeNotshaded()
  {
      //before: the block it is standing on isn't dark and has't moved
      //after: makes the robot make the block it's standing on dark than moves forward two blocks
      Robot.makeDark();
      Robot.move();
      Robot.move();
  }
  //combines the two parameters
  public static void repeatEachCheckLine()
  {
    //before: None of the two lines have been shaded properly
    //after: The two lines have been shaded properly
    checkLine1();
    checkLine2();
  }
  
  }

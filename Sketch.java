import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(105, 245, 231);
  }
  
  public void draw(){
    drawFlower(150, 150, 75);
    drawFlower(300, 300, 75);
    drawFlower(450, 450, 75);
    drawFlower(600, 300, 75);
    drawFlower(750, 450, 75);
    drawFlower(900, 300, 75);
    drawFlower(1050, 150, 75);

    drawCube(100, 450, 100, 100, 198, 24, 242, 246, 242, 247);
    drawCube(550, 500, 100, 100, 255, 4, 0, 250, 10, 250);
    drawCube(1000, 450, 100, 100, 0, 0, 0, 55, 255, 0);
    drawCube(250, 75, 100, 100, 72, 247, 86, 0, 255, 238);
    drawCube(300, 85, 100, 100, 237, 107, 14, 16, 33, 222);
    drawCube(350, 95, 100, 100, 244, 242, 245, 86, 99, 16);
    drawCube(400, 85, 100, 100, 99, 42, 16, 128, 255, 246);
    drawCube(450, 75, 100, 100, 255, 128, 249, 214, 208, 15);
    drawCube(500, 65, 100, 100, 205, 18, 78, 98, 105, 158);
    drawCube(550, 55, 100, 100, 126, 9, 132, 206, 170, 84);
    drawCube(600, 65, 100, 100, 157, 246, 49, 8, 147, 190);
    drawCube(650, 75, 100, 100, 237, 208, 199, 239, 71, 0);
    drawCube(700, 75, 100, 100, 255, 196, 0, 10, 250, 230);
    
    float newX = drawCircle(25,25,50);
    newX = drawCircle(newX,25,50);
    newX = drawCircle(newX,25,50);
    newX = drawCircle(newX,25,50);
    newX = drawCircle(newX,25,50);
    newX = drawCircle(newX,25,50);
    newX = drawCircle(newX,25,50);
    newX = drawCircle(newX,25,50);
    newX = drawCircle(newX,25,50);
    newX = drawCircle(newX,25,50);
    newX = drawCircle(newX,25,50);
    newX = drawCircle(newX,25,50);
    newX = drawCircle(newX,25,50);
    newX = drawCircle(newX,25,50);
    newX = drawCircle(newX,25,50);
    newX = drawCircle(newX,25,50);
    newX = drawCircle(newX,25,50);
    newX = drawCircle(newX,25,50);
    newX = drawCircle(newX,25,50);
    newX = drawCircle(newX,25,50);
    newX = drawCircle(newX,25,50);
    newX = drawCircle(newX,25,50);
    newX = drawCircle(newX,25,50);
    newX = drawCircle(newX,25,50);

  }

  /**
   * Draws the flowers
   * 
   * @param flowerX1  X coordinate of petal
   * @param flowerY1  Y coordinate of petal
   * @param flowerDiameter  Diameter of the petals
   */
  public void drawFlower(float flowerX1, float flowerY1, float flowerDiameter) {
    // Declare the variables of Flower

    // Draw flower petals of Flower
    fill(250, 238, 2);
    ellipse(flowerX1 - 30, flowerY1 - 30, flowerDiameter - 10, flowerDiameter - 10);
    ellipse(flowerX1 + 30, flowerY1 - 30, flowerDiameter - 10, flowerDiameter - 10);
    ellipse(flowerX1 - 30, flowerY1 + 30, flowerDiameter - 10, flowerDiameter - 10);
    ellipse(flowerX1 + 30, flowerY1 + 30, flowerDiameter - 10, flowerDiameter - 10);

    // Draw middle of Flower
    fill(20, 23, 20);
    ellipse(flowerX1, flowerY1, flowerDiameter - 30, flowerDiameter - 30);

  }
    
    /*
     * Draws the Cube Faces
     * 
     * @param cubeX    X coordinate of square
     * @param cubeY    Y coordinate of square
     * @param cubeWidth    Width of square
     * @param cubeHeight   Height of square
     * @cubeColour1, cubeColour2, cubeColour3    RGB colour of square
     * @eyesColour1, eyesColour2, eyesColour3    RGB colour of eyes and mouth
     */

    public void drawCube(float cubeX, float cubeY, float cubeWidth, float cubeHeight, int cubeColour1, int cubeColour2, int cubeColour3, int eyesColour1, int eyesColour2, int eyesColour3) {
      // fill colour of body
      fill(cubeColour1, cubeColour2, cubeColour3);

      // draw the body
      rect(cubeX, cubeY, cubeWidth, cubeHeight);

      // fill colour of eyes
      fill(eyesColour1, eyesColour2, eyesColour3);

      // draw eyes
      rect((float)(cubeX + 15), (float)(cubeY + 20), (float)(cubeWidth * 0.2), (float)(cubeHeight * 0.2));
      rect((float)(cubeX + 65), (float)(cubeY + 20), (float)(cubeWidth * 0.2), (float)(cubeHeight * 0.2));

      // draw mouth
      rect((float)(cubeX + 15), (float)(cubeY + 65), (float)(cubeWidth * 0.7), (float)(cubeHeight * 0.2));

    }
    
    /*
     * Draws repeating pink circles at the top of the screen
     * 
     * @param x   X coordinate of the original circle
     * @param y   Y coordinate of the circle
     * @param dia   Diameter of the circles
     * @newX      Updated X coordinate of the circle after it is returned
     */

    public float drawCircle(float x, float y, float dia){
    
      // draws the original circle
      fill(252, 3, 182);
      ellipse(x, y, dia, dia);
      
      // increases the X value by the diameter.  This will create a chain of circles.  Returns the new value as variable newX
      float newX = x + dia;

      return newX;
    }
}   




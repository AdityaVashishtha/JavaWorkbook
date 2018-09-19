import java.io.Serializable;

public class Game implements Serializable {
    private int xPos;
    private int yPos;

    public Game() {
        //default constructor
    }
    public Game(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    public int getXPos() {
        return this.xPos;
    }

    public int getYPos() {
        return this.yPos;
    }

    public void changePos(int xStep, int yStep) {
        this.xPos += xStep;
        this.yPos += yStep;
    }

    public void displayPos() {
        System.out.println("Current Pos: X: "+this.xPos+" ,Y: "+this.yPos);
    }

}
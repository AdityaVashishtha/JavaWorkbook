public class ThreeDGame extends Game {
    private int zPos;    

    public ThreeDGame() {

        //default constructor
    }
    public ThreeDGame(int xPos, int yPos, int zPos) {
        super(xPos,yPos);
        this.zPos = zPos;
    }

    public void setZPos(int zPos) {
        this.zPos = zPos;
    }

    public int getZPos() {
        return this.zPos;
    }
    

    public void changePos(int xStep, int yStep, int zStep) {
        changePos(xStep,yStep);
        this.zPos += zStep;
    }

    public void displayPos() {
        System.out.println("Current Pos: X: "+this.getXPos()+" ,Y: "+this.getYPos()+" ,Z: "+this.zPos);
    }

}
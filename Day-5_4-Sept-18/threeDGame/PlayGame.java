import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.File;


public class PlayGame {
    public static void main(String[] args) throws Exception {
        if(args.length == 4) {
            int choice = Integer.parseInt(args[0]);
            int xStep = Integer.parseInt(args[1]);
            int yStep = Integer.parseInt(args[2]);
            int zStep = Integer.parseInt(args[3]);
            ThreeDGame game = null;
            switch (choice) {
                case 1:
                    System.out.println("Starting new 3d game");
                    game = new ThreeDGame(xStep,yStep,zStep);                    
                    break;
                case 2: 
                    File file = new File("game.data");
                    if(file.exists()) {
                        FileInputStream fis = new FileInputStream(file);
                        ObjectInputStream ois = new ObjectInputStream(fis);
                        game = (ThreeDGame) ois.readObject();
                        game.changePos(xStep,yStep,zStep);
                        fis.close();
                        ois.close();
                    }      
                    break;                                  
                default:
                    break;
            }    
            if(game !=null) {
                game.displayPos();
                File file = new File("game.data");
                FileOutputStream fos =  new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(game);
                fos.close();
                oos.close();
            } else {
                System.out.println("No game to play");
            }
            
        } else {
            System.out.println("Wrong number of params");
        }
    }
}
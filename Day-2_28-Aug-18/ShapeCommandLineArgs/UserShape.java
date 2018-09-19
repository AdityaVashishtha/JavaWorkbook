
public class UserShape {

    public static void circleArea(int radius) {
        int area = (int)Math.PI*radius*radius;
        System.out.println("Area of Circle : "+area);
    }

    public static void squareArea(int side) {
        int area = side*side;
        System.out.println("Area of Square : "+area);
    }

    public static void main(String args[]) {
        if(args.length == 2) {            
            if(args[0].equals("1")) {                
                UserShape.circleArea(Integer.parseInt(args[1]));
            } else if (args[0].equals("2")) {
                // call square
                UserShape.squareArea(Integer.parseInt(args[1]));
            }
        }    else {
            System.out.println("Please pass 2 arguments");
        }    
    }
}
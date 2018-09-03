public class ThrowCustomExceptionDemo {
    public static void main(String[] args) {
        int x=0,y=0,res=0;
        try {
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            if(x<y)
                throw new BigNoException();
            res = x/y;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.err.println("Some unknown error");
            e.printStackTrace();
        }
        
    }
}
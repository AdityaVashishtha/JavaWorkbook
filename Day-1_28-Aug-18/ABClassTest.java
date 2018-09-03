public class ABClassTest {
	public static void main(String args[]) {
		TestMain.main(args);
		System.out.println("INSIDE CALLING MAIN CLASS' MAIN METHOD");
	}
}

class TestMain {
	public static void main(String args[]) {
		System.out.println("INSIDE CALLED CLASS' MAIN METHOD");
	}
}
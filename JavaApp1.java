// just to have the syntax of main etc
// javac JavaApp1.java
// java JavaApp1
// jar -cvmf manifest.txt app1.jar *.class
// java -jar app1.jar

public class JavaApp1{
	
	static class Cord {
		String s;
		void drawIt() {
			System.out.println(s);
		}
	}
	
	static void Loppy (int y) {
		int x = 1;
		
		Cord one = new Cord();
		one.s = "*";
		while (x < y) {
			if (x == 1) {
				System.out.println("start:");
			}
			one.drawIt();
			System.out.println("..." + x);
			x = x + 1;
		}
	}
	
	public static void main (String[] args) {
		Loppy(5);
		System.out.println("Hello World");
	}
}


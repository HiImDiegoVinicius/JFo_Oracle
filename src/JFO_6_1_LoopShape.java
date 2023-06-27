public class JFO_6_1_LoopShape {
    public static void main(String[] args) {
		createRectangle(5,4);
		createTriangle(5);
	}
	
	public static void createTriangle(int height) {
		if (height < 1) {
			throw new IllegalArgumentException("Invalid number");
		}
	
		for (int i = 1; i <= height; i++) {
			
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i) {
					System.out.print("#");					
				} else if (i == height) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.print("\n");
		}
	}
	
	public static void createRectangle(int columns, int lines) {
		if (columns < 1 || lines < 1) {
			throw new IllegalArgumentException("Invalid number");
		}
		
		for (int i = 1; i <= lines ; i++) {
			
			for (int j = 1; j <= columns ; j++) {
				if (i == 1 || i == lines) {
					System.out.print("#");
				} else if (j == 1 || j == columns) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			
			System.out.print("\n");
		}
	}

}


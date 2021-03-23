import java.util.Scanner;
public class RectangleWithCircle {
	public static void main(String[] args) {		

		int height = readNumber("height");
		int width = readNumber("width");
		
		CreateShape(height, width);
	}

	public static int readNumber(String prompt){
		Scanner scan = new Scanner(System.in); 	

		System.out.print("Please enter " + prompt + " of the rectangle: ");
		int value = scan.nextInt();
		return value;
	}

	private static void CreateShape(int height, int width) {
		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){

				if((int)Math.pow((i-height/2)*height, 2) + (int)Math.pow((j-width/2)*width, 2) < (int)Math.pow(height*width,2)/8){
					if (i == height/2 && j == width/2){
					System.out.print(" ");
					}
					else{
						System.out.print("0");
					}
			}
				else{
				System.out.print("#");
				}
			}
		System.out.println("");
		}
	}

}

// There may be some logical probelm the over looks great in square but its abit off in rectangle.

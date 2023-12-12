import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Day01Part2 {

	public Day01Part2() {
	}

	public static void main(String[] args) throws FileNotFoundException{
		Scanner scanner = new Scanner(new File("./src/Day01Inputter.txt"));
		int total = 0;
		
		while(scanner.hasNext()) {
			String currLine = scanner.nextLine();
			System.out.print(currLine + " ");
			String lineForFirst = currLine;
			String lineForLast = currLine;
			for(int i = 0; i < currLine.length(); i++) {
				if(Character.isDigit(currLine.charAt(i))) {
					total += 10 * Character.getNumericValue(currLine.charAt(i));
					System.out.print(Character.getNumericValue(currLine.charAt(i)));
					break;
				}
			}
			for(int i = currLine.length() - 1; i >= 0; i--) {
				if(Character.isDigit(currLine.charAt(i))) {
					total += Character.getNumericValue(currLine.charAt(i));
					System.out.print(Character.getNumericValue(currLine.charAt(i)) + " ");
					break;
				}
			}
			System.out.println(total);
		}
		System.out.println(total);
	}

}
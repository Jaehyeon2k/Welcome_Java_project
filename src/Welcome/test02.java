package Welcome;
import java.util.*;

public class test02 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        int userInput = 0;
	        
	        while (true) {
	            try {
	                System.out.print("정수를 입력하세요: ");
	                userInput = Integer.parseInt(scanner.nextLine()); // 입력 받은 값을 정수로 변환
	                break; // 정수가 입력되면 반복문 종료
	            } catch (NumberFormatException e) {
	                System.out.println("잘못된 입력입니다. 정수를 입력해주세요.");
	            }
	        }
	        
	        System.out.println("입력한 정수는: " + userInput);
	        scanner.close();

	}

}

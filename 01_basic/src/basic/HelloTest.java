package basic;

public class HelloTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Hello Java");
		System.out.println();
		System.out.print("안녕하세요\n");
		System.out.print("Hello\n");
		System.out.println(25+26);
		System.out.println("25+26");
		System.out.println("25" +" 26");
		System.out.println("25 + 36 = 61");
		System.out.println("25 + 26 = " + (25 + 36));
		System.out.println("25 / 26 = " + (25 / 36)); // 정수/정수 = 몫 만 나온다.
		System.out.println("25 / 26 = " + (25.0 / 36)); // 실수/정수 = 실수
		System.out.println("25 / 26 = " + ((double)25 / 36)); // 형변환
		System.out.println("25 / 26 = " + String.format("%.3f",(double)25 / 36)); // 소수 3자리수 
		System.out.print("50 + 49\10t");
		System.out.print("5 + 49");
		
	}// 실행 우클릭 - Run as - Java Application   2. Ctrl + F11 

}

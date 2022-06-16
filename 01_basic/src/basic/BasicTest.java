package basic;

public class BasicTest {

	public static void main(String[] args) {
		System.out.println('A' + 3);// TODO Auto-generated method stub
		System.out.println( (char)('A' + 3) );// TODO Auto-generated method stub
		System.out.println( (char)('A' + 32) );// TODO Auto-generated method stub
		System.out.println("A" + 3);
		System.out.println(2 + 5);		//7
		System.out.println('2' + '5'); //103
		System.out.println(('2'-48 + '5'-48)); // 7 
		System.out.println("2" + "5"); //"25"
		System.out.println(Integer.parseInt("2") + "5"); // class로 캐스팅 필요
		System.out.println(Integer.parseInt("2") + Double.parseDouble("5")); // class로 캐스팅 필요
		System.out.println(Integer.parseInt("2") + Double.parseDouble("5"));
		
	}

}

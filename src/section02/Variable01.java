package section02;



/*
 * 1. 논리형(boolean)
 * 	true, false 두가지 값을 가지는 기본 자료형
 * 	1byte (논리형은 1bit처럼 보이지만 바이트임)
 * 선언방법
 * 	boolean 변수명;
 * 
 */

public class Variable01 {
	public static void main(String[] args) {
		// 논리형 변수 선언하기
		boolean isWait;
		// 선언한 변수에 값 대입하기
		isWait = true;
		// 저장된 값을 문자열로 출력하기
		System.out.println("논리형 변수에 저장된 값: "+ isWait);
		
		// 선언과 동시 대입하기
		boolean isRun = false;
		
		isRun = false;	// 변수 값 변경
		System.out.println(isRun);
		
	/*
	 * if 절을 사용한 조건문
	 * 1. 문자열
	 */
		String check1 = "남성";
		boolean sex = check1.contains("여성");
		if (sex) 
		{ 
			System.out.println("여성"); 
		}
		else
		{
			System.out.println("성별이 맞지 않습니다.");
		}
		
		// 미성년자 체크 boolean 변수와 if 조건문으로 출력하기
		
		int isAge = 15;
		boolean check2;
		
		if (isAge >= 19) 
		{
			check2 = true;
		}
		else
		{
			check2 = false;			
		}
		
		if (check2)
		{
			System.out.println("당신의 나이는 " + isAge + "입니다");
		}
		else 
		{
			System.out.println("미성년자입니다.");
		}		
	}
	
}	
		
	
		
	









package section02;
/*
 * 출력문
 * 	데이터를 화면에 출력하는 방법
 * 
 * 	System.out.println() : 괄호안 내용출력 후 행 바꿈
 *  System.out.print() : 괄호안 내용출력 행 바꿈X
 *  System.out.printf() : 문자열을 서식 문자를 이용해 형식화된 내용 출력 행 바꿈X 
 * 	
 * 	서식문자: 개발자가 값을 정해줄 수 있지만 값이 유동적으로 바뀔 수 있음. 그게 사용자가 입력한 값 혹은 DB에서 가져온 값일 수도 있음.
 * 		%d : 정수(10진수)
 * 		%o : 정수(8진수)
 * 		%x : 정수(16진수)
 * 		%f : 실수
 * 		%e : 지수(e표기 기반)
 * 		%g : 출력 대상에 따라 %e 또는 %f 형태로 출력
 * 		%s : 문자열
 * 		%c : 문자
 */

public class ConsolePrint {

	public static void main(String[] args) {
		System.out.print("Welcom.");
		
		System.out.println("Java World");
		
		System.out.printf("오늘은 %d월 %d일 입니다.\n", 4, 22);
		
		System.out.printf("%d은 첫번째, %f은 두번째, %c은 세번째.\n", 1, 2.0, '셋');

		System.out.printf("%s", "오늘 다시 시작");
		
		
		
		
	}
}






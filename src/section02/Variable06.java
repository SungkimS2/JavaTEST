package section02;
/*
 * 5. String 형(문자열)
 * 	문자열을 저장할 수 있다.
 * 	참조형
 * 
 * 선언방법
 * 	String 변수명; 객체형: 누군가 이미 만들어 놓은 코드
 * 				        -반드시 대문자로 시작함
 * 				        -코드로 되어 있다고 확인법은 Ctrl을 누른 상태로 마우스 커서를 두면 확인가능
 * 
 * 기본형 - boolean, char, byte, short, int, long, float, double
 * 		  *실제 값을 전달
 * 참조형 - 기본형을 제외한 모든 객체(클래스 코드로 되어있다)
 * 		  *주소 값을 전달
 * 		  ※속성은 '값 = 변수'과 기능(메소드(함수))을 담을 수 있다.
 */
public class Variable06 {
	public static void main(String[] args) {
		// 변수 선언과 동시에 값 대입하기
		String str = "안녕하세요.";
		System.out.println("str: " + str);

		/*
		 * 	h e l l o 
		 *  0 1 2 3 4  => 인덱스번호
 		 */
		String hello = "hello";
		System.out.println("1번 인덱스: " + hello.charAt(1));
		System.out.println("2번 인덱스부터 4번 인덱스까지: " + hello.substring(2,4));
		System.out.println("3번 인덱스부터 4번 인텍스까지:" + hello.substring(3,4));
		
		String addr1 = "서울 특별시 서대문구 신촌"; // String에 contains 기능이 있음 boolean을 통해 ~인지 아닌지를 선별해 주는 역할
		String addr2 = "미국에서 온 외국인 입니다.";
		boolean isContain = addr1.contains("외국인"); /*
												   	* addr 주석에 "외국인"은 포함이 안되므로 fales로 프린트문에서 실행되지 않음
													* 따라서 else의 프린트문이 실행됨
		 											*/
		// if 조건문
		if(isContain) {	// true 이면 실행
			System.out.println("외국인 입니다!!");
		}else {
			System.out.println("외국인2 입니다!!");
		}
		
	}

}





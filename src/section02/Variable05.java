package section02;

import java.math.BigDecimal;

/*
 * 데이터 표현방식
 * 	정수표현
 * 		컴퓨터는 2진수로 표현(bit)
 * 		(MSB)부호비트(Most Significant Bit) + 수치비트
 * 		음의 값을 표현할 때 2의보수 표현
 * 
 * 	실수표현
 * 		지수부(e)비트 + 가수부(m)비트
 *      ex) 부동소수점 표현
 *      부호/ 지수부 / 가수부
 *      MSB / 10^-1(/0.1)  / 3.14  지수부*가수부 =31.4
 *      ※위는 비유적인 표현이고 3.14에 컴퓨터는 2진수 값이 들어감 (소수점 2진수 0.14*2 나중에 찾아보기)
 *      따라서 가수부에는 3.14의 2진수 값이 들어가고 지수부에는 2의 (ㄷ한자)±N승으로 표현됨
 *      
 *      ※고정소수 표현에서 컴퓨터가 표현을 못하는 이유
 *      MSB / 31 / 4000000000 <- 컴퓨터는 소수점 이하의 값을 크기제한으로 인해 표현하지 않음(효율성이 떨어짐)
 * 		(소수점 앞과 뒤를 나눠 표현하는 것을 '고정소수'표현이라고 함)
 * 		따라서 부동소수 표현을 함.
 * 
 * 	실수표현 수식
 * 		±(1.m)*2^(e-127) 어떤 값을 가수부와 지수분에 넣어 계산해도 0이 안됨 !
 *     부동소수점오차
 * 		정확한 실수표현 불가능 근사치 값으로 인해 생긴 오차를 의미함.
 * 
 * 드래그 방법 쉬프트 + 컨트롤 방향키
 */


public class Variable05 {
	public static void main(String[] args) {
		
		float f = 0.0f;
		double d = 0.0;
		BigDecimal bd = new BigDecimal(0.0);
		BigDecimal bd2 = new BigDecimal(0.0);
		
		// for 반복문
		for(int i = 0; i < 100; i++) {
			f += 0.1f;
			d += 0.1d;
			bd = bd.add(new BigDecimal(0.1));
			bd2 = bd2.add(new BigDecimal(0.2));  
											    /*  bigdecimal 은 만들어진 구성으로 소수의 오차가 더 줄어들었음. 표현할 수 있는 
											     *  데이터 범위가 크기 때문임. 오차가 생기면 방안을 준비해야함 (ex: 소수점의 수를
											     *  절삭, 반올림, 올림 등등 대표나 사업부와 협의 후 처리.)
											     */
		}

		System.out.println(f);
		System.out.println(d);
		System.out.println(bd); 
		System.out.println(bd2);
		
		
		double fa = 0.00f;
		for(double a = 0.1f; a <= 10; a++) {
			fa += 0.01f;
			
			System.out.println(fa);
		 }
		}
	}
	









package section02;
/*
 * 형변환
 * 	1. 업캐스팅(프로모션)
 * 	 - 표현 범위가 더 큰 데이터형으로 변환하기
 * 	 - 자동으로 가능
 * 	 - 데이터 손실이 없다.
 * 
 *  2. 다운캐스팅(디모션)
 *   - 표현 범위가 더 작은 데이터형으로 변환하기
 *   - 명시적으로 해야한다.
 *   - 데이터 손실이 있을 수 있다.
 */

public class Variable07 {
	public static void main(String[] args) {
		// 업캐스팅 예
		byte iByte = 10;
		int iInt = iByte; // 자동으로 형변환
		
		float iFloat = 10.1f;
		double iDouble = iFloat; // 자동으로 형변환
		
		double iDouble2 = 1.0123456100001;
		
		// 다운캐스팅 예 (소수점을 절삭하기 위해 하기도 함.)
		float iFloat2 = (float)iDouble2; // 큰값에서 작은값으로 출력시킬 때 메모리 차이로 값이 소실될 우려가 있음.
		System.out.println("iFloat2: " + iFloat2);
		
		int iInt2 = (int)iDouble; // 실수형 값을 정수형값으로 변할 할 때 소수값이 없어지기 때문에 주의해야 함. 역시 값이 소실될 우려가 존재
		System.out.println("iInt2: " + iInt2);
	}
}












package exceptionhandling;

public class Main1 {

	public static void main(String[] args) {
		//
		int[] ar = { 10, 20, 30, 40 };
		System.out.println("예외 처리의 목적?");
		try {
			System.out.println(ar[5]); // ArrayIndexOutOfBoundsException 발생
		}
		
		catch (Exception e) {
			System.err.println(e.getMessage()); // 예외 메세지는 출력 텍스트 색상 변경을 위해 out대신 err도 사용 가능
		} 
		
		// 이 아래는 에러. Exception코드가 아래 Exception보다 상위 클래스기 때문에 에러가 발생하면
		// Exception이 다 처리하므로 도달을 할 수가 없다.
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}
	}

}

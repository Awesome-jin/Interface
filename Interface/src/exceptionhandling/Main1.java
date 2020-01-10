package exceptionhandling;

public class Main1 {

	public static void main(String[] args) {
		//
		int[] ar = { 10, 20, 30, 40 };
		System.out.println("예외 처리의 목적?");
		try {
			System.out.println(ar[5]);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("에러가 발생해도 계속 작업을 수행시키려고!");

	}

}

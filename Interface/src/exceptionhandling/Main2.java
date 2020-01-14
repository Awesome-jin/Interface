package exceptionhandling;

public class Main2 {

	public static void main(String[] args) throws InterruptedException {
		// throws로 예외를 jvm이 처리하게 하면 InterruptedException이 실제로 발생했는지 알 수가 없음
		// 가급적이면 try-catch를 하자.
		for(int i =0; i<10; i=i+1)
		{
			System.out.println("Hello Exception?");
			Thread.sleep(1000);
			i = i +1;
		}

	}

}

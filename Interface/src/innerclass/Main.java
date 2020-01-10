package innerclass;

public class Main {

	public static void main(String[] args) {
		// 실행 메소드를 만들기
		
		Anony obj = new AnonyImpl();
		obj.print(); // 인스턴스의 참조를 obj에 저장했으므로 인스턴스 재사용 가능.
		// obj라는 객체가 생겼으므로 재사용에 좋다.
		
		//굳이 한 번만 쓸거라면 이렇게 할 수 있다.
		new AnonyImpl().print(); 
		
		//클래스를 만들지 않고 Anony의 인터페이스를 사용하는 방법
		new Anony() {

			@Override
			public void print() {
				System.out.println("This is anonymous");
			}			
		}.print();

		
		
	int a = 10;
	int ar [] = {100, 200, 300};
	System.out.println(a);
	System.out.println(ar[2]);
	}

}

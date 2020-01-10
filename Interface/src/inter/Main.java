package inter;

public class Main {

	public static void main(String[] args) {
		
		// InterfacesampleImpl 클래스의 disp 메소드 호출
		// static이 아니니까 인스턴스를 만들어서 불러줘야 한다.
		// static이었다면???? 어떻게 했을까? 바로 dips(); 갖다 쓰면 됨
		
		//InterfacesampleImpl obj = new InterfacesampleImpl();
		Interfacesample obj = new InterfacesampleImpl();  //이렇게 해도 무관하다.
		obj.disp();
	}

}

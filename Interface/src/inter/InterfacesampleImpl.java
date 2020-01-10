package inter;

//Interfacesample 이라는 인터페이스를 구현한 클래스
public class InterfacesampleImpl implements Interfacesample {

	@Override
	public void disp() { //인터페이스에 있는 애들 갖다 쓸 수 있음
		System.out.println(Today); //인터페이스에 있는 변수를 가지고 와서 출력. 수정 불가
		//Today = "2020.01.11"; // cannot be assigned. 새로 할당 안돼!
	}

}

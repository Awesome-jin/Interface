package inter;

public interface Interfacesample {

	// interface기 때문에 final이 없어도 변경을 못함. 읽기 전용
	public String Today = "2020.01.10";
	
	// 이것도 abstract화 되기 때문에, Interfacesample을 implements한 곳에서 반드시 overriding해야 함
	public void disp();
	
	// 인터페이스에서 꼭 무조건 { } 안에 내용을 써야겠다면...  default를 접근 지정자로 사용해라.
	default void print() {
		
	}
	
}

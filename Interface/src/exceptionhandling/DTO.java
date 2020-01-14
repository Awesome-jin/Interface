package exceptionhandling;

public class DTO {

	// 속성은 private으로 만들고자 할 때 접근자 메소드를 public으로 선언해서 사용
	private int num;
	private String name;

	// 접근자 메소드는 Source > generate getters and setters로
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 인스턴스의 내용을 비교하는 메소드를 만들어보자
	public boolean equals(DTO other) { // 여기안에가 DTO니까 other는 아무 이름이나 쓴 것
		// 실제 내용 비교
		if (this.num == other.num && this.name.equals(other.name)) //왜 num끼리비교는 ==이고 name은 equals인지 잘 생각할 것(스칼라 vs 벡터)
		{
			return true;
		} else {
			return false;
		}
	}

	// 데이터를 표현하는 클래스를 만들 때는, Source > toString으로 만들어주자!
	@Override
	public String toString() {
		return "DTO [num=" + num + ", name=" + name + "]";
	}
	
	//인스턴스 내용을 복사해서 리턴해주는 메소드 clone 만들기
	public DTO clone( ) {
		//새로운 인스턴스를 생성
		DTO copy = new DTO( );
		copy.setNum(this.num);
		copy.setName(this.name);
		return copy;
	}
}

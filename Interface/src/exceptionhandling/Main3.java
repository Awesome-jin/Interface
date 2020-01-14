package exceptionhandling;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// DTO 클래스의 인스턴스를 만들고 내용을 채워서 출력해보자.
		
		DTO dto = new DTO();
		dto.setNum(1);
		dto.setName("태연");
		//출력까지 해보기
		// 인스턴스 이름을 출력하는 메소드에 대입하면 toString();을 호출한 결과가 출력 (안써도 무방)
		System.out.println(dto);
		
		/*
		String id = "root";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아아디 입력:");
		String input = sc.nextLine();
		
		System.out.println(id == input);
		System.out.println(id.equals(input));
		
		sc.close();
		*/
		
		DTO dto2 = new DTO();
		dto2.setNum(1);
		dto2.setName("태연");
		
		//참조를 비교하기 == : 각각 new로 인스턴스를 새로 만들었기 때문에 참조가 다르다.
		System.out.println(dto == dto2);
		// 내용을 비교하기 위한 메소드가 필요하다. : equals
		System.out.println(dto.equals(dto2));
		
		//참조를 복사하는 건 위험하다 - 하나의 변경이 다른 것에도 영향을 주게 된다.
		DTO dto3 = dto;
		dto3.setNum(2);
		System.out.println(dto);
		
		//내용을 복사해버리면?? - 영향을 주지 않는다!
		DTO dto4 = dto.clone();
		dto4.setNum(3);
		System.out.println(dto4);
		System.out.println(dto);
	}

}

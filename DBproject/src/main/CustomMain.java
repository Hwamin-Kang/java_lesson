package main;

import java.util.List;
import java.util.Scanner;

import dao.CustomDao;
import vo.CustomVo;


public class CustomMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 회원등록 2. 회원리스트 3. 회원조회 4. 회원정보 변경 5.회원탈퇴 6. 프로그램 종료");
		
		boolean run = true;
		CustomDao dao = CustomDao.getInstance(); //싱글턴패턴의 Dao 객체 생성
		while(run) {
			System.out.print("선택해: ");
			String sel = sc.nextLine();
			
			switch (sel) {
			case "1":
				//회원ID의 무결성 조건 검사(중복값 검사)
				String custom_id;
				while(true) {
					System.out.print("사용할 ID 입력 >>> ");
					custom_id = sc.nextLine();
					if(dao.getOne(custom_id) != null) {
						System.out.println("사용할 수 없는 ID이다.");
					}
					else {
						System.out.println("사용할 수 있는 ID이다.");
						break;
					}
				}
				System.out.println("이름 입력 >>> ");
				String name = sc.nextLine();
				CustomVo vo2 = new CustomVo(); vo2.setName(name); vo2.setCustom_id(custom_id);
				dao.insert(vo2);
				break;
			case "2":
				List<CustomVo> list = dao.getList();
				System.out.println(list);
				break;
			case "3":
				System.out.print("조회할 고객 ID 입력 >>> ");
				String id = sc.nextLine();
				CustomVo vo = dao.getOne(id);
				if (vo != null) System.out.println(vo);
				else System.out.println("조회 결과가 없다.");
				System.out.println(vo);
				break;
			case "4":
				System.out.println("정보 변경할 ID 입력 : ");
				custom_id = sc.nextLine();
				vo2 = dao.getOne(custom_id);
				if(vo2 == null) {
					System.out.println("없는 회원 id이다.");
				} else {
					System.out.println(String.format("현재 회원정보 email : %s, age : %d", vo2.getEmail(), vo2.getAge()));
					System.out.print("변경할 email : ");
					String email = sc.nextLine();
					System.out.print("변경할 나이 : ");
					int age = Integer.parseInt(sc.nextLine());
					vo2 = new CustomVo(); vo2.setAge(age); vo2.setEmail(email); vo2.setCustom_id(custom_id);
					dao.update(vo2);
					System.out.println("변경 완료");
					System.out.println(dao.getOne(custom_id));
				}
				break;
			case "5":
				System.out.println("탈퇴할 ID 입력: ");
				custom_id = sc.nextLine();
				if(dao.getOne(custom_id) == null) {
					System.out.println("없는 회원ID");
				} else {
					System.out.print("탈퇴할거야? 구매내역과 적립포인트가 삭제된다(y:yes) >>> ");
					if(sc.nextLine().equals("y")) {
						if(dao.delete(custom_id) == 1) {
							System.out.println("탈퇴 완료했다.");
						}
					} else {
						System.out.println("회원탈퇴 취소했다.");
					}
				}
				break;
			case "6":
				run = false;
				break;
			default:
				System.out.println("메뉴 선택 다시해라.(1 ~ 5)");
			}
			
		}
		System.out.println("-------END-------");
		sc.close();

	}

}

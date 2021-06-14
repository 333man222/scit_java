package net.scit41.shop.ui;

import java.util.List;
import java.util.Scanner;

import net.scit41.shop.service.ProductService;
import net.scit41.shop.vo.ProductVO;

// 화면에 보여지는 모든 처리를 담당하는 메서드
public class ProductUI {
	Scanner keyin = new Scanner(System.in);
	ProductService service = new ProductService();	//서비스 객체를 생성하는 코드
	
	public ProductUI() {
		String choice = null;
		
		while(true) {
			menu();
			choice = keyin.next();
			switch(choice) {
			case "1" :
				insert();
				break;
			case "2" :
				selectOne();	//사용자한테 정보를 받아서 서비스로 넘기는 일
				break;
			case "3" :
				selectAll();
				break;
			case "4" :
				update();
				break;
			case "5" : 
				delete();
				break;
			case "0" :
				service.save();
				System.out.println("** 프로그램을 종료합니다.");
				return;
			default :
				System.out.println("** 메뉴를 다시 선택해 주세요");
				keyin.nextLine();
				continue;
			}
		}
	}

	private void delete() {
		System.out.println("\n [[ 제품 정보 삭제 ]]");
		System.out.print("> 제품 아이디 : "); 
		String pid = keyin.next();

		ProductVO vo = service.selectOne(pid);
		if (vo == null) {
			System.out.println("** 제품 정보가 존재하지 않습니다.");
			return;
		}
		int result = service.delete(pid);
		//result가 1이다 = true 0혹은 다른값이다=삭제가 제대로 안된것이므로 false
		if(result == 1) System.out.println("** 삭제 완료.");
		else System.out.println("** 삭제 에러 발생.");
	}

	private void update() {
		System.out.println("\n [[ 제품 정보 수정 ]]");
		System.out.print("> 제품 아이디 : "); 
		String pid = keyin.next();

		ProductVO vo = service.selectOne(pid);
		if (vo == null) {
			System.out.println("** 제품 정보가 존재하지 않습니다.");
			return;
		}
		
		System.out.print("> 제품명 : "); 
		String pname = keyin.next();

		System.out.print("> 가격 : "); 

		int unitPrice = keyin.nextInt();
		int salePrice = (int)(unitPrice * 1.5);
		
		int result = service.update(new ProductVO(pid, pname, unitPrice, salePrice));		

		if(result == 1) System.out.println("** 수정 완료.");
		else System.out.println("** 수정 시 에러 발생.");
	}

	private void selectAll() {
		int count = service.productCount();
		System.out.println("# 등록된 제품 수 : " +  count);
		List<ProductVO> list = service.selectAll();
		for(ProductVO vo : list)
			System.out.println(vo);
		
	}
	private void selectOne() {	//사용자한테 정보를 받는 selectOne
		System.out.println("\n [[ 제품 정보 조회 ]]");
		System.out.print("> 제품 아이디 : "); 
		String pid = keyin.next();

		
		ProductVO vo = service.selectOne(pid);	//서비스에있는 selecOne은 ArrayList에서 정보를 찾는 것
		if(vo == null) {
			System.out.println("** 제품정보가 없습니다.");
			return;
		}
		System.out.println(vo);	//List에 동일한 정보가 있을경우 표시
	}
	
	private void insert() {
		System.out.println("\n [[ 제품 정보 입력 ]]");
		System.out.print("> 제품 아이디 : "); 
		String pid = keyin.next();

		ProductVO vo = service.selectOne(pid);
		if (vo != null) {
			System.out.println("** 같은 제품 정보가 존재합니다.");
			return;
		}
		
		System.out.print("> 제품명 : "); 
		String pname = keyin.next();

		System.out.print("> 가격 : "); 

		int unitPrice = keyin.nextInt();
		int salePrice = (int)(unitPrice * 1.5);	//1.5배는 더블형이므로 인티저로 형변환
		
		service.insert(new ProductVO(pid, pname, unitPrice, salePrice));
	}
	
	public void menu() {
		System.out.println("\n   [[ 제품 정보 관리 ]]");
		System.out.println("     1. 제품 등록");
		System.out.println("     2. 제품 조회");
		System.out.println("     3. 제품 전체 조회");
		System.out.println("     4. 제품 수정");
		System.out.println("     5. 제품 삭제");
		System.out.println("     0. 종  료");
		System.out.println("======================");
		System.out.print  ("      선택 > ");
	}
}

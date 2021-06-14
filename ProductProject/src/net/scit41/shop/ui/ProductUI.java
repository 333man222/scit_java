package net.scit41.shop.ui;

import java.util.List;
import java.util.Scanner;

import net.scit41.shop.service.ProductService;
import net.scit41.shop.vo.ProductVO;

// ȭ�鿡 �������� ��� ó���� ����ϴ� �޼���
public class ProductUI {
	Scanner keyin = new Scanner(System.in);
	ProductService service = new ProductService();	//���� ��ü�� �����ϴ� �ڵ�
	
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
				selectOne();	//��������� ������ �޾Ƽ� ���񽺷� �ѱ�� ��
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
				System.out.println("** ���α׷��� �����մϴ�.");
				return;
			default :
				System.out.println("** �޴��� �ٽ� ������ �ּ���");
				keyin.nextLine();
				continue;
			}
		}
	}

	private void delete() {
		System.out.println("\n [[ ��ǰ ���� ���� ]]");
		System.out.print("> ��ǰ ���̵� : "); 
		String pid = keyin.next();

		ProductVO vo = service.selectOne(pid);
		if (vo == null) {
			System.out.println("** ��ǰ ������ �������� �ʽ��ϴ�.");
			return;
		}
		int result = service.delete(pid);
		//result�� 1�̴� = true 0Ȥ�� �ٸ����̴�=������ ����� �ȵȰ��̹Ƿ� false
		if(result == 1) System.out.println("** ���� �Ϸ�.");
		else System.out.println("** ���� ���� �߻�.");
	}

	private void update() {
		System.out.println("\n [[ ��ǰ ���� ���� ]]");
		System.out.print("> ��ǰ ���̵� : "); 
		String pid = keyin.next();

		ProductVO vo = service.selectOne(pid);
		if (vo == null) {
			System.out.println("** ��ǰ ������ �������� �ʽ��ϴ�.");
			return;
		}
		
		System.out.print("> ��ǰ�� : "); 
		String pname = keyin.next();

		System.out.print("> ���� : "); 

		int unitPrice = keyin.nextInt();
		int salePrice = (int)(unitPrice * 1.5);
		
		int result = service.update(new ProductVO(pid, pname, unitPrice, salePrice));		

		if(result == 1) System.out.println("** ���� �Ϸ�.");
		else System.out.println("** ���� �� ���� �߻�.");
	}

	private void selectAll() {
		int count = service.productCount();
		System.out.println("# ��ϵ� ��ǰ �� : " +  count);
		List<ProductVO> list = service.selectAll();
		for(ProductVO vo : list)
			System.out.println(vo);
		
	}
	private void selectOne() {	//��������� ������ �޴� selectOne
		System.out.println("\n [[ ��ǰ ���� ��ȸ ]]");
		System.out.print("> ��ǰ ���̵� : "); 
		String pid = keyin.next();

		
		ProductVO vo = service.selectOne(pid);	//���񽺿��ִ� selecOne�� ArrayList���� ������ ã�� ��
		if(vo == null) {
			System.out.println("** ��ǰ������ �����ϴ�.");
			return;
		}
		System.out.println(vo);	//List�� ������ ������ ������� ǥ��
	}
	
	private void insert() {
		System.out.println("\n [[ ��ǰ ���� �Է� ]]");
		System.out.print("> ��ǰ ���̵� : "); 
		String pid = keyin.next();

		ProductVO vo = service.selectOne(pid);
		if (vo != null) {
			System.out.println("** ���� ��ǰ ������ �����մϴ�.");
			return;
		}
		
		System.out.print("> ��ǰ�� : "); 
		String pname = keyin.next();

		System.out.print("> ���� : "); 

		int unitPrice = keyin.nextInt();
		int salePrice = (int)(unitPrice * 1.5);	//1.5��� �������̹Ƿ� ��Ƽ���� ����ȯ
		
		service.insert(new ProductVO(pid, pname, unitPrice, salePrice));
	}
	
	public void menu() {
		System.out.println("\n   [[ ��ǰ ���� ���� ]]");
		System.out.println("     1. ��ǰ ���");
		System.out.println("     2. ��ǰ ��ȸ");
		System.out.println("     3. ��ǰ ��ü ��ȸ");
		System.out.println("     4. ��ǰ ����");
		System.out.println("     5. ��ǰ ����");
		System.out.println("     0. ��  ��");
		System.out.println("======================");
		System.out.print  ("      ���� > ");
	}
}

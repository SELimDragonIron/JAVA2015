package view;


import java.util.*;
import java.util.Scanner;
import entity.CSugang;


public class CSugangView {

	public CSugang getSugang(){
	String message;
		
	CSugang sugang = new CSugang();
	System.out.println("������û ȭ���Դϴ�.");
	
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("�л� ���̵� �Է��ϼ���");
	message = scan.nextLine();
	sugang.setHaksaeangID(message);
	
	System.out.println("����ϰ���� ���� ��ȣ�� �Է��ϼ���");
	message = scan.nextLine();
	sugang.setGangjwaID(message);
	
	return  sugang;
	}
	
}

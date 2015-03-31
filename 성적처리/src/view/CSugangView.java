package view;


import java.util.*;
import java.util.Scanner;
import entity.CSugang;


public class CSugangView {

	public CSugang getSugang(){
	String message;
		
	CSugang sugang = new CSugang();
	System.out.println("수강신청 화면입니다.");
	
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("학생 아이디를 입력하세요");
	message = scan.nextLine();
	sugang.setHaksaeangID(message);
	
	System.out.println("등록하고싶은 강좌 번호를 입력하세요");
	message = scan.nextLine();
	sugang.setGangjwaID(message);
	
	return  sugang;
	}
	
}

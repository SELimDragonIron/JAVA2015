

import view.CGwomkView;
import view.CLoginView;
import view.GangjwaView;
import DAOs.DAO;
import control.CGwomkControl;
import control.CLoginControl;
import control.GangjwaControl;
import entity.CGangjwa;
import entity.CGwamok;
import entity.CMember;


public class Cmain {

	public static void main(String[] args) {
		//login
		CLoginView loginView = new CLoginView();
		CMember member = loginView.login();
		//control
		CLoginControl logincontrol  = new CLoginControl();
		
		member = logincontrol.processMember(member);
		//entity
		DAO memberDAO = new DAO();
		memberDAO.write(member, null);
		
		//과목 개설
		CGwomkView gwamokView = new CGwomkView();
		Object gwamok = gwamokView.getGwamok();
		CGwomkControl gwamokControl = new CGwomkControl();
		gwamok = gwamokControl.processGwamok(gwamok);
		DAO gwamokDAO =new DAO();
		gwamokDAO.write(gwamok,"gwamok");
		gwamokDAO.read("gwamok");
		gwamok = (CGwamok) gwamokDAO.read("gwamok");
		// 강제 형변환 (CGwamok)

			
		//과목 개설	 = 과목을 보고서 우리가 만든다. 
		GangjwaView gangjwaView = new GangjwaView();
		CGangjwa gangjwa = gangjwaView.getgangjwa();
		GangjwaControl gangjwaControl = new GangjwaControl();
		gangjwa = gangjwaControl.processGangjwa(gangjwa);
		DAO gangjwaDAO =new DAO();
		gangjwaDAO.write(gangjwa,"");
	}

}

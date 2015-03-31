

import view.CGwomkView;
import view.CLoginView;
import view.CGangjwaView;
import view.CSugangView;
import DAOs.DAO;
import control.CGwomkControl;
import control.CLoginControl;
import control.CGangjwaControl;
import control.CSugangControl;
import entity.CGangjwa;
import entity.CGwamok;
import entity.CMember;
import entity.CSugang;


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
		memberDAO.write(member, "member");
		
		//���� ����
		CGwomkView gwamokView = new CGwomkView();
		Object gwamok = gwamokView.getGwamok();
		CGwomkControl gwamokControl = new CGwomkControl();
		gwamok = gwamokControl.processGwamok(gwamok);
		DAO gwamokDAO =new DAO();
		gwamokDAO.write(gwamok,"gwamok");
		gwamokDAO.read("gwamok");
		gwamok = (CGwamok) gwamokDAO.read("gwamok");
		// ���� ����ȯ (CGwamok)

			
		//���� ����	 = ������ ���� �츮�� �����. 
		CGangjwaView cGangjwaView = new CGangjwaView();
		CGangjwa gangjwa = cGangjwaView.getgangjwa();
		CGangjwaControl gangjwaControl = new CGangjwaControl();
		gangjwa = gangjwaControl.processGangjwa(gangjwa);
		DAO gangjwaDAO =new DAO();
		gangjwaDAO.write(gangjwa,"gangjwa");
		
		
		//���� ��û  = �����Ͱ� ����ϰ� �����.
		CSugangView sugangview = new CSugangView();
		CSugang sugang = sugangview.getSugang();
		CSugangControl sugangcontrol = new CSugangControl();
		sugang = sugangcontrol.processSugang(sugang);
		DAO sugangDAO = new DAO();
		gangjwaDAO.write(sugang, "sugang");
		
		
		
	}

}

package view;

import entity.CGwamok;

public class CGwomkView {

	public CGwamok getGwamok() {
	
		CGwamok gwamok = new CGwamok();
		
		//원래는 입력을 받게 만들어야한다.
		gwamok.setID(21);
		gwamok.setName("java");
		gwamok.setHakjeom(3);
		return gwamok;
	}

}

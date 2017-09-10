package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();
	private LinkedList<Integer> scores = new LinkedList<Integer>();
	int flag = 0;
	public Round() {
		
		Roll firstRoll = new Roll();
		ComeOutScore = firstRoll.getScore();
		
		scores.add(ComeOutScore);
		int z = 0;

		if((ComeOutScore != 2)&&(ComeOutScore != 3)&&(ComeOutScore != 12)&&(ComeOutScore != 7)&&(ComeOutScore != 11))
		{	while((z != ComeOutScore) && (z != 7)){
				
				
				Roll addRoll = new Roll();
				z = addRoll.getScore();
				scores.add(z);
				++flag;
			
		}}
		

	if ((ComeOutScore==7)||(ComeOutScore==11)) {
		eGameResult = eGameResult.NATURAL;
	}
	else if ((ComeOutScore==2)||(ComeOutScore==3)||(ComeOutScore==12)){
		eGameResult = eGameResult.CRAPS;
		}
	else if ((z==7)){
		eGameResult = eGameResult.SEVEN_OUT;
		}
	else {
		eGameResult = eGameResult.POINT;
	}
	/*System.out.print(eGameResult);
	System.out.print("*");
	System.out.print(ComeOutScore);
	System.out.print("**");
	System.out.println(z);*/
	System.out.println(scores);	
	}

	

	public int RollCount() {

		return flag;
	}

}

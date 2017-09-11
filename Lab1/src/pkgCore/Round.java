package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();
	

	public Round() {

		Roll firstRoll = new Roll();
		ComeOutScore = firstRoll.getScore();

		rolls.add(firstRoll);

		switch (ComeOutScore) {
		case 2:
		case 3:
		case 12:
			eGameResult = eGameResult.CRAPS;
			break;
		case 7:
		case 11:
			eGameResult = eGameResult.NATURAL;
			break;
		default:
			
			do {
				Roll r = new Roll();
				rolls.add(r);
				
				if (r.getScore() == ComeOutScore)
				{
					eGameResult = eGameResult.POINT;
					break;
				}
				else if (r.getScore() == 7)
				{
					eGameResult = eGameResult.SEVEN_OUT;
					break;
				}
			} while(true);

		}

		for (Roll r: rolls)
		{
			System.out.println(r.getScore());
		}
		
	}

	public int RollCount() {

		return rolls.size();
	}

	public eGameResult geteGameResult() {
		return eGameResult;
	}

	public LinkedList<Roll> getRolls() {
		return rolls;
	}

}

package variableTypes;

public class Coach {

	public static void main(String[] args)
	
	{
		
		PlayerInfo RohitS = new PlayerInfo();
		RohitS.name="Rohit Sharma";
		RohitS.Nationality="Indian";
		RohitS.Type="Batsman";
		RohitS.Grade='A';
		RohitS.jurseyno=45;
		RohitS.SR=149.49f;
		RohitS.Info();
		
		PlayerInfo SuryaY = new PlayerInfo();
		SuryaY.name="Suryakumar Yadav";
		SuryaY.Nationality="Indian";
		SuryaY.Type="Batsman";
		SuryaY.Grade='a';
		SuryaY.jurseyno=11;
		SuryaY.SR=150.12f;
		SuryaY.Info();
		
		PlayerInfo JB= new PlayerInfo();
		JB.name="Jasprit Bumrah";
		JB.Nationality="Indian";
		JB.Type="Bowler";
		JB.Grade='A';
		JB.jurseyno=58;
		JB.SR=6.59f;
		JB.Info();
		
	
		
	}

}


public class Nan extends Characters{
	
	private static int skills = 4;
	private static SkillSet as = new SkillSet(skills);
	
	public Nan()
	{
		super("Nan", 29780, 600, 9001, 500, as);
		as.setSkill(0, "Logic", 10000, 50, "Nan uses the power of logic to smite his enemy.");
		as.setSkill(1, "Righteous Fury", 25000, 100, "Nan unleashes righteous fury.");
		as.setSkill(2, "Lance Of Longinus", 90001, 150, "Nan sends the holy Lance of Longinus at his enemy.");
		as.setSkill(3, "Ascension", 1000000, 250, "Nan ascends into a higher existence.");
	}
}

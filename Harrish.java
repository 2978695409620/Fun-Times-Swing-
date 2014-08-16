
public class Harrish extends Characters{
	
	private static int skills = 4;
	private static SkillSet hs = new SkillSet(skills);
	
	public Harrish()
	{
		super("Harrish", 15000, 100, 3, 5, hs);
		hs.setSkill(0, "GivesUp", -9000, 0, "Harrish gives up.");
		hs.setSkill(1, "Motivation", 30, 200, "Harrish becomes motivated.");
		hs.setSkill(2, "Cower", 20, 500, "Harrish cowers in fear.");
		hs.setSkill(3, "Hide", 600, 1000, "Harrish hides, confusing his enemy.");
	}
}

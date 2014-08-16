
public class Brian extends Characters{
	
	private static int skills = 4;
	private static SkillSet as = new SkillSet(skills);
	
	public Brian()
	{
		super("Brian", 8000, 200, 170, 80, as);
		as.setSkill(0, "Skip", 0, 10, "Brian skips class altogether.");
		as.setSkill(1, "Smash", 400, 50, "Brian smashes his enemy.");
		as.setSkill(2, "Strangle", 1000, 100, "Brian strangles his enemy.");
		as.setSkill(3, "Obliterate", 7000, 250, "Brian obliterates his enemy.");
	}
}

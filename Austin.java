
public class Austin extends Characters{
	
	private static int skills = 4;
	private static SkillSet as = new SkillSet(skills);
	
	public Austin()
	{
		super("Austin", 4000, 250, 20, 50, as);
		as.setSkill(0, "Sleep", 0, 0, "Austin sleeps in class.");
		as.setSkill(1, "Argue", 30, 100, "Austin argues.");
		as.setSkill(2, "Confusion", 10, 50, "Austin is really confused about what is happening.");
		as.setSkill(3, "NoIdea", -50, 0, "Austin has no idea what is going on.");
	}
}

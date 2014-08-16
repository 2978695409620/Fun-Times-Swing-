
public class Jason extends Characters{
	
	private static int skills = 4;
	private static SkillSet as = new SkillSet(skills);
	
	public Jason()
	{
		super("Jason", 8000, 300, 30, 80, as);
		as.setSkill(0, "Poke", 30, 10, "Jason pokes his enemy lightly.");
		as.setSkill(1, "Jab", 200, 60, "Jason jabs his enemy.");
		as.setSkill(2, "Kick", 600, 100, "Jason kicks his enemy.");
		as.setSkill(3, "Round-House Kick", 4500, 200, "Jason roundhouse kicks enemy in the face.");
	}
}

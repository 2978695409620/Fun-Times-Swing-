
public class William extends Characters{
	
	private static int skills = 4;
	private static SkillSet as = new SkillSet(skills);
	
	public William()
	{
		super("William", 7000, 300, 45, 100, as);
		as.setSkill(0, "Rage", 200, 50, "Cody is very calm in every situation.");
		as.setSkill(1, "Tantrum", 600, 100, "Cody jumps up and kicks his enemy in the face.");
		as.setSkill(2, "Berserk", 1200, 200, "Cody facepalms at his enemy.");
		as.setSkill(3, "Table Flip", 6500, 350, "Cody uses the powers of calculus against his enemy.");
	}
}

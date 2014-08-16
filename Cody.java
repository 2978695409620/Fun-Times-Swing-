
public class Cody extends Characters{
	
	private static int skills = 4;
	private static SkillSet as = new SkillSet(skills);
	
	public Cody()
	{
		super("Cody", 10000, 150, 40, 150, as);
		as.setSkill(0, "Calm", 80, 10, "Cody is very calm in every situation.");
		as.setSkill(1, "Flying Kick", 450, 50, "Cody jumps up and kicks his enemy in the face.");
		as.setSkill(2, "Face Palm", 800, 100, "Cody facepalms at his enemy.");
		as.setSkill(3, "Calculus", 4400, 300, "Cody uses the powers of calculus against his enemy.");
	}

}

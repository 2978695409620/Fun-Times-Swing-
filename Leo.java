
public class Leo extends Characters{
	
	private static int skills = 4;
	private static SkillSet as = new SkillSet(skills);
	
	public Leo()
	{
		super("Leo", 5500, 300, 100, 90, as);
		as.setSkill(0, "Ambush", 300, 100, "Leo ambushes his enemy from the nearby bush.");
		as.setSkill(1, "Deathly Stare", 500, 200, "Leo stares at his enemy with deathly intent.");
		as.setSkill(2, "LeoMonade", 700, 300, "Leo is just being himself.");
		as.setSkill(3, "Invitation To Bed", 15000, 500, "Leo invites his enemy to bed.");
	}

}

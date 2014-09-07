
public class Kevin extends Characters{
	
	private static int skills = 4;
	private static SkillSet as = new SkillSet(skills);
	
	public Kevin()
	{
		super("Kevin", 8000, 350, 80, 180, as);
		as.setSkill(0, "TooLongDidNotRead", -100, 10, "Kevin does not read.");
		as.setSkill(1, "Scorch", 250, 100, "Kevin sends a tiny stream of fire at his enemy.");
		as.setSkill(2, "Pyroblast", 750, 200, "Kevin throws a huge fireball at his enemy.");
		as.setSkill(3, "Living Fire", 60000, 500, "Kevin turns his enemy into a pillar of flame.");
	}

}

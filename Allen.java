
public class Allen extends Characters{

	private static int skills = 4;
	private static SkillSet as = new SkillSet(skills);
	
	public Allen()
	{
		super("Allen", 12000, 200, 50, 120, as);
		as.setSkill(0, "HaHa", 150, 60, "Allen laughs maniacally at his enemy.");
		as.setSkill(1, "Leap Attack", 600, 200, "Allen leaps into the air and lands on his enemy.");
		as.setSkill(2, "Crush", 1000, 300, "Allen crushes his enemy.");
		as.setSkill(3, "Avatar", 5000, 600, "Allen turns into an unstoppable avatar.");
	}
}

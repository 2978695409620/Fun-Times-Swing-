
public class Mario extends Characters{

	private static int skills = 4;
	private static SkillSet as = new SkillSet(skills);
	
	public Mario()
	{
		super("Mario", 5000, 600, 500, 500, as);
		as.setSkill(0, "Nice", -200, 20, "Mario feels like being nice today.");
		as.setSkill(1, "Hard Question", 1000, 60, "Mario asks his student a hard question.");
		as.setSkill(2, "Hard Test", 2500, 1000, "Mario gives his student a hard test.");
		as.setSkill(3, "You Fail", 900001, 1500, "Mario decided that his student should fail the course.");
	}
}

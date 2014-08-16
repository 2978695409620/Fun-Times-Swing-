
public class James extends Characters{
	
	private static int skills = 4;
	private static SkillSet as = new SkillSet(skills);
	
	public James()
	{
		super("James", 6500, 250, 50, 80, as);
		as.setSkill(0, "Work Hard", 100, 20, "James works very hard in class.");
		as.setSkill(1, "Wise", 200, 45, "James is exceptionally wise.");
		as.setSkill(2, "Program", 500, 100, "James creates a deadly program.");
		as.setSkill(3, "High Mark", 4500, 180, "James receives a perfect mark.");
	}

}

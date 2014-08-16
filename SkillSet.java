
public class SkillSet {
	
	private int numOfSkills;
	private String[] skillNames;
	private int[] skillValues;
	private int[] skillCosts;
	private String[] skillDescriptions;
	
	public SkillSet(int numOfSkills)
	{
		this.numOfSkills = numOfSkills;
		skillNames = new String[numOfSkills];
		skillValues = new int[numOfSkills];
		skillCosts = new int[numOfSkills];
		skillDescriptions = new String[numOfSkills];
	}
	
	public void setSkill(int skill, String name, int value, int cost, String description)
	{
		assert numOfSkills > skill;
		this.skillNames[skill] = name;
		this.skillValues[skill] = value;
		this.skillCosts[skill] = cost;
		this.skillDescriptions[skill] = description;
	}
	
	public String getName(int skill)
	{
		return skillNames[skill];
	}
	
	public int getValue(int skill)
	{
		return skillValues[skill];
	}
	
	public int getCost(int skill)
	{
		return skillCosts[skill];
	}
	
	public String getDescription(int skill)
	{
		return skillDescriptions[skill];
	}
	
	public int getNumOfSkills()
	{
		return numOfSkills;
	}
}

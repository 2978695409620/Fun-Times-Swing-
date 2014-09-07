
public class Characters {
	
	//Basic parameters
	private String name;
	private int hp;
	private int mana;
	private int attack;  
	private int manaRegen;
	private boolean alive;
	private SkillSet skillSet;
	
	public Characters(String name, int hp, int mana, int attack, int manaRegen, SkillSet skillSet)
	{
		this.name = name;
		this.hp = hp;
		this.mana = mana;
		this.attack = attack;
		this.manaRegen = manaRegen;
		this.skillSet = skillSet;
		this.alive = true;
	}
	
	//Parameter Information Methods
	public String getName()
	{
		return name;
	}
	
	public int getHP()
	{
		return hp;
	}
	
	public int getMana()
	{
		return mana;
	}
	
	public int getManaRegen()
	{
		return manaRegen;
	}
	
	public SkillSet getSkillSet()
	{
		return skillSet;
	}
	
	public boolean isAlive()
	{
		return alive;
	}
	
	//Parameter change methods
	public void receiveDamage(int damage)
	{
		this.hp = this.hp - damage;
	}
	
	public void setHP(int hp)
	{
		this.hp = hp;
	}
	
	public void setMana(int mana)
	{
		this.mana = mana;
	}
	
	public void die()
	{
		alive = false;
	}
	
	//Action methods
	public int roll(int damage)
	{
		return (int)Math.round(0.4 * damage + 0.6 * damage * Math.random());
	}
	
	public String attack(Characters enemy)
	{
		int damage = roll(attack);
		String message = name + " hits " + enemy.getName() + " for " + damage + " damage.";
		enemy.receiveDamage(damage);
		if (enemy.getHP() <= 0)
		{
			enemy.die();
		}
		
		return message;
	}
	
	public String useSkill(int skill, Characters enemy)
	{
		if (mana >= skillSet.getCost(skill))
		{
			
			int damage = roll(skillSet.getValue(skill));
			
			String message = skillSet.getDescription(skill);
			if (damage > 0)
			{
				message = message + " " + enemy.getName() + " suffers " + damage + " damage.";
			}
			else if (damage < 0)
			{
				message = message + " " + enemy.getName() + " is healed for " + -damage + ".";
			}
			enemy.receiveDamage(damage);
			mana = mana - skillSet.getCost(skill);
			
			if (enemy.getHP() <= 0)
			{
				enemy.setHP(0);
				enemy.die();
			}
			
			return message;
		}
		else
		{
			return null;
		}
	}
}

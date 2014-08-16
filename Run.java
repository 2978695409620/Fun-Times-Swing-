
public class Run {
	
	//Chosen Characters
	private Characters p1;
	private Characters p2;
	
	private GameStates states;
	
	private GUI game;
	
	//Puts together a player's stats in a easy to read format
	private String getPlayerStats(Characters player)
	{
		String stats = "                                    " + player.getName() + "\n\n";
		stats = stats + "Health: " + player.getHP() + "\n";
		stats = stats + "Mana: " + player.getMana() + "\n";
		stats = stats + "Mana Regen: " + player.getManaRegen() + "\n";
		
		return stats;
	}
	
	//Puts together a player's skills in a easy to read format
	private String getPlayerSkills(Characters player)
	{
		SkillSet skillSet = player.getSkillSet();
		
		String skills = "\n---------------------------Skills---------------------------\n\n";
		
		skills = skills + "Skill 1: Attack (0 mana)\n";
		
		for (int i = 0; i < skillSet.getNumOfSkills(); i++)
		{
			skills = skills + "Skill " + (i + 2) + ": "+ skillSet.getName(i) + " (" + skillSet.getCost(i) + " mana)\n";
		}
		
		return skills;
	}
	
	private Characters selectCharacters(int player)
	{
		new CharacterSelect(states, player);
		states.setWaiting(true);

		while(states.isWaiting())
		{
			//Waiting
		}

		switch (states.getCharacter())
		{
			case 1: return new Austin();
			case 2: return new Harrish();
			case 3: return new Jason();
			case 4: return new Allen();
			case 5: return new Kevin();
			case 6: return new Leo();
			case 7: return new James();
			case 8: return new Cody();
			case 9: return new William();
			case 10: return new Nan();
			case 11: return new Brian();
			case 12: return new Mario();
			default: return null;
		}
	}
	
	private void play()
	{
		game.updateP1(getPlayerStats(p1) + getPlayerSkills(p1));
		game.updateP2(getPlayerStats(p2) + getPlayerSkills(p2));
		
		while (p1.isAlive() && p2.isAlive())
		{
			if (!states.isWaiting())
			{
				game.updateP1(getPlayerStats(p1) + getPlayerSkills(p1));
				game.updateP2(getPlayerStats(p2) + getPlayerSkills(p2));
				
				if (states.getTurn() == 1)
				{
					if (states.isSuccessful())
					{
						game.removeSkills();
						game.addNext();
						states.setSuccess(false);
						states.setWaiting(true);
					}
					else
					{
						game.setLog("It is " + p1.getName() + "'s turn.");
						game.updateLog();
						game.addSkills(p1, p2);
						states.setWaiting(true);
					}
				}
				
				else if (states.getTurn() == 2)
				{
					if (states.isSuccessful())
					{
						game.removeSkills();
						game.addNext();
						states.setSuccess(false);
						states.setWaiting(true);
					}
					else
					{
						game.setLog("It is " + p2.getName() + "'s turn.");
						game.updateLog();
						game.addSkills(p2, p1);
						states.setWaiting(true);
					}
				}
			}
		}
	}
	
	private void results()
	{
		if (p1.getHP() < 0)
		{
			p1.setHP(0);
		}
		
		if (p2.getHP() < 0)
		{
			p2.setHP(0);
		}
		
		game.updateP1(getPlayerStats(p1) + getPlayerSkills(p1));
		game.updateP2(getPlayerStats(p2) + getPlayerSkills(p2));
		
		game.removeSkills();
		
		if (p1.isAlive())
		{
			states.setPlayerOneWin();
			game.addText(p2.getName() + " has been slain!\n" + p1.getName() + " wins!");
		}
		else if (p2.isAlive())
		{
			states.setPlayerTwoWin();
			game.addText(p1.getName() + " has been slain!\n" + p2.getName() + " wins!");
		}
	}
	
	private void benjamin()
	{
		int benjaminRoll = (int) (Math.random () * 5);
		if (benjaminRoll == 1)
		{
		    game.addText ("A Wild Benjamin Has Appeared!");
		    if (p1.isAlive() && (!p1.getName().equals ("Nan")))
		    {
		    game.addText ("Benjamin slays " + p1.getName() + "!");
		    game.addText ("Benjamin wins!");
		    }
		    else if (p2.isAlive() && (!p2.getName().equals ("Nan")))
		    {
		    game.addText ("Benjamin slays " + p2.getName() + "!");
		    game.addText ("Benjamin wins!");
		    }
		    else if ((p1.isAlive() || p2.isAlive()) && (p1.getName().equals ("Nan") || p2.getName().equals ("Nan")))
		    {
		    game.addText ("Benjamin celebrates with Nan!");
		    }
		}
	}
	
	public Run()
	{
		states = new GameStates();
		
		//Selecting Characters
		p1 = selectCharacters(1);
		p2 = selectCharacters(2);
		
		states.setPlayerOneTurn();
		
		
		//Opens up GUI and start playing
		game = new GUI(states);
		play();
		
		//Displays results
		results();
		
		//Rolls for wild Benjamin
		benjamin();
	}
}

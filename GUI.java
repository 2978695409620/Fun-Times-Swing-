
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class GUI extends JFrame implements WindowListener{
	
	//Information areas
	private JTextArea p1;
	private JTextArea p2;
	private JTextArea log;
	
	private String combatLog = "";
	
	//Buttons for skills
	private JButton skillOne;
	private JButton skillTwo;
	private JButton skillThree;
	private JButton skillFour;
	private JButton skillFive;
	
	private JButton next;
	
	//States of the game
	private GameStates state;
	
	public GUI(GameStates state)
	{
		this.state = state;
		
		setLayout(new FlowLayout());
		
		p1 = new JTextArea();
		p1.setPreferredSize(new Dimension(250, 300));
		p1.setEditable(false);
		add(p1);
		
		log = new JTextArea();
		log.setPreferredSize(new Dimension(450, 200));
		log.setEditable(false);
		add(log);
		
		p2 = new JTextArea();
		p2.setPreferredSize(new Dimension(250, 300));
		p2.setEditable(false);
		add(p2);
		
		next = new JButton("Start!");
		next.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		
		setTitle("FunTimes");
		setSize(1000,400);
		setVisible(true);
		setResizable(false);
		addWindowListener(this);
	}
	
	//Status and Information Updates
	
	//Sets the combatLog variable
	public void setLog(String log)
	{
		combatLog = log;
	}
	
	//Updates the log TextArea
	public void updateLog(String combatLog)
	{
		log.setText(combatLog);
	}
	
	public void updateLog()
	{
		log.setText(combatLog);
	}
	
	public void addText(String text)
	{
		combatLog = combatLog + "\n" + text;
		updateLog(combatLog);
	}
	
	//Updates player 1 information
	public void updateP1(String stats)
	{
		p1.setText(stats);
	}
	
	//Updates player 2 information
	public void updateP2(String stats)
	{
		p2.setText(stats);
	}
	
	//Buttons Methods
	
	//Remove skill buttons from the frame
	public void removeSkills()
	{
		remove(skillOne);
		remove(skillTwo);
		remove(skillThree);
		remove(skillFour);
		remove(skillFive);
		
		revalidate();
		repaint();
	}
	
	//Removes the next button from the frame
	public void removeNext()
	{
		remove(next);
		
		revalidate();
		repaint();
		
		state.setWaiting(false);
	}
	
	//Adds the next button to the frame
	public void addNext()
	{
		next = new JButton("Next");
		next.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if (state.getTurn() == 1)
				{
					state.setPlayerTwoTurn();
				}
				else if (state.getTurn() == 2)
				{
					state.setPlayerOneTurn();
				}
				removeNext();
				
				state.setWaiting(false);
			}
		});
		add(next);
		
		revalidate();
		repaint();
	}
	
	//Add skill buttons to the frame
	public void addSkills(final Characters player, final Characters enemy)
	{
		skillOne = new JButton("Skill 1");
		add(skillOne);
		skillOne.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				combatLog = combatLog + "\n" + player.attack(enemy);
				updateLog(combatLog);
				state.setSuccess(true);
				state.setWaiting(false);
			}
		});
		
		skillTwo = new JButton("Skill 2");
		add(skillTwo);
		skillTwo.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String message = player.useSkill(0, enemy);
				if (message == null)
				{
					combatLog = combatLog + "\nNot enough mana. Use another skill.";
					updateLog(combatLog);
				}
				else
				{
					combatLog = combatLog + "\n" + message;
					updateLog(combatLog);
					state.setSuccess(true);
					state.setWaiting(false);
				}
			}
		});
		
		skillThree = new JButton("Skill 3");
		add(skillThree);
		skillThree.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String message = player.useSkill(1, enemy);
				if (message == null)
				{
					combatLog = combatLog + "\nNot enough mana. Use another skill.";
					updateLog(combatLog);
				}
				else
				{
					combatLog = combatLog + "\n" + message;
					updateLog(combatLog);
					state.setSuccess(true);
					state.setWaiting(false);
				}
			}
		});
		
		skillFour = new JButton("Skill 4");
		add(skillFour);
		skillFour.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String message = player.useSkill(2, enemy);
				if (message == null)
				{
					combatLog = combatLog + "\nNot enough mana. Use another skill.";
					updateLog(combatLog);
				}
				else
				{
					combatLog = combatLog + "\n" + message;
					updateLog(combatLog);
					state.setSuccess(true);
					state.setWaiting(false);
				}
			}
		});
		
		skillFive = new JButton("Skill 5");
		add(skillFive);
		skillFive.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String message = player.useSkill(3, enemy);
				if (message == null)
				{
					combatLog = combatLog + "\nNot enough mana. Use another skill.";
					updateLog(combatLog);
				}
				else
				{
					combatLog = combatLog + "\n" + message;
					updateLog(combatLog);
					state.setSuccess(true);
					state.setWaiting(false);
				}
			}
		});
		
		revalidate();
		repaint();
	}
	
	// WindowEvent handlers
	@Override
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
	
	@Override
	public void windowOpened(WindowEvent e)
	{
		
	}
	
	@Override
	public void windowClosed(WindowEvent e)
	{
		
	}
	
	@Override
	public void windowIconified(WindowEvent e)
	{
		
	}
	
	@Override
	public void windowDeiconified(WindowEvent e)
	{
		
	}
	
	@Override
	public void windowActivated(WindowEvent e)
	{
		
	}
	
	@Override
	public void windowDeactivated(WindowEvent e)
	{
		
	}
}

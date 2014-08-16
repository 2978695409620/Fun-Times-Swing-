
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class CharacterSelect extends Frame implements WindowListener{
	
	private GameStates state;
	
	//Character Buttons
	private JButton austin;
	private JButton harrish;
	private JButton jason;
	private JButton allen;
	private JButton kevin;
	private JButton leo;
	private JButton james;
	private JButton cody;
	private JButton william;
	private JButton nan;
	private JButton brian;
	private JButton mario;
	
	private Dimension d;
	
	private JLabel select;
	
	private JTextArea tf;
	
	public CharacterSelect(GameStates state, int player)
	{
		this.state = state;
		
		setLayout(new FlowLayout());
		
		select = new JLabel("Player " + player + " select character");
		add(select);
		
		tf = new JTextArea("Choose a character from below:");
		tf.setPreferredSize(new Dimension(200, 40));
		add(tf);
		
		//Adding Character Buttons
		
		d = new Dimension(85, 26);
		
		austin = new JButton("Austin");
		austin.setPreferredSize(d);
		add(austin);
		austin.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setCharacter(1);
			}
		});
		
		harrish = new JButton("Harrish");
		harrish.setPreferredSize(d);
		add(harrish);
		harrish.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setCharacter(2);
			}
		});
		
		jason = new JButton("Jason");
		jason.setPreferredSize(d);
		add(jason);
		jason.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setCharacter(3);
			}
		});
		
		allen = new JButton("Allen");
		allen.setPreferredSize(d);
		add(allen);
		allen.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setCharacter(4);
			}
		});
		
		kevin = new JButton("Kevin");
		kevin.setPreferredSize(d);
		add(kevin);
		kevin.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setCharacter(5);
			}
		});
		
		leo = new JButton("Leo");
		leo.setPreferredSize(d);
		add(leo);
		leo.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setCharacter(6);
			}
		});
		
		james = new JButton("James");
		james.setPreferredSize(d);
		add(james);
		james.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setCharacter(7);
			}
		});
		
		cody = new JButton("Cody");
		cody.setPreferredSize(d);
		add(cody);
		cody.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setCharacter(8);
			}
		});
		
		william = new JButton("William");
		william.setPreferredSize(d);
		add(william);
		william.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setCharacter(9);
			}
		});
		
		nan = new JButton("Nan");
		nan.setPreferredSize(d);
		add(nan);
		nan.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setCharacter(10);
			}
		});
		
		brian = new JButton("Brian");
		brian.setPreferredSize(d);
		add(brian);
		brian.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setCharacter(11);
			}
		});
		
		mario = new JButton("Mario");
		mario.setPreferredSize(d);
		add(mario);
		mario.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				setCharacter(12);
			}
		});
		
		
		setTitle("Character Selection");
		setSize(230, 400);
		setVisible(true);
		setResizable(false);
		addWindowListener(this);
	}
	
	private void setText(String text)
	{
		tf.setText(text);
	}
	
	private void setCharacter(int character)
	{
		if ((character == 10 && state.getCharacter() == 12) || (state.getCharacter() == 12 && character == 10))
		{
			System.out.println("Nan");
			setText("Mario refuses to face Nan.\nPlease choose another character.");
		}
		else if ((character == 1 && state.getCharacter() == 12) || (state.getCharacter() == 12 && character == 1))
		{
			setText("Mario would automatically win.\nPlease choose another character.");
		}
		else if (character != state.getCharacter())
		{
			state.setCharacter(character);
			state.setWaiting(false);
			exit();
			//System.out.println(state.isWaiting());
		}
		else
		{
			setText("Character taken.\nPlease choose another character.");
		}
	}
	
	public void exit()
	{
		setVisible(false);
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

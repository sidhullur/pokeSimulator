package pokeSimulator;

import java.awt.*;

import javax.swing.*;

public class GameInterface extends JPanel {
	
	private JFrame frame;
	private JButton[] buttons = new JButton[4];
	private JPanel game, controls;
	private JLabel frontLabel, backLabel;

	public GameInterface(Pokemon user, Pokemon opponent) {
		frame = new JFrame();
		frame.setBounds(100, 200, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Pokemon Battle Simulator");
		frame.add(this);
		
		setBounds(0, 0, frame.getWidth(), frame.getHeight());
		setLayout(null);
		getMaximumSize();
		
		game = new JPanel();
		game.setBounds(10, 10, getWidth()-30, getHeight()*3/5);
		game.setBackground(Color.WHITE);
		game.setLayout(null);
		add(game);
		
		frontLabel = new JLabel("", opponent.frontSprite, JLabel.CENTER);
		frontLabel.setVerticalTextPosition(JLabel.TOP);
		frontLabel.setHorizontalTextPosition(JLabel.RIGHT);
		frontLabel.setBounds(300, 40, 150, 150);
		game.add(frontLabel);
		
		backLabel = new JLabel("", user.backSprite, JLabel.CENTER);
		backLabel.setVerticalTextPosition(JLabel.BOTTOM);
		backLabel.setHorizontalTextPosition(JLabel.LEFT);
		backLabel.setBounds(50, 150, 150, 150);
		game.add(backLabel);
		
	
		controls = new JPanel();
		controls.setBounds(20, getHeight()*3/5 + 20, getWidth()-50, getHeight()*1/4);
		controls.setBackground(Color.WHITE);
		controls.setLayout(null);
		add(controls);
		
		for(int i = 0; i<buttons.length; i++) buttons[i] = new JButton(user.attacks[i]);
		
		/*
		buttons[0].setBounds(0, 0, controls.getWidth()/2, controls.getHeight()/2);
		buttons[1].setBounds(controls.getWidth()/2, 0, controls.getWidth(), controls.getHeight());
		buttons[2].setBounds(0, controls.getHeight()/2, controls.getWidth()/2, controls.getHeight());
		buttons[3].setBounds(controls.getWidth()/2, controls.getHeight()/2, controls.getWidth(), controls.getHeight());
		*/
		
		controls.setLayout(new GridLayout(2, 2, 10, 10));
		for(int i = 0; i<buttons.length; i++) controls.add(buttons[i]);
		
		frame.setVisible(true);
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, frame.getWidth(), frame.getHeight());
		g.setColor(Color.BLACK);
		g.drawRect(game.getX(), game.getY(), game.getWidth(), game.getHeight());
		g.drawRect(controls.getX(), controls.getY(), controls.getWidth(), controls.getHeight());
		g.fillRect(getX(), getY(), getWidth(), getHeight());
		
	}
}

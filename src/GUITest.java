import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUITest 
{
	private static final int height = 400;
	private static final int width = 400;
	

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame ("Dark Wave");
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout layout = new FlowLayout();
		frame.setLayout(layout);
		
		JButton b1 = new JButton ("Man who stare");
		JButton b2 = new JButton ("at goats");
		JButton b52 = new JButton ("at code monkeys");
		JButton doNotPushME = new JButton ("my finger is on the button");
		
		// We are using an anonymous class
		b1.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println("Stop staring!!!");
			}
		});
		frame.add(b1);
		frame.add(b2);
		frame.add(b52);
		frame.add(doNotPushME);
		
		frame.pack();
		
		frame.setVisible(true);
		
		
	}

}

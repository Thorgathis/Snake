
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class GameFrame extends JFrame {

	GameFrame() {
		JFrame m = new JFrame();
		JFrame f = new JFrame("Difficulty selection");
		JButton a = new JButton("Easy");
		a.setBounds(0, 0, 100, 30);
		a.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GamePanel.DELAY = 150;
				m.add(new GamePanel());
				m.setTitle("Easy Snake by Thorgathis");
				m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				m.setResizable(false);
				m.pack();
				m.setVisible(true);
				m.setLocationRelativeTo(null);
				f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
			}
		});

		JButton b = new JButton("Normal");
		b.setBounds(100, 0, 100, 30);
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GamePanel.DELAY = 75;
				m.add(new GamePanel());
				m.setTitle("Normal Snake by Thorgathis");
				m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				m.setResizable(false);
				m.pack();
				m.setVisible(true);
				m.setLocationRelativeTo(null);
				f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
			}
		});

		JButton c = new JButton("Hard");
		c.setBounds(200, 0, 100, 30);
		c.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				GamePanel.DELAY = 45;
				m.add(new GamePanel());
				m.setTitle("Hard Snake by Thorgathis");
				m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				m.setResizable(false);
				m.pack();
				m.setVisible(true);
				m.setLocationRelativeTo(null);
				f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
			}
		});
		f.add(a);
		f.add(b);
		f.add(c);
		f.setResizable(false);
		f.setSize(314, 66);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setVisible(true);

	}

}

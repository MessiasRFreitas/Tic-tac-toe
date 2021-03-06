package entities;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JV implements ActionListener {
	public Integer x1 = 0;
	public Integer y1 = 0;
	public String p1 = null;
	public String p2 = null;
	public boolean pwins = false;
	public Integer count = 0;

	JButton[] btn = new JButton[9];

	public JV() {
		JFrame frame = new JFrame("Jogo da Velha");
		frame.setSize(300, 390);
		frame.setLocation(200, 100);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int i = 0; i < 9; i++) {
			btn[i] = new JButton();
			btn[i].setBounds(x1, y1, 100, 100);
			btn[i].setFont(new Font("Arial", Font.BOLD, 30));
			frame.add(btn[i]);

			x1 += 100;

			if (i == 2) {
				y1 += 100;
				x1 = 0;
			}

			if (i == 5) {
				y1 += 100;
				x1 = 0;
			}
			btn[i].addActionListener(this);
		}
		JButton btn = new JButton("Reset");
		btn.setBounds(0, 310, 300, 60);
		frame.add(btn);

		btn.addActionListener((ActionEvent ae) -> {
			frame.dispose();
			new JV();
		});
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		JButton b = (JButton) ae.getSource();

		if (count % 2 == 0) {
			b.setText("X");
			b.setForeground(Color.blue);
		} else {
			b.setText("0");
			b.setForeground(Color.red);
		}
		count++;
		b.removeActionListener(this);

		if (btn[0].getText().equals("X") && btn[1].getText().equals("X") && btn[2].getText().equals("X")
				|| btn[0].getText().equals("X") && btn[3].getText().equals("X") && btn[6].getText().equals("X")
				|| btn[0].getText().equals("X") && btn[4].getText().equals("X") && btn[8].getText().equals("X")
				|| btn[1].getText().equals("X") && btn[4].getText().equals("X") && btn[7].getText().equals("X")
				|| btn[2].getText().equals("X") && btn[5].getText().equals("X") && btn[8].getText().equals("X")
				|| btn[2].getText().equals("X") && btn[4].getText().equals("X") && btn[6].getText().equals("X")
				|| btn[3].getText().equals("X") && btn[4].getText().equals("X") && btn[5].getText().equals("X")) {
			resultado(p1, p2);
		}
		if (btn[0].getText().equals("0") && btn[1].getText().equals("0") && btn[2].getText().equals("0")
				|| btn[0].getText().equals("0") && btn[3].getText().equals("0") && btn[6].getText().equals("0")
				|| btn[0].getText().equals("0") && btn[4].getText().equals("0") && btn[8].getText().equals("0")
				|| btn[1].getText().equals("0") && btn[4].getText().equals("0") && btn[7].getText().equals("0")
				|| btn[2].getText().equals("0") && btn[5].getText().equals("0") && btn[8].getText().equals("0")
				|| btn[2].getText().equals("0") && btn[4].getText().equals("0") && btn[6].getText().equals("0")
				|| btn[3].getText().equals("0") && btn[4].getText().equals("0") && btn[5].getText().equals("0")) {
			resultado(p1, p2);

		}
	}

	public void resultado(String p1, String p2) {
		if (p1 != null) {
			JOptionPane.showMessageDialog(null, p1 + " venceu!");
		} else {
			JOptionPane.showMessageDialog(null, p2 + " venceu!");
		}
	}

}

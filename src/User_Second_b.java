import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class User_Second_b extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User_Second_b frame = new User_Second_b();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public User_Second_b() {
		setTitle("CAR RACING GAME");

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYouAreNow = new JLabel("You are now registerd and you can login");
		lblYouAreNow.setBounds(79, 80, 327, 15);
		contentPane.add(lblYouAreNow);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(153, 107, 117, 25);
		contentPane.add(btnOk);
		btnOk.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		    
			// display admin frame when the button is pressed
				 setVisible(false);
		  }
		});
	}
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testtsproject;

/**
 *
 * @author Mamun
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import com.intellij.uiDesigner.core.*;
/*
 * Created by JFormDesigner on Sat Nov 10 22:41:45 BDT 2012
 */



/**
 * @author Mamun
 */
public class LoginPanel extends JPanel {
	public LoginPanel() {
		initComponents();
	}

        private Object getMainFrame()
        {
            return this.getParent().getParent().getParent().getParent();
        }
	private void SubmitButtonMouseClicked(MouseEvent e) {
		// TODO add your code here
            
            System.out.print(UsernameField.getText()+" "+passField.getText());
            
            MainFrame m = (MainFrame) this.getMainFrame();
            if(m.isTeacher==true)
            {
                m.turnOnJPanel(m.numberOfQuesSelectionPanel);
            }
	}

	private void backButtonMouseClicked(MouseEvent e) {
		// TODO add your code here
            
           // System.out.print(this.getMainFrame().toString());
            
             MainFrame m = (MainFrame) this.getMainFrame();
            
             m.isTeacher = true;
            
             m.turnOnJPanel(m.loginSelectPanel);
	}
	
            
	

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		Title = new JLabel();
		panel1 = new JPanel();
		usernameLabel = new JLabel();
		UsernameField = new JTextField();
		passLabel = new JLabel();
		passField = new JPasswordField();
		panel2 = new JPanel();
		SubmitButton = new JButton();
		backButton = new JButton();

		//======== this ========
		setLayout(new GridLayoutManager(3, 1, new Insets(0, 0, 0, 0), 5, -1));

		//---- Title ----
		Title.setText("Login");
		Title.setHorizontalAlignment(SwingConstants.CENTER);
		Title.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(Title, new GridConstraints(0, 0, 1, 1,
			GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
			GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
			GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
			null, null, null));

		//======== panel1 ========
		{
			panel1.setLayout(null);

			//---- usernameLabel ----
			usernameLabel.setText("Username:");
			panel1.add(usernameLabel);
			usernameLabel.setBounds(10, 20, 140, 30);
			panel1.add(UsernameField);
			UsernameField.setBounds(150, 20, 235, 30);

			//---- passLabel ----
			passLabel.setText("Password");
			panel1.add(passLabel);
			passLabel.setBounds(10, 65, 140, 30);
			panel1.add(passField);
			passField.setBounds(150, 65, 235, 30);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < panel1.getComponentCount(); i++) {
					Rectangle bounds = panel1.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = panel1.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				panel1.setMinimumSize(preferredSize);
				panel1.setPreferredSize(preferredSize);
			}
		}
		add(panel1, new GridConstraints(1, 0, 1, 1,
			GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
			GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
			GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
			null, null, null));

		//======== panel2 ========
		{
			panel2.setLayout(null);

			//---- SubmitButton ----
			SubmitButton.setText("Submit");
			SubmitButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
			SubmitButton.setPreferredSize(new Dimension(50, 30));
			SubmitButton.setMinimumSize(new Dimension(50, 30));
			SubmitButton.setMaximumSize(new Dimension(50, 30));
			SubmitButton.setBorder(new LineBorder(Color.black));
			SubmitButton.setAutoscrolls(true);
			SubmitButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					SubmitButtonMouseClicked(e);
				}
			});
			panel2.add(SubmitButton);
			SubmitButton.setBounds(45, 5, 90, SubmitButton.getPreferredSize().height);

			//---- backButton ----
			backButton.setText("Back");
			backButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
			backButton.setPreferredSize(new Dimension(50, 30));
			backButton.setMinimumSize(new Dimension(50, 30));
			backButton.setMaximumSize(new Dimension(50, 30));
			backButton.setBorder(new LineBorder(Color.black));
			backButton.setAutoscrolls(true);
			backButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					backButtonMouseClicked(e);
				}
			});
			panel2.add(backButton);
			backButton.setBounds(45, 70, 75, 20);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < panel2.getComponentCount(); i++) {
					Rectangle bounds = panel2.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = panel2.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				panel2.setMinimumSize(preferredSize);
				panel2.setPreferredSize(preferredSize);
			}
		}
		add(panel2, new GridConstraints(2, 0, 1, 1,
			GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
			GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
			GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
			null, null, null));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel Title;
	private JPanel panel1;
	private JLabel usernameLabel;
	private JTextField UsernameField;
	private JLabel passLabel;
	private JTextField passField;
	private JPanel panel2;
	private JButton SubmitButton;
	private JButton backButton;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}

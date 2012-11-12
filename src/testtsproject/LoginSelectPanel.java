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
/*
 * Created by JFormDesigner on Sat Nov 10 21:09:02 BDT 2012
 */



/**
 * @author Mamun
 */
public class LoginSelectPanel extends JPanel {
	public LoginSelectPanel() {
		initComponents();
	}

        
        private Object getMainFrame()
        {
            return this.getParent().getParent().getParent().getParent();
        }
        
	private void TeacherButtonMouseClicked(MouseEvent e) {
		// TODO add your code here
            
            MainFrame m = (MainFrame) this.getMainFrame();
            
            m.isTeacher = true;
            
           m.turnOnJPanel(m.loginPanel);
	}

	private void StudentButtonMouseClicked(MouseEvent e) {
		// TODO add your code here
            
            MainFrame m = (MainFrame) this.getMainFrame();
            
            m.isTeacher = false;
            
             m.turnOnJPanel(m.loginPanel);
	}
	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		TitleLabel = new JLabel();
		TeacherButton = new JButton();
		StudentButton = new JButton();

		//======== this ========
		setLayout(new GridLayout(4, 0, 10, 20));

		//---- TitleLabel ----
		TitleLabel.setText("Select who You are.....");
		TitleLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		TitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		add(TitleLabel);

		//---- TeacherButton ----
		TeacherButton.setText("Teacher");
		TeacherButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TeacherButton.setPreferredSize(new Dimension(50, 30));
		TeacherButton.setMinimumSize(new Dimension(50, 30));
		TeacherButton.setMaximumSize(new Dimension(50, 30));
		TeacherButton.setBorder(new LineBorder(Color.black));
		TeacherButton.setAutoscrolls(true);
		TeacherButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		TeacherButton.setMargin(new Insets(20, 20, 20, 14));
		TeacherButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TeacherButtonMouseClicked(e);
			}
		});
		add(TeacherButton);

		//---- StudentButton ----
		StudentButton.setText("Student");
		StudentButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		StudentButton.setPreferredSize(new Dimension(50, 30));
		StudentButton.setMinimumSize(new Dimension(50, 30));
		StudentButton.setMaximumSize(new Dimension(50, 30));
		StudentButton.setBorder(new LineBorder(Color.black));
		StudentButton.setAutoscrolls(true);
		StudentButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StudentButtonMouseClicked(e);
			}
		});
		add(StudentButton);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel TitleLabel;
	private JButton TeacherButton;
	private JButton StudentButton;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}

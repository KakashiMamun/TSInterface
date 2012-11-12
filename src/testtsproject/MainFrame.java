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
import javax.swing.*;
/*
 * Created by JFormDesigner on Sat Nov 10 21:06:58 BDT 2012
 */



/**
 * @author Mamun
 */
public class MainFrame extends JFrame {
	public MainFrame(String t) {
            super(t);
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents

		//======== this ========
		Container contentPane = getContentPane();
		contentPane.setLayout(new CardLayout());
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
                
                //======LoginSelectPanel======
                loginSelectPanel = new LoginSelectPanel();
                //loginSelectPanel.setBackground(Color.cyan);
                contentPane.add(loginSelectPanel, BorderLayout.CENTER);
                loginSelectPanel.setVisible(true);
                
                //========Loginpanel========
                 loginPanel = new LoginPanel();
                //loginSelectPanel.setBackground(Color.cyan);
                contentPane.add(loginPanel, BorderLayout.CENTER);
                loginSelectPanel.setVisible(false);
                
                
                //=====NOQSpanel============
                numberOfQuesSelectionPanel = new numberOfQuesSelectionPanel();
                contentPane.add(numberOfQuesSelectionPanel, BorderLayout.CENTER);
                numberOfQuesSelectionPanel.setVisible(false);
                
                //=====QSPane============
                questionScrollPane = new QuestionsScrollPane();
                contentPane.add(questionScrollPane, BorderLayout.CENTER);
                questionScrollPane.setVisible(false);
                
                
                //======Frame Settings======
                setSize(600, 500);
		setLocationRelativeTo(getOwner());
	}

        
        public void turnOnJPanel(JPanel p)
        {
         
            this.loginPanel.setVisible(false);
            this.loginSelectPanel.setVisible(false);
            this.numberOfQuesSelectionPanel.setVisible(false);
            this.questionScrollPane.setVisible(false);
            
            p.setVisible(true);
        }
	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// JFormDesigner - End of variables declaration  //GEN-END:variables
        
         JPanel loginSelectPanel;
         JPanel loginPanel;
         JPanel numberOfQuesSelectionPanel;
         JPanel questionScrollPane;
       
         
        
        boolean isTeacher;
        public static void main(String [] args)
        {
            MainFrame mainFrame = new MainFrame("Main Frame");
            mainFrame.setVisible(true);
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}

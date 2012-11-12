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
import com.intellij.uiDesigner.core.*;
/*
 * Created by JFormDesigner on Sun Nov 11 19:31:02 BDT 2012
 */



/**
 * @author Mamun
 */
public class numberOfQuesSelectionPanel extends JPanel {
	public numberOfQuesSelectionPanel() {
		initComponents();
	}


        private Object getMainFrame()
        {
            return this.getParent().getParent().getParent().getParent();
        }
	private void proccedButtonMouseClicked(MouseEvent e) {
		// TODO add your code here
            
            //System.out.print("Works fine");
            
              int mcqQuesNo;
              int tfQuesNo;
              
              try{
                 mcqQuesNo = Integer.parseInt(MCQField.getText());
                 tfQuesNo = Integer.parseInt(TFField.getText());
           
                 if((mcqQuesNo+tfQuesNo) != 0){
                     MainFrame m = (MainFrame) this.getMainFrame();
                     QuestionsScrollPane sc = (QuestionsScrollPane) m.questionScrollPane;
                     sc.mcqQuesNo = mcqQuesNo;
                     sc.tfQuesNo = tfQuesNo;
                     sc.total = sc.mcqQuesNo + sc.tfQuesNo;
                     sc.containerSetup();
                     m.turnOnJPanel(m.questionScrollPane);
                 }
              }
              catch(Exception ex){
                  StatusLabel.setText(StatusLabel.getText()+ " Something Wrong. Please fill all required boxes");
              }
            
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		Titile = new JLabel();
		MCQPanel = new JPanel();
		MCQLabel = new JLabel();
		MCQField = new JTextField();
		TFPanel = new JPanel();
		TFLabel = new JLabel();
		TFField = new JTextField();
		IDPanel = new JPanel();
		IDLabel = new JLabel();
		IDField = new JTextField();
		DurationPanel = new JPanel();
		DurationLabel = new JLabel();
		DurationField = new JTextField();
		StatusPanel = new JPanel();
		StatusLabel = new JLabel();
		proccedButton = new JButton();

		//======== this ========
		setLayout(new GridLayoutManager(6, 1, new Insets(0, 0, 0, 0), 5, -1));

		//---- Titile ----
		Titile.setText("Number of question you want to set.");
		Titile.setFont(new Font("Tahoma", Font.PLAIN, 18));
		add(Titile, new GridConstraints(0, 0, 1, 1,
			GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
			GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
			GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
			null, null, null));

		//======== MCQPanel ========
		{
			MCQPanel.setLayout(null);

			//---- MCQLabel ----
			MCQLabel.setText("MCQ Questions");
			MCQPanel.add(MCQLabel);
			MCQLabel.setBounds(75, 10, 210, 25);
			MCQPanel.add(MCQField);
			MCQField.setBounds(335, 10, 110, 25);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < MCQPanel.getComponentCount(); i++) {
					Rectangle bounds = MCQPanel.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = MCQPanel.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				MCQPanel.setMinimumSize(preferredSize);
				MCQPanel.setPreferredSize(preferredSize);
			}
		}
		add(MCQPanel, new GridConstraints(3, 0, 1, 1,
			GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
			GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
			GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
			null, null, null));

		//======== TFPanel ========
		{
			TFPanel.setLayout(null);

			//---- TFLabel ----
			TFLabel.setText("True/False Questions");
			TFPanel.add(TFLabel);
			TFLabel.setBounds(70, 10, 210, 25);
			TFPanel.add(TFField);
			TFField.setBounds(335, 10, 110, 25);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < TFPanel.getComponentCount(); i++) {
					Rectangle bounds = TFPanel.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = TFPanel.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				TFPanel.setMinimumSize(preferredSize);
				TFPanel.setPreferredSize(preferredSize);
			}
		}
		add(TFPanel, new GridConstraints(4, 0, 1, 1,
			GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
			GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
			GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
			null, null, null));

		//======== IDPanel ========
		{
			IDPanel.setLayout(null);

			//---- IDLabel ----
			IDLabel.setText("Question ID:");
			IDPanel.add(IDLabel);
			IDLabel.setBounds(75, 10, 210, 25);
			IDPanel.add(IDField);
			IDField.setBounds(335, 10, 110, 25);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < IDPanel.getComponentCount(); i++) {
					Rectangle bounds = IDPanel.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = IDPanel.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				IDPanel.setMinimumSize(preferredSize);
				IDPanel.setPreferredSize(preferredSize);
			}
		}
		add(IDPanel, new GridConstraints(1, 0, 1, 1,
			GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
			GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
			GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
			null, null, null));

		//======== DurationPanel ========
		{
			DurationPanel.setLayout(null);

			//---- DurationLabel ----
			DurationLabel.setText("Duration");
			DurationPanel.add(DurationLabel);
			DurationLabel.setBounds(75, 10, 210, 25);
			DurationPanel.add(DurationField);
			DurationField.setBounds(335, 10, 110, 25);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < DurationPanel.getComponentCount(); i++) {
					Rectangle bounds = DurationPanel.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = DurationPanel.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				DurationPanel.setMinimumSize(preferredSize);
				DurationPanel.setPreferredSize(preferredSize);
			}
		}
		add(DurationPanel, new GridConstraints(2, 0, 1, 1,
			GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
			GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
			GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
			null, null, null));

		//======== StatusPanel ========
		{
			StatusPanel.setLayout(null);

			//---- StatusLabel ----
			StatusLabel.setText("Status:");
			StatusPanel.add(StatusLabel);
			StatusLabel.setBounds(20, 10, 345, 28);

			//---- proccedButton ----
			proccedButton.setText("Procced");
			proccedButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					proccedButtonMouseClicked(e);
				}
			});
			StatusPanel.add(proccedButton);
			proccedButton.setBounds(340, 10, 110, 28);

			{ // compute preferred size
				Dimension preferredSize = new Dimension();
				for(int i = 0; i < StatusPanel.getComponentCount(); i++) {
					Rectangle bounds = StatusPanel.getComponent(i).getBounds();
					preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
					preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
				}
				Insets insets = StatusPanel.getInsets();
				preferredSize.width += insets.right;
				preferredSize.height += insets.bottom;
				StatusPanel.setMinimumSize(preferredSize);
				StatusPanel.setPreferredSize(preferredSize);
			}
		}
		add(StatusPanel, new GridConstraints(5, 0, 1, 1,
			GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
			GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
			GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
			null, null, null));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel Titile;
	private JPanel MCQPanel;
	private JLabel MCQLabel;
	private JTextField MCQField;
	private JPanel TFPanel;
	private JLabel TFLabel;
	private JTextField TFField;
	private JPanel IDPanel;
	private JLabel IDLabel;
	private JTextField IDField;
	private JPanel DurationPanel;
	private JLabel DurationLabel;
	private JTextField DurationField;
	private JPanel StatusPanel;
	private JLabel StatusLabel;
	private JButton proccedButton;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}

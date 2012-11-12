
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
import com.intellij.uiDesigner.core.*;
import javax.swing.border.TitledBorder;
/*
 * Created by JFormDesigner on Sun Nov 11 19:15:59 BDT 2012
 */



/**
 * @author Mamun
 */
public class MCQPanel extends JPanel {
	public MCQPanel(String title) {
		initComponents(title);
	}

	private void initComponents(String title) {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		Titile = new JLabel();
		QuestionPanel = new JPanel();
		QuestionPanel2 = new JPanel();
		quesLabel = new JLabel();
		quesText = new JTextField();
		choicePanels = new JPanel();
		ABPanel = new JPanel();
		choiceA = new JPanel();
		label1 = new JLabel();
		ansField = new JTextField();
		choiceB = new JPanel();
		label2 = new JLabel();
		ansField2 = new JTextField();
		CDPanel = new JPanel();
		choiceC = new JPanel();
		label3 = new JLabel();
		ansField3 = new JTextField();
		choiceD = new JPanel();
		label4 = new JLabel();
		ansField4 = new JTextField();
		AnswerPanel = new JPanel();
		label5 = new JLabel();
		ABox = new JCheckBox();
		BBox = new JCheckBox();
		CBox = new JCheckBox();
		DBox = new JCheckBox();

		//======== this ========
		setPreferredSize(new Dimension(500, 100));
		setMaximumSize(new Dimension(500, 100));
		setMinimumSize(new Dimension(500, 100));
		setLayout(new GridLayout(3, 0, 0, 3));
                
                //setBorder(new TitledBorder(Titile.getText()));

		//---- Titile ----
		Titile.setText(title);
		//Titile.setFont(new Font("Tahoma", Font.PLAIN, 18));
		//Titile.setHorizontalAlignment(SwingConstants.CENTER);
		//add(Titile);

                setBorder(new TitledBorder(Titile.getText()));
		//======== QuestionPanel ========
		{
			QuestionPanel.setLayout(new FlowLayout());
                         
			//======== QuestionPanel2 ========
			{
				QuestionPanel2.setLayout(null);

				//---- quesLabel ----
				quesLabel.setText("Question:");
				quesLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
				QuestionPanel2.add(quesLabel);
				quesLabel.setBounds(0, 0, 90, 30);
				QuestionPanel2.add(quesText);
				quesText.setBounds(90, 0, 395, 30);

				{ // compute preferred size
					Dimension preferredSize = new Dimension();
					for(int i = 0; i < QuestionPanel2.getComponentCount(); i++) {
						Rectangle bounds = QuestionPanel2.getComponent(i).getBounds();
						preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
						preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
					}
					Insets insets = QuestionPanel2.getInsets();
					preferredSize.width += insets.right;
					preferredSize.height += insets.bottom;
					QuestionPanel2.setMinimumSize(preferredSize);
					QuestionPanel2.setPreferredSize(preferredSize);
				}
			}
			QuestionPanel.add(QuestionPanel2);
		}
		add(QuestionPanel);

		//======== choicePanels ========
		{
			choicePanels.setLayout(new FlowLayout());

			//======== ABPanel ========
			{
				ABPanel.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), 20, -1));

				//======== choiceA ========
				{
					choiceA.setLayout(null);

					//---- label1 ----
					label1.setText("A:");
					choiceA.add(label1);
					label1.setBounds(0, 0, 35, 20);
					choiceA.add(ansField);
					ansField.setBounds(70, 0, 130, 20);

					{ // compute preferred size
						Dimension preferredSize = new Dimension();
						for(int i = 0; i < choiceA.getComponentCount(); i++) {
							Rectangle bounds = choiceA.getComponent(i).getBounds();
							preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
							preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
						}
						Insets insets = choiceA.getInsets();
						preferredSize.width += insets.right;
						preferredSize.height += insets.bottom;
						choiceA.setMinimumSize(preferredSize);
						choiceA.setPreferredSize(preferredSize);
					}
				}
				ABPanel.add(choiceA, new GridConstraints(0, 0, 1, 1,
					GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
					GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
					GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
					null, null, null));

				//======== choiceB ========
				{
					choiceB.setLayout(null);

					//---- label2 ----
					label2.setText("B:");
					choiceB.add(label2);
					label2.setBounds(0, 0, 35, 20);
					choiceB.add(ansField2);
					ansField2.setBounds(70, 0, 130, 20);

					{ // compute preferred size
						Dimension preferredSize = new Dimension();
						for(int i = 0; i < choiceB.getComponentCount(); i++) {
							Rectangle bounds = choiceB.getComponent(i).getBounds();
							preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
							preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
						}
						Insets insets = choiceB.getInsets();
						preferredSize.width += insets.right;
						preferredSize.height += insets.bottom;
						choiceB.setMinimumSize(preferredSize);
						choiceB.setPreferredSize(preferredSize);
					}
				}
				ABPanel.add(choiceB, new GridConstraints(0, 1, 1, 1,
					GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
					GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
					GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
					null, null, null));
			}
			choicePanels.add(ABPanel);

			//======== CDPanel ========
			{
				CDPanel.setLayout(new GridLayoutManager(1, 2, new Insets(0, 0, 0, 0), 20, -1));

				//======== choiceC ========
				{
					choiceC.setLayout(null);

					//---- label3 ----
					label3.setText("C:");
					choiceC.add(label3);
					label3.setBounds(0, 0, 35, 20);
					choiceC.add(ansField3);
					ansField3.setBounds(70, 0, 130, 20);

					{ // compute preferred size
						Dimension preferredSize = new Dimension();
						for(int i = 0; i < choiceC.getComponentCount(); i++) {
							Rectangle bounds = choiceC.getComponent(i).getBounds();
							preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
							preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
						}
						Insets insets = choiceC.getInsets();
						preferredSize.width += insets.right;
						preferredSize.height += insets.bottom;
						choiceC.setMinimumSize(preferredSize);
						choiceC.setPreferredSize(preferredSize);
					}
				}
				CDPanel.add(choiceC, new GridConstraints(0, 0, 1, 1,
					GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
					GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
					GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
					null, null, null));

				//======== choiceD ========
				{
					choiceD.setLayout(null);

					//---- label4 ----
					label4.setText("D:");
					choiceD.add(label4);
					label4.setBounds(0, 0, 35, 20);
					choiceD.add(ansField4);
					ansField4.setBounds(70, 0, 130, 20);

					{ // compute preferred size
						Dimension preferredSize = new Dimension();
						for(int i = 0; i < choiceD.getComponentCount(); i++) {
							Rectangle bounds = choiceD.getComponent(i).getBounds();
							preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
							preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
						}
						Insets insets = choiceD.getInsets();
						preferredSize.width += insets.right;
						preferredSize.height += insets.bottom;
						choiceD.setMinimumSize(preferredSize);
						choiceD.setPreferredSize(preferredSize);
					}
				}
				CDPanel.add(choiceD, new GridConstraints(0, 1, 1, 1,
					GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
					GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
					GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
					null, null, null));
			}
			choicePanels.add(CDPanel);
		}
		add(choicePanels);

		//======== AnswerPanel ========
		{
			AnswerPanel.setLayout(new FlowLayout());

			//---- label5 ----
			label5.setText("Answer:");
			label5.setFont(new Font("Tahoma", Font.PLAIN, 14));
			AnswerPanel.add(label5);

			//---- ABox ----
			ABox.setText("A");
			AnswerPanel.add(ABox);

			//---- BBox ----
			BBox.setText("B");
			AnswerPanel.add(BBox);

			//---- CBox ----
			CBox.setText("C");
			AnswerPanel.add(CBox);

			//---- DBox ----
			DBox.setText("D");
			AnswerPanel.add(DBox);
		}
		add(AnswerPanel);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	public  JLabel Titile;
	private JPanel QuestionPanel;
	private JPanel QuestionPanel2;
	private JLabel quesLabel;
	private JTextField quesText;
	private JPanel choicePanels;
	private JPanel ABPanel;
	private JPanel choiceA;
	private JLabel label1;
	private JTextField ansField;
	private JPanel choiceB;
	private JLabel label2;
	private JTextField ansField2;
	private JPanel CDPanel;
	private JPanel choiceC;
	private JLabel label3;
	private JTextField ansField3;
	private JPanel choiceD;
	private JLabel label4;
	private JTextField ansField4;
	private JPanel AnswerPanel;
	private JLabel label5;
	private JCheckBox ABox;
	private JCheckBox BBox;
	private JCheckBox CBox;
	private JCheckBox DBox;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}

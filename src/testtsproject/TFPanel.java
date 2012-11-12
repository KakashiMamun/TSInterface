
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
import javax.swing.border.*;
/*
 * Created by JFormDesigner on Sun Nov 11 18:38:16 BDT 2012
 */



/**
 * @author Mamun
 */
public class TFPanel extends  JPanel{

    
        public TFPanel(String title) {
		initComponents(title);
	}
    
        
	private void initComponents(String title) {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		Titile = new JLabel();
		QuestionPanel = new JPanel();
		QuestionPanel2 = new JPanel();
		quesLabel = new JLabel();
		quesText = new JTextField();
		AnswerPanel = new JPanel();
		label5 = new JLabel();
		TBox = new JCheckBox();

		//======== this ========
		setPreferredSize(new Dimension(500, 100));
		setLayout(new GridLayout(2, 0));

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

		//======== AnswerPanel ========
		{
			AnswerPanel.setLayout(new FlowLayout());

			//---- label5 ----
			label5.setText("Answer:");
			label5.setFont(new Font("Tahoma", Font.PLAIN, 14));
			AnswerPanel.add(label5);

			//---- TBox ----
			TBox.setText("True");
			AnswerPanel.add(TBox);
		}
		add(AnswerPanel);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	 JLabel Titile;
	private JPanel QuestionPanel;
	private JPanel QuestionPanel2;
	private JLabel quesLabel;
	private JTextField quesText;
	private JPanel AnswerPanel;
	private JLabel label5;
	private JCheckBox TBox;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}

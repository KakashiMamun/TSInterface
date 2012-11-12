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
import org.jdesktop.swingx.VerticalLayout;
/*
 * Created by JFormDesigner on Sun Nov 11 19:31:56 BDT 2012
 */

/**
 * @author Mamun
 */
public class QuestionsScrollPane extends JPanel {

    public QuestionsScrollPane() {
        //containerSetup();
        initComponents();
    }

    private void proccedButtonMouseClicked(MouseEvent e) {
        // TODO add your code here
    }

    public void containerSetup() {
        container = new JPanel();
        questionPanels = new JPanel[total];
        container.setLayout(new VerticalLayout());

        //System.out.print(mcqQuesNo+" "+tfQuesNo);

        for (int i = 0; i < mcqQuesNo; i++) {
            questionPanels[i] = new MCQPanel("MCQ Question No:" + (i + 1));
            questionPanels[i].setPreferredSize(new Dimension(500, 200));
            container.add(questionPanels[i]);
        }

        for (int i = mcqQuesNo; i < total; i++) {
            questionPanels[i] = new TFPanel("True/False Question No:" + (i - mcqQuesNo + 1));
            questionPanels[i].setPreferredSize(new Dimension(500, 100));
            container.add(questionPanels[i]);
        }


        //======== scrollPane1 ========
        {
            scrollPane1 = new JScrollPane(container);
            scrollPane1.setBorder(new EtchedBorder());
            scrollPane1.setBackground(new Color(204, 204, 255));
            scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
            scrollPane1.setViewportBorder(new EtchedBorder());
            scrollPane1.setComponentOrientation(ComponentOrientation.UNKNOWN);
            scrollPane1.setDoubleBuffered(true);
            scrollPane1.setFocusable(false);
            scrollPane1.setPreferredSize(new Dimension(500, 350));
        }
        add(scrollPane1);

        setupStatusPanel();


    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        Titile = new JLabel();

        StatusPanel = new JPanel();
        StatusPanel2 = new JPanel();
        StatusLabel = new JLabel();
        proccedButton = new JButton();

        //======== this ========
        setLayout(new VerticalLayout());

        //---- Titile ----
        Titile.setText("Set Questions");
        Titile.setFont(new Font("Tahoma", Font.PLAIN, 18));
        Titile.setHorizontalAlignment(SwingConstants.CENTER);
        Titile.setFocusable(false);
        Titile.setHorizontalTextPosition(SwingConstants.CENTER);
        Titile.setMaximumSize(new Dimension(500, 50));
        Titile.setMinimumSize(new Dimension(500, 50));
        Titile.setPreferredSize(new Dimension(500, 50));
        Titile.setRequestFocusEnabled(false);
        add(Titile);




        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    public void setupStatusPanel() {

        //======== StatusPanel ========
        {
            StatusPanel.setLayout(new FlowLayout());

            //======== StatusPanel2 ========
            {
                StatusPanel2.setLayout(null);

                //---- StatusLabel ----
                StatusLabel.setText("Status:");
                StatusPanel2.add(StatusLabel);
                StatusLabel.setBounds(0, 0, 380, 28);

                //---- proccedButton ----
                proccedButton.setText("Procced");
                proccedButton.addMouseListener(new MouseAdapter() {

                    @Override
                    public void mouseClicked(MouseEvent e) {
                        proccedButtonMouseClicked(e);
                    }
                });
                StatusPanel2.add(proccedButton);
                proccedButton.setBounds(390, 0, 110, 28);

                { // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for (int i = 0; i < StatusPanel2.getComponentCount(); i++) {
                        Rectangle bounds = StatusPanel2.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = StatusPanel2.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    StatusPanel2.setMinimumSize(preferredSize);
                    StatusPanel2.setPreferredSize(preferredSize);
                }
            }
            StatusPanel.add(StatusPanel2);
        }
        add(StatusPanel);
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel Titile;
    private JScrollPane scrollPane1;
    private JPanel StatusPanel;
    private JPanel StatusPanel2;
    private JLabel StatusLabel;
    private JButton proccedButton;
    private JPanel container;
    private JPanel[] questionPanels;
    public int mcqQuesNo;
    public int tfQuesNo;
    public int total;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}

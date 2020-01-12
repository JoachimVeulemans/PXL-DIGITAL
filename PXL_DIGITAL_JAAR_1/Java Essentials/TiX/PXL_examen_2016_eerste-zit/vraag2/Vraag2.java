package be.pxl.vraag2;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    Daan Vankerkom
    1 TIN J
 */
public class Vraag2 extends JFrame {

    private final static char[] SYMBOLEN = {'a', 'b', 'c', 'd', '+', '"'};
    private final static int AANTALRIJEN = 3;

    private JTextField textfieldTop;

    private JPanel container;
    private JPanel leftPanel;
    private JPanel rightPanel;

    private JComboBox<String> cboActions;
    private JButton btnOkay;

    private JButton[] buttons = new JButton[SYMBOLEN.length];

    public Vraag2() {
        super("vraag2");

        initComponents();
        setLayout();
        initActionListeners();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

    private void initComponents() {

        // NORTH
        textfieldTop = new JTextField(20);
        textfieldTop.setEditable(false);

        // Container
        container = new JPanel();

        // leftPanel
        leftPanel = new JPanel();
        for(int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("" + SYMBOLEN[i]);
        }

        // rightPanel
        rightPanel = new JPanel();
        cboActions = new JComboBox<String>(new String[] { "verdubbel", "wis", "hoofdletters" });
        btnOkay = new JButton("ok");

    }

    private void setLayout() {
        setLayout(new BorderLayout());

        // Top
        add(textfieldTop, BorderLayout.NORTH);

        // Left panel
        leftPanel.setLayout(new GridLayout(AANTALRIJEN, 2));
        // Add buttons.
        for(int i = 0; i < buttons.length; i++) {
            leftPanel.add(buttons[i]);
        }

        // Right Panel
        rightPanel.setLayout(new GridLayout(0, 1));
        rightPanel.add(cboActions);
        rightPanel.add(btnOkay);

        // Container
        container.setLayout(new GridLayout(0, 2));
        container.add(leftPanel);
        container.add(rightPanel);

        add(container, BorderLayout.CENTER);

    }

    private void initActionListeners() {
        for(int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton sender = (JButton)e.getSource();
                    String currentText = textfieldTop.getText();
                    currentText += sender.getText();
                    textfieldTop.setText(currentText);
                }
            });
        }

        btnOkay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String content = textfieldTop.getText();

                switch (cboActions.getSelectedIndex()) {
                    case 0: // Verdubbel
                    {
                        content += content; // Add content
                        break;
                    }

                    case 1: // Wis
                    {
                        content = ""; // Empty string
                        break;
                    }

                    case 2:
                    {
                        content = content.toUpperCase(); // Uppercase ;)
                        break;
                    }

                }

                textfieldTop.setText(content);
            }
        });
    }
}

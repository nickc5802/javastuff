import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Arrays;

public class TicTacToe extends JFrame {
    //0 - not selected, 1 - x, 2 - o
    int[] states = new int[9];

    int currentPlayer = 1;

    //creating buttons
    JButton tl = new JButton("");
    JButton tm = new JButton("");
    JButton tr = new JButton("");
    JButton cl = new JButton("");
    JButton cm = new JButton("");
    JButton cr = new JButton("");
    JButton bl = new JButton("");
    JButton bm = new JButton("");
    JButton br = new JButton("");

    JButton win = new JButton("");

    public TicTacToe() {
        super();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        getContentPane().add(panel);
        setSize(800,500);
        setVisible(true);

        panel.setLayout(null);

        Arrays.fill(states, 0);

        //adding buttons to panel
        panel.add(tl);
        panel.add(tm);
        panel.add(tr);
        panel.add(cl);
        panel.add(cm);
        panel.add(cr);
        panel.add(bl);
        panel.add(bm);
        panel.add(br);

        panel.add(win);

        //positioning buttons
        tl.setBounds(0, 0, 150, 150);
        tm.setBounds(150, 0, 150, 150);
        tr.setBounds(300, 0, 150, 150);
        cl.setBounds(0, 150, 150, 150);
        cm.setBounds(150, 150, 150, 150);
        cr.setBounds(300, 150, 150, 150);
        bl.setBounds(0, 300, 150, 150);
        bm.setBounds(150, 300, 150, 150);
        br.setBounds(300, 300, 150, 150);

        win.setBounds(500, 200, 150, 50);

        win.setBorderPainted(false);
        win.setFocusPainted(false);
        win.setContentAreaFilled(false);

        tl.setFont(new Font("Arial", Font.PLAIN, 40));
        tm.setFont(new Font("Arial", Font.PLAIN, 40));
        tr.setFont(new Font("Arial", Font.PLAIN, 40));
        cl.setFont(new Font("Arial", Font.PLAIN, 40));
        cm.setFont(new Font("Arial", Font.PLAIN, 40));
        cr.setFont(new Font("Arial", Font.PLAIN, 40));
        bl.setFont(new Font("Arial", Font.PLAIN, 40));
        bm.setFont(new Font("Arial", Font.PLAIN, 40));
        br.setFont(new Font("Arial", Font.PLAIN, 40));

        win.setText("Player one's turn");

        tl.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    onClick(0, tl);
                }
            });
        tm.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    onClick(1, tm);
                }
            });
        tr.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    onClick(2, tr);
                }
            });
        cl.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    onClick(3, cl);
                }
            });
        cm.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    onClick(4, cm);
                }
            });
        cr.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    onClick(5, cr);
                }
            });
        bl.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    onClick(6, bl);
                }
            });
        bm.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    onClick(7, bm);
                }
            });
        br.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    onClick(8, br);
                }
            });
    }

    public int winCheck() {
        int win = 0;
        if (states[0] == states[2] && states[0] == states[1] && states[0] != 0) {
            if (states[0] == 1) {
                win = 1;
            } else if (states[0] == 2) {
                win = 2;
            }
        } else if (states[3] == states[5] && states[3] == states[4] && states[3] != 0) {
            if (states[3] == 1) {
                win = 1;
            } else if (states[3] == 2) {
                win = 2;
            }
        } else if (states[6] == states[8] && states[6] == states[7] && states[6] != 0) {
            if (states[6] == 1) {
                win = 1;
            } else if (states[6] == 2) {
                win = 2;
            }
        } else if (states[0] == states[3] && states[0] == states[6] && states[0] != 0) {
            if (states[0] == 1) {
                win = 1;
            } else if (states[0] == 2) {
                win = 2;
            }
        } else if (states[2] == states[5] && states[2] == states[8] && states[2] != 0) {
            if (states[2] == 1) {
                win = 1;
            } else if (states[2] == 2) {
                win = 2;
            }
        } else if (states[1] == states[4] && states[1] == states[7] && states[1] != 0) {
            if (states[1] == 1) {
                win = 1;
            } else if (states[1] == 2) {
                win = 2;
            }
        } else if (states[0] == states[4] && states[0] == states[8] && states[0] != 0) {
            if (states[0] == 1) {
                win = 1;
            } else if (states[0] == 2) {
                win = 2;
            }
        } else if (states[2] == states[4] && states[2] == states[6] && states[2] != 0) {
            if (states[2] == 1) {
                win = 1;
            } else if (states[2] == 2) {
                win = 2;
            }
        }
        return win;
    }
    
    public void onClick(int index, JButton b) {
        if (states[index] == 0) {
            if (currentPlayer == 1) {
                b.setText("X");
                states[index] = 1;
                currentPlayer = 2;
                win.setText("Player two's turn");
            } else if (currentPlayer == 2) {
                b.setText("O");
                states[index] = 2;
                currentPlayer = 1;
                win.setText("Player one's turn");
            }
            if (winCheck() == 1) {
                win.setText("Player one wins");
            } else if (winCheck() == 2) {
                win.setText("Player two wins");
            }
        }
    }
}
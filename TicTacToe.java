import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class TicTacToe extends JFrame {
    //0 - not selected, 1 - x, 2 - o
    int tlState = 0;
    int tmState = 0;
    int trState = 0;
    int clState = 0;
    int cmState = 0;
    int crState = 0;
    int blState = 0;
    int bmState = 0;
    int brState = 0;

    int currentPlayer = 1;

    public TicTacToe() {
        super();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        getContentPane().add(panel);
        setSize(800,500);
        setVisible(true);

        panel.setLayout(null);

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
                    if (tlState == 0) {
                        if (currentPlayer == 1) {
                            tl.setText("X");
                            tlState = 1;
                            currentPlayer = 2;
                            win.setText("Player two's turn");
                        } else if (currentPlayer == 2) {
                            tl.setText("O");
                            tlState = 2;
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
            });
        tm.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (tmState == 0) {
                        if (currentPlayer == 1) {
                            tm.setText("X");
                            tmState = 1;
                            currentPlayer = 2;
                            win.setText("Player two's turn");
                        } else if (currentPlayer == 2) {
                            tm.setText("O");
                            tmState = 2;
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
            });
        tr.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (trState == 0) {
                        if (currentPlayer == 1) {
                            tr.setText("X");
                            trState = 1;
                            currentPlayer = 2;
                            win.setText("Player two's turn");
                        } else if (currentPlayer == 2) {
                            tr.setText("O");
                            trState = 2;
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
            });
        cl.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (clState == 0) {
                        if (currentPlayer == 1) {
                            cl.setText("X");
                            clState = 1;
                            currentPlayer = 2;
                            win.setText("Player two's turn");
                        } else if (currentPlayer == 2) {
                            cl.setText("O");
                            clState = 2;
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
            });
        cm.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (cmState == 0) {
                        if (currentPlayer == 1) {
                            cm.setText("X");
                            cmState = 1;
                            currentPlayer = 2;
                            win.setText("Player two's turn");
                        } else if (currentPlayer == 2) {
                            cm.setText("O");
                            cmState = 2;
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
            });
        cr.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (crState == 0) {
                        if (currentPlayer == 1) {
                            cr.setText("X");
                            crState = 1;
                            currentPlayer = 2;
                            win.setText("Player two's turn");
                        } else if (currentPlayer == 2) {
                            cr.setText("O");
                            crState = 2;
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
            });
        bl.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (blState == 0) {
                        if (currentPlayer == 1) {
                            bl.setText("X");
                            blState = 1;
                            currentPlayer = 2;
                            win.setText("Player two's turn");
                        } else if (currentPlayer == 2) {
                            bl.setText("O");
                            blState = 2;
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
            });
        bm.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (bmState == 0) {
                        if (currentPlayer == 1) {
                            bm.setText("X");
                            bmState = 1;
                            currentPlayer = 2;
                            win.setText("Player two's turn");
                        } else if (currentPlayer == 2) {
                            bm.setText("O");
                            bmState = 2;
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
            });
        br.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (brState == 0) {
                        if (currentPlayer == 1) {
                            br.setText("X");
                            brState = 1;
                            currentPlayer = 2;
                            win.setText("Player two's turn");
                        } else if (currentPlayer == 2) {
                            br.setText("O");
                            brState = 2;
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
            });
    }

    public int winCheck() {
        int win = 0;
        if (tlState == trState && tlState == tmState && tlState != 0) {
            if (tlState == 1) {
                win = 1;
            } else if (tlState == 2) {
                win = 2;
            }
        } else if (clState == crState && clState == cmState && clState != 0) {
            if (clState == 1) {
                win = 1;
            } else if (clState == 2) {
                win = 2;
            }
        } else if (blState == brState && blState == bmState && blState != 0) {
            if (blState == 1) {
                win = 1;
            } else if (blState == 2) {
                win = 2;
            }
        } else if (tlState == clState && tlState == blState && tlState != 0) {
            if (tlState == 1) {
                win = 1;
            } else if (tlState == 2) {
                win = 2;
            }
        } else if (trState == crState && trState == brState && trState != 0) {
            if (trState == 1) {
                win = 1;
            } else if (trState == 2) {
                win = 2;
            }
        } else if (tmState == cmState && tmState == bmState && tmState != 0) {
            if (tmState == 1) {
                win = 1;
            } else if (tmState == 2) {
                win = 2;
            }
        } else if (tlState == cmState && tlState == brState && tlState != 0) {
            if (tlState == 1) {
                win = 1;
            } else if (tlState == 2) {
                win = 2;
            }
        } else if (trState == cmState && trState == blState && trState != 0) {
            if (trState == 1) {
                win = 1;
            } else if (trState == 2) {
                win = 2;
            }
        }
        return win;
    }
}
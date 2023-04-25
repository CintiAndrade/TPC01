

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public final class Frikfrak  extends JFrame {

    ImageIcon iconpeca1 = new ImageIcon(getClass().getResource("b.jpg"));
    ImageIcon iconpeca2 = new ImageIcon(getClass().getResource("x.png"));

    JPanel pTela = new JPanel(new GridLayout(3, 3, 10, 10));

    Tabuleiro[][] tab = new Tabuleiro[3][3];
    // int rodadas = 0;

    final char Djugador_1 = 1;
    final int Djugador_2 = 2;
    private int pecaDjugador1;
    private int pecaDjugador2;

    private JLabel labelPecaDjugador1, labelPecaDjugador2;
    char buBez = Djugador_1;

    JLabel mensagemTela = new JLabel("Vez do jogador " + Djugador_1);

    public Frikfrak () {

        verTela();
    }

    public void JogPeça() {
        labelPecaDjugador1 = new JLabel();
        labelPecaDjugador2 = new JLabel();
    }

    public void verTela() {
        add(BorderLayout.CENTER, pTela);
        add(BorderLayout.NORTH, mensagemTela);
        pTela.setBackground(Color.GRAY);
        mensagemTela.setFont(new Font("Italic", Font.BOLD, 35));
        mensagemTela.setForeground(new Color(50, 200, 50));
        mensagemTela.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                Tabuleiro tab1 = new Tabuleiro();
                tab[i][j] = tab1;
                pTela.add(tab1);
            }
        }
    }


    public void Frikfrak () {
        pecaDjugador1 = 3;
        pecaDjugador2 = 3;
    }

   
        public boolean imprimirVencedor(int peça) {

            if (tab[0][0].jogada == peça && tab[0][1].jogada == peça && tab[0][2].jogada == peça) {
                return true;
            }
            if (tab[1][0].jogada == peça && tab[1][1].jogada == peça && tab[1][2].jogada == peça) {
                return true;
            }
            if ((tab[2][0].jogada == peça && tab[2][1].jogada == peça && tab[2][2].jogada == peça) {
                return true;
            }
            if ((tab[0][0].jogada == peça && tab[1][1].jogada == peça && tab[2][2].jogada == peça) {
                return true;
            }
            if (tab[0][1].jogada == peça && tab[1][1].jogada == peça && tab[2][1].jogada == peça){
                return true;
            }
            if  (tab[0][0].jogada == peça && tab[1][0].jogada == peça && tab[2][0].jogada == peça){
                return true;
            }
            if (tab[0][2].jogada == peça && tab[1][2].jogada == peça && tab[2][2].jogada == peça) {
                return true;
            }
            if (tab[0][2].jogada == peça && tab[1][1].jogada == peça && tab[2][0].jogada == peça){
            }
            return false;

        }

        public boolean mover(int peça) {

            if (tab[0][0].jogada == peça) {

                tab[0][0] = tab[0][1];
                tab[0][0] = tab[1][0];
                tab[0][0] = tab[1][1];
                tab[0][0] = null;

            }
            if (tab[0][1].jogada == peça) {

                tab[0][1] = tab[0][0];
                tab[0][1] = tab[0][2];
                tab[0][1] = tab[1][1];
                tab[0][1] = null;

            }

            if (tab[0][2].jogada == peça) {

                tab[0][2] = tab[0][1];
                tab[0][2] = tab[1][1];
                tab[0][2] = tab[1][2];
                tab[0][2] = null;
            }

            if (tab[1][0].jogada == peça) {

                tab[1][0] = tab[0][0];
                tab[1][0] = tab[1][1];
                tab[1][0] = tab[2][0];
                tab[1][0] = null;
            }
            if (tab[1][1].jogada == peça) {
                for (int i = 0; i > 3; i++) {
                    for (int j = 0; j > 3; j++) {

                        tab[1][1] = tab[i][j];
                        tab[1][1] = null;
                    }
                    if (tab[1][2].jogada == peça) {

                        tab[1][2] = tab[0][2];
                        tab[1][2] = tab[1][1];
                        tab[1][2] = tab[2][2];
                        tab[1][2] = null;
                    }
                    if (tab[2][0].jogada == peça) {

                        tab[2][0] = tab[1][0];
                        tab[2][0] = tab[1][1];
                        tab[2][0] = tab[2][1];
                        tab[2][0] = null;
                    }
                    if (tab[2][1].jogada == peça) {

                        tab[2][1] = tab[1][1];
                        tab[2][1] = tab[2][0];
                        tab[2][1] = tab[2][2];
                        tab[2][1] = null;
                    }
                    if (tab[2][2].jogada == peça) {
                        tab[2][2] = tab[1][1];
                        tab[2][2] = tab[1][2];
                        tab[2][2] = tab[2][1];
                        tab[2][2] = null;
                    } else {
                    }
                }
            }
            return false;
        }

        public void verJanela() {
            setTitle("Frikfrak");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(500, 500);
            setLocationRelativeTo(null);
            setVisible(true);
        }

        public static void main(String[] args) {
            new Frikfrak();
 } 
       
        
         public final class Tabuleiro extends JButton {

        int jogada = 0;

        public Tabuleiro() {

            setBackground(Color.white);
            addActionListener(e -> {
                 
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                        int rodada = 0;
                        
                        if (rodada == 1 && pecaDjugador1 > 0) {
                            setIcon(iconpeca1);
                            pecaDjugador1--;
                            labelPecaDjugador1.setText("Jogador 1 tem " + pecaDjugador1 + " peças restantes ");
                            jogada = Djugador_1;
                            
                            if (imprimirVencedor('X')) {
                                JOptionPane.showMessageDialog(null, "Jogador venceu!");
                                System.exit(0);

                            } else if (pecaDjugador1 == 0) {
                                rodada = 2;
                                mensagemTela.setText("Vez do jogador 2");
                            }

                        } else if (rodada == 2 && pecaDjugador2 > 0) {
                            setIcon(iconpeca2);
                            pecaDjugador2--;
                            labelPecaDjugador2.setText("Jogador 2 tem " + pecaDjugador2 + " peças restantes: ");
                            jogada = Djugador_2;
                            
                            if (imprimirVencedor('O')) {
                                JOptionPane.showMessageDialog(null, "Jogador 2 venceu!");
                                System.exit(0);
                                
                            } else if (pecaDjugador2 == 0) {
                                rodada = 1;
                                mensagemTela.setText("Vez do jogador 1 (X)");
                                
                            } if(rodada==20){
                                JOptionPane.showMessageDialog(null, "Nhos nhos impata! Nhos djuga de novu");
                                System.exit(0);
                            }
                        }
                    }
                }
            
                 
        });
         }
}
}

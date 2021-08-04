/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.awt.Color
 *  java.awt.Component
 *  java.awt.Container
 *  java.awt.EventQueue
 *  java.awt.Font
 *  java.awt.LayoutManager
 *  java.awt.event.ActionEvent
 *  java.awt.event.ActionListener
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Float
 *  java.lang.IllegalAccessException
 *  java.lang.InstantiationException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.URL
 *  java.util.logging.Level
 *  java.util.logging.Logger
 *  javax.swing.GroupLayout
 *  javax.swing.GroupLayout$Alignment
 *  javax.swing.GroupLayout$Group
 *  javax.swing.GroupLayout$ParallelGroup
 *  javax.swing.GroupLayout$SequentialGroup
 *  javax.swing.Icon
 *  javax.swing.ImageIcon
 *  javax.swing.JButton
 *  javax.swing.JFrame
 *  javax.swing.JLabel
 *  javax.swing.JTextField
 *  javax.swing.LayoutStyle
 *  javax.swing.LayoutStyle$ComponentPlacement
 *  javax.swing.UIManager
 *  javax.swing.UIManager$LookAndFeelInfo
 *  javax.swing.UnsupportedLookAndFeelException
 */
package classes;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class telaApp
extends JFrame {
    private JLabel Imagemtijuco;
    private JButton btnCalcular;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel lblSoma;
    private JTextField txtQuantMaq;
    private JTextField txtTCH;
    private JTextField txtTiro;
    private JTextField txtVelMaq;

    public telaApp() {
        this.initComponents();
    }

    private void initComponents() {
        this.Imagemtijuco = new JLabel();
        this.jLabel1 = new JLabel();
        this.jLabel2 = new JLabel();
        this.jLabel3 = new JLabel();
        this.jLabel4 = new JLabel();
        this.txtTCH = new JTextField();
        this.txtVelMaq = new JTextField();
        this.txtTiro = new JTextField();
        this.txtQuantMaq = new JTextField();
        this.jLabel5 = new JLabel();
        this.lblSoma = new JLabel();
        this.jLabel7 = new JLabel();
        this.btnCalcular = new JButton();
        this.jLabel6 = new JLabel();
        this.jLabel8 = new JLabel();
        this.setDefaultCloseOperation(3);
        this.Imagemtijuco.setIcon((Icon)new ImageIcon(this.getClass().getResource("/imagens/CMAAA1.jpg")));
        this.jLabel1.setText("Qual  o TCH?");
        this.jLabel2.setText("Qual e a velocidade da Maquina?");
        this.jLabel3.setText("Qual  o Tiro M\u00e9dio?");
        this.jLabel4.setText("Qual a quantidade de Maquinas em Serviço?");
        this.txtTCH.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent evt) {
                telaApp.this.txtTCHActionPerformed(evt);
            }
        });
        this.jLabel5.setFont(new Font("Tahoma", 1, 14));
        this.jLabel5.setText("O PONTENCIAL DE COLHEITA");
        this.lblSoma.setFont(new Font("Tahoma", 1, 24));
        this.lblSoma.setText("0");
        this.jLabel7.setIcon((Icon)new ImageIcon(this.getClass().getResource("/imagens/COLHEDORA.jpg")));
        this.btnCalcular.setFont(new Font("Tahoma", 1, 12));
        this.btnCalcular.setIcon((Icon)new ImageIcon(this.getClass().getResource("/imagens/Operadores.png")));
        this.btnCalcular.setText("   CALCULAR ");
        this.btnCalcular.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent evt) {
                telaApp.this.btnCalcularActionPerformed(evt);
            }
        });
        this.jLabel6.setFont(new Font("Tahoma", 1, 18));
        this.jLabel6.setText("TONELADAS");
        this.jLabel8.setFont(new Font("Tahoma", 0, 12));
        this.jLabel8.setForeground(new Color(0, 0, 255));
        this.jLabel8.setText("Leonardo.Vilela.Developer");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout((LayoutManager)layout);
        layout.setHorizontalGroup((GroupLayout.Group)layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup((GroupLayout.Group)layout.createSequentialGroup().addContainerGap().addComponent((Component)this.Imagemtijuco, -2, 130, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent((Component)this.jLabel8).addGap(19, 19, 19)).addGroup((GroupLayout.Group)layout.createSequentialGroup().addGroup((GroupLayout.Group)layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup((GroupLayout.Group)layout.createSequentialGroup().addGroup((GroupLayout.Group)layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup((GroupLayout.Group)layout.createSequentialGroup().addGap(80, 80, 80).addComponent((Component)this.lblSoma).addGap(29, 29, 29).addComponent((Component)this.jLabel6).addGap(32, 32, 32)).addGroup(GroupLayout.Alignment.TRAILING, (GroupLayout.Group)layout.createSequentialGroup().addContainerGap().addComponent((Component)this.jLabel5).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED))).addComponent((Component)this.jLabel7)).addGroup((GroupLayout.Group)layout.createSequentialGroup().addGap(26, 26, 26).addGroup((GroupLayout.Group)layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent((Component)this.jLabel1).addComponent((Component)this.jLabel2).addComponent((Component)this.jLabel3).addComponent((Component)this.jLabel4)).addGap(51, 51, 51).addGroup((GroupLayout.Group)layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent((Component)this.txtVelMaq, GroupLayout.Alignment.LEADING, -1, 60, 32767).addComponent((Component)this.txtTiro, GroupLayout.Alignment.LEADING).addComponent((Component)this.txtTCH, GroupLayout.Alignment.LEADING).addComponent((Component)this.txtQuantMaq))).addGroup((GroupLayout.Group)layout.createSequentialGroup().addGap(145, 145, 145).addComponent((Component)this.btnCalcular, -2, 167, -2))).addContainerGap(112, 32767)));
        layout.setVerticalGroup((GroupLayout.Group)layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup((GroupLayout.Group)layout.createSequentialGroup().addGroup((GroupLayout.Group)layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup((GroupLayout.Group)layout.createSequentialGroup().addContainerGap().addComponent((Component)this.Imagemtijuco, -2, 91, -2)).addGroup((GroupLayout.Group)layout.createSequentialGroup().addGap(23, 23, 23).addComponent((Component)this.jLabel8))).addGap(28, 28, 28).addGroup((GroupLayout.Group)layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup((GroupLayout.Group)layout.createSequentialGroup().addGroup((GroupLayout.Group)layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent((Component)this.jLabel1).addComponent((Component)this.txtTCH, -2, -1, -2)).addGap(37, 37, 37).addComponent((Component)this.jLabel2)).addComponent((Component)this.txtVelMaq, -2, -1, -2)).addGap(31, 31, 31).addGroup((GroupLayout.Group)layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent((Component)this.jLabel3).addComponent((Component)this.txtTiro, -2, -1, -2)).addGap(23, 23, 23).addGroup((GroupLayout.Group)layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent((Component)this.jLabel4).addComponent((Component)this.txtQuantMaq, -2, -1, -2)).addGap(18, 18, 18).addComponent((Component)this.btnCalcular, -2, 71, -2).addGroup((GroupLayout.Group)layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup((GroupLayout.Group)layout.createSequentialGroup().addGap(38, 38, 38).addComponent((Component)this.jLabel5).addGap(18, 18, 18).addGroup((GroupLayout.Group)layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent((Component)this.lblSoma).addComponent((Component)this.jLabel6)).addContainerGap(-1, 32767)).addGroup(GroupLayout.Alignment.TRAILING, (GroupLayout.Group)layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 51, 32767).addComponent((Component)this.jLabel7, -2, 100, -2).addContainerGap()))));
        this.pack();
    }

    private void txtTCHActionPerformed(ActionEvent evt) {
    }

    private void btnCalcularActionPerformed(ActionEvent evt) {
        float TCH = Integer.parseInt((String)this.txtTCH.getText());
        float VELMAQ = Integer.parseInt((String)this.txtVelMaq.getText());
        float TOT1 = (TCH /= 6666.0f) * (VELMAQ *= 1000.0f);
        float TIRO = Integer.parseInt((String)this.txtTiro.getText());
        TIRO = VELMAQ / TIRO;
        float MAQ = Integer.parseInt((String)this.txtQuantMaq.getText());
        float KG = TOT1 / 60.0f;
        float TOT = (60.0f - TIRO) * KG * MAQ;
        Float.toString((float)TOT);
        this.lblSoma.setText(String.format((String)"%.0f", (Object[])new Object[]{Float.valueOf((float)TOT)}));
    }

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if (!"Nimbus".equals((Object)info.getName())) continue;
                UIManager.setLookAndFeel((String)info.getClassName());
                break;
            }
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger((String)telaApp.class.getName()).log(Level.SEVERE, null, (Throwable)ex);
        }
        catch (InstantiationException ex) {
            Logger.getLogger((String)telaApp.class.getName()).log(Level.SEVERE, null, (Throwable)ex);
        }
        catch (IllegalAccessException ex) {
            Logger.getLogger((String)telaApp.class.getName()).log(Level.SEVERE, null, (Throwable)ex);
        }
        catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger((String)telaApp.class.getName()).log(Level.SEVERE, null, (Throwable)ex);
        }
        EventQueue.invokeLater((Runnable)new Runnable(){

            public void run() {
                new telaApp().setVisible(true);
            }
        });
    }

}


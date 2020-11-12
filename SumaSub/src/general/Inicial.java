/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin
 */
public class Inicial extends javax.swing.JFrame
{

    /**
     * Creates new form Inicial
     */
    public Inicial()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TTama = new javax.swing.JTextField();
        BAceptar = new javax.swing.JButton();
        BCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("                                                  ¿Tamaño del Vector?");

        TTama.setToolTipText("Maximo 10 elementos");
        TTama.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                TTamaKeyTyped(evt);
            }
        });

        BAceptar.setText("Aceptar");
        BAceptar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BAceptarActionPerformed(evt);
            }
        });

        BCancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TTama, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(BAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BCancelar)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TTama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BAceptar)
                    .addComponent(BCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TTamaKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_TTamaKeyTyped
    {//GEN-HEADEREND:event_TTamaKeyTyped

        if (TTama.getText().length() == 2)
        {
            evt.consume();
        } else
        {
            validaEntero(evt);
        }

    }//GEN-LAST:event_TTamaKeyTyped

    private void BAceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BAceptarActionPerformed
    {//GEN-HEADEREND:event_BAceptarActionPerformed

        int tamaño = Integer.parseInt(TTama.getText());

        if (tamaño > 0 && tamaño < 11)
        {
            Principal.tamaño = Integer.parseInt(TTama.getText());
            Principal principal = new Principal();
            this.setVisible(false);
            principal.setVisible(true);
        } else
        {
            error(this, "Solo se permite conjuntos de 1 a 10");
            TTama.setText("");
        }
    }//GEN-LAST:event_BAceptarActionPerformed

    private void validaEntero(KeyEvent ke)
    {
        if ((ke.getKeyChar() < '0' || ke.getKeyChar() > '9')
                && ke.getKeyCode() != 8)
        {
            ke.setKeyChar((char) 8);
        }
    }

    public void error(JFrame jf, String s)
    {
        if (jf == null)
        {
            System.out.println(s);
        } else
        {
            JOptionPane.showMessageDialog(jf, s, "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAceptar;
    private javax.swing.JButton BCancelar;
    private javax.swing.JTextField TTama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

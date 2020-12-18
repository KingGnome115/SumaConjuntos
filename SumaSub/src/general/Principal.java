package general;

import java.awt.event.KeyEvent;

/**
 *
 * @author Kevin
 */
public class Principal extends javax.swing.JFrame
{

    public static int tamaño;
    int indice = 0;
    Vectores conjunto;

    /**
     * Creates new form Principal
     */
    public Principal()
    {
        initComponents();
        conjunto = new Vectores(tamaño);
        TResultados.setLineWrap(true);
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
        J1 = new javax.swing.JLabel();
        TAnadir = new javax.swing.JTextField();
        BAnadir = new javax.swing.JButton();
        BCalcular = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JSub = new javax.swing.JLabel();
        JSubSo = new javax.swing.JLabel();
        Jscroll = new javax.swing.JScrollPane();
        TResultados = new javax.swing.JTextArea();
        BAutomatico = new javax.swing.JButton();
        BReinicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        J1.setForeground(new java.awt.Color(0, 153, 0));

        TAnadir.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                TAnadirKeyTyped(evt);
            }
        });

        BAnadir.setText("Añadir");
        BAnadir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BAnadirActionPerformed(evt);
            }
        });

        BCalcular.setText("Calcular");
        BCalcular.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BCalcularActionPerformed(evt);
            }
        });

        label1.setText("Subconjuntos");

        jLabel1.setText("Subconjuntos Solucion");

        TResultados.setColumns(20);
        TResultados.setRows(5);
        Jscroll.setViewportView(TResultados);

        BAutomatico.setText("Automatico");
        BAutomatico.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BAutomaticoActionPerformed(evt);
            }
        });

        BReinicio.setText("Reinicio");
        BReinicio.setToolTipText("");
        BReinicio.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                BReinicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Jscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BReinicio)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BCalcular)
                                .addGap(197, 197, 197))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JSubSo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JSub, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(J1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label1)
                                    .addComponent(jLabel1))
                                .addGap(22, 22, 22)
                                .addComponent(TAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(BAnadir)
                                .addGap(18, 18, 18)
                                .addComponent(BAutomatico)
                                .addGap(0, 19, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(J1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAnadir)
                    .addComponent(BAutomatico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JSub, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JSubSo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(Jscroll, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BReinicio)))
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

    private void BAnadirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BAnadirActionPerformed
    {//GEN-HEADEREND:event_BAnadirActionPerformed

        int numero = Integer.parseInt(TAnadir.getText());

        if (indice < tamaño)
        {
            conjunto.Inserta(numero, indice);
            J1.setText("");
            J1.setText(conjunto.Desp());
            indice++;
            if (indice == tamaño)
            {
                BAnadir.setEnabled(false);
            }
            TAnadir.setText("");
        }

    }//GEN-LAST:event_BAnadirActionPerformed

    private void TAnadirKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_TAnadirKeyTyped
    {//GEN-HEADEREND:event_TAnadirKeyTyped
        if (TAnadir.getText().length() == 5)
        {
            evt.consume();
        } else
        {
            validaEntero(evt);
        }
    }//GEN-LAST:event_TAnadirKeyTyped

    private void BCalcularActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BCalcularActionPerformed
    {//GEN-HEADEREND:event_BCalcularActionPerformed

        BAnadir.setEnabled(false);
        JSub.setText(String.valueOf((int) Math.pow(2, tamaño)));
        if (conjunto.HayResultados())
        {
            TResultados.setText(conjunto.Subconjuntos());
            JSubSo.setText(String.valueOf(conjunto.cantidad));
        } else
        {
            JSubSo.setText("No hay resultados posibles");
        }

    }//GEN-LAST:event_BCalcularActionPerformed

    private void BAutomaticoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BAutomaticoActionPerformed
    {//GEN-HEADEREND:event_BAutomaticoActionPerformed

        System.out.println("Llegue al metodo for");
        for (int i = 0; i < tamaño; i++)
        {
            int numero = generaNumeros(-10, 10);
            System.out.println(i + ": " + numero);
            conjunto.Inserta(numero, i);
            if (tamaño - 1 == i)
            {
                J1.setText("Datos en el conjunto son mushos");
            }
        }


    }//GEN-LAST:event_BAutomaticoActionPerformed

    private void BReinicioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_BReinicioActionPerformed
    {//GEN-HEADEREND:event_BReinicioActionPerformed
        
        new Inicial().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BReinicioActionPerformed

    static int generaNumeros(int desde, int hasta)
    {
        return (int) (Math.random() * (hasta - desde + 1) + desde);
    }

    private void validaEntero(KeyEvent ke)
    {
        if ((ke.getKeyChar() < '0' || ke.getKeyChar() > '9')
                && ke.getKeyCode() != 8 && ke.getKeyChar() != '-'
                && ke.getKeyChar() != '-')
        {
            ke.setKeyChar((char) 8);
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAnadir;
    private javax.swing.JButton BAutomatico;
    private javax.swing.JButton BCalcular;
    private javax.swing.JButton BReinicio;
    private javax.swing.JLabel J1;
    private javax.swing.JLabel JSub;
    private javax.swing.JLabel JSubSo;
    private javax.swing.JScrollPane Jscroll;
    private javax.swing.JTextField TAnadir;
    private javax.swing.JTextArea TResultados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1;
    // End of variables declaration//GEN-END:variables
}

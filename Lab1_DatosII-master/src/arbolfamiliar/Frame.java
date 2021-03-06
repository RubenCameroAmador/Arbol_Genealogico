/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolfamiliar;

import java.awt.Graphics;

/**
 *
 * @author Ruben Camero
 */
public class Frame extends javax.swing.JFrame {

    Graphics g;
    Arbol arbol;
    Nodo infoClick;
    Nodo familiarX;
    Nodo familiarY;

    /**
     * Creates new form Grafico
     */
    public Frame() {
        initComponents();
        this.setTitle("Árbol Genealógico");
        panel.setSize(1000, 400);
        indicador.setSize(316, 107);
        text.setSize(320, 199);
        g = panel.getGraphics();
        Nodo raiz = null;
        arbol = new Arbol(raiz);
        infoClick = null;
        familiarX = null;
        familiarY = null;
        text.setText("                            *INSTRUCCIONES*\n1: "
                + "Para agragar la raiz principal y crear un nuevo padre. Debe digitar un nombre y presionar el botón: crear nuevo árbol.\n"
                + "2: Para adicionar un hijo, primero debe señalar clickeando el padre al cual se le añadirá el hijo. Segundo, digite el nombre y seleccione "
                + "la posicion a la cual se desea colocar: Derecha o izquierda. Finalmente presionar el botón: Adicionar Hijo. \n"
                + "3: Para conocer el parentesco que tienen entre si los nodos. Primero, debe seleccionar ctrl+click para obtener el nodoX. Segundo, oprimiendo "
                + "alt+click se obtiene el nodoY. Al finalizar este procedimiento en pantalla aparecerá el parentesco obtenido entre estos.\n"
                + "4: Repita el paso 3 para obtener los parentesco de desee.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        nombre = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nHijo = new javax.swing.JTextField();
        addSon = new javax.swing.JButton();
        resultado = new javax.swing.JTextField();
        rbIzquierda = new javax.swing.JRadioButton();
        rbDerecha = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextPane();
        jSeparator1 = new javax.swing.JSeparator();
        prueba = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        indicador = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));
        jPanel1.setForeground(new java.awt.Color(102, 102, 255));

        panel.setPreferredSize(new java.awt.Dimension(100, 400));
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1074, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        agregar.setText("Crear nuevo árbol");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        jLabel3.setText("Digite el nombre del primer padre: ");

        jLabel1.setText("Seleccione el padre y digite el nombre del hijo:");

        addSon.setText("Adicionar Hijo");
        addSon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSonActionPerformed(evt);
            }
        });

        resultado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        resultado.setEnabled(false);

        buttonGroup1.add(rbIzquierda);
        rbIzquierda.setText("Izquierda");
        rbIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIzquierdaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbDerecha);
        rbDerecha.setText("Derecha");

        text.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        text.setEnabled(false);
        text.setMaximumSize(new java.awt.Dimension(320, 199));
        jScrollPane1.setViewportView(text);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        prueba.setText("prueba");
        prueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pruebaActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        indicador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        indicador.setEnabled(false);
        jScrollPane2.setViewportView(indicador);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbDerecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(prueba))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nHijo)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addSon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel3)
                    .addComponent(jSeparator1))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(resultado)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(agregar))
                                .addGap(38, 38, 38))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nHijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addSon))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(prueba))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(rbIzquierda)
                                            .addComponent(rbDerecha)))))
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1074, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked
        // TODO add your handling code here:
        int x = evt.getX();
        int y = evt.getY();
        Nodo info = Grafica.infoNodo(arbol.getRaiz(), x, y);
        //Grafica.changeColor(info, g, panel);
        if (info != null) {
            resultado.setText("Usted ha seleccionado a: " + info.getNombre());
            infoClick = info;
            Grafica.drawAll(arbol.getRaiz(), panel.getGraphics(), panel, infoClick);
        }
        if (info != null && evt.isControlDown() == true) {
            familiarX = info;
            indicador.setText("\n El familiar X  seleccionado es: " + familiarX.getNombre());
        }
        if (info != null && evt.isAltDown() == true) {
            familiarY = info;
            String a = indicador.getText();
            indicador.setText(a + " \n \n El familiar Y seleccionado es: " + familiarY.getNombre());
        }
        if (info != null && familiarX != null && familiarY != null) {
            //Arbol.parentesco(arbol.getRaiz(), familiarX, familiarY, resultado);
            Arbol.family(arbol.getRaiz(), familiarX, familiarY, resultado);
        }

    }//GEN-LAST:event_panelMouseClicked

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        String name = nombre.getText();
        if (name.equals("")) {
            resultado.setText("*Debe agregar un nombre");
        } else {
            Nodo raiz = null;
            arbol.setRaiz(arbol.insertar(raiz, raiz, null, name, panel.getWidth()));
            Arbol.preOrden(arbol.getRaiz());
            Grafica.drawAll(arbol.getRaiz(), panel.getGraphics(), panel, infoClick);
        }


    }//GEN-LAST:event_agregarActionPerformed

    private void addSonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSonActionPerformed

// TODO add your handling code here:
        int desicion = 1;
        if (rbIzquierda.isSelected()) {
            desicion = 1;
        } else {
            if (rbDerecha.isSelected()) {
                desicion = 2;
            }
        }
        String nombreHijo = nHijo.getText();
        Arbol.insertar(arbol.getRaiz(), null, infoClick, nombreHijo, panel.getWidth(), desicion);
        Grafica.drawAll(arbol.getRaiz(), panel.getGraphics(), panel, infoClick);
        nHijo.setText("");


    }//GEN-LAST:event_addSonActionPerformed

    private void rbIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIzquierdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbIzquierdaActionPerformed

    private void pruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pruebaActionPerformed
        // TODO add your handling code here:
        Nodo raiz = null;
        arbol.setRaiz(arbol.insertar(raiz, raiz, null, "Ruben", panel.getWidth()));
        Arbol.insertar(arbol.getRaiz(), null, arbol.getRaiz(), "Maria", panel.getWidth(), 1);
        Arbol.insertar(arbol.getRaiz(), null, arbol.getRaiz(), "Natalia", panel.getWidth(), 2);
        Grafica.drawAll(arbol.getRaiz(), panel.getGraphics(), panel, infoClick);
    }//GEN-LAST:event_pruebaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSon;
    private javax.swing.JButton agregar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextPane indicador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nHijo;
    private javax.swing.JTextField nombre;
    private javax.swing.JPanel panel;
    private javax.swing.JButton prueba;
    private javax.swing.JRadioButton rbDerecha;
    private javax.swing.JRadioButton rbIzquierda;
    private javax.swing.JTextField resultado;
    private javax.swing.JTextPane text;
    // End of variables declaration//GEN-END:variables
}

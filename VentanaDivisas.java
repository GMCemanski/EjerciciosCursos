/*

 */
package ventanas;

import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Ale
 */
public class VentanaDivisas extends javax.swing.JFrame {

String monto="";
String montoTrans="";
Boolean coma=false;


    public VentanaDivisas() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        labVisorUp = new javax.swing.JLabel();
        labVisorDown = new javax.swing.JLabel();
        btClear = new javax.swing.JButton();
        btDelUlt = new javax.swing.JButton();
        btSiete = new javax.swing.JButton();
        btOcho = new javax.swing.JButton();
        btNueve = new javax.swing.JButton();
        btCuatro = new javax.swing.JButton();
        btCinco = new javax.swing.JButton();
        btSeis = new javax.swing.JButton();
        btUno = new javax.swing.JButton();
        btDos = new javax.swing.JButton();
        btTres = new javax.swing.JButton();
        btCero = new javax.swing.JButton();
        btComa = new javax.swing.JButton();
        cbTop = new javax.swing.JComboBox<>();
        cbDown = new javax.swing.JComboBox<>();
        jSimbTop = new javax.swing.JLabel();
        jSimbDown = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menUsos = new javax.swing.JMenu();
        menCalc = new javax.swing.JMenuItem();
        menConversor = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        labVisorUp.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        labVisorUp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.weightx = 0.66;
        gridBagConstraints.weighty = 0.66;
        jPanel1.add(labVisorUp, gridBagConstraints);

        labVisorDown.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        labVisorDown.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.weightx = 0.66;
        gridBagConstraints.weighty = 0.66;
        jPanel1.add(labVisorDown, gridBagConstraints);

        btClear.setText("C");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.33;
        gridBagConstraints.weighty = 0.33;
        jPanel1.add(btClear, gridBagConstraints);

        btDelUlt.setText("D");
        btDelUlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelUltActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.33;
        gridBagConstraints.weighty = 0.33;
        jPanel1.add(btDelUlt, gridBagConstraints);

        btSiete.setText("7");
        btSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSieteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.33;
        gridBagConstraints.weighty = 0.33;
        jPanel1.add(btSiete, gridBagConstraints);

        btOcho.setText("8");
        btOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOchoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.33;
        gridBagConstraints.weighty = 0.33;
        jPanel1.add(btOcho, gridBagConstraints);

        btNueve.setText("9");
        btNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNueveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.33;
        gridBagConstraints.weighty = 0.33;
        jPanel1.add(btNueve, gridBagConstraints);

        btCuatro.setText("4");
        btCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCuatroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.33;
        gridBagConstraints.weighty = 0.33;
        jPanel1.add(btCuatro, gridBagConstraints);

        btCinco.setText("5");
        btCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCincoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.33;
        gridBagConstraints.weighty = 0.33;
        jPanel1.add(btCinco, gridBagConstraints);

        btSeis.setText("6");
        btSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeisActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.33;
        gridBagConstraints.weighty = 0.33;
        jPanel1.add(btSeis, gridBagConstraints);

        btUno.setText("1");
        btUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUnoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.33;
        gridBagConstraints.weighty = 0.33;
        jPanel1.add(btUno, gridBagConstraints);

        btDos.setText("2");
        btDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.33;
        gridBagConstraints.weighty = 0.33;
        jPanel1.add(btDos, gridBagConstraints);

        btTres.setText("3");
        btTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTresActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.33;
        gridBagConstraints.weighty = 0.33;
        jPanel1.add(btTres, gridBagConstraints);

        btCero.setText("0");
        btCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCeroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.33;
        gridBagConstraints.weighty = 0.33;
        jPanel1.add(btCero, gridBagConstraints);

        btComa.setText(".");
        btComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.33;
        gridBagConstraints.weighty = 0.33;
        jPanel1.add(btComa, gridBagConstraints);

        cbTop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dólar - Estado Unidos", "Peso - Argentina", "Euro - Europa" }));
        cbTop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTopActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 120;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(cbTop, gridBagConstraints);

        cbDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dólar - Estado Unidos", "Peso - Argentina", "Euro - Europa" }));
        cbDown.setToolTipText("");
        cbDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDownActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 120;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(cbDown, gridBagConstraints);

        jSimbTop.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jSimbTop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSimbTop.setText("USD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 0.33;
        gridBagConstraints.weighty = 0.33;
        jPanel1.add(jSimbTop, gridBagConstraints);

        jSimbDown.setFont(new java.awt.Font("Arial Black", 1, 16)); // NOI18N
        jSimbDown.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSimbDown.setText("USD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 0.33;
        gridBagConstraints.weighty = 0.33;
        jPanel1.add(jSimbDown, gridBagConstraints);

        menUsos.setText("Usos");

        menCalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calcesc.png"))); // NOI18N
        menCalc.setText("Calculadora Estándar");
        menCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menCalcActionPerformed(evt);
            }
        });
        menUsos.add(menCalc);

        menConversor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/divisasesc.png"))); // NOI18N
        menConversor.setText("Conversor de Divisas");
        menConversor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menConversorActionPerformed(evt);
            }
        });
        menUsos.add(menConversor);
        menUsos.add(jSeparator1);

        menSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/saliresc.png"))); // NOI18N
        menSalir.setText("Salir");
        menSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menSalirActionPerformed(evt);
            }
        });
        menUsos.add(menSalir);

        jMenuBar1.add(menUsos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menCalcActionPerformed
        VentanaCalc calc = new VentanaCalc();
        calc.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_menCalcActionPerformed

    private void menConversorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menConversorActionPerformed
        VentanaDivisas divi = new VentanaDivisas();
        divi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menConversorActionPerformed

    private void menSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menSalirActionPerformed

        System.exit(0);
    }//GEN-LAST:event_menSalirActionPerformed

    private void btUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUnoActionPerformed
        monto+="1";
        refreshVisorUp();
    }//GEN-LAST:event_btUnoActionPerformed

    private void btCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCeroActionPerformed
        monto+="0";
        refreshVisorUp();
    }//GEN-LAST:event_btCeroActionPerformed

    private void btDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDosActionPerformed
        monto+="2";
        refreshVisorUp();
    }//GEN-LAST:event_btDosActionPerformed

    private void btTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTresActionPerformed
        monto+="3";
        refreshVisorUp();
    }//GEN-LAST:event_btTresActionPerformed

    private void btCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCuatroActionPerformed
        monto+="4";
        refreshVisorUp();
    }//GEN-LAST:event_btCuatroActionPerformed

    private void btCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCincoActionPerformed
        monto+="5";
        refreshVisorUp();
    }//GEN-LAST:event_btCincoActionPerformed

    private void btSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeisActionPerformed
        monto+="6";
        refreshVisorUp();
    }//GEN-LAST:event_btSeisActionPerformed

    private void btSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSieteActionPerformed
        monto+="7";
        refreshVisorUp();
    }//GEN-LAST:event_btSieteActionPerformed

    private void btOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOchoActionPerformed
        monto+="8";
        refreshVisorUp();
    }//GEN-LAST:event_btOchoActionPerformed

    private void btNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNueveActionPerformed
        monto+="9";
        refreshVisorUp();
    }//GEN-LAST:event_btNueveActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        monto="";
        montoTrans="";
        coma = false;
        labVisorUp.setText("");
        labVisorDown.setText("");
    }//GEN-LAST:event_btClearActionPerformed

    private void btDelUltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelUltActionPerformed
        String aux="";
        boolean tieneComa=false;
        for (int i=0;i<monto.length()-1;i++){
            aux+= monto.charAt(i);
        }
        for (int i=0;i<aux.length();i++){
            if (Character.toString(aux.charAt(i)).equals(".")){
                tieneComa = true;
            }
        }
        if(tieneComa==true){
            coma = true;
        }
        else{
            coma=false;
        }
        monto=aux;
        if(!monto.equals("")){
            refreshVisorUp();
            refreshVisorDown();
            monto=aux;
            labVisorUp.setText(monto);
            labVisorDown.setText(montoTrans);
        }
        else{
            labVisorUp.setText("");
            labVisorDown.setText("");
        }
        
    }//GEN-LAST:event_btDelUltActionPerformed

    private void btComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComaActionPerformed
        if(monto.equals(" ")&&coma==false){
            monto+="0.";
            coma = true;
        }
        if(!monto.equals(" ")&&coma==false){
            monto+=".";
            coma = true;
        }
        labVisorUp.setText(monto);
        labVisorDown.setText(montoTrans);
    }//GEN-LAST:event_btComaActionPerformed

    private void cbTopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTopActionPerformed
        switch (cbTop.getSelectedIndex()){
            case 0: jSimbTop.setText("USD");refreshVisorUp();break;
            case 1: jSimbTop.setText("Pesos");refreshVisorUp();break;
            case 2: jSimbTop.setText("Euros");refreshVisorUp();break;
        }
    }//GEN-LAST:event_cbTopActionPerformed

    private void cbDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDownActionPerformed
        switch (cbDown.getSelectedIndex()){
            case 0: jSimbDown.setText("USD");refreshVisorDown();break;
            case 1: jSimbDown.setText("Pesos");refreshVisorDown();break;
            case 2: jSimbDown.setText("Euros");refreshVisorDown();break;
        }
    }//GEN-LAST:event_cbDownActionPerformed

    /**
     * @param args the command line arguments
     */
    private void refreshVisorUp(){
        
        double aux_monto=0;
        for(int i=0;i<3;i++){
            if (cbTop.getSelectedIndex()==i&&cbDown.getSelectedIndex()==i){ //Son iguales conserva el monto
                montoTrans = monto;
            }
        }
        
        //CONVERSIONES DÓLAR
        
        //Dólar a peso   Tipo de cambio a 93,83 pesos
        if (cbTop.getSelectedIndex()==0&&cbDown.getSelectedIndex()==1){
            aux_monto = (Double.parseDouble(monto)*93.83);
            montoTrans = String.valueOf(aux_monto);
        }
        
        //Dolar a Euro  Tipo de cambio a 0,82
        if (cbTop.getSelectedIndex()==0&&cbDown.getSelectedIndex()==2){
            aux_monto = (Double.parseDouble(monto)*0.82);
            montoTrans = String.valueOf(aux_monto);
        }
        
        //CONVERSIONES PESOS
        
        // Peso a dólar Tipo de cambio a 0,011
        if (cbTop.getSelectedIndex()==1&&cbDown.getSelectedIndex()==0){
            aux_monto = (Double.parseDouble(monto)/93.83);
            montoTrans = String.valueOf(aux_monto);
        }
        
        // Peso a Euro tipo de cambio 0,0088 euro
        if (cbTop.getSelectedIndex()==1&&cbDown.getSelectedIndex()==2){
            aux_monto = (Double.parseDouble(monto)/113.94);
            montoTrans = String.valueOf(aux_monto);
        }
        
        //CONVERSIONES EUROS
        
        
        // Euro a dólar  1,21
        if (cbTop.getSelectedIndex()==2&&cbDown.getSelectedIndex()==0){
            aux_monto = (Double.parseDouble(monto)*1.21);
            montoTrans = String.valueOf(aux_monto);
        }
               
        // Euro a peso  113,94
        if (cbTop.getSelectedIndex()==2&&cbDown.getSelectedIndex()==1){
            aux_monto = (Double.parseDouble(monto)*113.94);
            montoTrans = String.valueOf(aux_monto);
        }
        labVisorUp.setText(monto);
        labVisorDown.setText(montoTrans);
        
       
        
    }
    private void refreshVisorDown(){
        double aux_monto=0;
        for(int i=0;i<3;i++){
            if (cbTop.getSelectedIndex()==i&&cbDown.getSelectedIndex()==i){ //Son iguales conserva el monto
                montoTrans = monto;
            }
        }
        
        //CONVERSIONES DÓLAR
        
        //Dólar a peso   Tipo de cambio a 93,83 pesos
        if (cbTop.getSelectedIndex()==1&&cbDown.getSelectedIndex()==0){
            aux_monto = (Double.parseDouble(monto)/93.83);
            montoTrans = String.valueOf(aux_monto);
        }
        
        //Dolar a Euro  Tipo de cambio a 0,82
        if (cbTop.getSelectedIndex()==2&&cbDown.getSelectedIndex()==0){
            aux_monto = (Double.parseDouble(monto)*0.82);
            montoTrans = String.valueOf(aux_monto);
        }
        
        //CONVERSIONES PESOS
        
        // Peso a dólar Tipo de cambio a 0,011
        if (cbTop.getSelectedIndex()==0&&cbDown.getSelectedIndex()==1){
            aux_monto = (Double.parseDouble(monto)*93.83);
            montoTrans = String.valueOf(aux_monto);
        }
        
        // Peso a Euro tipo de cambio 0,0088 euro
        if (cbTop.getSelectedIndex()==2&&cbDown.getSelectedIndex()==1){
            aux_monto = (Double.parseDouble(monto)*113.94);
            montoTrans = String.valueOf(aux_monto);
        }
        
        //CONVERSIONES EUROS
        
        
        // Euro a dólar  1,21
        if (cbTop.getSelectedIndex()==0&&cbDown.getSelectedIndex()==2){
            aux_monto = (Double.parseDouble(monto)/1.21);
            montoTrans = String.valueOf(aux_monto);
        }
               
        // Euro a peso  113,94
        if (cbTop.getSelectedIndex()==1&&cbDown.getSelectedIndex()==2){
            aux_monto = (Double.parseDouble(monto)/113.94);
            montoTrans = String.valueOf(aux_monto);
        }
        labVisorUp.setText(monto);
        labVisorDown.setText(montoTrans);
        
    }
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
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDivisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDivisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCero;
    private javax.swing.JButton btCinco;
    private javax.swing.JButton btClear;
    private javax.swing.JButton btComa;
    private javax.swing.JButton btCuatro;
    private javax.swing.JButton btDelUlt;
    private javax.swing.JButton btDos;
    private javax.swing.JButton btNueve;
    private javax.swing.JButton btOcho;
    private javax.swing.JButton btSeis;
    private javax.swing.JButton btSiete;
    private javax.swing.JButton btTres;
    private javax.swing.JButton btUno;
    private javax.swing.JComboBox<String> cbDown;
    private javax.swing.JComboBox<String> cbTop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel jSimbDown;
    private javax.swing.JLabel jSimbTop;
    private javax.swing.JLabel labVisorDown;
    private javax.swing.JLabel labVisorUp;
    private javax.swing.JMenuItem menCalc;
    private javax.swing.JMenuItem menConversor;
    private javax.swing.JMenuItem menSalir;
    private javax.swing.JMenu menUsos;
    // End of variables declaration//GEN-END:variables
}



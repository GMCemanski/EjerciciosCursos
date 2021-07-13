/*
    -- La actividad consistía en realizar una calculadora con conversor de divisas.
       En esta versión se siguió con la instrucción del mismo (uso de Strings).
       El Modelo Vista Controlador se vió posteriormente en el curso.   
 */
package ventanas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class VentanaCalc extends javax.swing.JFrame {

    String operacion="";
    String num_uno="";
    String num_dos="";
    Double resultado;
    boolean punto=false;
    boolean punto2=false;
    
    public VentanaCalc() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        labVisor = new javax.swing.JLabel();
        labVisor.setText(num_uno+operacion+num_dos);
        btClear = new javax.swing.JButton();
        btRaiz = new javax.swing.JButton();
        btDiv = new javax.swing.JButton();
        btDelUlt = new javax.swing.JButton();
        btSiete = new javax.swing.JButton();
        btOcho = new javax.swing.JButton();
        btNueve = new javax.swing.JButton();
        btMult = new javax.swing.JButton();
        btCuatro = new javax.swing.JButton();
        btCinco = new javax.swing.JButton();
        btSeis = new javax.swing.JButton();
        btResta = new javax.swing.JButton();
        btUno = new javax.swing.JButton();
        btDos = new javax.swing.JButton();
        btTres = new javax.swing.JButton();
        btSuma = new javax.swing.JButton();
        btCambioSigno = new javax.swing.JButton();
        btCero = new javax.swing.JButton();
        btComa = new javax.swing.JButton();
        btIgual = new javax.swing.JButton();
        labVisor2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menUsos = new javax.swing.JMenu();
        menCalc = new javax.swing.JMenuItem();
        menConversor = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        labVisor.setBackground(new java.awt.Color(255, 255, 255));
        labVisor.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        labVisor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labVisor.setText(" ");
        labVisor.setToolTipText("");
        labVisor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 120;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(labVisor, gridBagConstraints);

        btClear.setText("C ");
        btClear.setToolTipText("");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(btClear, gridBagConstraints);

        btRaiz.setText("√");
        btRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRaizActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(btRaiz, gridBagConstraints);

        btDiv.setText("÷");
        btDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDivActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(btDiv, gridBagConstraints);

        btDelUlt.setText("D");
        btDelUlt.setToolTipText("");
        btDelUlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelUltActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(btDelUlt, gridBagConstraints);

        btSiete.setBackground(new java.awt.Color(153, 153, 153));
        btSiete.setText("7 ");
        btSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSieteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(btSiete, gridBagConstraints);

        btOcho.setBackground(new java.awt.Color(153, 153, 153));
        btOcho.setText("8 ");
        btOcho.setToolTipText("");
        btOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOchoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(btOcho, gridBagConstraints);

        btNueve.setBackground(new java.awt.Color(153, 153, 153));
        btNueve.setText("9 ");
        btNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNueveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(btNueve, gridBagConstraints);

        btMult.setText("X ");
        btMult.setToolTipText("");
        btMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(btMult, gridBagConstraints);

        btCuatro.setBackground(new java.awt.Color(153, 153, 153));
        btCuatro.setText("4 ");
        btCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCuatroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(btCuatro, gridBagConstraints);

        btCinco.setBackground(new java.awt.Color(153, 153, 153));
        btCinco.setText("5 ");
        btCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCincoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(btCinco, gridBagConstraints);

        btSeis.setBackground(new java.awt.Color(153, 153, 153));
        btSeis.setText("6 ");
        btSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeisActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(btSeis, gridBagConstraints);

        btResta.setText("- ");
        btResta.setToolTipText("");
        btResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRestaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(btResta, gridBagConstraints);

        btUno.setBackground(new java.awt.Color(153, 153, 153));
        btUno.setText("1 ");
        btUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUnoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(btUno, gridBagConstraints);

        btDos.setBackground(new java.awt.Color(153, 153, 153));
        btDos.setText("2 ");
        btDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(btDos, gridBagConstraints);

        btTres.setBackground(new java.awt.Color(153, 153, 153));
        btTres.setText("3 ");
        btTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTresActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(btTres, gridBagConstraints);

        btSuma.setText("+");
        btSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSumaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(btSuma, gridBagConstraints);

        btCambioSigno.setText("±");
        btCambioSigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCambioSignoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(btCambioSigno, gridBagConstraints);

        btCero.setBackground(new java.awt.Color(153, 153, 153));
        btCero.setText("0 ");
        btCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCeroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(btCero, gridBagConstraints);

        btComa.setText(". ");
        btComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(btComa, gridBagConstraints);

        btIgual.setText("=");
        btIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIgualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.25;
        gridBagConstraints.weighty = 0.25;
        jPanel1.add(btIgual, gridBagConstraints);

        labVisor2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        labVisor2.setForeground(new java.awt.Color(204, 204, 255));
        labVisor2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labVisor2.setText("  ");
        labVisor2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 120;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_END;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(labVisor2, gridBagConstraints);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void menCalcActionPerformed(java.awt.event.ActionEvent evt) {                                        
        VentanaCalc calc = new VentanaCalc();
        calc.setVisible(true);
        this.dispose();
    }                                       

    private void menConversorActionPerformed(java.awt.event.ActionEvent evt) {                                             
        VentanaDivisas divi = new VentanaDivisas();
        divi.setVisible(true);
        this.dispose();
    }                                            

    private void menSalirActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
       System.exit(0);
    }                                        

    private void btDelUltActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String aux="";
        boolean tieneComa=false;
        
        // Checkea si operación está vacío se está trabajando en el primer número
        if(operacion.equals("")){
            for (int i=0;i<num_uno.length()-1;i++){
                aux+=num_uno.charAt(i);
            } //Crea la nueva cadena en el auxiliar
            
            
            for (int i=0;i<aux.length();i++){
                if (Character.toString(aux.charAt(i)).equals(".")){ //si encuentra el sígno punto le da true a tiene coma.
                    tieneComa = true;
                }
            }
            
            if(tieneComa==true){ //Asigna la condición de coma vigente o no.
            punto = true;
            }       
            else{
                punto=false;
            }
            num_uno = aux;
            labVisor.setText(num_uno);
        }
        // si operación ya está asignado se está trabajando en el segundo número
        else{
            for (int i=0;i<num_dos.length()-1;i++){
                aux+=num_dos.charAt(i);
            }
            
            for (int i=0;i<aux.length();i++){
                if (Character.toString(aux.charAt(i)).equals(".")){ //si encuentra el sígno punto le da true a tiene coma.
                    tieneComa = true;
                }
            }
            
            if(tieneComa==true){ //Asigna la condición de coma vigente o no.
            punto2 = true;
            }       
            else{
                punto2=false;
            }
            
            num_dos = aux;
            labVisor2.setText(num_uno+operacion+num_dos);
            labVisor.setText(num_dos);     
        } 
    }                                        

    private void btRestaActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if (!num_uno.equals("")){ //Si aún no se ingresó el primer número no asigna la operación.
        operacion = "-";
        labVisor2.setText(num_uno+operacion+num_dos);
        labVisor.setText("");
        }
    }                                       

    private void btCuatroActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (operacion.equals("")){
            num_uno+="4";
            labVisor.setText(num_uno);            
        }
        else{
            num_dos+="4";
            labVisor.setText(num_dos);
        }
    }                                        

    private void btCincoActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if (operacion.equals("")){
            num_uno+="5";
            labVisor.setText(num_uno);
        }
        else{
            num_dos+="5";
            labVisor.setText(num_dos);
        }
    }                                       

    private void btSeisActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if (operacion.equals("")){
            num_uno+="6";
            labVisor.setText(num_uno);
        }
        else{
            num_dos+="6";
            labVisor.setText(num_dos);
        }
    }                                      

    private void btSieteActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if (operacion.equals("")){
            num_uno+="7";
            labVisor.setText(num_uno);
        }
        else{
            num_dos+="7";
            labVisor.setText(num_dos);
        }        
    }                                       

    private void btOchoActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if (operacion.equals("")){
            num_uno+="8";
            labVisor.setText(num_uno);
        }
        else{
            num_dos+="8";
            labVisor.setText(num_dos);
        }        
    }                                      

    private void btNueveActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if (operacion.equals("")){
            num_uno+="9";            
            labVisor.setText(num_uno);
        }
        else{
            num_dos+="9";
            labVisor.setText(num_dos);
        }        
    }                                       

    private void btUnoActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if (operacion.equals("")){
            num_uno+="1";   
            labVisor.setText(num_uno);
        }
        else{
            num_dos+="1";
            labVisor.setText(num_dos);
        }        
    }                                     

    private void btDosActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if (operacion.equals("")){
            num_uno+="2";
            labVisor.setText(num_uno);
        }
        else{
            num_dos+="2";
            labVisor.setText(num_dos);
            
        }        
    }                                     

    private void btTresActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if (operacion.equals("")){
            num_uno+="3";
            labVisor.setText(num_uno);
        }
        else{
            num_dos+="3";
            labVisor.setText(num_dos);
        }        
    }                                      

    private void btCeroActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if (operacion.equals("")){
            num_uno+="0";
            labVisor.setText(num_uno);
        }
        else{
            num_dos+="0";
            labVisor.setText(num_dos);
        }        
    }                                      

    private void btSumaActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if (!num_uno.equals("")){
        operacion = "+";
        labVisor.setText("");
        labVisor2.setText(num_uno+operacion+num_dos);
        }
    }                                      

    private void btMultActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if (!num_uno.equals("")){
        operacion = "*";
        labVisor.setText("");
        labVisor2.setText(num_uno+operacion+num_dos);
        }
    }                                      

    private void btDivActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if (!num_uno.equals("")){
        operacion = "/";
        labVisor.setText("");
        labVisor2.setText(num_uno+operacion+num_dos);
        }        
    }                                     

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {                                        
        limpiarDatos();
    }                                       

    private void btComaActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if (num_uno.equals("")){ // Si no hay número ingresa un 0.
            num_uno+="0.";
            punto = true;
            labVisor.setText(num_uno);
        }
        if (!num_uno.equals("")&&punto==false){ // Si hay un primer número y no hay punto lo agrega
            num_uno+=".";
            punto = true;
            labVisor.setText(num_uno);
        }
        if (!operacion.equals("")&&num_dos.equals("")){ // Si ya hay operación asignada pero no hay número dos aún asigna 0.
            num_dos+="0.";
            punto2 = true;
            labVisor.setText(num_dos);
        }
        if (!operacion.equals("")&&punto2==false){ // Si hay operación y el número dos tiene asignado pero sin punto, le agrega un punto.
            num_dos+=".";
            punto2 = true;
            labVisor.setText(num_dos);
        }     
        
    }                                      

    private void btIgualActionPerformed(java.awt.event.ActionEvent evt) {                                        
        resuelveEjercicio();
    }                                       
    
    
    private void resuelveEjercicio(){
        if(!num_uno.equals("")&&!num_dos.equals("")&&operacion.equals("+")){
            resultado = Double.parseDouble(num_uno)+Double.parseDouble(num_dos);
            
        }
        if(!num_uno.equals("")&&!num_dos.equals("")&&operacion.equals("-")){
            resultado = Double.parseDouble(num_uno)-Double.parseDouble(num_dos);
            System.out.println(Double.parseDouble(num_uno));
            System.out.println(Double.parseDouble(num_dos));
        }
        if(!num_uno.equals("")&&!num_dos.equals("")&&operacion.equals("/")){
            resultado = Double.parseDouble(num_uno)/Double.parseDouble(num_dos);
        }
        if(!num_uno.equals("")&&!num_dos.equals("")&&operacion.equals("*")){
            resultado = Double.parseDouble(num_uno)*Double.parseDouble(num_dos);
        }
        if(operacion.equals("√")){
            resultado = Math.sqrt(Double.parseDouble(num_uno));
        }
        limpiarDatos();
        labVisor2.setText("");
        labVisor.setText(String.valueOf(resultado));
        num_uno=String.valueOf(resultado);
        punto=true;
    
    }
    private void btCambioSignoActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if(!num_uno.equals("")&&operacion.equals("")){
            num_uno = String.valueOf(Double.parseDouble(num_uno)*-1);
            labVisor.setText(num_uno);
        }
        if(!num_dos.equals("")){
            num_dos = String.valueOf(Double.parseDouble(num_dos)*-1);
            labVisor.setText(num_dos);
        }
    }                                             

    private void btRaizActionPerformed(java.awt.event.ActionEvent evt) {                                       
        if(!num_uno.equals("")&&Double.parseDouble(num_uno)>0){
            operacion = "√";
            labVisor2.setText("√"+num_uno);
        }
    }                                      

    private void limpiarDatos(){
        // Resetea la calculadora
        operacion="";
        num_uno="";
        num_dos="";
        labVisor.setText("");
        labVisor2.setText("");
        punto=false;
        punto2=false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
            */
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaCalc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(VentanaCalc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(VentanaCalc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VentanaCalc.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btCambioSigno;
    private javax.swing.JButton btCero;
    private javax.swing.JButton btCinco;
    private javax.swing.JButton btClear;
    private javax.swing.JButton btComa;
    private javax.swing.JButton btCuatro;
    private javax.swing.JButton btDelUlt;
    private javax.swing.JButton btDiv;
    private javax.swing.JButton btDos;
    private javax.swing.JButton btIgual;
    private javax.swing.JButton btMult;
    private javax.swing.JButton btNueve;
    private javax.swing.JButton btOcho;
    private javax.swing.JButton btRaiz;
    private javax.swing.JButton btResta;
    private javax.swing.JButton btSeis;
    private javax.swing.JButton btSiete;
    private javax.swing.JButton btSuma;
    private javax.swing.JButton btTres;
    private javax.swing.JButton btUno;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel labVisor;
    private javax.swing.JLabel labVisor2;
    private javax.swing.JMenuItem menCalc;
    private javax.swing.JMenuItem menConversor;
    private javax.swing.JMenuItem menSalir;
    private javax.swing.JMenu menUsos;
    // End of variables declaration                   
}

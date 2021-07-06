/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Jugador;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ale
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    Jugador jugador1;
    Jugador jugador2;
    String jugadorActivo;
    String ganadorActual;
    String[][] tablero = {{"a","b","c"},{"d","e","f"},{"g","h","i"}};
    int empate=0;
    
    public VentanaPrincipal() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jB1 = new javax.swing.JButton();
        jB2 = new javax.swing.JButton();
        jB3 = new javax.swing.JButton();
        jB4 = new javax.swing.JButton();
        jB5 = new javax.swing.JButton();
        jB6 = new javax.swing.JButton();
        jB7 = new javax.swing.JButton();
        jB8 = new javax.swing.JButton();
        jB9 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mbJuego = new javax.swing.JMenu();
        miComenzar = new javax.swing.JMenuItem();
        miMostrarR = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        miSalir = new javax.swing.JMenuItem();
        mbAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(3, 3, 4, 4));

        jB1.setMaximumSize(new java.awt.Dimension(500, 500));
        jB1.setMinimumSize(new java.awt.Dimension(150, 150));
        jB1.setPreferredSize(new java.awt.Dimension(150, 150));
        jB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB1ActionPerformed(evt);
            }
        });
        jPanel1.add(jB1);

        jB2.setMaximumSize(new java.awt.Dimension(500, 500));
        jB2.setMinimumSize(new java.awt.Dimension(150, 150));
        jB2.setPreferredSize(new java.awt.Dimension(150, 150));
        jB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB2ActionPerformed(evt);
            }
        });
        jPanel1.add(jB2);

        jB3.setMaximumSize(new java.awt.Dimension(500, 500));
        jB3.setMinimumSize(new java.awt.Dimension(150, 150));
        jB3.setPreferredSize(new java.awt.Dimension(150, 150));
        jB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB3ActionPerformed(evt);
            }
        });
        jPanel1.add(jB3);

        jB4.setMaximumSize(new java.awt.Dimension(500, 500));
        jB4.setMinimumSize(new java.awt.Dimension(150, 150));
        jB4.setPreferredSize(new java.awt.Dimension(150, 150));
        jB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB4ActionPerformed(evt);
            }
        });
        jPanel1.add(jB4);

        jB5.setMaximumSize(new java.awt.Dimension(500, 500));
        jB5.setMinimumSize(new java.awt.Dimension(150, 150));
        jB5.setPreferredSize(new java.awt.Dimension(150, 150));
        jB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB5ActionPerformed(evt);
            }
        });
        jPanel1.add(jB5);

        jB6.setMaximumSize(new java.awt.Dimension(500, 500));
        jB6.setMinimumSize(new java.awt.Dimension(150, 150));
        jB6.setPreferredSize(new java.awt.Dimension(150, 150));
        jB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB6ActionPerformed(evt);
            }
        });
        jPanel1.add(jB6);

        jB7.setMaximumSize(new java.awt.Dimension(500, 500));
        jB7.setMinimumSize(new java.awt.Dimension(150, 150));
        jB7.setPreferredSize(new java.awt.Dimension(150, 150));
        jB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB7ActionPerformed(evt);
            }
        });
        jPanel1.add(jB7);

        jB8.setMaximumSize(new java.awt.Dimension(500, 500));
        jB8.setMinimumSize(new java.awt.Dimension(150, 150));
        jB8.setPreferredSize(new java.awt.Dimension(150, 150));
        jB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB8ActionPerformed(evt);
            }
        });
        jPanel1.add(jB8);

        jB9.setMaximumSize(new java.awt.Dimension(500, 500));
        jB9.setMinimumSize(new java.awt.Dimension(150, 150));
        jB9.setPreferredSize(new java.awt.Dimension(150, 150));
        jB9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB9ActionPerformed(evt);
            }
        });
        jPanel1.add(jB9);

        mbJuego.setText("Juego");

        miComenzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/refreshresc.png"))); // NOI18N
        miComenzar.setText("Comenzar de nuevo");
        miComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miComenzarActionPerformed(evt);
            }
        });
        mbJuego.add(miComenzar);

        miMostrarR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tablaResultadosResc.png"))); // NOI18N
        miMostrarR.setText("Mostrar resultados");
        miMostrarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMostrarRActionPerformed(evt);
            }
        });
        mbJuego.add(miMostrarR);
        mbJuego.add(jSeparator1);

        miSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/saliresc.png"))); // NOI18N
        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        mbJuego.add(miSalir);

        jMenuBar1.add(mbJuego);

        mbAyuda.setText("Ayuda");
        mbAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mbAyudaMouseClicked(evt);
            }
        });
        jMenuBar1.add(mbAyuda);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mbAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mbAyudaMouseClicked
        try {
            Desktop.getDesktop().browse(new URI ("https://www.pequeocio.com/tres-en-raya/"));
        } catch (URISyntaxException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mbAyudaMouseClicked

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_miSalirActionPerformed

    private void jB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB2ActionPerformed
        if (jugadorActivo.equals("jugador1")){
            if(jugador1.getFicha().getTipo().equals("X")){
                jB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/equis.png")));
                tablero[0][1]="X";
            }
            else{
                jB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.png")));
                tablero[0][1]="O";
            }
        }
        else{
            if(jugador2.getFicha().getTipo().equals("X")){
                jB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/equis.png")));
                tablero[0][1]="X";
            }
            else{
                jB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.png")));
                tablero[0][1]="O";
            }
        }
        checkGanador();
        cambiarJugadorActivo();
    }//GEN-LAST:event_jB2ActionPerformed

    private void jB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB1ActionPerformed
        
        if (jugadorActivo.equals("jugador1")){
            if(jugador1.getFicha().getTipo().equals("X")){
                jB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/equis.png")));
                tablero[0][0]="X";
            }
            else{
                jB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.png")));
                tablero[0][0]="O";
            }
        }
        else{
            if(jugador2.getFicha().getTipo().equals("X")){
                jB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/equis.png")));
                tablero[0][0]="X";
            }
            else{
                jB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.png")));
                tablero[0][0]="O";
            }
        }
        checkGanador();
        cambiarJugadorActivo();      
    }//GEN-LAST:event_jB1ActionPerformed

    private void miMostrarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMostrarRActionPerformed
        MostrarResultados tablaResu = new MostrarResultados(this,true,jugador1.getNombre(),jugador2.getNombre(),jugador1.getVictorias(),jugador2.getVictorias(),jugador1.getEmpates());
        tablaResu.setVisible(true);
    }//GEN-LAST:event_miMostrarRActionPerformed

    private void jB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB3ActionPerformed
        if (jugadorActivo.equals("jugador1")){
            if(jugador1.getFicha().getTipo().equals("X")){
                jB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/equis.png")));
                tablero[0][2]="X";
            }
            else{
                jB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.png")));
                tablero[0][2]="O";
            }
        }
        else{
            if(jugador2.getFicha().getTipo().equals("X")){
                jB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/equis.png")));
                tablero[0][2]="X";
            }
            else{
                jB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.png")));
                tablero[0][2]="O";
            }
        }
        checkGanador();
        cambiarJugadorActivo();
    }//GEN-LAST:event_jB3ActionPerformed

    private void jB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB4ActionPerformed
        if (jugadorActivo.equals("jugador1")){
            if(jugador1.getFicha().getTipo().equals("X")){
                jB4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/equis.png")));
                tablero[1][0]="X";
            }
            else{
                jB4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.png")));
                tablero[1][0]="O";
            }
        }
        else{
            if(jugador2.getFicha().getTipo().equals("X")){
                jB4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/equis.png")));
                tablero[1][0]="X";
            }
            else{
                jB4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.png")));
                tablero[1][0]="O";
            }
        }
        checkGanador();
        cambiarJugadorActivo();
    }//GEN-LAST:event_jB4ActionPerformed

    private void jB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB5ActionPerformed
        if (jugadorActivo.equals("jugador1")){
            if(jugador1.getFicha().getTipo().equals("X")){
                jB5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/equis.png")));
                tablero[1][1]="X";
            }
            else{
                jB5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.png")));
                tablero[1][1]="O";
            }
        }
        else{
            if(jugador2.getFicha().getTipo().equals("X")){
                jB5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/equis.png")));
                tablero[1][1]="X";
            }
            else{
                jB5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.png")));
                tablero[1][1]="O";
            }
        }
        checkGanador();
        cambiarJugadorActivo();
    }//GEN-LAST:event_jB5ActionPerformed

    private void jB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB6ActionPerformed
        if (jugadorActivo.equals("jugador1")){
            if(jugador1.getFicha().getTipo().equals("X")){
                jB6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/equis.png")));
                tablero[1][2]="X";
            }
            else{
                jB6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.png")));
                tablero[1][2]="O";
            }
        }
        else{
            if(jugador2.getFicha().getTipo().equals("X")){
                jB6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/equis.png")));
                tablero[1][2]="X";
            }
            else{
                jB6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.png")));
                tablero[1][2]="O";
            }
        }
        checkGanador();
        cambiarJugadorActivo();
    }//GEN-LAST:event_jB6ActionPerformed

    private void jB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB7ActionPerformed
        if (jugadorActivo.equals("jugador1")){
            if(jugador1.getFicha().getTipo().equals("X")){
                jB7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/equis.png")));
                tablero[2][0]="X";
            }
            else{
                jB7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.png")));
                tablero[2][0]="O";
            }
        }
        else{
            if(jugador2.getFicha().getTipo().equals("X")){
                jB7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/equis.png")));
                tablero[2][0]="X";
            }
            else{
                jB7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.png")));
                tablero[2][0]="O";
            }
        }
        checkGanador();
        cambiarJugadorActivo();
    }//GEN-LAST:event_jB7ActionPerformed

    private void jB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB8ActionPerformed
        if (jugadorActivo.equals("jugador1")){
            if(jugador1.getFicha().getTipo().equals("X")){
                jB8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/equis.png")));
                tablero[2][1]="X";
            }
            else{
                jB8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.png")));
                tablero[2][1]="O";
            }
        }
        else{
            if(jugador2.getFicha().getTipo().equals("X")){
                jB8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/equis.png")));
                tablero[2][1]="X";
            }
            else{
                jB8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.png")));
                tablero[2][1]="O";
            }
        }
        checkGanador();
        cambiarJugadorActivo();
    }//GEN-LAST:event_jB8ActionPerformed

    private void jB9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB9ActionPerformed
        if (jugadorActivo.equals("jugador1")){
            if(jugador1.getFicha().getTipo().equals("X")){
                jB9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/equis.png")));
                tablero[2][2]="X";
            }
            else{
                jB9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.png")));
                tablero[2][2]="O";
            }
        }
        else{
            if(jugador2.getFicha().getTipo().equals("X")){
                jB9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/equis.png")));
                tablero[2][2]="X";
            }
            else{
                jB9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.png")));
                tablero[2][2]="O";
            }
        }
        checkGanador();
        cambiarJugadorActivo();
    }//GEN-LAST:event_jB9ActionPerformed

    private void miComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miComenzarActionPerformed
        reiniciarJuego();
        cambiarJugadorActivo(); //el reiniciar tiene un cambio de jugador activo por eso aplicamos otro
        jugador1.setEmpates(0);
        jugador1.setVictorias(0);
        jugador2.setEmpates(0);
        jugador2.setVictorias(0);
    }//GEN-LAST:event_miComenzarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    private void checkGanador(){
        boolean seGano=false;
        int cantX=0, cantO=0;

        //Líneas horizontales ganadoras
        if (tablero[0][0]==tablero[0][1]&&tablero[0][1]==tablero[0][2]){
            ganadorActual = jugadorActivo;
            seGano=true;
        }
        
        else if (tablero[1][0]==tablero[1][1]&&tablero[1][1]==tablero[1][2]){
            ganadorActual = jugadorActivo;
            seGano=true;
        }
        
        else if (tablero[2][0]==tablero[2][1]&&tablero[2][1]==tablero[2][2]){
            ganadorActual = jugadorActivo;
            seGano=true;
        }
        
        
        //Lineas verticales ganadoras
        
        else if (tablero[0][0]==tablero[1][0]&&tablero[1][0]==tablero[2][0]){
            ganadorActual = jugadorActivo;
            seGano=true;
        }
        
        else if (tablero[0][1]==tablero[1][1]&&tablero[1][1]==tablero[2][1]){
            ganadorActual = jugadorActivo;
            seGano=true;
        }
        
        else if (tablero[0][2]==tablero[1][2]&&tablero[1][2]==tablero[2][2]){
            ganadorActual = jugadorActivo;
            seGano=true;
        }
        
        //Lineas diagonales ganadoras
        
        else if (tablero[0][0]==tablero[1][1]&&tablero[1][1]==tablero[2][2]){
            ganadorActual = jugadorActivo;
            seGano=true;
        }
        
        else if (tablero[2][0]==tablero[1][1]&&tablero[1][1]==tablero[0][2]){
            ganadorActual = jugadorActivo;
            seGano=true;
        }
        
        
        // Se corroboran la cantidad de X y de O marcadas hasta el momento
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if (tablero[i][j].equals("X")){
                  cantX++;
                }
                if (tablero[i][j].equals("O")){
                  cantO++;
                }   
            }
        }
       
        
        if(seGano==true){
            partidoGanado();
        }
        
        // si hay 9 objetos marcados y no ganó nadie entonces fue empate
        if(((cantX==4&&cantO==5)||(cantX==5&&cantO==4))&&seGano==false){
            partidoEmpatado();
        }

    }
    
    private void partidoEmpatado(){
        // suma el empate a los dos jugadores
        jugador1.setEmpates(jugador1.getEmpates()+1);
        jugador2.setEmpates(jugador2.getEmpates()+1);
        VentanaEmpate empate = new VentanaEmpate(this,true);
        empate.setVisible(true);
        reiniciarJuego();
    }
    
    private void partidoGanado(){
        
        // Suma la victoria al jugador que corresponde
        if(jugadorActivo.equals("jugador1")){
            jugador1.setVictorias(jugador1.getVictorias()+1);
        }
        else{
            jugador2.setVictorias(jugador2.getVictorias()+1);
        }
        
        // creo una variable auxiliar para asignar el nombre del ganador usando de referencia el jugador activo
        String ganadorAux;
        if(jugadorActivo.equals("jugador1")){
            ganadorAux = jugador1.getNombre();
        }
        else{
            ganadorAux = jugador2.getNombre();
        }
        
        // con la variable auxiliar disparo la ventana emergente de ganador
        VentanaGanador ganador = new VentanaGanador(this,true,ganadorAux);
        ganador.setVisible(true);
        reiniciarJuego();
        
        
    }
    
    private void reiniciarJuego(){
        
        // Le cambio los valores al tablero para que no se repitan
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                tablero[i][j]=i+""+10;
            }
        }
        empate=0;
        ganadorActual = "";
        jB1.setIcon(null);
        jB2.setIcon(null);
        jB3.setIcon(null);
        jB4.setIcon(null);
        jB5.setIcon(null);
        jB6.setIcon(null);
        jB7.setIcon(null);
        jB8.setIcon(null);
        jB9.setIcon(null);
        
        cambiarTurno();

    }
    
    private void cambiarTurno(){
        VentanaEscogerTurno elegirTurno = new VentanaEscogerTurno(this,true,jugador1.getNombre(),jugador2.getNombre());
        elegirTurno.setVisible(true);
        // Checkea cuál es el jugador que corresponde, Los igualo al revés porque luego continua el código a un cambiarJugadorActivo
        if (elegirTurno.getTurno().equals(jugador1.getNombre())){
            jugadorActivo = "jugador2";
        }
        else{
            jugadorActivo = "jugador1";
        }        
    }
    
    private void cambiarJugadorActivo(){
        if (jugadorActivo.equals("jugador1")){
            jugadorActivo = "jugador2";
        }
        else{
            jugadorActivo = "jugador1";
        }
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jB1;
    public static javax.swing.JButton jB2;
    public static javax.swing.JButton jB3;
    public static javax.swing.JButton jB4;
    public static javax.swing.JButton jB5;
    public static javax.swing.JButton jB6;
    public static javax.swing.JButton jB7;
    public static javax.swing.JButton jB8;
    public static javax.swing.JButton jB9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mbAyuda;
    private javax.swing.JMenu mbJuego;
    private javax.swing.JMenuItem miComenzar;
    private javax.swing.JMenuItem miMostrarR;
    private javax.swing.JMenuItem miSalir;
    // End of variables declaration//GEN-END:variables
}
////        VentanaEmpate empate = new VentanaEmpate(this,true);
////        empate.setVisible(true);
////        MostrarResultados mostrarR = new MostrarResultados(this,true);
////        mostrarR.setVisible(true);
////        VentanaGanador ganador = new VentanaGanador(this,true);
////        ganador.setVisible(true);
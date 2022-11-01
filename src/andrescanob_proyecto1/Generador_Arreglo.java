
/*
Universidad Estatal a Distancia
Cátedra de Ingeniería de Software
ORIENTACIÓN ACADÉMICA
Estructura de datos
Código: 00825 Créditos: 3
Grado académico: Diplomado
Encargado de cátedra: Percy Cañipa Valdez
Estudiante Andrés Cano Barboza
Proyecto 1
SEGUNDO CUATRIMESTRE
2021
*/
package andrescanob_proyecto1;

import java.util.Arrays;


public class Generador_Arreglo extends javax.swing.JFrame {
    private Ordenamientos orden;
    
    public Generador_Arreglo() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_titu = new javax.swing.JLabel();
        jB_generarA = new javax.swing.JButton();
        jB_burbuja = new javax.swing.JButton();
        jB_shellsort = new javax.swing.JButton();
        jB_Quicksort = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_resultado_ori = new javax.swing.JTextArea();
        label_dura = new javax.swing.JLabel();
        resul_B = new javax.swing.JTextField();
        resul_S = new javax.swing.JTextField();
        resul_Q = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_resultado_B = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_resultado_S = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_resultado_Q = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setLocation(new java.awt.Point(1, 1));

        label_titu.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        label_titu.setText("Generador de Arreglo");

        jB_generarA.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jB_generarA.setText("Genere un arreglo al azar");
        jB_generarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_generarAActionPerformed(evt);
            }
        });

        jB_burbuja.setText("Burbuja");

        jB_shellsort.setText("Shellsort");

        jB_Quicksort.setText("QuickSort");

        txt_resultado_ori.setEditable(false);
        txt_resultado_ori.setColumns(20);
        txt_resultado_ori.setRows(5);
        jScrollPane1.setViewportView(txt_resultado_ori);

        label_dura.setText("Duración de ordenameinto:");

        resul_B.setText("jTextField1");

        resul_S.setText("jTextField2");

        resul_Q.setText("jTextField3");

        jLabel1.setText("Arreglo Original:");

        jLabel2.setText("Ordenamiento Burbuja:");

        txt_resultado_B.setColumns(20);
        txt_resultado_B.setRows(5);
        jScrollPane2.setViewportView(txt_resultado_B);

        txt_resultado_S.setColumns(20);
        txt_resultado_S.setRows(5);
        jScrollPane3.setViewportView(txt_resultado_S);

        jLabel3.setText("Ordenamiento Shellsort:");

        txt_resultado_Q.setColumns(20);
        txt_resultado_Q.setRows(5);
        jScrollPane4.setViewportView(txt_resultado_Q);

        jLabel4.setText("Ordenamiento Quicksort:");

        jLabel5.setText("(cantidad en segundos)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_titu))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jB_generarA))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_dura)
                            .addComponent(jLabel5))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jB_burbuja)
                                .addGap(150, 150, 150)
                                .addComponent(jB_shellsort)
                                .addGap(150, 150, 150))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(resul_B, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(resul_S, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jB_Quicksort)
                            .addComponent(resul_Q, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jScrollPane1)
                                .addComponent(jScrollPane2)
                                .addComponent(jScrollPane3)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_titu)
                .addGap(53, 53, 53)
                .addComponent(jB_generarA)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_dura, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_burbuja)
                    .addComponent(jB_shellsort)
                    .addComponent(jB_Quicksort))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resul_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(resul_S, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(resul_Q, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
// Genera el arreglo para enviarlo a ordenar
    private void jB_generarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_generarAActionPerformed
        
        
        int[] arreglo1 = new int[999]; // creación de objeto arreglo para enviar por parámetro a la clase lógica
        
            for (int i=0; i < arreglo1.length; i++) {
            arreglo1[i] = (int)(Math.random()*1000)+1; }
               
            txt_resultado_ori.setText(Arrays.toString(arreglo1));     
                 
            orden = new Ordenamientos(); 
           
            //uso de método burbuja y medioción de tiempo
            long inicio = System.nanoTime();
            txt_resultado_B.setText(Arrays.toString(orden.Burbuja(arreglo1)));  
            long fin = System.nanoTime();
            double dif = (double) (fin - inicio) * 1.0e-9;
            resul_B.setText(String.valueOf(dif));
            
            //uso de método shellsort y medioción de tiempo
            long inicio1 = System.nanoTime();
            txt_resultado_S.setText(Arrays.toString(orden.Shellsort(arreglo1)));  
            long fin1 = System.nanoTime();
            double dif1 = (double) (fin1 - inicio1) * 1.0e-9;
            resul_S.setText(String.valueOf(dif1));
            
            //uso de método Quick y medioción de tiempo
            long inicio2 = System.nanoTime();
            txt_resultado_Q.setText(Arrays.toString(orden.Quicksort(arreglo1, 0,0)));  
            long fin2 = System.nanoTime();
            double dif2 = (double) (fin2 - inicio2) * 1.0e-9;
            resul_Q.setText(String.valueOf(dif2));
            
            //No hizo falta calidación de datos, ya que todo se maneja por botón, por lo que no se usó para que el programa sea más rápido
    }//GEN-LAST:event_jB_generarAActionPerformed

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
            java.util.logging.Logger.getLogger(Generador_Arreglo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Generador_Arreglo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Generador_Arreglo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generador_Arreglo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Generador_Arreglo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Quicksort;
    private javax.swing.JButton jB_burbuja;
    private javax.swing.JButton jB_generarA;
    private javax.swing.JButton jB_shellsort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel label_dura;
    private javax.swing.JLabel label_titu;
    private javax.swing.JTextField resul_B;
    private javax.swing.JTextField resul_Q;
    private javax.swing.JTextField resul_S;
    private javax.swing.JTextArea txt_resultado_B;
    private javax.swing.JTextArea txt_resultado_Q;
    private javax.swing.JTextArea txt_resultado_S;
    private javax.swing.JTextArea txt_resultado_ori;
    // End of variables declaration//GEN-END:variables
}
/*
Referencias

https://docs.oracle.com/javase/7/docs/api/

https://www.youtube.com/watch?v=G0hy_HtjCwM

https://www.youtube.com/watch?v=7SzQrBVXXRU

https://www.youtube.com/watch?v=N7f51HsrHWc

https://www.youtube.com/watch?v=DYmTpUfcyT8

https://www.youtube.com/watch?v=YYd4XB17bIc

https://www.youtube.com/watch?v=yXy7WzgUaSA

https://alvinalexander.com/blog/post/jfc-swing/how-center-jframe-java-swing/

https://www.youtube.com/watch?v=pbDbnmlFTS0

https://stackoverflow.com/questions/9543320/how-to-position-the-form-in-the-center-screen/9543339

https://stackoverflow.com/questions/144892/how-to-center-a-window-in-java

https://www.youtube.com/watch?v=Mw3II878roE

https://sites.google.com/site/fernandoagomezf/programacion-en-c/tips-de-programador-c/algoritmos/ordenacion-de-arrays-metodo-de-la-burbuja

https://www.youtube.com/watch?v=hf-_c7DFb3U

https://www.youtube.com/watch?v=IiqbrAxzo0A

http://javax-peru.blogspot.com/2012/08/array-de-botones.html

https://www.javamexico.org/foros/java_standard_edition/agregar_eventos_array_de_jbutton

https://pereiratechtalks.com/analisis-de-algoritmos-de-ordenamiento/

http://lineadecodigo.com/java/convertir-un-array-en-un-string-con-java/


*/
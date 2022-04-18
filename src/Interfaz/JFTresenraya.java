package Interfaz;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import Matriz.*;
public class JFTresenraya extends javax.swing.JFrame {
    FondoPanel fondo=new FondoPanel();
    FondoFrame1 fondo2=new FondoFrame1();
    JFEmpate jfempate = new JFEmpate();
    JFGanaX jfganax = new JFGanaX();
    JFGanaO jfganao = new JFGanaO();
    Tresenraya tresenraya1=new Tresenraya();
    javax.swing.JButton Array_jbutton[][];
   
    int[] array_aux= new int[2];
    int jugadorCPU,jugada_inicial,victoriasX,victoriasO,contadorPartidasFinalizadas=0;
    boolean x,o;
    
    public JFTresenraya(){
        this.setContentPane(fondo2);
        initComponents();
        this.setLocationRelativeTo(null);

        jugadorCPU=tresenraya1.getJugador();
        Array_jbutton=new javax.swing.JButton[3][3];
        Array_jbutton[0][0]=jB00;
        Array_jbutton[1][0]=jB10;
        Array_jbutton[2][0]=jB20;
        Array_jbutton[0][1]=jB01;
        Array_jbutton[1][1]=jB11;
        Array_jbutton[2][1]=jB21;
        Array_jbutton[0][2]=jB02;
        Array_jbutton[1][2]=jB12;
        Array_jbutton[2][2]=jB22;
          
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        jB12 = new javax.swing.JButton();
        jB00 = new javax.swing.JButton();
        jB01 = new javax.swing.JButton();
        jB02 = new javax.swing.JButton();
        jB10 = new javax.swing.JButton();
        jB21 = new javax.swing.JButton();
        jB20 = new javax.swing.JButton();
        jB22 = new javax.swing.JButton();
        jB11 = new javax.swing.JButton();
        jBNuevoJuego = new javax.swing.JButton();
        jCBTipodeJuego = new javax.swing.JComboBox<>();
        jBX = new javax.swing.JButton();
        jBO = new javax.swing.JButton();
        jLX = new javax.swing.JLabel();
        jLO = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBReiniciar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tres en raya");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jB12.setBorderPainted(false);
        jB12.setContentAreaFilled(false);
        jB12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB12ActionPerformed(evt);
            }
        });

        jB00.setBackground(new java.awt.Color(255, 255, 255));
        jB00.setBorderPainted(false);
        jB00.setContentAreaFilled(false);
        jB00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB00ActionPerformed(evt);
            }
        });

        jB01.setBackground(new java.awt.Color(255, 255, 255));
        jB01.setBorderPainted(false);
        jB01.setContentAreaFilled(false);
        jB01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB01ActionPerformed(evt);
            }
        });

        jB02.setBorderPainted(false);
        jB02.setContentAreaFilled(false);
        jB02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB02ActionPerformed(evt);
            }
        });

        jB10.setBackground(new java.awt.Color(255, 255, 255));
        jB10.setForeground(new java.awt.Color(255, 255, 255));
        jB10.setBorderPainted(false);
        jB10.setContentAreaFilled(false);
        jB10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB10ActionPerformed(evt);
            }
        });

        jB21.setBorderPainted(false);
        jB21.setContentAreaFilled(false);
        jB21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB21ActionPerformed(evt);
            }
        });

        jB20.setBorderPainted(false);
        jB20.setContentAreaFilled(false);
        jB20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB20ActionPerformed(evt);
            }
        });

        jB22.setBorderPainted(false);
        jB22.setContentAreaFilled(false);
        jB22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB22ActionPerformed(evt);
            }
        });

        jB11.setBorderPainted(false);
        jB11.setContentAreaFilled(false);
        jB11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB10, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB00, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB20, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB01, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB11, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB21, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB02, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB12, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB22, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jB01, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB00, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB02, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jB11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB12, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jB21, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB20, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB22, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        jBNuevoJuego.setFont(new java.awt.Font("BankGothic Md BT", 0, 24)); // NOI18N
        jBNuevoJuego.setForeground(new java.awt.Color(255, 255, 255));
        jBNuevoJuego.setText("NUEVO JUEGO");
        jBNuevoJuego.setContentAreaFilled(false);
        jBNuevoJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoJuegoActionPerformed(evt);
            }
        });

        jCBTipodeJuego.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jCBTipodeJuego.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "J1 vs J2", "J1 vs CPU | Facil", "J1 vs CPU | Medio", "J1 vs CPU | Imposible" }));

        jBX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenX.png"))); // NOI18N
        jBX.setBorderPainted(false);
        jBX.setContentAreaFilled(false);
        jBX.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jBXMouseDragged(evt);
            }
        });
        jBX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBXMouseExited(evt);
            }
        });
        jBX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBXActionPerformed(evt);
            }
        });

        jBO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen1.png"))); // NOI18N
        jBO.setBorderPainted(false);
        jBO.setContentAreaFilled(false);
        jBO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBOMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBOMouseExited(evt);
            }
        });
        jBO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOActionPerformed(evt);
            }
        });

        jLX.setFont(new java.awt.Font("BankGothic Md BT", 0, 36)); // NOI18N
        jLX.setForeground(new java.awt.Color(255, 255, 255));
        jLX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLX.setText("0");

        jLO.setFont(new java.awt.Font("BankGothic Md BT", 0, 36)); // NOI18N
        jLO.setForeground(new java.awt.Color(255, 255, 255));
        jLO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLO.setText("0");

        jLabel3.setFont(new java.awt.Font("BankGothic Md BT", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("-");

        jLabel1.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seleccione uno para empezar a jugar");

        jBReiniciar.setFont(new java.awt.Font("BankGothic Md BT", 0, 11)); // NOI18N
        jBReiniciar.setForeground(new java.awt.Color(255, 255, 255));
        jBReiniciar.setText("Reiniciar");
        jBReiniciar.setContentAreaFilled(false);
        jBReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBReiniciarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("BankGothic Md BT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione el modo de juego");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jCBTipodeJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jBNuevoJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBX, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLX, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jBReiniciar))
                        .addGap(45, 45, 45)
                        .addComponent(jBO, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(259, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBX, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBO, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBReiniciar)
                        .addGap(24, 24, 24)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jCBTipodeJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBNuevoJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(231, 231, 231))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB00ActionPerformed
        this.setJugada(0,0);
    }//GEN-LAST:event_jB00ActionPerformed

    private void jB01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB01ActionPerformed
        this.setJugada(0,1);
    }//GEN-LAST:event_jB01ActionPerformed

    private void jB02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB02ActionPerformed
        this.setJugada(0,2);
    }//GEN-LAST:event_jB02ActionPerformed

    private void jB10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB10ActionPerformed
        this.setJugada(1,0);
    }//GEN-LAST:event_jB10ActionPerformed

    private void jB11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB11ActionPerformed
        this.setJugada(1,1);
    }//GEN-LAST:event_jB11ActionPerformed

    private void jB12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB12ActionPerformed
        this.setJugada(1,2);
    }//GEN-LAST:event_jB12ActionPerformed

    private void jB20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB20ActionPerformed
        this.setJugada(2,0);
    }//GEN-LAST:event_jB20ActionPerformed

    private void jB21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB21ActionPerformed
        this.setJugada(2,1);
    }//GEN-LAST:event_jB21ActionPerformed

    private void jB22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB22ActionPerformed
        this.setJugada(2,2);
    }//GEN-LAST:event_jB22ActionPerformed

    private void jBNuevoJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoJuegoActionPerformed
        this.tresenraya1.NuevoJuego();
        borrarBotones();
        contadorPartidasFinalizadas=0;
        if(this.tresenraya1.getGanador()==1){
                
            }else if(this.tresenraya1.getGanador()==2){
            victoriasO++;{
            jLO.setText(""+victoriasO);
            };}
        //JFTresenrayaCPUmedio jftresenrayaCPUmedio = new JFTresenraya();
        //jftresenrayaCPUmedio.setVisible(true);
        //this.setVisible(false);
        
    }//GEN-LAST:event_jBNuevoJuegoActionPerformed

    private void jBXMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBXMouseDragged

    }//GEN-LAST:event_jBXMouseDragged

    private void jBXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBXMouseClicked
        jBX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenX2.png")));
    }//GEN-LAST:event_jBXMouseClicked

    private void jBXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBXMouseEntered
        jBX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenX2.png")));
    }//GEN-LAST:event_jBXMouseEntered

    private void jBXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBXMouseExited
        if(!x){
            jBX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenX.png")));
        }
    }//GEN-LAST:event_jBXMouseExited

    private void jBXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBXActionPerformed
        x=true;
        o=false;
        jBX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenX2.png")));
        jBO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen1.png")));
        jugada_inicial=1;
        //false==X
    }//GEN-LAST:event_jBXActionPerformed

    private void jBOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBOMouseEntered

        jBO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen2.png")));
    }//GEN-LAST:event_jBOMouseEntered

    private void jBOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBOMouseExited
        if(!o){
            jBO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen1.png")));}
    }//GEN-LAST:event_jBOMouseExited

    private void jBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOActionPerformed
        o=true;
        x=false;
        jugada_inicial=2;
        jBO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen2.png")));
        jBX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenX.png")));
        //true==O
    }//GEN-LAST:event_jBOActionPerformed

    private void jBReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReiniciarActionPerformed
        victoriasO=0;
        victoriasX=0;
        jLX.setText(""+victoriasX);
        jLO.setText(""+victoriasO);
    }//GEN-LAST:event_jBReiniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFTresenraya().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB00;
    private javax.swing.JButton jB01;
    private javax.swing.JButton jB02;
    private javax.swing.JButton jB10;
    private javax.swing.JButton jB11;
    private javax.swing.JButton jB12;
    private javax.swing.JButton jB20;
    private javax.swing.JButton jB21;
    private javax.swing.JButton jB22;
    private javax.swing.JButton jBNuevoJuego;
    private javax.swing.JButton jBO;
    private javax.swing.JButton jBReiniciar;
    private javax.swing.JButton jBX;
    private javax.swing.JComboBox<String> jCBTipodeJuego;
    private javax.swing.JLabel jLO;
    private javax.swing.JLabel jLX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

class FondoPanel extends JPanel{
    private Image imagen;
    @Override
    public void paint(Graphics g){
        imagen= new ImageIcon(getClass().getResource("/Imagenes/Rayas.png")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
    }

class FondoFrame1 extends JPanel{
    private Image imagen;
    @Override
    public void paint(Graphics g){
        imagen= new ImageIcon(getClass().getResource("/Imagenes/Fondotransparente.png")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
    }
public void setJugada(int fila, int columna){
        if(this.tresenraya1.getCantidad_jugadas()==0){
            this.tresenraya1.setJugador(jugada_inicial);
        }
        //Esta parte es la del jugador. Aqui se setea el icono en el boton que se haya presionado
        if(!this.tresenraya1.FinJuego()&&tresenraya1.getMatriz()[fila][columna]==0){
        if(this.tresenraya1.getJugador()==2){
            tresenraya1.setMatrizElemento(fila,columna,2);
            Array_jbutton[fila][columna].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen1.png")));

        }
        else if(this.tresenraya1.getJugador()==1){
            tresenraya1.setMatrizElemento(fila,columna,1);
            Array_jbutton[fila][columna].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenX.png")));
        }
        
        //Settear la jugada de la compu dependiendo del nivel que se haya escogido
        if(!this.tresenraya1.noquedanMovimientos()&&!this.tresenraya1.Ganador(this.tresenraya1.getJugador())){
        switch(jCBTipodeJuego.getSelectedIndex()){
            case 0:
                //J1 VS J2 no se hace nada
                break;
            case 1:
                array_aux=tresenraya1.setMovimientoFacil();
                if(this.tresenraya1.getJugador()==2&&(!tresenraya1.FinJuego()||!this.tresenraya1.Ganador(jugadorCPU))){
                Array_jbutton[array_aux[0]][array_aux[1]].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen1.png")));
                }
                else if(this.tresenraya1.getJugador()==1&&(!tresenraya1.FinJuego()||!this.tresenraya1.Ganador(jugadorCPU))){
                 Array_jbutton[array_aux[0]][array_aux[1]].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenX.png")));
                }

                break;
                
            case 2:
                array_aux=tresenraya1.setMovimientoMedio();
                if(this.tresenraya1.getJugador()==2&&(!tresenraya1.FinJuego()||!this.tresenraya1.Ganador(jugadorCPU))){
                Array_jbutton[array_aux[0]][array_aux[1]].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen1.png")));
                }
                else if(this.tresenraya1.getJugador()==1&&(!tresenraya1.FinJuego()||!this.tresenraya1.Ganador(jugadorCPU))){
                 Array_jbutton[array_aux[0]][array_aux[1]].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenX.png")));
                }

                break;
            case 3: 
                array_aux=tresenraya1.setMovimientoDificil();  
                if(this.tresenraya1.getJugador()==2&&(!tresenraya1.FinJuego()||!this.tresenraya1.Ganador(jugadorCPU))){
                Array_jbutton[array_aux[0]][array_aux[1]].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Imagen1.png")));
                }
                else if(this.tresenraya1.getJugador()==1&&(!tresenraya1.FinJuego()||!this.tresenraya1.Ganador(jugadorCPU))){
                 Array_jbutton[array_aux[0]][array_aux[1]].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenX.png")));
                }
                
                break;
        }
        
       
        
        }
        //se cambia el turno
        tresenraya1.cambioTurno();
        
        }
        //Mostrar la ventana indicando el ganador
        if(this.tresenraya1.FinJuego()&&this.contadorPartidasFinalizadas==0){
            this.contadorPartidasFinalizadas++;
        if(this.tresenraya1.getGanador()==1){
            jfganax.setVisible(true);
            victoriasX++; 
            jLX.setText(""+victoriasX);
        }else if(this.tresenraya1.getGanador()==2){
            jfganao.setVisible(true);
            victoriasO++;
            jLO.setText(""+victoriasO);
        }else if(this.tresenraya1.esEmpate()){
            jfempate.setVisible(true);
        }
        }        
}
//Se quitan todos los gráficos que se pusieron previamente en los botones
public void borrarBotones(){
    for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                     Array_jbutton[i][j].setIcon(null);
            }
        }
    
}
}


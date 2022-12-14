package projectgame;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/* หน้าเริ่มต้นเกมส์ */
public class GamePanel extends javax.swing.JFrame {

    /**
     * Creates new form GamePanel
     */
    public GamePanel() {
        initComponents();
        this.setLocationRelativeTo(null);//ให้หน้าWindow อยู๋ตรงกลางจอ
        this.setIconImage(new ImageIcon(getClass().getResource("/projectgame/iconrps.png")).getImage()); //Set Icon ของ Program
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    //--method สำหรับการสร้างและปรับแต่งหน้า UI--//
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new Panel.PanelGambar();
        Playbtn = new javax.swing.JLabel();
        Textinput = new javax.swing.JTextField();
        Titlegame = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JangKenFight");
        setMaximumSize(new java.awt.Dimension(960, 540));
        setMinimumSize(new java.awt.Dimension(960, 540));
        setPreferredSize(new java.awt.Dimension(960, 540));
        setResizable(false);
        getContentPane().setLayout(null);

        Playbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectgame/Layer 1.png"))); // NOI18N
        Playbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Playbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlaybtnMouseClicked(evt);
            }
        });

        Textinput.setBackground(new java.awt.Color(222, 232, 231));
        Textinput.setFont(new java.awt.Font("Old School Adventures", 1, 19)); // NOI18N
        Textinput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Textinput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextinputKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextinputKeyReleased(evt);
            }
        });

        Titlegame.setBackground(new java.awt.Color(255, 255, 255));
        Titlegame.setFont(new java.awt.Font("Old School Adventures", 1, 48)); // NOI18N
        Titlegame.setForeground(new java.awt.Color(255, 255, 255));
        Titlegame.setText("JangKenFight");
        Titlegame.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 224, Short.MAX_VALUE)
                .addComponent(Titlegame, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(Textinput, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(Playbtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(Titlegame, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Textinput, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(Playbtn)
                .addGap(169, 169, 169))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 960, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //--method ที่รับ event click จากปุ่ม Play เพื่อเข้าหน้าเกมส์--//
    private void PlaybtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlaybtnMouseClicked

        fp.Lpplayer.setText("x"+player.getLifepoint()); //ทำการ set พลังชีวิตของ Player
        fp.Lpboss.setText("x"+boss.getLifepoint());//ทำการ set พลังชีวิตของ Boss
        fp.Bosstext.setText(boss.getName());
        if(Textinput.getText().trim().equals("")){ //เกิดกรณีที่ไม่ได้ใส่ชื่อ ระบบจะตั้งชื้อให้เอง
            player.setName("PIYABUT");
            fp.Playertext.setText(player.getName());//ทำการset ชื่อ PIYABUT ของPlayer ในหน้าเกมส์
        }
        else{ //ถ้ามีชื่อ ระบบจะset ชื่อให้ player
            player.setName(Textinput.getText());
            fp.Playertext.setText(player.getName());//ทำการset ชื่อของPlayer ในหน้าเกมส์
        }
        fp.show();//ทำการshow หน้าเกมส์
        dispose();//ปิดหน้าเริ่มเกมส์       
    }//GEN-LAST:event_PlaybtnMouseClicked

    //--method ที่การเปลี่ยนให้ตัวอักษรทั้งหมดเป็นพิมพ์ใหญ่ --//
    private void TextinputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextinputKeyReleased
        int position = Textinput.getCaretPosition();//ทำการเก็บตำแหน่งของตัวcaret
        Textinput.setText(Textinput.getText().toUpperCase());//ทำการเปลี่ยนตัวอักษรเป็นพิมพ์ใหญ่
        Textinput.setCaretPosition(position);//ทำการsetตำแหน่งของตัวcaret
    }//GEN-LAST:event_TextinputKeyReleased

    //--method ที่รับevent จากการปุ่ม Enter เพื่อเข้าหน้าเกมส์--//
    private void TextinputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextinputKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){ //ถ้าปุ่มที่กดคือ ปุ่ม Enter
            fp.Lpplayer.setText("x"+player.getLifepoint()); //ทำการ set พลังชีวิตของ Player
            fp.Lpboss.setText("x"+boss.getLifepoint());//ทำการ set พลังชีวิตของ Boss
            fp.Bosstext.setText(boss.getName());
            if(Textinput.getText().trim().equals("")){//เกิดกรณีที่ไม่ได้ใส่ชื่อ
                player.setName("PIYABUT");
                fp.Playertext.setText(player.getName());//ทำการset ชื่อ PIYABUT ของPlayer ในหน้าเกมส์
            }
            else{//ถ้ามีชื่อ ระบบจะset ชื่อให้ Player
                player.setName(Textinput.getText());
                fp.Playertext.setText(player.getName());//ทำการset ชื่อของPlayer ในหน้าเกมส์
            }
            fp.show();//ทำการshow หน้าเกมส์
            dispose();//ปิดหน้าเริ่มเกมส์       
        }
    }//GEN-LAST:event_TextinputKeyPressed

    
    //--ประกาศ Attribute--//
    FightPanel fp = new FightPanel();
    Player player = new Player();
    Boss boss = new Boss();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Playbtn;
    private javax.swing.JTextField Textinput;
    private javax.swing.JLabel Titlegame;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}

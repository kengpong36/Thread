package thread;

//import ค่าใน Class แม่ ไปใช้กับ SubClass 
//บังคับเป็น static เพื่อให้สามารถใช้งานได้ทันที ไม่ต้อง New
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import static thread.ThreadGUI.Base_Path;
import static thread.ThreadGUI.T_Dog;
import static thread.ThreadGUI.T_Human;
import static thread.ThreadGUI.T_Polic;
import static thread.ThreadGUI.image;   //import image จาก classแม่ไปใช้ใน SubClass
import static thread.ThreadGUI.image_Bandit;
import static thread.ThreadGUI.image_Dog;
import static thread.ThreadGUI.image_polic;
import static thread.ThreadGUI.picture;
import static thread.ThreadGUI.statusBandit;
import static thread.ThreadGUI.statusDog;
import static thread.ThreadGUI.statusHuman;
import static thread.ThreadGUI.statusPolic;
import static thread.ThreadGUI.status_B;
import static thread.ThreadGUI.status_D;
import static thread.ThreadGUI.status_H;
import static thread.ThreadGUI.status_P;
import static thread.ThreadGUI.i;
import static thread.ThreadGUI.day;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import static thread.ThreadGUI.status;
import static thread.ThreadGUI.time;
import static thread.ThreadGUI.date;
import static java.lang.Thread.sleep; 

public class ThreadGUI extends javax.swing.JFrame implements MouseListener, ActionListener {

    public static String picture = null;
    public static String statusHuman = "WakeUp";
    public static String statusDog = "Sleep";
    public static String statusPolic = "Stanby";
    public static String statusBandit = "Sleep";
    public static Boolean status = false;
    public static Human T_Human = new Human(); // สร้าง Class Human เพื่อเอาไปใช้ใน classแม่
    public static Dog T_Dog = new Dog(); // สร้าง Class Dog เพื่อเอาไปใช้ใน classแม่
    public static Polic T_Polic = new Polic();//สร้าง Class Polic เพื่อเอาไปใช้ใน classแม่
    public static Thif T_Bandit = new Thif();//สร้าง Class Thif เพื่อเอาไปใช้ใน classแม่
    public static String Base_Path = "C:\\Users\\Administrator\\Desktop\\System\\Thread\\res\\";//Path ก่อนเข้าไฟล์รูป
    public static Clock clock = new Clock();//สร้าง Class Clock เพื่อเอาไปใช้ใน classแม่
    public static int i;
    public static int day = 0;

    public ThreadGUI() {
        initComponents();

    }

    //Resoure ที่เกิดจากสร้างหน้า GUI โดยใช้ การ ลากวาง เช่น Label,Button ทุกอย่างจะถูก new 
    //ที่ initComponents() เพื่อทำงาน เมื่อโปรแกรม เริ่มรัน
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        status_H = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        image_Dog = new javax.swing.JLabel();
        status_D = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        image_polic = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_bandit = new javax.swing.JButton();
        image_Bandit = new javax.swing.JLabel();
        status_B = new javax.swing.JLabel();
        status_P = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        time = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        btnStop = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));
        jPanel1.setForeground(new java.awt.Color(51, 51, 0));

        image.setIcon(new javax.swing.ImageIcon(Base_Path+"\\home.jpeg"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        status_H.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        status_H.setText("WakeUp");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));
        jPanel2.setForeground(new java.awt.Color(51, 51, 0));

        image_Dog.setIcon(new javax.swing.ImageIcon(Base_Path+"\\home.jpeg"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image_Dog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image_Dog, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addContainerGap())
        );

        status_D.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        status_D.setText(statusDog);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));
        jPanel3.setForeground(new java.awt.Color(51, 51, 0));

        image_polic.setIcon(new javax.swing.ImageIcon(Base_Path+"\\home.jpeg"));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image_polic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image_polic, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255), 3));
        jPanel4.setForeground(new java.awt.Color(51, 51, 0));

        btn_bandit.setText("Rob");
        btn_bandit.addMouseListener(this);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_bandit))
                    .addComponent(image_Bandit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image_Bandit, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_bandit))
        );

        image_Bandit.setIcon(new javax.swing.ImageIcon(Base_Path +"home.jpeg"));

        status_B.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        status_B.setText("Sleep");

        status_P.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        status_P.setText(statusPolic);

        btnStart.setText("Start");
        btnStart.addMouseListener(this);

        time.setFont(new java.awt.Font("Old English Text MT", 1, 18)); // NOI18N
        time.setText("00:00");

        jLabel1.setFont(new java.awt.Font("TH Charm of AU", 1, 24)); // NOI18N
        jLabel1.setText("Day");

        date.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N

        btnStop.setText("Stop");
        btnStop.addMouseListener(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(status_P, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(status_H, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(time)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnStart)
                        .addGap(18, 18, 18)
                        .addComponent(btnStop))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(status_D, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(status_B, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnStart)
                            .addComponent(btnStop)
                            .addComponent(time))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(status_D, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(status_H, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(status_P, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(status_B, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }

    // Code for dispatching events from components to event handlers.

    public void mouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getSource() == btn_bandit) {
            ThreadGUI.this.btn_banditMouseClicked(evt);
        }
        else if (evt.getSource() == btnStart) {
            ThreadGUI.this.btnStartMouseClicked(evt);
        }
        else if (evt.getSource() == btnStop) {
            ThreadGUI.this.btnStopMouseClicked(evt);
        }
    }

    public void mouseEntered(java.awt.event.MouseEvent evt) {
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
    }

    public void mousePressed(java.awt.event.MouseEvent evt) {
    }

    public void mouseReleased(java.awt.event.MouseEvent evt) {
    }// </editor-fold>//GEN-END:initComponents
    //ทำเมื่อ คลิกปุ่ม Rob
    private void btn_banditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_banditMouseClicked

        if (statusBandit == "WakeUp") { //WakeUp , Sleep
            try {
                T_Bandit.interrupt();
                status = true;
                clock.stop();
            } catch (Exception e) {
            }

        } else {
            JOptionPane.showMessageDialog(null, "โจรหลับอยู่", "Bandit Dialog", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btn_banditMouseClicked

    private void btnStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartMouseClicked
        if (i <= 0) {
            clock.start();
            T_Polic.start();
            T_Human.start();
            T_Dog.start();
            T_Dog.setPriority(4);
            T_Bandit.start();
            T_Bandit.setPriority(3);
            status = false;
        } else {
            JOptionPane.showMessageDialog(null, "Thread Running", "Thread Dialog", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btnStartMouseClicked

    private void btnStopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStopMouseClicked
        clock.stop();
        T_Bandit.stop();
        T_Polic.stop();
        T_Dog.stop();
        T_Human.stop();
          clock = new Clock();
            T_Polic = new Polic();
            T_Human = new Human();
            T_Dog = new Dog();
            T_Dog.setPriority(4);
            T_Bandit = new Thif();
            T_Bandit.setPriority(3);
    }//GEN-LAST:event_btnStopMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new ThreadGUI().setVisible(true);

            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnStart;
    public static javax.swing.JButton btnStop;
    public static javax.swing.JButton btn_bandit;
    public static javax.swing.JLabel date;
    public static javax.swing.JLabel image;
    public static javax.swing.JLabel image_Bandit;
    public static javax.swing.JLabel image_Dog;
    public static javax.swing.JLabel image_polic;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel jPanel4;
    public static javax.swing.JLabel status_B;
    public static javax.swing.JLabel status_D;
    public static javax.swing.JLabel status_H;
    public static javax.swing.JLabel status_P;
    public static javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class Human extends Thread {

    public void run() {

        while (Thread.currentThread().isAlive() && !status) {

            try {

                statusHuman = "WakeUp";
                picture = "wakeup";
                image.setIcon(new ImageIcon(Base_Path + "wakeUp.png"));
                status_H.setText(statusHuman);
                sleep(16000);
                statusHuman = "Sleep";
                picture = "sleep";
                status_H.setText(statusHuman);
                image.setIcon(new ImageIcon(Base_Path + "sleep.png"));
                sleep(8000);
            } catch (InterruptedException ex) {
                statusHuman = "WakeUp";
                picture = "wakeup";
                image.setIcon(new ImageIcon(Base_Path + "wakeup.png"));
                status_H.setText(statusHuman);
                T_Polic.interrupt();
            }

        }

    }
}

class Dog extends Thread {

    public void run() {

        while (Thread.currentThread().isAlive() && !status) {
            try {

                statusDog = "Sleep";
                picture = "dog_sleep";
                status_D.setText(statusDog);
                image_Dog.setIcon(new ImageIcon(Base_Path + "dog_sleep.png"));
                sleep(16000);
                statusDog = "WakeUp";
                picture = "dog_wakeUp";
                status_D.setText(statusDog);
                image_Dog.setIcon(new javax.swing.ImageIcon(Base_Path + "dog_wakeUp.png"));
                sleep(8000);
            } catch (InterruptedException ex) {
                T_Human.interrupt();
                statusDog = "WakeUp";
                picture = "dog_wakeUp";
                status_D.setText(statusDog);
                image_Dog.setIcon(new javax.swing.ImageIcon(Base_Path + "dog_wakeUp.png"));
            }
        }
    }
}

class Polic extends Thread {

    public void run() {

        try {
            image_polic.setIcon(new javax.swing.ImageIcon(Base_Path + "stanby.png"));
            synchronized (T_Polic) {
                T_Polic.wait();
            }
        } catch (InterruptedException ire) {
            statusPolic = "Work";
            picture = "work";
            status_P.setText(statusPolic);
            image_polic.setIcon(new javax.swing.ImageIcon(Base_Path + "work.png"));
            JOptionPane.showMessageDialog(null, "ตำรวจจับได้วันที่ "+day+"  เวลา  "+i, "Polic Dialog", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}

class Thif extends Thread {

    public void run() {

        while (Thread.currentThread().isAlive() && !status) {
            try {

                statusBandit = "Sleep";
                picture = "dog_sleep";
                status_B.setText(statusDog);
                image_Bandit.setIcon(new ImageIcon(Base_Path + "bandit_sleep.png"));
                sleep(16000);
                statusBandit = "WakeUp";
                picture = "bandit_wakeUp";
                status_B.setText(statusDog);
                image_Bandit.setIcon(new ImageIcon(Base_Path + "bandit_wakeUp.png"));
                sleep(8000);
            } catch (InterruptedException ex) {
                T_Dog.interrupt();
                statusBandit = "WakeUp";
                picture = "bandit_wakeUp";
                status_B.setText(statusBandit);
                image_Bandit.setIcon(new javax.swing.ImageIcon(Base_Path + "bandit_wakeUp.png"));
                image_polic.setIcon(new ImageIcon(Base_Path + "work.png"));
            }
        }

    }

}

//subclass clock ใช้นับเวลา
class Clock extends Thread {

    

    public void run() {

        for (i = 0; i < 25; i++) {
            time.setText(i + ":00");
            try {
                sleep(1000);
                if (i == 24) {
                    i = 0;
                    this.interrupt(); //เมื่อครบ 1 วัน = 24 ชม ให้ interrupt ตัวเอง
                }
            } catch (InterruptedException ex) { //เมื่อถูก interrupt ให้ Delay 1 วิ แล้วเพิ่ม วัน 
                try {
                    sleep(1000);
                } catch (InterruptedException ex1) {
                    Logger.getLogger(Clock.class.getName()).log(Level.SEVERE, null, ex1);
                }
                day++;
                date.setText(day + "");

            }
        }

    }

}

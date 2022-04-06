/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.Dimension;


/**
 *
 * @author Rica Mae
 */
public class Play extends JFrame implements ActionListener{
public JFrame framestart, fPlay, fyou, fyou2, fresult, fresult2;
public JLabel label, bebe,bibi, chief, note, note2, gameend,resTitle, missed;
public JPanel panel, panelback, pPlay, pyou, pyaw, pyou2, pyaw2, presult, presult2, back, back2;
public JButton button, next1, next2, next3, next4, next5, t1, t2, t3, t4, retry, exit, exit2;
public ImageIcon bgg, bra, bgg2, bra2;
public Image bgpic, logo, bgpic2, logo2; 
public Dimension dimension;
public static Font f1 = new Font(Font.SERIF, Font.BOLD, 30);
public static Font f2 = new Font(Font.SERIF, Font.BOLD, 20);
public static Font f3 = new Font(Font.DIALOG, Font.PLAIN, 15);
public static Font f4 = new Font(Font.SERIF, Font.PLAIN, 15);
public static Font f5 = new Font(Font.DIALOG, Font.PLAIN, 18);


public static String chieff, end;
    
    Play(){
        framestart = new JFrame ();
        framestart.setSize(447,671 );
        framestart.setLayout(null);
        framestart.setResizable(false);
        framestart.setVisible(true);
        framestart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        dimension = Toolkit.getDefaultToolkit().getScreenSize();
        framestart.setLocation(dimension.width/2-framestart.getWidth()/2, dimension.height/2 - framestart.getHeight()/2);
        
        panel = new JPanel();
        panel.setBounds(0,0,447,671);
        panel.setLayout(null);
        
        bebe = new JLabel();
        bebe.setBounds(0,0,447,671);
        
        bgg = new ImageIcon("game1.png");
        bgpic = bgg.getImage();
        logo = bgpic.getScaledInstance(bebe.getWidth(), bebe.getHeight(), Image.SCALE_SMOOTH);
        
        bra = new ImageIcon(logo);
        bebe.setIcon(bra);
       
        label = new JLabel();
        label.setText("IMMORTAL AGENT");
        label.setBounds(70,67,300,300);
        label.setFont(f1);
        label.setForeground(new Color(255,255,255));
         
        button = new JButton ();
        button.setText("Start");
        button.setBounds(110,540,200,60);
        button.setBackground(Color.white);
        button.setForeground(Color.black);
        button.setFont(f2);
        button.addActionListener(this);
        
        panelback = new JPanel();
        panelback.setBounds(0,420,447,230);
        panelback.setBackground(new Color(46,46,46,200));
        panelback.setVisible(false);
        
        chief = new JLabel();
        chief.setBounds(15,370,400,300);
        chieff = "<html><b>Chief on the phone:</b><p align=\"justify\"> Hello, Agent. I congratulate you in advance on"
                    + " your retirement. Your final assignment is to kill your target and you are free to go. <b><i>Find the real trigger around you screen"
                    + " to hit.</i></b> You only have one chance to shoot. Be careful because the Mafia is not "
                    + "very merciful. That have taken out few of our men but I know you are capable, Agent. "
                    + "Good luck and may the God be with you. ";
        chief.setText(chieff);
        chief.setForeground(Color.white);
        chief.setFont(f3);
        chief.setVisible(false);
            
        next1= new JButton();
        next1.setBounds(310,590,100,25);
        next1.setText("Continue>");
        next1.setForeground(Color.black);
        next1.setBackground(Color.white);
        next1.setFont(f4);
        next1.setVisible(false);
        next1.addActionListener(this);
        
        framestart.add(panel);
        panel.add(label);
        panel.add(button);
        panel.add(next1);
        panel.add(chief);
        panel.add(panelback);
        panel.add(bebe);
          
    }
    
    public void Hit(){
        fPlay = new JFrame ();
        fPlay.setSize(447,671 );
        fPlay.setLayout(null);
        fPlay.setResizable(false);
        fPlay.setVisible(false);
        fPlay.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        fPlay.setLocation(dimension.width/2-fPlay.getWidth()/2, dimension.height/2 - fPlay.getHeight()/2);
        
        pPlay = new JPanel();
        pPlay.setBounds(0,0,447,671);
        pPlay.setLayout(null);
        
        note = new JLabel();
        note.setBounds(120,5,200,30);
        note.setText("Note: Find the right trigger to hit.");
        note.setForeground(Color.white);
        
        bebe = new JLabel();
        bebe.setBounds(0,-20,447,671);
        
        bgg = new ImageIcon("game2.png");
        bgpic = bgg.getImage();
        logo = bgpic.getScaledInstance(bebe.getWidth(), bebe.getHeight(), Image.SCALE_SMOOTH);
        
        bra = new ImageIcon(logo);
        bebe.setIcon(bra);
        
        t1 = new JButton ();
        t1.setBounds(165,120,30,30);
        t1.setBackground(Color.red);
        t1.setContentAreaFilled(false);
        t1.setOpaque(false);
        t1.setBorder(null);
        t1.addActionListener(this);
        
        t2 = new JButton ();
        t2.setBounds(0,220,150,410);
        t2.setBackground(Color.white);
        t2.setContentAreaFilled(false);
        t2.setBorder(null);
        t2.setOpaque(false);
        t2.addActionListener(this);
        
        t3 = new JButton ();
        t3.setBounds(0,0,447,90);
        t3.setBackground(Color.white);
        t3.setContentAreaFilled(false);
        t3.setOpaque(false);
        t3.setBorder(null);
        t3.addActionListener(this);
        
        t4 = new JButton ();
        t4.setBounds(230,280,200,300);
        t4.setBackground(Color.white);
        t4.setContentAreaFilled(false);
        t4.setOpaque(false);
        t4.setBorder(null);
        t4.addActionListener(this);
               
        fPlay.add(pPlay);
        pPlay.add(note);
        //pPlay.add(missed);
        pPlay.add(t1);
        pPlay.add(t2);
        pPlay.add(t3);
        pPlay.add(t4);
        pPlay.add(bebe);    
    }
    
    public void Failed(){
        fyou = new JFrame ();
        fyou.setSize(447,671 );
        fyou.setLayout(null);
        fyou.setResizable(false);
        fyou.setVisible(false);
        fyou.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        fyou.setLocation(dimension.width/2-fyou.getWidth()/2, dimension.height/2 - fyou.getHeight()/2);
        
        pyou = new JPanel();
        pyou.setBounds(0,0,447,671);
        pyou.setLayout(null);
        
        missed = new JLabel();
        missed.setVisible(false);
        missed.setText("Missed!");
        missed.setForeground(Color.red);
        missed.setFont(f1);
        
        bebe = new JLabel();
        bebe.setBounds(0,-20,447,671);
        
        bgg = new ImageIcon("game3_1.png");
        bgpic = bgg.getImage();
        logo = bgpic.getScaledInstance(bebe.getWidth(), bebe.getHeight(), Image.SCALE_SMOOTH);
        
        bra = new ImageIcon(logo);
        bebe.setIcon(bra);
        
        note = new JLabel();
        note.setBounds(130,5,200,30);
        note.setText("Click any where to continue.");
        note.setForeground(Color.white);
        
        next2 = new JButton ();
        next2.setBounds(0,0,447,671);
        next2.setBackground(Color.white);
        next2.setOpaque(false);
        next2.setBorder(null);
        next2.addActionListener(this);
       
        pyaw = new JPanel();
        pyaw.setBounds(0,0,447,671);
        pyaw.setLayout(null);
        pyaw.setVisible(true);
        pyaw.setBackground(Color.black);
        
        next3 = new JButton ();
        next3.setBounds(0,0,447,671);
        next3.setBackground(Color.white);
        next3.setOpaque(false);
        next3.setBorder(null);
        next3.addActionListener(this);
        
        fyou.add(pyou);
        pyou.add(missed);
        pyou.add(next2);
        pyou.add(note);
        pyou.add(bebe);
        
        note2 = new JLabel();
        note2.setBounds(130,5,200,30);
        note2.setText("Click any where to continue.");
        note2.setForeground(Color.white);
        
        fyou.add(pyaw);
        pyaw.add(next3);
        pyaw.add(note2);
        
        fresult2 = new JFrame();
        fresult2.setSize(447,671 );
        fresult2.setLayout(null);
        fresult2.setResizable(false);
        fresult2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        fresult2.setLocation(dimension.width/2-fresult2.getWidth()/2, dimension.height/2 - fresult2.getHeight()/2);
        
        presult2 = new JPanel();
        presult2.setBounds(0,0,447,671);
        presult2.setLayout(null);
        
        gameend = new JLabel();
        end = "<html><p align=\"justify\"> You got caught by the Mafia Admiral and got you captured. Are have bee tortured, lasorated,"
                + " beaten up, decapitated and body thrown in a remote dumpster. Good thing you don't die due to"
                + " your radioactive exposure in the explosion of your last mission. Put yourself together and eliminate"
                + "the target.</p> ";
        gameend.setText(end);
        gameend.setFont(f5);
        gameend.setBounds(15,60,320,250);
        gameend.setForeground(Color.WHITE);
        
        resTitle = new JLabel();
        resTitle.setText("MISSION FAILED");
        resTitle.setFont(f1);
        resTitle.setBounds(50,-5,320,100);
        resTitle.setForeground(Color.RED);
        
        back = new JPanel();
        back.setBounds(40,130,350,350);
        back.setBackground(new Color(0,0,0,99));
        back.setLayout(null);
        
        exit2 = new JButton ();
        exit2.setBounds(160,540,130,50);
        exit2.setBackground(Color.white);
        exit2.setText("Retry");
        exit2.setFont(f2); 
        exit2.setBorder(null);
        exit2.addActionListener(this);
       
        bebe = new JLabel();
        bebe.setBounds(0,-20,447,671);
        
        bgg = new ImageIcon("game4_2.png");
        bgpic = bgg.getImage();
        logo = bgpic.getScaledInstance(bebe.getWidth(), bebe.getHeight(), Image.SCALE_SMOOTH);
        
        bra = new ImageIcon(logo);
        bebe.setIcon(bra);
        
        fresult2.add(presult2);
        presult2.add(back);
        back.add(resTitle);
        back.add(gameend);
        presult2.add(exit2);
        presult2.add(bebe);
    }
    
    public void Success(){
        fyou2 = new JFrame ();
        fyou2.setSize(447,671 );
        fyou2.setLayout(null);
        fyou2.setResizable(false);
        fyou2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        fyou2.setLocation(dimension.width/2-fyou2.getWidth()/2, dimension.height/2 - fyou2.getHeight()/2);
        
        pyou2 = new JPanel();
        pyou2.setBounds(0,0,447,671);
        pyou2.setLayout(null);
        pyou2.setVisible(false);
        
        bibi = new JLabel();
        bibi.setBounds(0,-20,447,671);
        
        bgg2 = new ImageIcon("game3_2.png");
        bgpic2 = bgg2.getImage();
        logo2 = bgpic2.getScaledInstance(bibi.getWidth(), bibi.getHeight(), Image.SCALE_SMOOTH);
        
        bra2 = new ImageIcon(logo2);
        bibi.setIcon(bra2);
        
        next4 = new JButton ();
        next4.setBounds(0,0,447,671);
        next4.setBackground(Color.white);
        next4.setOpaque(false);
        next4.setBorder(null);
        next4.addActionListener(this);
        
        pyaw2 = new JPanel();
        pyaw2.setBounds(0,0,447,671);
        pyaw2.setLayout(null);
        pyaw2.setVisible(true);
        pyaw2.setBackground(Color.black);
        
        note2 = new JLabel();
        note2.setBounds(130,5,200,30);
        note2.setText("Click any where to continue.");
        note2.setForeground(Color.white);
        
        next5 = new JButton ();
        next5.setBounds(0,0,447,671);
        next5.setBackground(Color.white);
        next5.setOpaque(false);
        next5.setBorder(null);
        next5.addActionListener(this);
        
        fyou2.add(pyou2);
        pyou2.add(next4);
        pyou2.add(note2);
        pyou2.add(bibi);
        
        note = new JLabel();
        note.setBounds(130,5,200,30);
        note.setText("Click any where to continue.");
        note.setForeground(Color.white);
        
        fyou2.add(pyaw2);
        pyaw2.add(next5);
        pyaw2.add(note);     
        
        fresult = new JFrame();
        fresult.setSize(447,671 );
        fresult.setLayout(null);
        fresult.setResizable(false);
        fresult.setVisible(false);
        fresult.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        fresult.setLocation(dimension.width/2-fresult.getWidth()/2, dimension.height/2 - fresult.getHeight()/2);
        
        presult = new JPanel();
        presult.setBounds(0,0,447,671);
        presult.setLayout(null);
        presult.setVisible(false);
        
        back2 = new JPanel();
        back2.setBounds(40,140,350,350);
        back2.setBackground(new Color(0,0,0,99));
        back2.setLayout(null);
        
        gameend = new JLabel();
        end = "<html><p align=\"justify\"> Very good, Agent. You've successfully killed the Mafia Admiral."
                + "The underground will surely be in chaos because of the lost of the shepherd but it will"
                + "be a problem of the agency. Congrats on your retirement, Agent. You are now free to go. </p> ";
        gameend.setText(end);
        gameend.setFont(f5);
        gameend.setBounds(15,60,320,250);
        gameend.setForeground(Color.WHITE);
        
        resTitle = new JLabel();
        resTitle.setText("MISSION COMPLETE");
        resTitle.setFont(f1);
        resTitle.setBounds(20,-5,360,100);
        resTitle.setForeground(Color.RED);
        
        exit = new JButton ();
        exit.setBounds(160,550,130,50);
        exit.setBackground(Color.white);
        exit.setText("Exit");
        exit.setFont(f2);
        exit.setBorder(null);
        exit.addActionListener(this);
           
        bebe = new JLabel();
        bebe.setBounds(0,0,447,671);
        
        bgg = new ImageIcon("game4_1.png");
        bgpic = bgg.getImage();
        logo = bgpic.getScaledInstance(bebe.getWidth(), bebe.getHeight(), Image.SCALE_SMOOTH);
        
        bra = new ImageIcon(logo);
        bebe.setIcon(bra);
        
        fresult.add(presult);
        presult.add(back2);
        back2.add(gameend);
        back2.add(resTitle);
        presult.add(exit);
        presult.add(bebe);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            panelback.setVisible(true);
            label.setVisible(false);
            chief.setVisible(true);
            button.setVisible(false);
            next1.setVisible(true);
            
        }
        
        if(next1==e.getSource()){
        Hit();
        fPlay.setVisible(true);
        framestart.setVisible(false);
        fyou.setVisible(false);
        fyou2.setVisible(false);
        fresult.setVisible(false);
        fresult2.setVisible(false);
    }
        
        if(e.getSource()== t1){
            Success();
            t1.setBackground(Color.red);
            t1.setOpaque(true);
            fyou2.setVisible(true);
            pyou2.setVisible(true);
            framestart.setVisible(false);
            fPlay.setVisible(false);
            fyou.setVisible(false);
            fresult.setVisible(false);
            fresult2.setVisible(false);
        }
        
        if(e.getSource()==t2){
            Failed();
            missed.setVisible(true);
            missed.setBounds(5,270,100,100);
            fyou.setVisible(true);
            pyou.setVisible(true);
            framestart.setVisible(false);
            fPlay.setVisible(false);
            fyou2.setVisible(false);
            fresult.setVisible(false);
            fresult2.setVisible(false);
           
        }
        
        if(e.getSource()==t3){
            Failed();
            missed.setVisible(true);
            missed.setBounds(210,20,100,100);
            fyou.setVisible(true);
            pyou.setVisible(true);
            framestart.setVisible(false);
            fPlay.setVisible(false);
            fyou2.setVisible(false);
            fresult.setVisible(false);
            fresult2.setVisible(false);
        }
        
        if(e.getSource()==t4){
            Failed();
            missed.setVisible(true);
            missed.setBounds(290,300,100,100);
            fyou.setVisible(true);
            pyou.setVisible(true);
            framestart.setVisible(false);
            fPlay.setVisible(false);
            fyou2.setVisible(false);
            fresult.setVisible(false);
            fresult2.setVisible(false);
        }
        
        if(e.getSource()==next2){
            pyaw.setVisible(true);
            pyou.setVisible(false);
            framestart.setVisible(false);
            fPlay.setVisible(false);
            fyou2.setVisible(false);
            fresult.setVisible(false);
            fresult2.setVisible(false);
        }
        
        if(e.getSource()==next3){
            pyou.setVisible(false);
            fresult2.setVisible(true);
            presult2.setVisible(true);
            framestart.setVisible(false);
            fPlay.setVisible(false);
            fyou.setVisible(false);
            fyou2.setVisible(false);
            fresult.setVisible(false);
        }
        
        if(e.getSource()==next4){
            pyaw2.setVisible(true);
            pyou2.setVisible(false);
            framestart.setVisible(false);
            fPlay.setVisible(false);
            fyou.setVisible(false);
            fresult.setVisible(false);
            fresult2.setVisible(false);
        }
        
        if(e.getSource()==next5){
            fresult.setVisible(true);
            presult.setVisible(true);
            framestart.setVisible(false);
            fPlay.setVisible(false);
            fyou.setVisible(false);
            fyou2.setVisible(false);
            fresult.setVisible(false);
        }
        
        if(e.getSource()==exit){
            System.exit(0);
        }
        
        if(e.getSource()==exit2){
            fresult2.setVisible(false);
            new Play();
            Hit();
            Success();
            Failed();
            
        }
    }
}


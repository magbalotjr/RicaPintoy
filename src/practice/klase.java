/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.awt.*;
//import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Dimension;


/**
 *
 * @author Rica Mae
 */
public class klase extends JFrame implements ActionListener {
    
    public JButton reg, log, confirm1, confirm2;
    public JFrame frame, regFrame, logFrame;
    public JLabel label, regLabel1, regLabel2, logLabel1, logLabel2, pepper,
            regLabel3,regLabel4,regLabel5,regLabel6,regLabel7,regLabel8, regLabel9, bebe;
    public JPanel panel, regPanel, logPanel, back;
    public ImageIcon bg;
    public JTextField regEmail, regPass, logUser, logPass,
            firstName, lastName, regUsername, gender, religon, nationality,
            confirmPass, subject;
    public String email, Password; 
    public Dimension dimension;
    public ImageIcon bgg, bra;
    public Image bgpic, logo;
    public String Userinput, Passinput, successtext, UserRegEmail, UserRegPass;
    public static Font f1 = new Font(Font.SERIF, Font.BOLD, 30);
    public static Font f2 = new Font(Font.SERIF, Font.PLAIN, 20);
    public static Font f3 = new Font(Font.SERIF, Font.BOLD, 15);
        
    klase(){
        frame = new JFrame ();
        frame.setTitle("GUI");
        frame.setSize(447,671);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        dimension = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dimension.width/2-frame.getWidth()/2, dimension.height/2 - frame.getHeight()/2);
               
        panel = new JPanel();
        panel.setSize(447,671);
        panel.setLayout(null);
        
        label = new JLabel();
        label.setText("IMMORTAL AGENT");
        label.setBounds(60,30,300,300);
        label.setFont(f1);
        label.setForeground(new Color(255,255,255));
        
        
        reg =new JButton ();
        log = new JButton ();
        reg.setBounds(50,500,100,30);
        log.setBounds(270,500,100,30);
        reg.setText("Register");
        log.setText("Login");
        reg.setBackground(Color.white);
        log.setBackground(Color.white);
        reg.setForeground(Color.black);
        log.setForeground(Color.black);
        log.setEnabled(false);
        reg.addActionListener(this);
        log.addActionListener(this);
        
        bebe = new JLabel();
        
        bebe.setBounds(0,0,447,671);
        
        bgg = new ImageIcon("bg.jpg");
        bgpic = bgg.getImage();
        logo = bgpic.getScaledInstance(bebe.getWidth(), bebe.getHeight(), Image.SCALE_SMOOTH);
        
        bra = new ImageIcon(logo);
        bebe.setIcon(bra);
        
        
        
        frame.add(panel);
        panel.add(label);
        panel.add(reg);
        panel.add(log);
        panel.add(bebe);     
       
    }
    
    @Override
  public void actionPerformed(ActionEvent e) {
      
      
      
      if(e.getSource()==reg){
          frame.setVisible(false);
          regFrame=new JFrame();
          regFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
          regFrame.setVisible(true);
          regFrame.setSize(447,671);
          regFrame.setLayout(null);
          
          regFrame.setLocation(dimension.width/2-frame.getWidth()/2, dimension.height/2 - frame.getHeight()/2);
          
          regPanel = new JPanel();
          regPanel.setSize(447,671);
          regPanel.setBackground(Color.pink);
          regPanel.setLayout(null);
          regFrame.add(regPanel);
          
          //Register labels
          regLabel1 = new JLabel();
          regLabel2= new JLabel();
          regLabel1.setText("Email: ");
          regLabel2.setText("Password: ");
          regLabel1.setBounds(35,215,100,50);
          regLabel2.setBounds(230,215,100,50);
          regLabel1.setFont(f2);
          regLabel2.setFont(f2);
          regLabel1.setForeground(Color.white);
          regLabel2.setForeground(Color.white);
          regPanel.add(regLabel1);
          regPanel.add(regLabel2);
          
          regLabel9 = new JLabel();
          JLabel regLabel10= new JLabel();
          regLabel9.setText("Confirm Password: ");
          regLabel10.setText("Tell something about the subject: ");
          regLabel9.setBounds(35,265,400,100);
          regLabel10.setBounds(35,340,500,100);
          regLabel9.setFont(f2);
          regLabel10.setFont(f2);
          regLabel9.setForeground(Color.white);
          regLabel10.setForeground(Color.white);
          regPanel.add(regLabel9);
          regPanel.add(regLabel10); 
          
          regLabel3 = new JLabel();
          regLabel4= new JLabel();
          regLabel3.setText("Firstname: ");
          regLabel4.setText("Lastname: ");
          regLabel3.setBounds(35,15,100,50);
          regLabel4.setBounds(230,15,100,50);
          regLabel3.setFont(f2);
          regLabel4.setFont(f2);
          regLabel3.setForeground(Color.white);
          regLabel4.setForeground(Color.white);
          regPanel.add(regLabel3);
          regPanel.add(regLabel4);
          
          regLabel5 = new JLabel();
          regLabel6= new JLabel();
          regLabel5.setText("Username: ");
          regLabel6.setText("Gender: ");
          regLabel5.setBounds(35,80,100,50);
          regLabel6.setBounds(230,80,100,50);
          regLabel5.setForeground(Color.white);
          regLabel6.setForeground(Color.white);
          regLabel5.setFont(f2);
          regLabel6.setFont(f2);
          regPanel.add(regLabel5);
          regPanel.add(regLabel6);
          
          regLabel7 = new JLabel();
          regLabel8= new JLabel();
          regLabel7.setText("Religon: ");
          regLabel8.setText("Nationality: ");
          regLabel7.setBounds(35,145,100,50);
          regLabel8.setBounds(230,145,100,50);
          regLabel7.setFont(f2);
          regLabel8.setFont(f2);
          regLabel7.setForeground(Color.white);
          regLabel8.setForeground(Color.white);
          regPanel.add(regLabel7);
          regPanel.add(regLabel8);
          
          
          
          
          //Register Textfield
          regEmail = new JTextField();
          regPass= new JTextField();
          regEmail.setBounds(35,260,130,30);
          regPass.setBounds(230,260,130,30);
          UserRegEmail = regEmail.getText();
          UserRegPass = regPass.getText();
          regPanel.add(regEmail);
          regPanel.add(regPass);
          
          confirmPass = new JTextField();
          subject = new JTextField();
          confirmPass.setBounds(35,335,130,30);
          subject.setBounds(35,410,340,30);
          regPanel.add(confirmPass);
          regPanel.add(subject);
          
          firstName = new JTextField();
          lastName = new JTextField();
          firstName.setBounds(35,55,130,30);
          lastName.setBounds(230,55,130,30);
          regPanel.add(firstName);
          regPanel.add(lastName);
          
          regUsername = new JTextField();
          gender = new JTextField();
          regUsername.setBounds(35,120,130,30);
          gender.setBounds(230,120,130,30);
          regPanel.add(regUsername);
          regPanel.add(gender);
          
          religon = new JTextField();
          nationality= new JTextField();
          religon.setBounds(35,190,130,30);
          nationality.setBounds(230,190,130,30);
          regPanel.add(religon);
          regPanel.add(nationality);
          
          //email = regEmail.getText();
          //Password = regPass.getText();
          
          confirm1 = new JButton();
          confirm1.setText("SIGN UP");
          confirm1.setBounds(280,550,100,30);
          confirm1.setFont(f3);
          confirm1.setForeground(Color.black);
          confirm1.setBackground(Color.white);
          regPanel.add(confirm1);
          confirm1.addActionListener(this);
         
          
          regPanel.add(bebe);
          
                    
      }
          if(e.getSource()==confirm1){
              regFrame.setVisible(false);
              frame.setVisible(true);
              log.setEnabled(true);
              panel.add(bebe);
          }
          
          if(e.getSource() == log){
              frame.setVisible(false);
              logFrame = new JFrame();
              logFrame.setSize(447,671);
              logFrame.setLayout(null);
              logFrame.setVisible(true);
              logFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              
              logFrame.setLocation(dimension.width/2-frame.getWidth()/2, dimension.height/2 - frame.getHeight()/2);
              
              logPanel = new JPanel();
              logPanel.setBackground(Color.pink);
              logPanel.setSize(447,671);
              logPanel.setLayout(null);
              logFrame.add(logPanel);
              
              logLabel1 = new JLabel();
              logLabel2 = new JLabel();
              logLabel1.setText("Email: ");
              logLabel2.setText("Password: ");
              logLabel1.setBounds(135,110,100,100);
              logLabel2.setBounds(135,180,100,100);
              logLabel1.setFont(f2);
              logLabel2.setFont(f2);
              logLabel1.setForeground(Color.white);
              logLabel2.setForeground(Color.white);
              logPanel.add(logLabel1);
              logPanel.add(logLabel2);
          
            logUser = new JTextField();
            logPass= new JTextField();
            logUser.setBounds(130,180,170,30);
            logPass.setBounds(130,250,170,30);
            logPanel.add(logUser);
            logPanel.add(logPass);

            Userinput = logUser.getText();
            Passinput = logPass.getText();

            confirm2 = new JButton();
            confirm2.setText("LOGIN");
            confirm2.setBounds(160,300,100,30);
            confirm2.setFont(f3);
            confirm2.setForeground(Color.black);
            confirm2.setBackground(Color.white);
            logPanel.add(confirm2);
            confirm2.addActionListener(this);
            
            back = new JPanel();
            back.setBackground(new Color(0,0,0,50));
            back.setBounds(15,100,400,300);
            logPanel.add(back);
            
            logPanel.add(bebe);
            
          }
          
          if(e.getSource() == confirm2){
         
                new Play();
                logFrame.setVisible(false);
                      
                      
          }
  }
  }  
    


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Desktop;

import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Game {

  JFrame window;
  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
  double height = screenSize.getHeight();
  double width = screenSize.getWidth();
  int screenHeight = (int) height;
  int screenWidth = (int) width;
  Container con;
  JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
  JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
  Font titleFont = new Font("Times New Roman", Font.PLAIN, 150);
  Font narratorFont = new Font("Times New Roman", Font.PLAIN, 16);
  Font deathFont = new Font("Times New Roman", Font.PLAIN, 22);
  Font playerFont = new Font("Courier New", Font.PLAIN, 16);
  JButton startButton, choice1, choice2, choice3, choice4, choice5, choice6, choice7, choice8, choice9, choice10, choice11, choice12;
  JTextArea narratorResponse1, narratorResponse2, narratorResponse3, narratorResponse4, narratorResponse5, narratorResponse6, playerResponse1, playerResponse2, playerResponse3, playerResponse4, playerResponse5, playerResponse6, narratorResponseDeath1, narratorResponseDeath2, narratorResponseDeath3, narratorResponseDeath4, narratorResponseDeath5, narratorAfterResponse, playerAfterResponse;
  int playerHP, monsterHP, silverRing;
  String weapon, position;
  TitleScreenHandler tsHandler = new TitleScreenHandler();
  ChoiceHandler choiceHandler = new ChoiceHandler();
  ImageIcon logo = new ImageIcon(".//res//jackfrost.jpg");
  Color tan = new Color(255,255,204);

  public static void main(String[] args) {
    new Game();
  }

  public Game(){
    window = new JFrame();
    window.setSize(screenWidth, screenHeight);
    window.setUndecorated(true);
    window.setVisible(true);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.getContentPane().setBackground(Color.black);
    window.setLayout(null);
    window.setIconImage(logo.getImage());
    con = window.getContentPane();

    titleNamePanel = new JPanel();
    titleNamePanel.setBounds(100, 200, screenWidth - 200, 150);
    titleNamePanel.setBackground(Color.black);
    titleNameLabel = new JLabel("ZORK");
    titleNameLabel.setForeground(Color.white);
    titleNameLabel.setFont(titleFont);

    startButtonPanel = new JPanel();
    startButtonPanel.setBounds(screenWidth / 2 - 200, 500, 400, 200);
    startButtonPanel.setBackground(Color.black);

    startButton = new JButton("START");
    startButton.setBackground(Color.black);
    startButton.setForeground(Color.white);
    startButton.setFont(deathFont);
    startButton.addActionListener(tsHandler);
    startButton.setFocusPainted(false);

    titleNamePanel.add(titleNameLabel);
    startButtonPanel.add(startButton);

    con.add(titleNamePanel);
    con.add(startButtonPanel);

    window.setVisible(true);
  }

    public void createGameScreen(){
    
      titleNamePanel.setVisible(false);
      startButtonPanel.setVisible(false);
    
      mainTextPanel = new JPanel();
      mainTextPanel.setBounds(100, 100, 1100, 600);
      mainTextPanel.setBackground(Color.black);
      con.add(mainTextPanel);
      narratorResponse1 = new JTextArea("");
      narratorResponse1.setBounds(100, 100, 1100, 350);
      narratorResponse1.setBackground(Color.black);
      narratorResponse1.setForeground(Color.white);
      narratorResponse1.setFont(narratorFont);
      narratorResponse1.setLineWrap(true);
      narratorResponse1.setWrapStyleWord(true);
      narratorResponse1.setEditable(false);
    
      narratorResponse2 = new JTextArea("");
      narratorResponse2.setBounds(100, 100, 1100, 350);
      narratorResponse2.setBackground(Color.black);
      narratorResponse2.setForeground(Color.white);
      narratorResponse2.setFont(narratorFont);
      narratorResponse2.setLineWrap(true);
      narratorResponse2.setWrapStyleWord(true);
      narratorResponse2.setEditable(false);
    
      narratorResponse3 = new JTextArea("");
      narratorResponse3.setBounds(100, 100, 1100, 350);
      narratorResponse3.setBackground(Color.black);
      narratorResponse3.setForeground(Color.white);
      narratorResponse3.setFont(narratorFont);
      narratorResponse3.setLineWrap(true);
      narratorResponse3.setWrapStyleWord(true);
      narratorResponse3.setEditable(false);
    
      narratorResponse4 = new JTextArea("");
      narratorResponse4.setBounds(100, 100, 1100, 350);
      narratorResponse4.setBackground(Color.black);
      narratorResponse4.setForeground(Color.white);
      narratorResponse4.setFont(narratorFont);
      narratorResponse4.setLineWrap(true);
      narratorResponse4.setWrapStyleWord(true);
      narratorResponse4.setEditable(false);
    
      narratorResponse5 = new JTextArea("");
      narratorResponse5.setBounds(100, 100, 1100, 350);
      narratorResponse5.setBackground(Color.black);
      narratorResponse5.setForeground(Color.white);
      narratorResponse5.setFont(narratorFont);
      narratorResponse5.setLineWrap(true);
      narratorResponse5.setWrapStyleWord(true);
      narratorResponse5.setEditable(false);
      
      narratorResponse6 = new JTextArea("");
      narratorResponse6.setBounds(100, 100, 1100, 350);
      narratorResponse6.setBackground(Color.black);
      narratorResponse6.setForeground(Color.white);
      narratorResponse6.setFont(narratorFont);
      narratorResponse6.setLineWrap(true);
      narratorResponse6.setWrapStyleWord(true);
      narratorResponse6.setEditable(false);
    
      playerResponse1 = new JTextArea("");
      playerResponse1.setBounds(100, 100, 1100, 350);
      playerResponse1.setBackground(Color.black);
      playerResponse1.setForeground(tan);
      playerResponse1.setFont(playerFont);
      playerResponse1.setLineWrap(true);
      playerResponse1.setWrapStyleWord(true);
      playerResponse1.setEditable(false);
    
      playerResponse2 = new JTextArea("");
      playerResponse2.setBounds(100, 100, 1100, 350);
      playerResponse2.setBackground(Color.black);
      playerResponse2.setForeground(tan);
      playerResponse2.setFont(playerFont);
      playerResponse2.setLineWrap(true);
      playerResponse2.setWrapStyleWord(true);
      playerResponse2.setEditable(false);
    
      playerResponse3 = new JTextArea("");
      playerResponse3.setBounds(100, 100, 1100, 350);
      playerResponse3.setBackground(Color.black);
      playerResponse3.setForeground(tan);
      playerResponse3.setFont(playerFont);
      playerResponse3.setLineWrap(true);
      playerResponse3.setWrapStyleWord(true);
      playerResponse3.setEditable(false);
    
      playerResponse4 = new JTextArea("");
      playerResponse4.setBounds(100, 100, 1100, 350);
      playerResponse4.setBackground(Color.black);
      playerResponse4.setForeground(tan);
      playerResponse4.setFont(playerFont);
      playerResponse4.setLineWrap(true);
      playerResponse4.setWrapStyleWord(true);
      playerResponse4.setEditable(false);
    
      playerResponse5 = new JTextArea("");
      playerResponse5.setBounds(100, 100, 1100, 350);
      playerResponse5.setBackground(Color.black);
      playerResponse5.setForeground(tan);
      playerResponse5.setFont(playerFont);
      playerResponse5.setLineWrap(true);
      playerResponse5.setWrapStyleWord(true);
      playerResponse5.setEditable(false);
      
      playerResponse6 = new JTextArea("");
      playerResponse6.setBounds(100, 100, 1100, 350);
      playerResponse6.setBackground(Color.black);
      playerResponse6.setForeground(tan);
      playerResponse6.setFont(playerFont);
      playerResponse6.setLineWrap(true);
      playerResponse6.setWrapStyleWord(true);
      playerResponse6.setEditable(false);
    
      narratorResponseDeath1 = new JTextArea("");
      narratorResponseDeath1.setBounds(100, 100, 1100, 350);
      narratorResponseDeath1.setBackground(Color.black);
      narratorResponseDeath1.setForeground(Color.white);
      narratorResponseDeath1.setFont(deathFont);
      narratorResponseDeath1.setLineWrap(true);
      narratorResponseDeath1.setWrapStyleWord(true);
      narratorResponseDeath1.setEditable(false);
    
      narratorResponseDeath2 = new JTextArea("");
      narratorResponseDeath2.setBounds(100, 100, 1100, 350);
      narratorResponseDeath2.setBackground(Color.black);
      narratorResponseDeath2.setForeground(Color.white);
      narratorResponseDeath2.setFont(deathFont);
      narratorResponseDeath2.setLineWrap(true);
      narratorResponseDeath2.setWrapStyleWord(true);
      narratorResponseDeath2.setEditable(false);
    
      narratorResponseDeath3 = new JTextArea("");
      narratorResponseDeath3.setBounds(100, 100, 1100, 350);
      narratorResponseDeath3.setBackground(Color.black);
      narratorResponseDeath3.setForeground(Color.white);
      narratorResponseDeath3.setFont(deathFont);
      narratorResponseDeath3.setLineWrap(true);
      narratorResponseDeath3.setWrapStyleWord(true);
      narratorResponseDeath3.setEditable(false);
    
      narratorResponseDeath4 = new JTextArea("");
      narratorResponseDeath4.setBounds(100, 100, 1100, 350);
      narratorResponseDeath4.setBackground(Color.black);
      narratorResponseDeath4.setForeground(Color.white);
      narratorResponseDeath4.setFont(deathFont);
      narratorResponseDeath4.setLineWrap(true);
      narratorResponseDeath4.setWrapStyleWord(true);
      narratorResponseDeath4.setEditable(false);
    
      narratorResponseDeath5 = new JTextArea("");
      narratorResponseDeath5.setBounds(100, 100, 1100, 350);
      narratorResponseDeath5.setBackground(Color.black);
      narratorResponseDeath5.setForeground(Color.white);
      narratorResponseDeath5.setFont(deathFont);
      narratorResponseDeath5.setLineWrap(true);
      narratorResponseDeath5.setWrapStyleWord(true);
      narratorResponseDeath5.setEditable(false);
    
      mainTextPanel.add(narratorResponse1);
      mainTextPanel.add(playerResponse1);
      mainTextPanel.add(narratorResponseDeath1);
      mainTextPanel.add(narratorResponse2);
      mainTextPanel.add(playerResponse2);
      mainTextPanel.add(narratorResponseDeath2);
      mainTextPanel.add(narratorResponse3);
      mainTextPanel.add(playerResponse3);
      mainTextPanel.add(narratorResponseDeath3);
      mainTextPanel.add(narratorResponse4);
      mainTextPanel.add(playerResponse4);
      mainTextPanel.add(narratorResponseDeath4);
      mainTextPanel.add(narratorResponse5);
      mainTextPanel.add(playerResponse5);
      mainTextPanel.add(narratorResponseDeath5);
      mainTextPanel.add(narratorResponse6);
      mainTextPanel.add(playerResponse6);
    
      choiceButtonPanel = new JPanel();
      choiceButtonPanel.setBounds(100, 550, 300, 450);
      choiceButtonPanel.setBackground(Color.black);
      choiceButtonPanel.setLayout(new GridLayout(12,1));
      con.add(choiceButtonPanel);
      choice1 = new JButton("Choice 1");
      choice1.setBackground(Color.black);
      choice1.setForeground(Color.white);
      choice1.setFont(narratorFont);
      choice1.setFocusPainted(false);
      choice1.addActionListener(choiceHandler);
      choice1.setActionCommand("c1");
      choiceButtonPanel.add(choice1);
      choice2 = new JButton("Choice 2");
      choice2.setBackground(Color.black);
      choice2.setForeground(Color.white);
      choice2.setFont(narratorFont);
      choice2.setFocusPainted(false);
      choice2.addActionListener(choiceHandler);
      choice2.setActionCommand("c2");
      choiceButtonPanel.add(choice2);
      choice3 = new JButton("Choice 3");
      choice3.setBackground(Color.black);
      choice3.setForeground(Color.white);
      choice3.setFont(narratorFont);
      choice3.setFocusPainted(false);
      choice3.addActionListener(choiceHandler);
      choice3.setActionCommand("c3");
      choiceButtonPanel.add(choice3);
      choice4 = new JButton("Choice 4");
      choice4.setBackground(Color.black);
      choice4.setForeground(Color.white);
      choice4.setFont(narratorFont);
      choice4.setFocusPainted(false);
      choice4.addActionListener(choiceHandler);
      choice4.setActionCommand("c4");
      choiceButtonPanel.add(choice4);
      choice5 = new JButton("Choice 5");
      choice5.setBackground(Color.black);
      choice5.setForeground(Color.white);
      choice5.setFont(narratorFont);
      choice5.setFocusPainted(false);
      choice5.addActionListener(choiceHandler);
      choice5.setActionCommand("c5");
      choiceButtonPanel.add(choice5);
      choice6 = new JButton("Choice 6");
      choice6.setBackground(Color.black);
      choice6.setForeground(Color.white);
      choice6.setFont(narratorFont);
      choice6.setFocusPainted(false);
      choice6.addActionListener(choiceHandler);
      choice6.setActionCommand("c6");
      choiceButtonPanel.add(choice6);
      choice7 = new JButton("Choice 7");
      choice7.setBackground(Color.black);
      choice7.setForeground(Color.white);
      choice7.setFont(narratorFont);
      choice7.setFocusPainted(false);
      choice7.addActionListener(choiceHandler);
      choice7.setActionCommand("c7");
      choiceButtonPanel.add(choice7);
      choice8 = new JButton("Choice 8");
      choice8.setBackground(Color.black);
      choice8.setForeground(Color.white);
      choice8.setFont(narratorFont);
      choice8.setFocusPainted(false);
      choice8.addActionListener(choiceHandler);
      choice8.setActionCommand("c8");
      choiceButtonPanel.add(choice8);
      choice9 = new JButton("Choice 9");
      choice9.setBackground(Color.black);
      choice9.setForeground(Color.white);
      choice9.setFont(narratorFont);
      choice9.setFocusPainted(false);
      choice9.addActionListener(choiceHandler);
      choice9.setActionCommand("c9");
      choiceButtonPanel.add(choice9);
      choice10 = new JButton("Choice 10");
      choice10.setBackground(Color.black);
      choice10.setForeground(Color.white);
      choice10.setFont(narratorFont);
      choice10.setFocusPainted(false);
      choice10.addActionListener(choiceHandler);
      choice10.setActionCommand("c10");
      choiceButtonPanel.add(choice10);
      choice11 = new JButton("Choice 11");
      choice11.setBackground(Color.black);
      choice11.setForeground(Color.white);
      choice11.setFont(narratorFont);
      choice11.setFocusPainted(false);
      choice11.addActionListener(choiceHandler);
      choice11.setActionCommand("c11");
      choiceButtonPanel.add(choice11);
      choice12 = new JButton("Choice 12");
      choice12.setBackground(Color.black);
      choice12.setForeground(Color.white);
      choice12.setFont(narratorFont);
      choice12.setFocusPainted(false);
      choice12.addActionListener(choiceHandler);
      choice12.setActionCommand("c12");
      choiceButtonPanel.add(choice12);
      
      narratorAfterResponse = new JTextArea("");
      narratorAfterResponse.setBounds(100, 100, 1100, 350);
      narratorAfterResponse.setBackground(Color.black);
      narratorAfterResponse.setForeground(Color.white);
      narratorAfterResponse.setFont(narratorFont);
      narratorAfterResponse.setLineWrap(true);
      narratorAfterResponse.setWrapStyleWord(true);
      narratorAfterResponse.setEditable(false);
      
      playerAfterResponse = new JTextArea("");
      playerAfterResponse.setBounds(100, 100, 1100, 350);
      playerAfterResponse.setBackground(Color.black);
      playerAfterResponse.setForeground(tan);
      playerAfterResponse.setFont(playerFont);
      playerAfterResponse.setLineWrap(true);
      playerAfterResponse.setWrapStyleWord(true);
      playerAfterResponse.setEditable(false);
      
      mainTextPanel.add(playerAfterResponse);
      mainTextPanel.add(narratorAfterResponse);
      
      window.repaint();
      choiceButtonPanel.repaint();
    
    //choice4.setContentAreaFilled(false);  // Disable highlighting on press!!!
    
      playerPanel = new JPanel();
      playerPanel.setBounds(100, 15, 900, 50);
      playerPanel.setBackground(Color.black);
      playerPanel.setLayout(new GridLayout(1,4));
      con.add(playerPanel);
      hpLabel = new JLabel("HP:");
      hpLabel.setFont(narratorFont);
      hpLabel.setForeground(Color.white);
      playerPanel.add(hpLabel);
      hpLabelNumber = new JLabel();
      hpLabelNumber.setFont(narratorFont);
      hpLabelNumber.setForeground(Color.white);
      playerPanel.add(hpLabelNumber);
      weaponLabel = new JLabel("Weapon:");
      weaponLabel.setFont(narratorFont);
      weaponLabel.setForeground(Color.white);
      weaponLabel.setBackground(Color.red);
      playerPanel.add(weaponLabel);
      weaponLabelName = new JLabel();
      weaponLabelName.setFont(narratorFont);
      weaponLabelName.setForeground(Color.white);
      playerPanel.add(weaponLabelName);

      playerSetup();
    
    }

    public void playerSetup(){
        playerHP = 15;
        monsterHP = 20;
        weapon = "Knife";
        weaponLabelName.setText(weapon);
        hpLabelNumber.setText("" + playerHP);
        nondescriptRoom();
    }

    public void x() {
      nondescriptRoom();
    }
    public void quit() {
      System.exit(0);
    }
    public void githubLink() {
      System.exit(0);
    }
    
    public void zorkDied() {
      narratorResponseDeath5.setVisible(true);
      narratorResponse6.setVisible(true);
      choice3.setVisible(true);
      narratorResponseDeath5.setText("\n*** You have died ***\n");
      narratorResponse6.setText("Would you like to start over, restore a saved position, or end this session of Zork? (type RESTART, RESTORE, or QUIT):");
      choice1.setText("restart");
      choice2.setText("restore");
      choice3.setText("quit");  
    }
    public void zorkDiedShining() {
      narratorResponseDeath5.setVisible(true);
      narratorResponse6.setVisible(true);
      choice3.setVisible(true);
      narratorResponseDeath5.setText("\n*** All work and no play makes Jack a dull boy ***\n");
      narratorResponse6.setText("All work and no play makes Jack a dull boy? (All work and no play makes Jack a dull boy):");
      choice1.setText("All work and no play makes Jack a dull boy");
      choice2.setText("All work and no play makes Jack a dull boy");
      choice3.setText("All work and no play makes Jack a dull boy");
    }
    public void zorkDiedShining2() {
      narratorResponseDeath5.setVisible(true);
      narratorResponse6.setVisible(true);
      choice3.setVisible(true);
      narratorResponseDeath5.setText("\n*** All work and no play makes Jack a dull boy ***\n");
      narratorResponse6.setText("Does all work and no play make Jack a dull boy? (type RESTART, RESTORE, or QUIT):");
      choice1.setText("restart");
      choice2.setText("restore");
      choice3.setText("quit");
    }
    public void zorkDiedSheep() {
      narratorResponseDeath5.setVisible(true);
      narratorResponse6.setVisible(true);
      choice3.setVisible(true);
      narratorResponseDeath5.setText("\n*** You shagged the sheep, and are expelled from Zork ***\n");
      narratorResponse6.setText("Would you like to log in to your account so you can vandalise some more, use your brother's computer, or turn off your computer? (type ACCOUNT, BROTHER, or SHUTDOWN):");
      choice1.setText("ACCOUNT");
      choice2.setText("BROTHER");
      choice3.setText("SHUTDOWN"); 
    }
    public void zorkDiedWario() {   
      narratorResponseDeath5.setVisible(true);
      narratorResponse6.setVisible(true);
      choice3.setVisible(true);
      narratorResponseDeath5.setText("\n*** “So ein mist!”\n~ Wario ***\n");
      narratorResponse6.setText("Would you like to go back to the start, try again with 10 coins, or end this session of Mario Party? (type RESTART, RESTORE, or QUIT):");
      choice1.setText("restart");
      choice2.setText("restore");
      choice3.setText("quit");
    }
    public void zorkDiedNarrator() {   
      narratorResponseDeath5.setVisible(true);
      narratorResponse6.setVisible(true);
      choice3.setVisible(true);
      narratorResponseDeath5.setText("\n*** You pissed off the narrator. ***\n");
      narratorResponse6.setText("Would you like to start over, restore a saved position, or end this session of Zork? (Type RESTART, RESTORE, or QUIT):");
      choice1.setText("restart");
      choice2.setText("restore");
      choice3.setText("quit");
    }
    public void zorkDiedHosed() {   
      narratorResponseDeath5.setVisible(true);
      narratorResponse6.setVisible(true);
      choice3.setVisible(true);
      narratorResponseDeath5.setText("\n*** You got hosed ***\n");
      narratorResponse6.setText("Would you like to towel down, restore a change of clothes, or end this water fight? (type RESTART, RESTORE, or QUIT):");
      choice1.setText("restart");
      choice2.setText("restore");
      choice3.setText("quit");
    }
    public void zorkDiedGrued() {
      narratorResponseDeath5.setVisible(true);
      narratorResponse6.setVisible(true);
      choice3.setVisible(true);
      narratorResponseDeath5.setText("\n*** You have been grue'd ***\n");
      narratorResponse6.setText("Would you like to start over like an honest person, restore a saved position like a cheater, or give up on this session of Zork like the n00b that you really are? (type HONEST, CHEATER, or N00B):");
      choice1.setText("HONEST");
      choice2.setText("CHEATER");
      choice3.setText("N00B");
    }
    public void zorkDiedSuck() {
      narratorResponseDeath5.setVisible(true);
      narratorResponse6.setVisible(true);
      choice3.setVisible(true);
      narratorResponseDeath5.setText("\n*** You suck ***\n");
      narratorResponse6.setText("Would you like to not suck, cheat by loading someone else's save, or give up out of frustration? (type NOT SUCK, CHEAT, or GIVE UP):");
      choice1.setText("not suck");
      choice2.setText("cheat");
      choice3.setText("give up");
    }
    
    
    public void setAnubisScene() {   
      narratorResponse5.setVisible(true);
      playerResponse5.setVisible(true);
      narratorResponse6.setVisible(true);
      choice3.setVisible(true);
      narratorResponse5.setText("\n\n\n\nSUDDENLY! You are on a cloud in deep space, and there is a man standing in front of you.\n");
      playerResponse5.setText("> examine man");
      narratorResponse6.setText("He appears to be Anubis, the God of Death.\n\nWhat would you like to do?");
      choice1.setText("give him a piece of gum");
      choice2.setText("ask him to bring you back to life");
      choice3.setText("restore");
    }
    public void grue() {
      narratorResponse1.setVisible(true);
      narratorResponse1.setText("Man, you've never played this game before, have you? The Grue devours you before you have a chance to scream.");
      zorkDiedShining2();
    }
    public void grueDeathButDreaming() {
      narratorResponse1.setVisible(true);
      choice3.setVisible(true);
      choice4.setVisible(true);
      choice5.setVisible(true);
      narratorResponse1.setText("Standing still is not really a viable option when a ravenous Grue is attacking you. The Grue devours you before you have a chance to scream. Yet your demise will not be swift enough to feel them feed. Their teeth like acid fire in your flesh. Their tongues lapping at your vital fluids.\n\n...\nBut wait!\nSuddenly, you wake up!\nYou sigh with relief. \"Phew, it was all just a dream!\"\nYou're back in the nondescript room. Now to start your adventure for real.");
      choice1.setText("go north");
      choice2.setText("go south");
      choice3.setText("go east");
      choice4.setText("go west");
      choice5.setText("restore");
    }
    
    public void saveSelect() {
      position = "restore";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      choice3.setVisible(true);
      choice4.setVisible(true);
      choice6.setVisible(true);
      playerResponse1.setText("> restore");
      narratorResponse2.setText("There are four save files.");
      choice1.setText("The Super Ultimate Final Conclusive Showdown Battle of The End - 451 turn(s)");
      choice2.setText("Nondescript Room - 1 turn(s)");
      choice3.setText("No data");
      choice4.setText("Grue Room - ??? turn(s)");
      choice6.setText("quit");
    }
    
    public void resetScene() {
      narratorResponse1.setVisible(false);
      narratorResponse2.setVisible(false);
      narratorResponse3.setVisible(false);
      narratorResponse4.setVisible(false);
      narratorResponse5.setVisible(false);
      narratorResponse6.setVisible(false);
      playerResponse1.setVisible(false);
      playerResponse2.setVisible(false);
      playerResponse3.setVisible(false);
      playerResponse4.setVisible(false);
      playerResponse5.setVisible(false);
      playerResponse6.setVisible(false);
      narratorResponseDeath1.setVisible(false);
      narratorResponseDeath2.setVisible(false);
      narratorResponseDeath3.setVisible(false);
      narratorResponseDeath4.setVisible(false);
      narratorResponseDeath5.setVisible(false);
      choice1.setVisible(true);
      choice2.setVisible(true);
      choice3.setVisible(false);
      choice4.setVisible(false);
      choice5.setVisible(false);
      choice6.setVisible(false);
      choice7.setVisible(false);
      choice8.setVisible(false);
      choice9.setVisible(false);
      choice10.setVisible(false);
      choice11.setVisible(false);
      choice12.setVisible(false);
      narratorAfterResponse.setVisible(false);
      playerAfterResponse.setVisible(false);
    }

    public void nondescriptRoom(){
      position = "nondescriptRoom";
      resetScene();
      narratorResponse1.setVisible(true);
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse2.setVisible(true);
      narratorResponse3.setVisible(true);
      playerResponse3.setVisible(true);
      narratorResponse4.setVisible(true);
      choice3.setVisible(true);
      choice4.setVisible(true);
      choice5.setVisible(true);
      choice6.setVisible(true);
      choice7.setVisible(true);
      choice8.setVisible(true);
      choice9.setVisible(true);
      choice10.setVisible(true);
      choice11.setVisible(true);
      choice12.setVisible(true);
      narratorResponse1.setText("ZORK I: The Great Underground Empire\nCopyright © June 22, 1979, 2005, 2006, 200X Unfocom, Inc. All rights reserved.\nRevision 69105 / Serial Number 47\n\nThere is a leaflet on the floor.\n");
      playerResponse1.setText("> take leaflet");
      narratorResponse2.setText("Stolen.\n");
      playerResponse2.setText("> read leaflet");
      narratorResponse3.setText("Welcome to the Zork page. In this space you will experience some of the most thrilling text action ever devised. It is a game of high skills and low cunning. In this adventure you will find some of the most dangerous creatures you've ever seen like e-\nEurg!! The rest of the leaflet has been torn.\n");
      playerResponse3.setText("> look");
      narratorResponse4.setText("You are in a nondescript room of nondescript size. Exits are to the north, south, and west. Oh, and there's a Grue over there in the corner.\nThere is half a leaflet next to the Grue.");
      choice1.setText("North");
      choice2.setText("South (WIP)");
      choice3.setText("East");
      choice4.setText("West (WIP)");
      choice5.setText("inventory");
      choice6.setText("Take rest of leaflet");
      choice7.setText("talk to grue");
      choice8.setText("look at an advertisement");
      choice9.setText("eat grue");
      choice10.setText("stay");
      choice11.setText("pwn grue lol");
      choice12.setText("What is a Grue?");
    }
    public void kitchen(){
      position = "kitchen";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      choice3.setVisible(true);
      choice4.setVisible(true);
      choice5.setVisible(true);
      choice6.setVisible(true);
      choice7.setVisible(true);
      choice8.setVisible(true);
      playerResponse1.setText("> go north");
      narratorResponse2.setText("You are in the kitchen. There are cupboards and a door that leads to the yard outside. On the counter is a butcher knife. Next to the knife is a small, light blue tea cup. You also notice a large, black stove in the corner, that is probably used for cooking stuff. You notice a can on the stove.\n\nYou wonder what a butcher knife, designed exclusively for the slicing and hacking of flesh, is doing in a kitchen which is noticably absent of any meat storage or preparation facilities. In fact, you notice that the knife is awfully shiny for a kitchen utensil. It looks as if it's never been used. It's unstained. Untainted. Pure. Righteous.");
      choice1.setText("get knife");
      choice2.setText("examine cupboards");
      choice3.setText("go south");
      choice4.setText("go north");
      choice5.setText("leave house");
      choice6.setText("get teacup");
      choice7.setText("go to town");
      choice8.setText("examine stove");
    }
    public void kitchenKnife() {
      position = "kitchenKnife";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse2.setVisible(true);
      narratorResponse3.setVisible(true);
      choice3.setVisible(true);
      choice4.setVisible(true);
      choice5.setVisible(true);
      playerResponse1.setText("> get knife");
      narratorResponse2.setText("You quickly grab the knife and stick it in your pants. You suddenly feel a strong sense of justice. Soon your knife's pure, shining blade will bite the flesh of the sinners.\n");
      playerResponse2.setText("> inv");
      narratorResponse3.setText("You've got some clothes on, a stick of gum in your pocket, and a knife sticking into your leg. Ah. You suddenly feel a strong sense of mind-bending irony, as well as mind-bending agony.");
      choice1.setText("examine gum");
      choice2.setText("remove knife");
      choice3.setText("go south");
      choice4.setText("leave house");
      choice5.setText("stab grue");
    }
    public void kitchenKnifeGum() {
      position = "kitchenKnifeGum";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      choice3.setVisible(true);
      playerResponse1.setText("> examine gum");
      narratorResponse2.setText("Yep, that sure is gum alright. You can make out some mystical runes on the side of it... no, no, it just says Juicy Fruit.");
      choice1.setText("remove knife");
      choice2.setText("go south");
      choice3.setText("leave house");
    }
    public void kitchenKnifeRemoved() {
      position = "kitchenKnifeRemoved";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      choice3.setVisible(true);
      choice4.setVisible(true);
      choice5.setVisible(true);
      choice6.setVisible(true);
      playerResponse1.setText("> remove knife");
      narratorResponse2.setText("Good call. The sensations of pain in your leg begin to recede. You're still bleeding, though.");
      choice1.setText("get knife");
      choice2.setText("examine cupboards");
      choice3.setText("chew gum");
      choice4.setText("leave house");
      choice5.setText("go south");
      choice6.setText("go to town");
    }
    public void kitchenKnifeRestabbed() {
      position = "kitchenKnifeRestabbed";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse2.setVisible(true);
      narratorResponse3.setVisible(true);
      playerResponse3.setVisible(true);
      narratorResponse4.setVisible(true);
      playerResponse4.setVisible(true);
      narratorResponse5.setVisible(true);
      choice4.setVisible(true);
      playerResponse1.setText("> take knife");
      narratorResponse2.setText("What the hell? You take out the knife and then decide to put it back in? You like having a knife in your leg or something?\n");
      playerResponse2.setText("> uh, yes?");
      narratorResponse3.setText("Then why the hell did you remove the knife?\n");
      playerResponse3.setText("> I dunno...");
      narratorResponse4.setText("You know what I know? How to do the zorkDied banner!\n");
      playerResponse4.setText("> but I didn't die!");
      narratorResponse5.setText("You examine the knife. Turns out it's actually a Grue made of stainless steel. Of course, you know what happens next, right?");
      zorkDiedShining();
      choice4.setText("That's a little bit unfair for a guy who just wanted to insert the knife in a different, painless spot, amirite?");
    }
    public void kitchenCupboards(){
      position = "kitchenCupboards";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse1.setText("> examine cupboards");
      narratorResponse2.setText("To your surprise, you find that the smell of mouse droppings no longer whets your appetite.");
      choice1.setText("leave house");
      choice2.setText("go south");
    }
    
    
    public void yardBleeding(){
      position = "yardBleeding";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      choice3.setVisible(true);
      playerResponse1.setText("> leave house");
      narratorResponse2.setText("You're standing on a grassy lawn. Looks well-kept.\nDirectly in front of you is a nice-looking forest. You can also hear a faint rushing sound to your left.\nYour bleeding seems to be slowing down a bit.\n");
      playerResponse1.setText("> inv");
      narratorResponse2.setText("You have clothes, a stick of gum, and a knife coated in your bodily fluids. By which I mean blood. I know what you were thinking, sicko.");
      choice1.setText("enter forest");
      choice2.setText("go left");
      choice3.setText("examine house");
    }
    public void forestBleeding(){
      position = "forestBleeding";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse1.setText("> enter forest");
      narratorResponse2.setText("Well, it's a forest. There's trees, dirt, and that's it. Nothing here. Really.\nWhat, did you expect to find magical treasure, or a Dust Goblin to slay? Well, screw you.\nWell, what do you do?");
      choice1.setText("go deeper into forest");
      choice2.setText("exit forest");
    }
    
    public void riverbankBleeding(){
      position = "riverbankBleeding";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      choice3.setVisible(true);
      playerResponse1.setText("> go left");
      narratorResponse2.setText("There's a swiftly-running river here. Crossing is not recommended, judging by the size and sharpness of those rocks...\nTo your right is a well-kept yard.\nThere is also a shallow cave. The sun illuminates the back of it, so you're in no danger of being eaten by a Grue if you go inside.");
      choice1.setText("Cross river");
      choice2.setText("Enter cave");
      choice3.setText("Go right");
    }
    public void riverBleeding() {
      position = "riverBleeding";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse2.setVisible(true);
      narratorResponse3.setVisible(true);
      playerResponse3.setVisible(true);
      narratorResponse4.setVisible(true);
      playerResponse4.setVisible(true);
      narratorResponse5.setVisible(true);
      playerResponse5.setVisible(true);
      narratorResponse6.setVisible(true);
      choice3.setVisible(true);
      choice4.setVisible(true);
      choice5.setVisible(true);
      playerResponse1.setText("> cross river");
      narratorResponse2.setText("What luck! Despite the rushing water and razor-edged rocks, you made it across!\n");
      playerResponse2.setText("> look");
      narratorResponse3.setText("You are in a picnic area. There is a picnic basket here, smelling of hot peppers. There is also a glass bottle containing water.\nThere is a well worn path heading northwest, down a hill, to a beach. In the distance to the northwest, you see a yacht.\n");
      playerResponse3.setText("> open basket");
      narratorResponse4.setText("Opening the basket reveals a lunch.");
      playerResponse4.setText("> inv");
      narratorResponse5.setText("Uhhh...you have nothing except a knife wound. All your possessions were lost in the river.");
      playerResponse5.setText("> Including my clothes?");
      narratorResponse6.setText("Good point...in that case, your clothes just washed up on shore.");
      playerResponse5.setText("> take and wear clothes");
      choice1.setText("Eat lunch");
      choice2.setText("Drink water");
      choice3.setText("Take water");
      choice4.setText("Go northwest");
      choice5.setText("Go back across the river");
    }
    
    
    public void eatLunchDeath() {
      position = "eatLunchDeath";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse2.setVisible(true);
      narratorResponse3.setVisible(true);
      playerResponse1.setText("> Eat the lunch");
      narratorResponse2.setText("At last! Sweet, tasty revenge for that time you got eaten by the lunch after eating the grue! The lunch is helplessly inanimate as you devour it.\nAs you shake the crumbs off yourself, you suddenly notice a long, meal-shaped shadow spreading over you. Could it be that the lunch you just ate had a bigger brother or sister?\n");
      playerResponse2.setText("> turn around");
      narratorResponse3.setText("Too late - you are eaten by a banquet.");
      zorkDiedShining();
    }
    public void drinkWaterDeath() {
      position = "drinkWaterDeath";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse1.setText("> Drink water");
      narratorResponse2.setText("You are eaten by a Water Grue.");
      zorkDied();
    }
    public void takeWater() {
      position = "takeWater";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse1.setText("> take water");
      narratorResponse2.setText("Which water do you mean?");
      choice1.setText("the bottle of water");
      choice2.setText("the water in the river");
    }
    public void takeBottleWater() {
      position = "takeBottleWater";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse2.setVisible(true);
      narratorResponse3.setVisible(true);
      choice3.setVisible(true);
      choice4.setVisible(true);
      playerResponse1.setText("> take water");
      narratorResponse2.setText("Which water do you mean?\n");
      playerResponse2.setText("> the bottle of water");
      narratorResponse3.setText("Taken.\n(what? You were expecting a funny response to such a boring command?)");
      choice1.setText("Eat lunch");
      choice2.setText("Take lunch");
      choice3.setText("Go northwest");
      choice4.setText("Go back across the river");
    }
    public void takeRiverWater() {
      position = "takeRiverWater";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse2.setVisible(true);
      narratorResponse3.setVisible(true);
      choice3.setVisible(true);
      choice4.setVisible(true);
      playerResponse1.setText("> take water");
      narratorResponse2.setText("Which water do you mean?\n");
      playerResponse2.setText("> the water in the river");
      narratorResponse3.setText("You take the bottle, pour out the water that's already in it, and fill it with water from the river. Why didn't you just stick with the water that was already there? At least that was nice, clean, healthy water. Not stuff from the river that fish have been peeing in. I mean, who wants to drink that? Oh, never mind...");
      choice1.setText("Eat lunch");
      choice2.setText("Take lunch");
      choice3.setText("Go northwest");
      choice4.setText("Go back across the river");
    }
    public void takeLunch() {
      position = "takeLunch";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse2.setVisible(true);
      narratorResponse3.setVisible(true);
      playerResponse3.setVisible(true);
      narratorResponse4.setVisible(true);
      playerResponse1.setText("> take lunch");
      narratorResponse2.setText("I wouldn't do that if I were you.\n");
      playerResponse2.setText("> take lunch");
      narratorResponse3.setText("Fine, you get the lunch.\n");
      playerResponse3.setText("> inv");
      narratorResponse4.setText("I'm just going to pretend you didn't just do that. Anyways, the little girl whose lunch you just took has returned and notices the conspicuous buldge in your pants from where you stuffed the lunch basket. She calls her daddy over and he fucks you up, son.");
      zorkDiedSheep();
    }
    public void northwestToBoatBleeding() {
      position = "northwestToBoatBleeding";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse2.setVisible(true);
      narratorResponse3.setVisible(true);
      playerResponse3.setVisible(true);
      narratorResponse4.setVisible(true);
      choice3.setVisible(true);
      playerResponse1.setText("> go northwest");
      narratorResponse2.setText("You are at a wharf. There is a giant cruise ship anchored in front of you.\nThe paintwork on the side of the giant cruise ship reveals it to be the HMS GRUE.\nAnother path heads east into a rest area.The scabbard to ye sword is here.\n");
      playerResponse2.setText("> examine ye scabbard...");
      narratorResponse3.setText("Yep, that's for ye sword. Yanno, the one in the house.\n");
      playerResponse3.setText("> take scabbard");
      narratorResponse4.setText("Nope, you can't have ye scabbard, either.\n");
      playerResponse4.setText("> you're a big meanie.");
      narratorResponse5.setText("So I've been told. Anyway, isn't it lunchtime about now?");
      choice1.setText("Eat lunch");
      choice2.setText("Back to the picnic area");
      choice3.setText("Board HMS GRUE");
    }
    public void hmsGrueBleeding() {
      position = "hmsGrueBleeding";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      choice3.setVisible(true);
      choice4.setVisible(true);
      playerResponse1.setText("> Board HMS GRUE");
      narratorResponse2.setText("You are on board the HMS GRUE.\nUnfortunately, your knife wound still hasn't healed, and there's a hairy, rectangular passenger lurking in the shadows, and the scent of blood is making him awfully ravenous...");
      choice1.setText("examine hairy, rectangular passenger");
      choice2.setText("talk to grue");
      choice3.setText("stand still");
      choice4.setText("run away");
    }
    public void grueRun() {
      position = "grueRun";
      resetScene();
      narratorResponse1.setVisible(true);
      narratorResponse1.setText("In addition to their fearsome natural armament and aggressive disposition, Grues are blessed with the gift of alacrity. The Grue devours you before you have a chance to scream.");
      zorkDied();
    }
    
    
    
    public void riverDeath() {
      position = "riverDeath";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse1.setText("> cross river");
      narratorResponse2.setText("Uh...you do realise you can only get so lucky so often, right?\nYou are caught in the undertow and drown.");
      setAnubisScene();
    }
    public void caveBleeding() {
      position = "caveBleeding";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse2.setVisible(true);
      narratorResponse3.setVisible(true);
      playerResponse3.setVisible(true);
      narratorResponse4.setVisible(true);
      playerResponse1.setText("> enter cave");
      narratorResponse2.setText("");
      playerResponse2.setText("> get batteries");
      narratorResponse3.setText("");
      playerResponse3.setText("> inv");
      narratorResponse4.setText("");
      choice1.setText("leave cave");
      choice2.setText("use batteries");
    }        
    
    public void examineHouseBleeding(){
      position = "examineHouseBleeding";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      choice3.setVisible(true);
      playerResponse1.setText("> examine house");
      narratorResponse2.setText("It appears to be a late-model Victorian home, common among many suburbs. What it's doing in the middle of a forest, you have no idea.\nThere is a door here, which appears to lead into the kitchen. It's unlocked.");
      choice1.setText("enter house");
      choice2.setText("enter forest");
      choice3.setText("go left");
    }    
    public void kitchenCupboards2(){
      position = "kitchenCupboards2";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse1.setText("> examine cupboards");
      narratorResponse2.setText("No luck; like Old Mother Hubbard, these cupboards are bare. (Eeew.)\n\nYou begin to feel like renting a movie.");
      choice1.setText("Rent a movie");
      choice2.setText("go back");
    }
    public void movie(){
      position = "movie";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      narratorResponseDeath2.setVisible(true);
      narratorResponse3.setVisible(true);
      choice3.setVisible(true);
      playerResponse1.setText("> go to the movie store");
      narratorResponse2.setText("You go to the movie store. There are no Grues here. You pick out a movie called 'Gone with the Wind'. You go up to the counter to rent it. You feel safe.\n\nUnfortunately, the man behind the counter is a Grue, which grabs the movie out of your hands and whacks you on the head with it. You died. The Grue eats you with white wine sauce and truffles.\n");
      narratorResponseDeath2.setText("\n*** Gone with the Grue ***\n");
      narratorResponse3.setText("Would you like to get Rhett, restore a fellow comrade, or say that you don't give a damn? (Type RHETT, COMRADE, or DAMN):");
      choice1.setText("restart");
      choice2.setText("restore");
      choice3.setText("quit");
    }
    public void kitchenNorth() {
      position = "kitchenNorth";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse1.setText("> go north");
      narratorResponse2.setText("You go north and fall off a cliff, in the distance you can heard a man asking you to throw him your goodies. But, you die to soon to do so.");
      zorkDiedSuck();
    }
    public void yard() {
      position = "yard";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      choice3.setVisible(true);
      choice4.setVisible(true);
      choice5.setVisible(true);
      choice6.setVisible(true);
      choice7.setVisible(true);
      playerResponse1.setText("> leave house");
      narratorResponse2.setText("You're standing on a grassy lawn. Looks well-kept.\n\nDirectly around you is nothing but nice-looking forest. You can also hear a faint rushing sound to your left.");
      choice1.setText("enter forest");
      choice2.setText("go left");
      choice3.setText("go east");
      choice4.setText("examine house");
      choice5.setText("marvel at the author's choice of adjectives");
      choice6.setText("go southwest");
      choice7.setText("go to kitchen through window");
    }
    public void kitchenTeacup() {
      position = "kitchenTeacup";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse1.setText("> get teacup");
      narratorResponse2.setText("You reach for the light blue teacup, but are startled by a small spider sitting on the handle. You drop the teacup to the floor and it shatters into many pieces. The spider crawls away, mad that he was disturbed from his resting place.\n\nThe sound attracted the grue, who dances on your skull until your head is flat.");
      zorkDiedHosed();
    }
    public void town() {
      position = "town";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse2.setVisible(true);
      narratorResponse3.setVisible(true);
      playerResponse3.setVisible(true);
      narratorResponse4.setVisible(true);
      playerResponse4.setVisible(true);
      narratorResponse5.setVisible(true);
      choice3.setVisible(true);
      playerResponse1.setText("> Go to town");
      narratorResponse2.setText("You go to the imaginary town of Zabalabanazaz. However, since you have an awful imagination, zabalabanazaz lacks townspeople, shops, and robots to do manual labor. All you can see here is a lot of empty houses and an alleyway to the east. Suddenly, an imaginary robber runs up to you and stabs you in the leg.");
      playerResponse2.setText("> Attack Robber");
      narratorResponse3.setText("You punch the robber square in the jaw, knocking him unconscious. Nice shot! You notice his fancy-looking butcher knife on the ground.\n");
      playerResponse3.setText("> Examine knife");
      narratorResponse4.setText("It looks like the same knife from the kitchen in the house. It has, strangely, no blood on it. It's untainted. Pure. Righteous.\n");
      playerResponse4.setText("> Take knife");
      narratorResponse5.setText("You take the knife and put it in your pocket.");
      choice1.setText("Go back");
      choice2.setText("Go east");
      choice3.setText("Go into nearby store");
    }
    public void kitchenStove() {
      position = "kitchenStove";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse2.setVisible(true);
      narratorResponse3.setVisible(true);
      playerResponse3.setVisible(true);
      narratorResponse4.setVisible(true);
      playerResponse4.setVisible(true);
      narratorResponse5.setVisible(true);
      playerResponse1.setText("> examine stove");
      narratorResponse2.setText("You walk over to the stove and examine it. It is a wood fired cooking stove, and it apears to be made of metal. There is a tin can that reads \"Pinnacle Peaches\" on the stove. There is a small door, probably for building a fire.\n");
      playerResponse2.setText("> Open Stove Door");
      narratorResponse3.setText("You open the door and get metal splinters in your hand.\n");
      playerResponse3.setText("> Cuss at hand");
      narratorResponse4.setText("You loudly swear at your hand for being so foolish and getting hurt by metal. Your hand, ashamed at itself goes and huffs a kitten.\n");
      playerResponse4.setText("> Examine Opening");
      narratorResponse5.setText("You examine the inside of the stove and see the following:\n   -2 KG of Charcoal\nThere also apears to be a fire, ready to be lit.");
      choice1.setText("Light a Fire");
      choice2.setText("Take Charcoal");
    }
    // TODO: Incomplete Sequence
    public void nondescriptRoomBloody() {
      position = "nondescriptRoomBloody";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      choice3.setVisible(true);
      choice4.setVisible(true);
      choice5.setVisible(true);
      choice6.setVisible(true);
      playerResponse1.setText("> go south");
      narratorResponse2.setText("Okie dokie. You limp back into the Grue room, dripping blood. Come to think of it, the blood seems to be making the Grue awfully ravenous...");
      choice1.setText("attack grue with knife");
      choice2.setText("talk to grue");
      choice3.setText("eat grue");
      choice4.setText("stand still");
      choice5.setText("run away");
      choice6.setText("commit Gruicide");
    }
    public void grueTalk() {
      position = "grueTalk";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse1.setText("> talk to grue");
      narratorResponse2.setText("\nYou start to say hello and the Grue interupts to comment on the blood coming from your jeans and suggests you use club soda to get it out. The Grue devours you before you have a chance to follow up on his advice.");
      zorkDiedWario();
    }
    public void eatGrue() {
      position = "eatGrue";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      narratorResponseDeath2.setVisible(true);
      playerResponse1.setText("> eat grue");
      narratorResponse2.setText("\nYou succeed in eating the Grue! Amazing!\nMoments later, however, you are eaten by [REDACTED].");
      zorkDiedSheep();
    }
    public void knifeGrue(){
      position = "knifeGrue";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      choice4.setVisible(true);
      playerResponse2.setVisible(true);
      narratorResponse3.setVisible(true);
      playerResponse1.setText("> attack grue");
      narratorResponse2.setText("How the hell did you get this far without a brain? The grue devours you before you have a chance to scream.\n\nMaybe next time you'll bring something better than a knife.\n\nLike a tank.");
      playerResponse2.setText("> i hate you in every way possible");
      narratorResponse3.setText("Oh yeah, you could've also tried using that chess set behind you. Sorry I didn't mention about it earlier.");
      zorkDiedShining();
      choice4.setText("Come back to life and follow the narrator's advice");
      }
    public void tankHell(){
      position = "tankHell";
      resetScene();
      narratorResponse1.setVisible(true);
      narratorResponse1.setText("You escaped Hell successfully!\n\nYou go to a nearby tank store, buy a tank, and drive the tank to the nondescript room. The Grue stands there. You shoot the Grue with a pepper from your barrel.\n\nUnfortunately, the pepper explodes. The tremor makes the lightbulb fall on your head and electrify you. The Grue, whom you missed with the shot, chops off your head and adds it to his trophy collection. Oh yeah, it also took your pepper. Tough luck, bitch.");
      narratorResponseDeath1.setText("\n*** All work and no play makes Jack a dull boy ***\n");
      
    }
    public void nondescriptRoomGrueHungry() {
      position = "nondescriptRoomGrueHungry";
      resetScene();
      narratorResponse2.setVisible(true);
      choice3.setVisible(true);
      choice4.setVisible(true);
      narratorResponse2.setText("Well, the Grue is still here. It looks hungrier by the second. Best be out of here before it gets any ideas.");
      choice1.setText("go north");
      choice2.setText("go south");
      choice3.setText("go west");
      choice4.setText("go east");
    }
    public void foyer(){
      position = "foyer";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse2.setVisible(true);
      narratorResponse3.setVisible(true);
      choice3.setVisible(true);
      choice4.setVisible(true);
      choice5.setVisible(true);
      choice6.setVisible(true);
      choice7.setVisible(true);
      playerResponse1.setText("> go south");
      narratorResponse2.setText("You are in the foyer of what appears to be a fairly decent home. There's an open living room off to your left and a flight of stairs to your right, leading up. There is also a large, imposing door directly in front of you.\n\nOn hooks above the mantlepiece hangs an elven sword of great antiquity.\n");
      playerResponse2.setText("> examine door");
      narratorResponse3.setText("The door is locked, bolted, and hermitically sealed. Plus, I heard it said something nasty about your mom. You're not gettin' through there.");
      choice1.setText("go left");
      choice2.setText("climb stairs");
      choice3.setText("lift a rug");
      choice4.setText("go back");
      choice5.setText("get sword");
      choice6.setText("attempt to pronounce 'xyzzy'");
      choice7.setText("avoid grue");
    }
    public void foyerYeSwordLook() {
      position = "foyerYeSwordLook";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      choice3.setVisible(true);
      playerResponse1.setText("> take sword");
      narratorResponse2.setText("You can't take ye sword!");
      choice1.setText("say F-word");
      choice2.setText("lift the pointy-eared buggers' sword off the hooks with my hands - pretty please?");
      choice3.setText("look");
    }
    public void foyerYeSwordCurse() {
      position = "foyerYeSwordCurse";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse1.setText("> say F-word");
      narratorResponse2.setText("Real adventurers do not use such language.\n\nSince you are not a real adventurer, given the way you've putzed about thus far, you have no business being here.");
      zorkDiedNarrator();
    }
    public void foyerYeSwordBeg() {
      position = "foyerYeSwordBeg";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      choice2.setVisible(false);
      playerResponse1.setText("> lift the pointy-eared buggers' sword off the hooks with my hands - pretty please?");
      narratorResponse2.setText("Look, buddy. When I said \"You can't get ye sword!\" I meant that you cannot get the sword. It is not possible for you to get the sword. Getting the sword is not an option. It is unachievable (Who do you think you are!? The Hero of Time?!). It is a tautology that you cannot get the sword. No matter how much you try to get the sword, it will not ever succeed. So stop asking me.\n\n\nOh, you mean you want the reason why you can't get the sword? Well, ye sword 'tis hung so far up ye wall that thou shalt not graspeth ye sword even if thou dost standeth on thine tippy-toes. SO THERE.");
      choice1.setText("look");
    }
    public void houseEast(){
      position = "houseEast";
      resetScene();
      narratorResponse1.setVisible(true);
      narratorResponseDeath1.setVisible(true);
      narratorResponse2.setVisible(true);
      choice3.setVisible(true);
      narratorResponse1.setText("You smack your head into the wall. You wake up to find yourself being eaten by the Grue. Your last conscious thought is the determination to pay attention to your surroundings more.");
      narratorResponseDeath1.setText("\n*** You fail at Zork ***\n");
      narratorResponse2.setText("Would you like to not fail, restore The Super Ultimate Final Conclusive Showdown Battle To The End save file, or end your failing session of Zork? (TYPE RESTART, RESTORE OR QUIT):");
      choice1.setText("restart");
      choice2.setText("restore");
      choice3.setText("quit");
      choice3.setVisible(true);
    }
    public void houseWest(){
      position = "houseWest";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse2.setVisible(true);
      narratorResponse3.setVisible(true);
      playerResponse3.setVisible(true);
      narratorResponse4.setVisible(true);
      playerResponse4.setVisible(true);
      narratorResponse5.setVisible(true);
      playerResponse5.setVisible(true);
      narratorResponse6.setVisible(true);
      playerResponse6.setVisible(true);
      choice3.setVisible(true);
      choice4.setVisible(true);
      choice5.setVisible(true);
      choice6.setVisible(true);
      choice7.setVisible(true);
      choice8.setVisible(true);
      choice9.setVisible(true);
      choice10.setVisible(true);
      playerResponse1.setText("> go west");
      narratorResponse2.setText("This is an open field west of a white house with a boarded front door. There is a small mailbox here with \"1600 Pennsylvania Avenue\" written on it.\nThere is also a monkey, and a path leading in the direction of Dennis.\n");
      playerResponse2.setText("> open door");
      narratorResponse3.setText("It's boarded shut. You must've arrived here through, I dunno, the catflap or something.\n");
      playerResponse3.setText("> Open catflap");
      narratorResponse4.setText("You're an idiot.\n");
      playerResponse4.setText("> Open idiot");
      narratorResponse5.setText("No.\n");
      playerResponse5.setText("> Open n-");
      narratorResponse6.setText("Okay, I'll take pity on you. Lemme give you a hint - what you should do now does not involve grues.\n");
      playerResponse6.setText("> Gee thanks");
      choice1.setText("examine monkey");
      choice2.setText("open mailbox");
      choice3.setText("fight mailbox");
      choice4.setText("stroke mailbox");
      choice5.setText("go north");
      choice6.setText("go east");
      choice7.setText("Dennis");
      choice8.setText("keep going west");
      choice9.setText("eat monkey");
      choice10.setText("Sheet on a Toliet");
    }
    public void ndrInventory(){
      position = "ndrInventory";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse1.setText("> inventory");
      narratorResponse2.setText("You pull out each item in the inventory as you examine them. You have:\n\n5 litres of human blood, 206 bones, a skull, a human brain (embedded in skull), a layer of skin (being worn), two eyes (embedded in skull), a tongue, a stomach (half-full), a digestive tract, a rectum (full), a bladder (half-empty), a liver, a kidney (worth 500 zorkmids), another kidney (in use), two lungs (in use), a human heart (in use), a spleen (unventilated), some genitals, 412 human hairs (being worn), a song (embedded in heart), a smile (embedded in skull), 9 hopes, 12 dreams, 14 regrets, 99 problems, 17 fears, 5 ounces of darkness (embedded in heart) and a consciousness (not in use).\n\nYou also have no pants (no shirt; real adventurers don't need shirts!), a stick of gum, and an anti-Grue uniform. Unfortunately, the gods of Zork suddenly decide that you having an anti-Grue uniform would be unfair to the Grues, and they take it away from you.\n\nUnfortunately, by the time you put back all the things in your inventory, a Grue eats you. Tough luck.");
      zorkDiedShining();
    }
    public void leaflet(){
      position = "leaflet";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse2.setVisible(true);
      narratorResponse3.setVisible(true);
      playerResponse3.setVisible(true);
      narratorResponse4.setVisible(true);
      playerResponse1.setText("> examine leaflet");
      narratorResponse2.setText("Which one? The grue is getting closer.\n");
      playerResponse2.setText("> the one on the floor");
      narratorResponse3.setText("Ah.\n\nIt says,\"eurgs and grues.\" The grue is 5 steps away.\n");
      playerResponse3.setText("> kill grue");
      narratorResponse4.setText("You've killed the Grue! Amazing! Then, a non-existent weapon falls on your head and crushes you instantly.");
      zorkDiedShining();
    }
    public void grueConversation(){
      position = "grueConversation";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse1.setText("> Talk to Grue");
      narratorResponse2.setText("You greet the Grue in a polite and respectful manner.\n\"Hello there, Grue. Please do not eat me, I would like to be your friend.\"\nThe Grue looks at you thoughtfully, a small bit of drool dripping off its sharp fangs.\n\"Umm...\" you say nervously, backing away a step, \"good Grue... good Grue... \"\nThis last sentence was a mistake, for the simple reason that a good Grue eats everything living in sight. What you wanted was a bad Grue, that thinks it's supposed to sing campfire songs.\nThe Grue rips you into 69,105 pieces, sending blood and chunks of flesh flying everywhere. It growls a little, then eats the pieces.\nExcept for your left pinky toe. A mouse ran away with that when the Grue was busy gnawing on the remains of your head.\nIt is safe to assume that...");
      zorkDied();
    }
    public void advertisement(){
      position = "advertisement";
      resetScene();
      narratorResponse1.setText("Unset");
      weapon = "Long Sword";
      weaponLabelName.setText(weapon);
      choice1.setText("Click me");
      choice2.setVisible(false);
    }
    public void stay(){
      position = "stay";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse1.setText("> stay");
      narratorResponse2.setText("The grue gets closer. RUN YOU CRAZY FOOL!!");
      choice1.setText("stay");
      choice2.setText("run");
    }
    public void runAway(){
      position = "runAway";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse1.setText("> run");
      narratorResponse2.setText("Since you didn't specify a direction, you run on the spot, and the grue eats you.");
      zorkDiedGrued();
    }
    public void n00b(){
      position = "n00b";
      resetScene();
      playerResponse1.setVisible(true);
      narratorResponse2.setVisible(true);
      playerResponse1.setText("> pwn grue");
      narratorResponse2.setText("You attempt to viciously pwn the grue, but your Pwn4g3 stat isn't high enough for this creature to be pwnt. Why don't you go train it up for awhile? Oh, but you can't, because YOU HAVE BEEN EATEN BY THE GRUE!!");
      zorkDied();
    }
    public void whatIsGrue(){
      position = "whatIsGrue";
      resetScene();
      narratorResponse1.setVisible(true);
      choice2.setVisible(false);
      narratorResponse1.setText("The Grue is a box-shaped, gape-toothed mammal known for eating disgarded detergent bottles and humans. Often seen roaming the wilderness in herds, whistling old-timey Irish pub songs and calculating the amount of back taxes owed by car salesmen. It is also a sinister, lurking presence in the dark places of the earth. Its favorite diet is adventurers, but its insatiable appetite is tempered by its fear of light. No grue has ever been seen by the light of day, and few have survived its fearsome jaws to tell the tale.");
      choice1.setText("Back");
    }
    
    
    public void fight(){
      position = "fight";
      resetScene();
      narratorResponse1.setText("Monster HP: " + monsterHP + "\n\nWhat do you do?");
      choice1.setText("Attack");
      choice2.setText("Run");
      choice3.setText("");
      choice4.setText("");
    }
    public void playerAttack(){
      position = "playerAttack";
      resetScene();
      int playerDamage = 0;
      if(weapon.equals("Knife")){
        playerDamage = new java.util.Random().nextInt(3);
      }
      else if(weapon.equals("Long Sword")){
        playerDamage = new java.util.Random().nextInt(12);
      }
      narratorResponse1.setText("You attacked the monster and gave " + playerDamage + " damage!");
      monsterHP = monsterHP - playerDamage;
      choice1.setText(">");
      choice2.setText("");
      choice3.setText("");
      choice4.setText("");
    }
    public void monsterAttack(){
      position = "monsterAttack";
      resetScene();
      int monsterDamage = 0;
      monsterDamage = new java.util.Random().nextInt(6);
      narratorResponse1.setText("The monster attacked you and gave " + monsterDamage + " damage!");
      playerHP = playerHP - monsterDamage;
      hpLabelNumber.setText(""+playerHP);
      choice1.setText(">");
      choice2.setText("");
      choice3.setText("");
      choice4.setText("");
    }
    public void win(){
      position = "win";
      resetScene();
      narratorResponse1.setText("You defeated the monster!\nThe monster dropped a ring!\n\n(You obtained a Silver Ring)");
      silverRing = 1;
      choice1.setText("Go east");
      choice2.setText("");
      choice3.setText("");
      choice4.setText("");
    }
    public void lose(){
      position = "lose";
      resetScene();
      narratorResponse1.setText("You are dead!\n\nGAME OVER");
      choice1.setText("");
      choice2.setText("");
      choice3.setText("");
      choice4.setText("");
      choice1.setVisible(false);
      choice2.setVisible(false);
      choice3.setVisible(false);
      choice4.setVisible(false);
    }
    public void ending(){
      position = "ending";
      resetScene();
      narratorResponse1.setText("Guard: Oh you killed that goblin!?\nThank you so much. You are true hero!\nWelcome to our town!\n\nTHE END");
      choice1.setText("");
      choice2.setText("");
      choice3.setText("");
      choice4.setText("");
      choice1.setVisible(false);
      choice2.setVisible(false);
      choice3.setVisible(false);
      choice4.setVisible(false);
    }

    public class TitleScreenHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){

            createGameScreen();
        }
    }


    public class ChoiceHandler implements ActionListener{
      public void actionPerformed(ActionEvent event){
        String yourChoice = event.getActionCommand();

          switch (position) {
          case "nondescriptRoom":
            switch (yourChoice) {
            case "c1": kitchen(); break;
            case "c2": foyer(); break;
            case "c3": houseEast(); break;
            case "c4": houseWest(); break;
            case "c5": ndrInventory(); break;
            case "c6": leaflet(); break;
            case "c7": grueConversation(); break;
            case "c8": advertisement(); break;
            case "c9": eatGrue(); break;
            case "c10": stay(); break;
            case "c11": n00b(); break;
            case "c12": whatIsGrue(); break;
            }
            break;
          case "restore":
            switch (yourChoice) {
            case "c1": x(); break;
            case "c2": x(); break;
            case "c3": x(); break;
            case "c4": x(); break;
            case "c6": quit(); break;
            }
            break;
          case "kitchen":
            switch (yourChoice) {
            case "c1": kitchenKnife(); break;
            case "c2": kitchenCupboards2(); break;
            case "c3": nondescriptRoomGrueHungry(); break;
            case "c4": kitchenNorth(); break;
            case "c5": yard(); break;
            case "c6": kitchenTeacup(); break;
            case "c7": town(); break;
            case "c8": kitchenStove(); break;
            }
            break;
          case "kitchenKnife":
            switch (yourChoice) {
            case "c1": kitchenKnifeGum(); break;
            case "c2": kitchenKnifeRemoved(); break;
            case "c3": nondescriptRoomBloody(); break;
            case "c4": nondescriptRoom(); break;
            }
            break;
          case "kitchenKnifeGum":
            switch (yourChoice) {
            case "c1": kitchenKnifeRemoved(); break;
            case "c2": nondescriptRoom(); break;
            case "c3": nondescriptRoom(); break;
            }
            break;
          case "kitchenKnifeRemoved":
            switch (yourChoice) {
            case "c1": kitchenKnifeRestabbed(); break;
            case "c2": kitchenCupboards(); break;
            case "c3": x(); break;
            case "c4": yardBleeding(); break;
            case "c5": nondescriptRoomBloody(); break;
            case "c6": x(); break;
            }
            break;
          case "kitchenKnifeRestabbed":
            switch (yourChoice) {
            case "c1": nondescriptRoom(); break;
            case "c2": saveSelect(); break;
            case "c3": quit(); break;
            case "c4": x(); break;
            }
            break;
          case "kitchenCupboards":
            switch (yourChoice) {
            case "c1": x(); break;
            case "c2": nondescriptRoomBloody(); break;
            }
            break;
          case "yardBleeding":
            switch(yourChoice){
            case "c1": forestBleeding(); break;
            case "c2": riverbankBleeding(); break;
            case "c3": examineHouseBleeding(); break;
            }
            break;
          case "forestBleeding":
            switch(yourChoice){
            case "c1": x(); break;
            case "c2": x(); break;
            }
            break;
          case "riverbankBleeding":
            switch(yourChoice){
            case "c1": riverBleeding(); break;
            case "c2": caveBleeding(); break;
            case "c3": yardBleeding(); break;
            }
            break;
          case "riverBleeding":
            switch(yourChoice){
            case "c1": eatLunchDeath(); break;
            case "c2": drinkWaterDeath(); break;
            case "c3": takeWater(); break;
            case "c4": northwestToBoatBleeding(); break;
            case "c5": riverDeath(); break;
            }
            break;
          case "eatLunchDeath":
            switch (yourChoice) {
            case "c1": nondescriptRoom(); break;
            case "c2": saveSelect(); break;
            case "c3": quit(); break;
            }
            break;
          case "drinkWaterDeath":
            switch (yourChoice) {
            case "c1": nondescriptRoom(); break;
            case "c2": saveSelect(); break;
            case "c3": quit(); break;
            }
            break;
          case "takeWater":
            switch(yourChoice){
            case "c1": takeRiverWater(); break;
            case "c2": takeBottleWater(); break;
            }
            break;
          case "takeRiverWater":
            switch(yourChoice){
            case "c1": eatLunchDeath(); break;
            case "c2": takeLunch(); break;
            case "c3": northwestToBoatBleeding(); break;
            case "c4": riverDeath(); break;
            }
            break;
          case "takeBottleWater":
            switch(yourChoice){
            case "c1": eatLunchDeath(); break;
            case "c2": takeLunch(); break;
            case "c3": northwestToBoatBleeding(); break;
            case "c4": riverDeath(); break;
            }
            break;
          case "takeLunch":
            switch (yourChoice) {
            case "c1": nondescriptRoom(); break;
            case "c2": saveSelect(); break;
            case "c3": quit(); break;
            }
            break;
          case "northwestToBoatBleeding":
            switch (yourChoice) {
            case "c1": eatLunchDeath(); break;
            case "c2": riverBleeding(); break;
            case "c3": hmsGrueBleeding(); break;
            }
            break;
          case "hmsGrueBleeding":
            switch (yourChoice) {
            case "c1": grue(); break;
            case "c2": grueTalk(); break;
            case "c3": grueDeathButDreaming(); break;
            case "c4": grueRun(); break;
            }
            break;
          case "grueRun":
            switch (yourChoice) {
            case "c1": nondescriptRoom(); break;
            case "c2": saveSelect(); break;
            case "c3": quit(); break;
            }
            break;
            
            
            
          case "riverDeath":
            switch (yourChoice) {
            case "c1": x(); break;
            case "c2": x(); break;
            case "c3": saveSelect(); break;
            }
            break;
          case "caveBleeding":
            switch (yourChoice) {
            case "c1": riverbankBleeding(); break;
            case "c2": x(); break;
            }
            break;
            
            //cave here
            
          case "examineHouseBleeding":
            switch(yourChoice){
            case "c1": kitchenKnifeRemoved(); break;
            case "c2": forestBleeding(); break;
            case "c3": riverbankBleeding(); break;
            }
            break;
          case "kitchenCupboards2":
            switch (yourChoice) {
            case "c1": movie(); break;
            case "c2": kitchen(); break;
            }
            break;
          case "movie":
            switch (yourChoice) {
            case "c1": nondescriptRoom(); break;
            case "c2": saveSelect(); break;
            case "c3": quit(); break;
            }
            break;
          case "kitchenNorth":
            switch (yourChoice) {
            case "c1": nondescriptRoom(); break;
            case "c2": saveSelect(); break;
            case "c3": quit(); break;
            }
            break;
          case "yard":
            switch (yourChoice) {
            case "c1": x(); break;
            case "c2": x(); break;
            case "c3": x(); break;
            case "c4": x(); break;
            case "c5": x(); break;
            case "c6": x(); break;
            case "c7": kitchen(); break;
            }
            break;
          case "kitchenTeacup":
            switch (yourChoice) {
            case "c1": nondescriptRoom(); break;
            case "c2": saveSelect(); break;
            case "c3": quit(); break;
            }
            break;
          case "town":
            switch (yourChoice) {
            case "c1": x(); break;
            case "c2": x(); break;
            case "c3": x(); break;
            }
            break;
          case "kitchenStove":
            switch (yourChoice) {
            case "c1": x(); break;
            case "c2": x(); break;
            }
            break;
          case "nondescriptRoomBloody":
            switch (yourChoice) {
            case "c1": knifeGrue(); break;
            case "c2": grueTalk(); break;
            case "c3": eatGrue(); break;
            case "c4": x(); break;
            case "c5": x(); break;
            case "c6": x(); break;
            }
            break;
          case "knifeGrue":
            switch (yourChoice) {
            case "c1": nondescriptRoom(); break;
            case "c2": saveSelect(); break;
            case "c3": quit(); break;
            case "c4": tankHell(); break;
            }
            break;
          case "tankHell":
            switch (yourChoice) {
            case "c1": nondescriptRoom(); break;
            case "c2": saveSelect(); break;
            case "c3": quit(); break;
            }
            break;
          case "grueTalk":
            switch (yourChoice) {
            case "c1": nondescriptRoom(); break;
            case "c2": saveSelect(); break;
            case "c3": quit(); break;
            }
            break;
          case "eatGrue":
            switch (yourChoice) {
            case "c1": nondescriptRoom(); break;
            case "c2": saveSelect(); break;
            case "c3": quit(); break;
            }
            break;
          case "nondescriptRoomGrueHungry":
            switch (yourChoice) {
            case "c1": kitchen(); break;
            case "c2": foyer(); break;
            case "c3": nondescriptRoom(); break;
            case "c4": houseEast(); break;
            case "c5": x(); break;
            case "c6": x(); break;
            case "c7": x(); break;
            case "c8": x(); break;
            }
            break;
          case "foyer":
            switch (yourChoice) {
            case "c1": x(); break;
            case "c2": x(); break;
            case "c3": x(); break;
            case "c4": nondescriptRoomGrueHungry(); break;
            case "c5": foyerYeSwordLook(); break;
            case "c6": x(); break;
            case "c7": x(); break;
            }
            break;
          case "foyerYeSwordLook":
            switch (yourChoice) {
            case "c1": foyerYeSwordCurse(); break;
            case "c2": foyerYeSwordBeg(); break;
            case "c3": foyer(); break;
            }
            break;
          case "foyerYeSwordCurse":
            switch (yourChoice) {
            case "c1": nondescriptRoom(); break;
            case "c2": saveSelect(); break;
            case "c3": quit(); break;
            }
            break;
          case "foyerYeSwordBeg":
            switch (yourChoice) {
            case "c1": foyer(); break;
            }
            break;
          case "houseEast":
            switch (yourChoice) {
            case "c1": nondescriptRoom(); break;
            case "c2": saveSelect(); break;
            case "c3": quit(); break;
            }
            break;
          case "houseWest":
            switch (yourChoice) {
            case "c1": x(); break;
            case "c2": x(); break;
            case "c3": x(); break;
            case "c4": x(); break;
            case "c5": x(); break;
            case "c6": nondescriptRoomGrueHungry(); break;
            case "c7": x(); break;
            case "c8": x(); break;
            case "c9": x(); break;
            case "c10": x(); break;
            }
            break;
          case "ndrInventory":
            switch(yourChoice){
            case "c1": nondescriptRoom(); break;
            case "c2": saveSelect(); break;
            case "c3": quit(); break;
            }
            break;
          case "leaflet":
            switch(yourChoice){
            case "c1": nondescriptRoom(); break;
            case "c2": saveSelect(); break;
            case "c3": quit(); break;
            }
            break;
          case "grueConversation":
            switch(yourChoice){
            case "c1": nondescriptRoom(); break;
            case "c2": saveSelect(); break;
            case "c3": quit(); break;
            }
            break;
          case "advertisement":
            switch(yourChoice){
            case "c1": githubLink(); break;
            }
            break;
          case "stay":
            switch(yourChoice){
            case "c1": nondescriptRoom(); break;
            case "c2": saveSelect(); break;
            }
            break;
          case "runAway":
            switch(yourChoice){
            case "c1": nondescriptRoom(); break;
            case "c2": saveSelect(); break;
            case "c3": quit(); break;
            }
            break;
          case "n00b":
            switch(yourChoice){
            case "c1": nondescriptRoom(); break;
            case "c2": saveSelect(); break;
            case "c3": quit(); break;
            }
            break;
          case "whatIsGrue":
            switch(yourChoice){
            case "c1": nondescriptRoom(); break;
            }
            break;
          case "fight":
            switch(yourChoice){
            case "c1": playerAttack();break;
            case "c2": houseEast(); break;
            }
            break;
          case "playerAttack":
            switch(yourChoice){
            case "c1": 
              if(monsterHP <1 ){
                win();
              }
              else{
                monsterAttack();
              }
              break;
            }
            break;
          case "monsterAttack":
            switch(yourChoice){
            case "c1": 
              if(playerHP <1 ){
                lose();
              }
              else{
                fight();
              }
              break;
            }
            break;
          case "win":
            switch(yourChoice){
            case "c1": houseEast();
            }
            break;
        
          case "grue":
            switch(yourChoice){
            case "c1": nondescriptRoom(); break;
            case "c2": saveSelect(); break;
            case "c3": quit(); break;
            }
            break;
          case "grueDeathButDreaming":
            switch (yourChoice) {
            case "c1": kitchen(); break;
            case "c2": foyer(); break;
            case "c3": houseEast(); break;
            case "c4": houseWest(); break;
            case "c5": saveSelect(); break;
            }
          }
        }
    }
}
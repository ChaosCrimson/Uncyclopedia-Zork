import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Toolkit;

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
    JTextArea narratorResponse1, narratorResponse2, narratorResponse3, narratorResponse4, narratorResponse5, narratorResponse6, narratorResponse7, playerResponse1, playerResponse2, playerResponse3, playerResponse4, playerResponse5, playerResponse6, playerResponse7, narratorResponseDeath1, narratorResponseDeath2, narratorResponseDeath3, narratorResponseDeath4, narratorResponseDeath5, narratorResponseDeath6, narratorAfterResponse, playerAfterResponse;
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

        narratorResponse7 = new JTextArea("");
        narratorResponse7.setBounds(100, 100, 1100, 350);
        narratorResponse7.setBackground(Color.black);
        narratorResponse7.setForeground(Color.white);
        narratorResponse7.setFont(narratorFont);
        narratorResponse7.setLineWrap(true);
        narratorResponse7.setWrapStyleWord(true);
        narratorResponse7.setEditable(false);

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

        playerResponse7 = new JTextArea("");
        playerResponse7.setBounds(100, 100, 1100, 350);
        playerResponse7.setBackground(Color.black);
        playerResponse7.setForeground(tan);
        playerResponse7.setFont(playerFont);
        playerResponse7.setLineWrap(true);
        playerResponse7.setWrapStyleWord(true);
        playerResponse7.setEditable(false);

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

        narratorResponseDeath6 = new JTextArea("");
        narratorResponseDeath6.setBounds(100, 100, 1100, 350);
        narratorResponseDeath6.setBackground(Color.black);
        narratorResponseDeath6.setForeground(Color.white);
        narratorResponseDeath6.setFont(deathFont);
        narratorResponseDeath6.setLineWrap(true);
        narratorResponseDeath6.setWrapStyleWord(true);
        narratorResponseDeath6.setEditable(false);

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
        mainTextPanel.add(narratorResponseDeath6);
        mainTextPanel.add(narratorResponse7);
        mainTextPanel.add(playerResponse7);

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

    public void zorkDied() {
        narratorResponseDeath6.setVisible(true);
        narratorResponse7.setVisible(true);
        choice3.setVisible(true);
        narratorResponseDeath6.setText("\n*** All work and no play makes Jack a dull boy ***\n");
        narratorResponse7.setText("All work and no play makes Jack a dull boy? (All work and no play makes Jack a dull boy):");
        choice1.setText("All work and no play makes Jack a dull boy");
        choice2.setText("All work and no play makes Jack a dull boy");
        choice3.setText("All work and no play makes Jack a dull boy");
    }
    public void zorkDiedShining() {
        narratorResponseDeath6.setVisible(true);
        narratorResponse7.setVisible(true);
        choice3.setVisible(true);
        narratorResponseDeath6.setText("\n*** All work and no play makes Jack a dull boy ***\n");
        narratorResponse7.setText("All work and no play makes Jack a dull boy? (All work and no play makes Jack a dull boy):");
        choice1.setText("All work and no play makes Jack a dull boy");
        choice2.setText("All work and no play makes Jack a dull boy");
        choice3.setText("All work and no play makes Jack a dull boy");
    }
    public void zorkDiedShining2() {
        narratorResponseDeath6.setVisible(true);
        narratorResponse7.setVisible(true);
        choice3.setVisible(true);
        narratorResponseDeath6.setText("\n*** All work and no play makes Jack a dull boy ***\n");
        narratorResponse7.setText("Does all work and no play make Jack a dull boy? (type RESTART, RESTORE, or QUIT):");
        choice1.setText("restart");
        choice2.setText("restore");
        choice3.setText("quit");
    }
    public void zorkDiedSheep() {
        narratorResponseDeath6.setVisible(true);
        narratorResponse7.setVisible(true);
        choice3.setVisible(true);
        narratorResponseDeath6.setText("\n*** You shagged the sheep, and are expelled from Zork ***\n");
        narratorResponse7.setText("Would you like to log in to your account so you can vandalise some more, use your brother's computer, or turn off your computer? (type ACCOUNT, BROTHER, or SHUTDOWN):");
        choice1.setText("ACCOUNT");
        choice2.setText("BROTHER");
        choice3.setText("SHUTDOWN");
    }
    public void zorkDiedWario() {
        narratorResponseDeath6.setVisible(true);
        narratorResponse7.setVisible(true);
        choice3.setVisible(true);
        narratorResponseDeath6.setText("\n*** “So ein mist!”\n~ Wario ***\n");
        narratorResponse7.setText("Would you like to go back to the start, try again with 10 coins, or end this session of Mario Party? (type RESTART, RESTORE, or QUIT):");
        choice1.setText("restart");
        choice2.setText("restore");
        choice3.setText("quit");
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
        narratorResponse7.setVisible(false);
        playerResponse1.setVisible(false);
        playerResponse2.setVisible(false);
        playerResponse3.setVisible(false);
        playerResponse4.setVisible(false);
        playerResponse5.setVisible(false);
        playerResponse6.setVisible(false);
        playerResponse7.setVisible(false);
        narratorResponseDeath1.setVisible(false);
        narratorResponseDeath2.setVisible(false);
        narratorResponseDeath3.setVisible(false);
        narratorResponseDeath4.setVisible(false);
        narratorResponseDeath5.setVisible(false);
        narratorResponseDeath6.setVisible(false);
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
        narratorResponse1.setText("ZORK I: The Great Underground Empire\nCopyright © June 22, 1979, 2005, 2006, 200X Unfocom, Inc. All rights reserved.\nRevision 69105 / Serial Number 47\n\nThere is a leaflet on the floor.");
        playerResponse1.setText("> take leaflet");
        narratorResponse2.setText("Stolen.");
        playerResponse2.setText("> read leaflet");
        narratorResponse3.setText("Welcome to the Zork page. In this space you will experience some of the most thrilling text action ever devised. It is a game of high skills and low cunning. In this adventure you will find some of the most dangerous creatures you've ever seen like e-\nEurg!! The rest of the leaflet has been torn.");
        playerResponse3.setText("> look");
        narratorResponse4.setText("You are in a nondescript room of nondescript size. Exits are to the north, south, and west. Oh, and there's a Grue over there in the corner.\nThere is half a leaflet next to the Grue.");
        choice1.setText("North");
        choice2.setText("South");
        choice3.setText("East");
        choice4.setText("West");
        choice5.setText("inventory");
        choice6.setText("Take rest of leaflet");
        choice7.setText("talk to grue");
        choice8.setText("look at an advertisement");
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
        narratorResponse2.setText("You are in the kitchen. There are cupboards and a door that leads to the yard outside. On the counter is a butcher knife. Next to the knife is a small, light blue tea cup. You also notice a large, black stove in the corner, that is probably used for cooking stuff. You notice a can on the stove.\n\nYou wonder what a butcher knife, designed exclusively for the slicing and hacking of flesh, is doing in a kitchen which is noticeably absent of any meat storage or preparation facilities. In fact, you notice that the knife is awfully shiny for a kitchen utensil. It looks as if it's never been used. It's unstained. Untainted. Pure. Righteous.");
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
    public void stabGrueAttempt() {
        position = "stabGrueAttempt";
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
        playerResponse1.setText("> Stab the Grue");
        narratorResponse2.setText("What grue?\n");
        playerResponse2.setText("> Look for a grue to stab");
        narratorResponse3.setText("As you are looking for a grue to stab, a grue sneaks up behind you.\n");
        playerResponse3.setText("> Stab the Grue");
        narratorResponse4.setText("You cannot stab the grue.\n");
        playerResponse4.setText("> Why not?");
        narratorResponse5.setText("Because the knife is in your leg.\n");
        playerResponse5.setText("> remove knife from leg");
        narratorResponse6.setText("You grab the knife and try to yank it out of your leg. You fail. The grue eats you. Hey, at least the knife isn't hurting you any more because...");
        zorkDiedShining2();
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
        narratorResponse2.setText("\nYou start to say hello and the Grue interrupts to comment on the blood coming from your jeans and suggests you use club soda to get it out. The Grue devours you before you have a chance to follow up on his advice.");
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
        playerResponse2.setVisible(true);
        narratorResponse3.setVisible(true);
        choice4.setVisible(true);
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
        narratorResponse1.setText("You escaped Hell successfully!\n\nYou go to a nearby tank store, buy a tank, and drive the tank to the nondescript room. The Grue stands there. You shoot the Grue with a pepper from your barrel.\n\nUnfortunately, the pepper explodes. The tremor makes the light-bulb fall on your head and electrify you. The Grue, whom you missed with the shot, chops off your head and adds it to his trophy collection. Oh yeah, it also took your pepper. Tough luck, bitch.");
        zorkDiedShining2();
    }

    public void yardStabbed(){
        position = "yardStabbed";
        resetScene();
        playerResponse1.setVisible(true);
        narratorResponse2.setVisible(true);
        choice3.setVisible(true);
        choice4.setVisible(true);
        choice5.setVisible(true);
        playerResponse1.setText("leave house");
        narratorResponse2.setText("You're standing on a grassy lawn. Looks well-kept.\n\nDirectly in front of you is a nice-looking forest. You can also hear a faint rushing sound to your left, but it's drowned out by a low moaning. You look around for a while before you realize it's coming from you.\n\nDid I mention that knife was painful?");
        choice1.setText("so what?");
        choice2.setText("remove knife");
        choice3.setText("enter forest");
        choice4.setText("go left");
        choice5.setText("examine house");
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
        narratorResponse1.setVisible(true);
        choice3.setVisible(true);
        choice4.setVisible(true);
        narratorResponse1.setText("You are in the foyer of what appears to be a fairly decent home. There's an open living room off to your left and a flight of stairs to your right, leading up. There is also a large, imposing door directly in front of you.\nOn hooks above the mantelpiece hangs an elven sword of great antiquity.\n");
        choice1.setText("Placeholder");
        choice2.setText("Placeholder");
        choice3.setText("Placeholder");
        choice4.setText("Placeholder");
    }
    public void houseEast(){
        position = "houseEast";
        resetScene();
        narratorResponse1.setVisible(true);
        narratorResponseDeath1.setVisible(true);
        narratorResponse2.setVisible(true);
        choice3.setVisible(true);
        narratorResponse1.setText("You smack your head into the wall. You wake up to find yourself being eaten by the Grue. Your last conscious thought is the determination to pay attention to your surroundings more.");
        narratorResponseDeath1.setText("*** You fail at Zork ***\n");
        narratorResponse2.setText("Would you like to not fail, restore The Super Ultimate Final Conclusive Showdown Battle To The End save file, or end your failing session of Zork? (TYPE RESTART, RESTORE OR QUIT):");
        choice1.setText("restart");
        choice2.setText("restore");
        choice3.setText("quit");
        choice3.setVisible(true);
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
                        case "c4": x(); break;
                        case "c5": x(); break;
                        case "c6": x(); break;
                        case "c7": x(); break;
                        case "c8": x(); break;
                        case "c9": x(); break;
                        case "c10": x(); break;
                        case "c11": x(); break;
                        case "c12": x(); break;
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
                        case "c4": nondescriptRoom(); break;
                    }
                    break;
                case "kitchenKnife":
                    switch (yourChoice) {
                        case "c1": kitchenKnifeGum(); break;
                        case "c2": kitchenKnifeRemoved(); break;
                        case "c3": nondescriptRoomBloody(); break;
                        case "c4": yardStabbed(); break;
                        case "c5": stabGrueAttempt(); break;
                    }
                    break;
                case "kitchenKnifeGum":
                    switch (yourChoice) {
                        case "c1": kitchenKnifeRemoved(); break;
                        case "c2": nondescriptRoomBloody(); break;
                        case "c3": yardStabbed(); break;
                    }
                    break;
                case "kitchenKnifeRemoved":
                    switch (yourChoice) {
                        case "c1": kitchenKnifeRestabbed(); break;
                        case "c2": kitchenCupboards(); break;
                        case "c3": x(); break;
                        case "c4": x(); break;
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
                case "kitchenCupboards2":
                    switch (yourChoice) {
                        case "c1": movie(); break;
                        case "c2": kitchen(); break;
                    }
                    break;
                case "movie", "tankHell":
                    switch (yourChoice) {
                        case "c1": nondescriptRoom(); break;
                        case "c2": saveSelect(); break;
                        case "c3": quit(); break;
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
                    }
                    break;
                case "foyer":
                    switch (yourChoice) {
                        case "c1": nondescriptRoom(); break;
                    }
                    break;
                case "houseEast":
                    switch (yourChoice) {
                        case "c1": nondescriptRoom(); break;
                        case "c2": saveSelect(); break;
                        case "c3": quit(); break;
                    }
                    break;
                case "north":
                    switch(yourChoice){
                        case "c1": houseEast(); break;
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
            }
        }
    }
}
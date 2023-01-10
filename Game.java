import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Game {

    JFrame window;
    Container con;
    JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
    JLabel titleNameLabel, hpLabel, hpLabelNumber, weaponLabel, weaponLabelName;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 90);
    Font narratorFont = new Font("Times New Roman", Font.PLAIN, 16);
    Font deathFont = new Font("Times New Roman", Font.PLAIN, 22);
    Font playerFont = new Font("Courier New", Font.PLAIN, 16);
    JButton startButton, choice1, choice2, choice3, choice4;
    JTextArea narratorResponse1, narratorResponse2, narratorResponse3, narratorResponse4, narratorResponse5, playerResponse1, playerResponse2, playerResponse3, playerResponse4, playerResponse5, narratorResponseDeath1, narratorResponseDeath2, narratorResponseDeath3, narratorResponseDeath4, narratorResponseDeath5;
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
        window.setSize(1200, 900);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setIconImage(logo.getImage());
        con = window.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 1200, 150);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel = new JLabel("ADVENTURE");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(600, 500, 200, 100);
        startButtonPanel.setBackground(Color.black);

        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.white);
        startButton.setFont(narratorFont);
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

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(100, 550, 300, 150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
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

//        choice4.setContentAreaFilled(false);  // Disable highlighting on press!!!


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

    public void resetScene() {
        narratorResponse1.setText("");
        narratorResponse2.setText("");
        narratorResponse3.setText("");
        narratorResponse4.setText("");
        narratorResponse5.setText("");
        playerResponse1.setText("");
        playerResponse2.setText("");
        playerResponse3.setText("");
        playerResponse4.setText("");
        playerResponse5.setText("");
        narratorResponseDeath1.setText("");
        narratorResponseDeath2.setText("");
        narratorResponseDeath3.setText("");
        narratorResponseDeath4.setText("");
        narratorResponseDeath5.setText("");
        choice1.setText("");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
        choice1.setVisible(true);
        choice2.setVisible(true);
        choice3.setVisible(true);
        choice4.setVisible(true);
    }

    public void nondescriptRoom(){
        position = "nondescriptRoom";
        resetScene();
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
    }
    public void kitchen(){
        position = "kitchen";
        resetScene();
        narratorResponse1.setText("Guard: Hello stranger. I have never seen your face. \nI'm sorry but we cannot let a stranger enter our town.");
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    public void foyer(){
        position = "foyer";
        resetScene();
        narratorResponse1.setText("You are in the foyer of what appears to be a fairly decent home. There's an open living room off to your left and a flight of stairs to your right, leading up. There is also a large, imposing door directly in front of you.\nOn hooks above the mantlepiece hangs an elven sword of great antiquity.\n");
        //playerHP = playerHP -3;
        playerHP -=3;
        hpLabelNumber.setText(""+playerHP);
        choice1.setText(">");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    public void houseEast(){
        position = "houseEast";
        resetScene();
        narratorResponse1.setText("You smack your head into the wall. You wake up to find yourself being eaten by the Grue. Your last conscious thought is the determination to pay attention to your surroundings more.");
        narratorResponseDeath1.setText("*** You fail at Zork ***\n");
        narratorResponse2.setText("Would you like to not fail, restore The Super Ultimate Final Conclusive Showdown Battle To The End save file, or end your failing session of Zork? (TYPE RESTART, RESTORE OR QUIT):");
        choice1.setText("restart");
        choice2.setText("restore");
        choice3.setText("quit");
        choice4.setVisible(false);
    }
    public void north(){
        position = "north";
        resetScene();
        narratorResponse1.setText("There is a river. \nYou drink the water and rest at the riverside. \n\n(Your HP is recovered by 2)");
        playerHP = playerHP + 2;
        hpLabelNumber.setText(""+playerHP);
        choice1.setText("Go south");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");
    }
    public void east(){
        position = "east";
        resetScene();
        narratorResponse1.setText("You walked into a forest and found a Long Sword!\n\n(You obtained a Long Sword)");
        weapon = "Long Sword";
        weaponLabelName.setText(weapon);
        choice1.setText("Go west");
        choice2.setText("");
        choice3.setText("");
        choice4.setText("");

    }
    public void west(){
        position = "west";
        resetScene();
        narratorResponse1.setText("You encounter a goblin!");
        choice1.setText("Fight");
        choice2.setText("Run");
        choice3.setText("");
        choice4.setText("");
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

            switch(position){
                case "nondescriptRoom":
                    switch(yourChoice){
                        case "c1": kitchen();break;
                        case "c2": foyer();break;
                        case "c3": houseEast();break;
                    }
                    break;
                case "kitchen":
                    switch(yourChoice){
                        case "c1": nondescriptRoom(); break;
                    }
                    break;
                case "foyer":
                    switch(yourChoice){
                        case "c1": nondescriptRoom(); break;
                    }
                    break;
                case "houseEast":
                    switch(yourChoice){
                        case "c1": north(); break;
                        case "c2": east();break;
                        case "c3": nondescriptRoom(); break;
                        case "c4": west();break;
                    }
                    break;
                case "north":
                    switch(yourChoice){
                        case "c1": houseEast(); break;
                    }
                    break;
                case "east":
                    switch(yourChoice){
                        case "c1": houseEast(); break;
                    }
                    break;
                case "west":
                    switch(yourChoice){
                        case "c1": fight(); break;
                        case "c2": houseEast(); break;
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
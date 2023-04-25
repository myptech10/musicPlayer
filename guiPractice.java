import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class guiPractice implements ActionListener {

    private static JTextField userSong;
    private static JTextField removeSong;
    private static JTextField searchSong;

    private enum Actions{
        button, nextButton, restartButton, backButton, viewButton, removeButton, skipButton, searchButton, randomButton, randomButtonBack, randomButtonRestart, heartedButton ;
    }

     static JButton viewButton;
     static JButton restartButton;
     static JButton nextButton;
     static JButton backButton;
     static JButton removeButton;
     static JButton skipButton;
     static JButton searchButton;
     static JButton randomButton;
     static JButton randomButtonBack;
     static JButton randomButtonRestart;
     static JButton heartedButton;

    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,450);
        frame.add(panel);
        panel.setLayout(null);
        
        //song label
        JLabel songLabel = new JLabel("add a song");
        songLabel.setBounds(10,20,80,25);
        panel.add(songLabel);

       //user enter label
        userSong = new JTextField();
        userSong.setBounds(100,20,165,25);
        panel.add(userSong);

        //add song button
        JButton button = new JButton("add");
        button.setActionCommand(Actions.button.name());
        button.setBounds(100,50,165,25);
        button.addActionListener(new guiPractice());
        panel.add(button);

    
         //next song button
         nextButton = new JButton("play/next");
         nextButton.setActionCommand(Actions.nextButton.name());
         nextButton.setBounds(250,100,165,25);
         nextButton.addActionListener(new guiPractice());
         panel.add(nextButton);


        // previous song button 
        backButton = new JButton("back");
        backButton.setActionCommand(Actions.backButton.name());
        backButton.setBounds(40,100,165, 25);
        backButton.addActionListener(new guiPractice());
        panel.add(backButton);


        //restart playlist button
        restartButton = new JButton("restart playlist");
        restartButton.setActionCommand(Actions.restartButton.name());
        restartButton

        //print/view playlist 
        viewButton = new JButton("view playlist");
        viewButton.setActionCommand(Actions.viewButton.name());
        viewButton.setBounds(250,150,165,25);
        viewButton.addActionListener(new guiPractice());
        panel.add(viewButton);


        JLabel removeLabel = new JLabel("remove a song");
        removeLabel.setBounds(300,20,100,25);
        panel.add(removeLabel);

        //remove song from playlist
        removeButton = new JButton("remove");
        removeButton.setActionCommand(Actions.removeButton.name());
        removeButton.setBounds(400,50,165,25);
        removeButton.addActionListener(new guiPractice());
        panel.add(removeButton);

        //user remove button access
        removeSong = new JTextField();
        removeSong.setBounds(400,20,165,25);
        panel.add(removeSong);

        JLabel unlimited = new JLabel("unlimited skips?");
        unlimited.setBounds(450,100,150,25);
        panel.add(unlimited);

        skipButton = new JButton("yes");
        skipButton.setActionCommand(Actions.skipButton.name());
        skipButton.setBounds(460,125,80,25);
        skipButton.addActionListener(new guiPractice());
        panel.add(skipButton);

        JLabel searchLabel = new JLabel("search for song");
        searchLabel.setBounds(600,20,100,25);
        panel.add(searchLabel);

        searchButton = new JButton("search");
        searchButton.setActionCommand(Actions.searchButton.name());
        searchButton.setBounds(720,50,165,25);
        searchButton.addActionListener(new guiPractice());
        panel.add(searchButton);

        searchSong = new JTextField();
        searchSong.setBounds(720,20,165,25);
        panel.add(searchSong);

        //random playlist intitiation 
        JLabel randomPlaylist = new JLabel("random playlist:");
        randomPlaylist.setBounds(10,200,160,25);
        panel.add(randomPlaylist);

        randomButton = new JButton("play random");
        randomButton.setActionCommand(Actions.randomButton.name());
        randomButton.setBounds(10,250,165,25);
        randomButton.addActionListener(new guiPractice());
        panel.add(randomButton);

        randomButtonBack = new JButton("back");
        randomButtonBack.setActionCommand(Actions.randomButtonBack.name());
        randomButtonBack.setBounds(200,250,165,25);
        randomButtonBack.addActionListener(new guiPractice());
        panel.add(randomButtonBack);

        randomButtonRestart = new JButton("restart");
        randomButtonRestart.setActionCommand(Actions.randomButtonRestart.name());
        randomButtonRestart.setBounds(390,250,165,25);
        randomButtonRestart.addActionListener(new guiPractice());
        panel.add(randomButtonRestart);
        
        heartedButton = new JButton("add to my playlist");
        heartedButton.setActionCommand(Actions.heartedButton.name());
        heartedButton.setBounds(390,250,165,25);
        heartedButton.addActionListener(new guiPractice());
        panel.add(heartedButton);

        // JCheckBox testing = new JCheckBox("heart song");
        // testing.setActionCommand(Actions.testing.name());
        // testing.setBounds(500,300,80,25);
        // testing.addActionListener(new guiPractice());
        // panel.add(testing);

        



        frame.setVisible(true);

        
    }


    //button actions/methods

    

    static int counter  = 0;
    
    
    mpMethods playlist = new mpMethods();
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String songName = userSong.getText();
        String delete = removeSong.getText();
        String search=searchSong.getText();
        
     

        if (e.getActionCommand() == Actions.button.name() && !songName.equals("")){
            
            playlist.addSong(songName);
          
    }



    else if (e.getActionCommand() == Actions.skipButton.name()){
        counter=-9999999;
        JOptionPane.showMessageDialog(skipButton , "enjoy your unlimited plays");
        
    }
    
   
    else if ((e.getActionCommand() == Actions.nextButton.name())){

        if (counter==3){
        
            JOptionPane.showMessageDialog(nextButton, "you have exceeded the amount of plays/skips. click unlimited skips for $10.99 a year!");
            }
        

      else{
        String play = mpMethods.forwardSong();
        counter=counter+1;
        JOptionPane.showMessageDialog(nextButton, "playing " + play);
       
        }
       // System.out.println(counter);
        

    }

    else if ((e.getActionCommand() == Actions.restartButton.name())){
        String replay =  mpMethods.restartPlaylist();
        JOptionPane.showMessageDialog(restartButton, "playing " + replay);
        
       
    }

    else if ((e.getActionCommand() == Actions.backButton.name())){
     String previous= mpMethods.previousSong();
     JOptionPane.showMessageDialog(backButton, previous);


    }

   else if ((e.getActionCommand() == Actions.viewButton.name())){
       ArrayList<String> print  = mpMethods.printPlaylist();
       JOptionPane.showMessageDialog(viewButton, print);
  
      }
     
      
   else if ((e.getActionCommand() == Actions.removeButton.name() && !delete.equals(""))){
          
          String removeOrNot = mpMethods.removeSong(delete);
        JOptionPane.showMessageDialog(removeButton, removeOrNot);

} 
   
     
    else if((e.getActionCommand() == Actions.searchButton.name() && !search.equals(""))) {


        String find= mpMethods.findSong(search);
        JOptionPane.showMessageDialog(searchButton, find);

}

else if((e.getActionCommand() == Actions.randomButton.name())) {

    randomMethods.random();
    String random= randomMethods.playRandom();
    JOptionPane.showMessageDialog(randomButton, random);

}

else if((e.getActionCommand() == Actions.randomButtonBack.name())) {

    randomMethods.random();
    String randomBack= randomMethods.previousRandomSong();
    JOptionPane.showMessageDialog(randomButtonBack, randomBack);

}

else if((e.getActionCommand() == Actions.randomButtonRestart.name())) {

    randomMethods.random();
    String randomRestart= randomMethods.restartPlaylist();
    JOptionPane.showMessageDialog(randomButtonRestart, randomRestart);

}
        
   
}
}


import java.util.ArrayList;
import java.util.LinkedList;



public class mpMethods {
     
 
    static LinkedList<Node> userPlayList1 = new LinkedList<>();

    
    //node class
    private class Node{
        String data; //data part of node
        Node next; //link to next node in the LL

        public Node(String musicName){
            data = musicName;
    }


}

    private static Node ptr;
    private static Node front;
    private static Node prev;
    //adds songs to playlist
    public void addSong(String songName){
        if (ptr == null){
            front  = new Node(songName);
            ptr = new Node(songName);
            
            userPlayList1.add(ptr);
        
        }
        else{
            Node song  = new Node(songName);
            ptr.next=song;
            ptr = song;
            userPlayList1.add(song); 
            
    }
   
    
}

   


//prints playlist
    static ArrayList<String> playlist = new ArrayList<String>();     
    public static ArrayList<String> printPlaylist(){
        playlist.clear();
        if (userPlayList1.size()==0){
            playlist.add("playlist currently has no songs");
            return playlist;    
        }


      for (int i = 0; i<userPlayList1.size(); i++){
        // ArrayList<String> playlist = new ArrayList<String>();
        playlist.add(userPlayList1.get(i).data);
      }
      return playlist;
       //return printPlaylist();     

        }
    

    //get size of playlist for reference
    public int getSize(){
        return userPlayList1.size();
    }
    

    //plays next song of playlist
   static int i = 0; 
   static String play;
    public static String forwardSong(){
       
        if (!userPlayList1.isEmpty()){
    
            p=i;
        if (temp==userPlayList1.get(0)){
            i=1;
            temp=null;
        }

         p=i;
      
         if (i>userPlayList1.size()-1){
             String cantPlay = "you have reached end of playlist. want to restart playlist?";
            //System.out.println("you have reached end of playlist. want to restart playlist?");
           
            i=0;
            return cantPlay;
            
         }

         else{
            front = userPlayList1.get(i);
         }

        }

        else{
            return "the playlist has no songs to play";
        }
             
            if (front!=null){
                 play = front.data;
               //System.out.println(front.data);
                front=front.next;
                

                if (i<userPlayList1.size()){
                    i++;
                    
                }
                return play;
                
            } 
            return play;
           
      } 
     


    //restarts playlist
    static int j=1;
    public static Node temp;
    public static String restartPlaylist(){
        
        if (!userPlayList1.isEmpty()){ 
                
                front = userPlayList1.get(0);
                temp=front;
                p=0;
                return temp.data;
               // System.out.println(temp.data);  
                     
          
      } 
      else{
         return "the playlist has no songs";
       // System.out.println("the playlist has no songs");
     }
    
    
    }

    //plays previous song 

    static int p; 
    static int var;
    static String previousSong;
    public static String previousSong(){

        if (!userPlayList1.isEmpty()){ 
            if(var==p){
                p=p-1;
            }

        if (p==userPlayList1.size()){
                p--;
            }

        if (p-1<0){
            String noSong= "there is no song before this. it is first song in playlist";
            return noSong;
        //System.out.println("there is no song before this. it is first song in playlist");
            }

            else{
                front = userPlayList1.get(p-1);
                prev= front;

                if (prev == null ){
                    String noSong2 = "there is no song before this. it is first song in playlist";
                    return noSong2;
                //System.out.println("there is no song before this. it is first song in playlist");

             }

            //METHOD 1 to return to player
          //   String = there is no song ...
          //return string 


                        
            else {
                  var = p;
               previousSong = prev.data;
                              
            // System.out.println(prev.data);
            
                        
                if (p-1==0){
                 i=1;
             }
             return previousSong;  
            }
           
        }       
    }

    else{
        return "the playlist has no songs";
      // System.out.println("the playlist has no songs");
    }
    

        
}

    
    //removes song chosen by user from playlist

    
    
    
    public static String removeSong(String delete){


        for (int i =0; i<userPlayList1.size(); i++){
            
           
            if (i==userPlayList1.size()){
                return "song you want to delete does not exist";
            }

            else if (userPlayList1.get(i).data.equals(delete)){
                userPlayList1.remove(i);

                return delete + " was successfully removed.";
               
            }

     

    }
        return "song you want to delete does not exist";
}

//searches song chosen by user in playlist

    public static String findSong(String find){

        for (int i=0; i<userPlayList1.size(); i++){

             if (i==userPlayList1.size()){
                return "song you searched does not exist in playlist";
            }

            else if (userPlayList1.get(i).data.equals(find)){

                return find + " is in your playlist";
               
            }

           
        }
        return "song you searched does not exist in playlist";

    }

}
    
   

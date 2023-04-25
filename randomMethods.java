import java.util.ArrayList;

public class randomMethods {

    //random playlist created
    static ArrayList<String> randomPlaylist = new ArrayList<String>();

    //added random songs by programmer
    public static void random(){

        randomPlaylist.add("peaches");
        randomPlaylist.add("better days");
        randomPlaylist.add("zero");
        randomPlaylist.add("you");
        randomPlaylist.add("love song");
        randomPlaylist.add("thats hilarious");
        randomPlaylist.add("senorita");
        randomPlaylist.add("stay");
        randomPlaylist.add("ghost");
        randomPlaylist.add("gone");

    }

   
    static int i = 0; 
   static String play;
   static String front;
    public static String playRandom(){
       
        if (!randomPlaylist.isEmpty()){
    
           p=i;
        if (temp==randomPlaylist.get(0)){
            i=1;
            temp=null;
        }

        p=i;
      
         if (i>randomPlaylist.size()-1){
             String cantPlay = "you have reached end of playlist. want to restart playlist?";
            //System.out.println("you have reached end of playlist. want to restart playlist?");
           
          //  i=0;
            return cantPlay;
            
         }

         else{
            front = randomPlaylist.get(i);
         }

        }

        else{
            return "the playlist has no songs to play";
        }
             
            if (front!=null){
                 play = front;
               //System.out.println(front.data);
                front=front+1;
                

                if (i<randomPlaylist.size()){
                    i++;
                    
                }
                return play;
                
            } 
            return play;
           
      } 







    static int p; 
    static int var;
    static String previousSong;
    static String prev;
    public static String previousRandomSong(){

        if (!randomPlaylist.isEmpty()){ 
            if(var==p){
                p=p-1;
            }

        if (p==randomPlaylist.size()){
                p--;
            }

        if (p-1<0){
            String noSong= "there is no song before this. it is first song in playlist";
            return noSong;
        //System.out.println("there is no song before this. it is first song in playlist");
            }

            else{
                front = randomPlaylist.get(p-1);
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
               previousSong = prev;
                              
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
static String temp;
static int j=1;
public static String restartPlaylist(){
    
    if (!randomPlaylist.isEmpty()){ 
            
            front = randomPlaylist.get(0);
            temp=front;
            p=0;
            return temp;
           // System.out.println(temp.data);  
                 
      
  } 
  else{
     return "the playlist has no songs";
   // System.out.println("the playlist has no songs");
 }


  }
 

}

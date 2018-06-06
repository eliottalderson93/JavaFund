import java.util.HashMap;
import java.util.Set;
public class hashmatique {
    public HashMap<String, String> tracklist(String [] name_list, String [] lyric_list){
        HashMap<String, String> tracks = new HashMap<String, String>();
        int length=0;
        if (name_list.length < lyric_list.length){
            length = name_list.length;
            System.out.println("too many lyrics to assign to songs");
        }
        else{
            length = lyric_list.length; //they are equal or this is less
        }
        for(int i = 0; i < length; i++){
            tracks.put(name_list[i],lyric_list[i]);
        }
        return tracks;
    }
    public String getLyrics(String title, HashMap<String, String> album){
        String output = "";
        Set<String> keys = album.keySet();
        for(String key : keys) {
            if (key == title){
                output = album.get(key); //gets the lyrics
            }   
        }
        if (output == ""){
            System.out.println("No such title in album");
        }
        return output;
    }
    public void printAlbum(HashMap<String, String> album){
        System.out.println("");
        String this_lyric;
        Set<String> keys = album.keySet();
        for(String key : keys) {
              this_lyric = album.get(key);
              System.out.print("Song: " + key);
              System.out.print(" || Lyrics: " + this_lyric);
              System.out.println("");
        }
    }
}

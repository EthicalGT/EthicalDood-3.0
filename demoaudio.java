import javazoom.jl.player.*;
import java.io.*;
class demoaudio{
    public static void main(String[] args) throws Exception{
    FileInputStream audio=new FileInputStream("audio/access_denied.mp3");
                    Player player=new Player(audio);
                    player.play();
                }
            }

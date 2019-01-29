import java.util.Scanner;
public class Tv {

    private int channel; 
    private int volumeLevel;
    private boolean on;

    public int getChannel(){
        return channel; 
    }
    public int getVolumeLevel(){
        return volumeLevel;
    }

    public boolean getOn(){
        return on; 
    } 

    public void turnOn(){
        on = true;
    }
   public void turnOn(){
       on = false;
   } 
   public void setChannel(int newChannel){
       if (on && newChannel >= 1 && newChannel <= 120)
           channel = newChannel
           else 
           System.out.println("Sin señal");
       }

   }
   public void setVolume(int newVolumeLevel){
       if (on && newVolumeLeve1 >= 1 && newVolumeLeve1 <= 7)
            volumeLevel = newVolumeLeve1
       else 
       System.out.println("Limite de volumen");

   }
   public void volumeUp(){
       //volumeLevel = volumeLevel + 1;
       if (on && volumeLevel < 7){
       volumeLevel++;
       }
   }
   public void volumeDown(){
       //volumeLevel = volumeLevel - 1;
       if (on && volumeLevel >1 ){
       volumeLevel--;
       }
   }
   public void channelUp(){
       //channelUp = channelUp + 1;
       if (on && channel < 120){
            channel++;
       }
   }
   public void channelDown(){
       //channelDown - 1;
       if (on && channel > 1){
            channel--;
       }
   }
   public static void main(String[] args) {
       Tv sony = new Tv();
        sony.turnOn();
        sony.setChannel(212);
        sony.setVolume(7);

        System.out.println("La tele esta: ") + sony.getOn() +
                            "el channel es: "+ sony.getChannel()
                            "el volumen es: "+ sony.getVolumeLevel()    

        sony.volumeDown();
        System.out.println(sony.getVolumeLevel());
        sony.volumeDown();
        System.out.println(sony.getVolumeLevel());
        sony.volumeDown();
        System.out.println(sony.getVolumeLevel());
        

   }



}

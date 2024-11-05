package utils;

import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SoundPlayer {

    Clip clip;
    URL soundUrl[] = new URL[30];

    public SoundPlayer(){
        soundUrl[0] = getClass().getResource("/res/sound/game-start.wav");
        soundUrl[1] = getClass().getResource("/res/sound/game-over.wav");
        soundUrl[2] = getClass().getResource("/res/sound/game-background.wav");
        soundUrl[3] = getClass().getResource("/res/sound/game-jump.wav");
        soundUrl[4] = getClass().getResource("/res/sound/game-eat.wav");
    }

    public void setFile(int i){
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundUrl[i]);
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void play(){
        clip.start();
    }

    public void playAndWait() {
        clip.start();
        
        try {
            while (!clip.isRunning()) {
                Thread.sleep(10);
            }
            while (clip.isRunning()) {
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    public void loop(){
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void stop(){
        clip.stop();
    }
      
}

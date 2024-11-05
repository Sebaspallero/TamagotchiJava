package main;
import java.util.Scanner;

import state.DeadState;
import utils.SoundPlayer;
import utils.TamagotchiHelper;
import utils.Text;

public class Game {

    private Tamagotchi tamagotchi;
    private Scanner scanner;
    private Text text;
    private SoundPlayer soundPlayer;
    private boolean isMusicPlaying = false;

    public Game(){
        scanner = new Scanner(System.in);
        text = new Text();
        soundPlayer = new SoundPlayer();
    }

    public void StartGame(){
    
        text.showWelcomeScreen();

        if (!isMusicPlaying) {
            playBackground(2); 
            isMusicPlaying = true;
        }

        initializeTamagotchi();
        boolean gameRunning = true;

        while (gameRunning) {
            int option = showMenu();
            gameRunning = processGameOption(option);
            //CHECK IF TAMAGOTCHI DIED
            if (tamagotchi.getCurrentState() instanceof DeadState) {
                playAndWaitSFX(1);
                gameRunning = false;
            }
        }
        text.goodbyeText();
        scanner.close();
    }


    //GAME FUNCTIONS:  

    //GET NAME OF TAMAGOTCHI AND CREATE IT
    public void initializeTamagotchi(){
        boolean validName = false;

        while (!validName) {
            System.out.println("Por favor, elige un nombre para tu Tamagotchi:");
            String name = scanner.nextLine();

            if (TamagotchiHelper.checkName(name)) {
                tamagotchi = Tamagotchi.createTamagotchi(name); 
                playSFX(0);
                validName = true;   
            }else{
                System.out.println("El nombre ingresado no es valido. ¡Intentalo de nuevo!");
            }
        }
    }

    //SHOW GAME OPTIONS

    public int showMenu(){
        System.out.println("");
        System.out.println("Elije una de las opciones: ");
        System.out.println("1- Alimentar");
        System.out.println("2- Jugar");
        System.out.println("3- Salir");
        System.out.println("");
        
        return scanner.nextInt();
    }

    //PROCESS GAME OPTION

    public boolean processGameOption(int option){
           
        switch (option) {
            case 1 -> tamagotchi.eat();
            case 2 -> tamagotchi.play();
            case 3 -> {return false;}
            default -> System.out.println("La opción ingresada no es valida");
        }
        return true;
    }

    //PLAY SOUND FX

    public void playSFX(int i) {
        soundPlayer.setFile(i);
        soundPlayer.play();
        
    }

    public void playAndWaitSFX(int i){
        soundPlayer.setFile(i);
        soundPlayer.playAndWait();
    }

    public void playBackground(int i) {
        soundPlayer.setFile(i);
        soundPlayer.loop();;
        
    }
}   

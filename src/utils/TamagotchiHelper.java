package utils;
import main.TamagochiRenderer;
import main.Tamagotchi;

public class TamagotchiHelper {
        
    public static void showHunger(Tamagotchi tamagotchi){
        System.out.println("Hambre: " + tamagotchi.getHunger());
    }

    public static void renderDeathByHunger(Tamagotchi tamagochi){
        System.out.println(tamagochi.getName() + " murio de hambre");
        TamagochiRenderer.renderDeath();
        showHunger(tamagochi);
    }

    public static void renderDeathByOverfed(Tamagotchi tamagochi){
        System.out.println(tamagochi.getName() + " murio de sobrepeso");
        TamagochiRenderer.renderDeath();
        showHunger(tamagochi);
    }

    public static void renderPlaying(Tamagotchi tamagotchi){
        System.out.println(tamagotchi.getName() + " está jugando!");
        TamagochiRenderer.renderPlaying();
        System.out.println(tamagotchi.getName() + " ahora tiene hambre...");
        showHunger(tamagotchi);
    }

    public static void renderEating(Tamagotchi tamagochi){
        System.out.println(tamagochi.getName() + " está comiendo!");
        TamagochiRenderer.renderEating();
        System.out.println(tamagochi.getName() + " ahora está feliz!");
        showHunger(tamagochi);
    }

    public static boolean checkName(String name) {
        return name != null && !name.trim().isEmpty();
    }
}

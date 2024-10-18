package utils;

public class Text {


    public Text(){

    }

    public void gameTitle(){
        System.out.println( "  _______                                _       _     _   _      _  __     \r\n" + //
                            " |__   __|                              | |     | |   (_) | |    (_)/ _|    \r\n" + //
                            "    | | __ _ _ __ ___   __ _  __ _  ___ | |_ ___| |__  _  | |     _| |_ ___ \r\n" + //
                            "    | |/ _` | '_ ` _ \\ / _` |/ _` |/ _ \\| __/ __| '_ \\| | | |    | |  _/ _ \\\r\n" + //
                            "    | | (_| | | | | | | (_| | (_| | (_) | || (__| | | | | | |____| | ||  __/\r\n" + //
                            "    |_|\\__,_|_| |_| |_|\\__,_|\\__, |\\___/ \\__\\___|_| |_|_| |______|_|_| \\___|\r\n" + //
                            "                              __/ |                                         \r\n" + //
                            "                             |___/                                          ");
    }

    public void greetingTitle(){
        System.out.println("  ____  _                           _     _               \r\n" + //
                        " |  _ \\(_)                         (_)   | |              \r\n" + //
                        " | |_) |_  ___ _ ____   _____ _ __  _  __| | ___     __ _ \r\n" + //
                        " |  _ <| |/ _ \\ '_ \\ \\ / / _ \\ '_ \\| |/ _` |/ _ \\   / _` |\r\n" + //
                        " | |_) | |  __/ | | \\ V /  __/ | | | | (_| | (_) | | (_| |\r\n" + //
                        " |____/|_|\\___|_| |_|\\_/ \\___|_| |_|_|\\__,_|\\___/   \\__,_|\r\n" + //
                        "                                                         ");
    }

    public void goodbyeText(){
        System.out.println(" _  ____                _                                                   \r\n" + //
                        "(_)/ ___|_ __ __ _  ___(_) __ _ ___   _ __   ___  _ __                      \r\n" + //
                        "| | |  _| '__/ _` |/ __| |/ _` / __| | '_ \\ / _ \\| '__|                     \r\n" + //
                        "| | |_| | | | (_| | (__| | (_| \\__ \\ | |_) | (_) | |                        \r\n" + //
                        "|_|\\____|_|  \\__,_|\\___|_|\\__,_|___/ | .__/ \\___/|_|                        \r\n" + //
                        "  (_)_   _  __ _  __ _ _ __    __ _  |_|                                    \r\n" + //
                        "  | | | | |/ _` |/ _` | '__|  / _` |                                        \r\n" + //
                        "  | | |_| | (_| | (_| | |    | (_| |                                        \r\n" + //
                        " _/ |\\__,_|\\__, |\\__,_|_|     \\__,_|                                        \r\n" + //
                        "|__/__     |___/                       _       _     _   _     _  __      _ \r\n" + //
                        "|_   _|_ _ _ __ ___   __ _  __ _  ___ | |_ ___| |__ (_) | |   (_)/ _| ___| |\r\n" + //
                        "  | |/ _` | '_ ` _ \\ / _` |/ _` |/ _ \\| __/ __| '_ \\| | | |   | | |_ / _ \\ |\r\n" + //
                        "  | | (_| | | | | | | (_| | (_| | (_) | || (__| | | | | | |___| |  _|  __/_|\r\n" + //
                        "  |_|\\__,_|_| |_| |_|\\__,_|\\__, |\\___/ \\__\\___|_| |_|_| |_____|_|_|  \\___(_)\r\n" + //
                        "                           |___/                                            ");
    }

    public void showWelcomeScreen(){
        System.out.println("");
        greetingTitle();
        gameTitle();
        System.out.println("");
    } 
}

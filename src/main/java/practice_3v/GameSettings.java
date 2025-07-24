package practice_3v;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    static {
        maxPlayers = 10;
    }

    GameSettings(int currentPlayers, String gameName){
        this.currentPlayers = currentPlayers;
        this.gameName = gameName;



    }

    static  int setMaxPlayer(int newMaxPlayer ){
        return GameSettings.maxPlayers = newMaxPlayer;
    }

    int add(){
        if(this.currentPlayers< maxPlayers){
            return this.currentPlayers +=1;
        }
        else System.out.println("максимальное количество игроков");
        return this.currentPlayers;

    }

    void  printGameStatus(){
        System.out.println("Название игры: " + this.gameName + ". текущее кол-во игроков: " + this.currentPlayers
        + ". Максимальное кол-во игроков: " + GameSettings.maxPlayers);
    }




}




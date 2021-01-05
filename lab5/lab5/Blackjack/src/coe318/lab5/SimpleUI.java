package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        System.out.println("House Cards:");
        for(int i=0;i<game.getHouseCards().getCards().size();i++){
            System.out.println(" "+game.getHouseCards().getCards().get(i));
        }
        System.out.println("Your Cards:");
        for(int i=0;i<game.getYourCards().getCards().size();i++){
            System.out.println(" "+game.getYourCards().getCards().get(i));
        }
        
    }

  @Override
    public boolean hitMe() {
        boolean k;
        
            System.out.printf("Do you want another card?: (Y/N)");
            String s= user.nextLine();
        
            if(s.charAt(0)=='Y'){
                k= true;
            } 
            else if(s.charAt(0)=='N'){
                k= false;
            } 
            else{
                System.out.print("Wrong input thus exited");
                k=false;
            }
        
        return k;
    }

  @Override
    public void gameOver() {
        int h = game.score(game.getHouseCards());
        int u=game.score(game.getYourCards());
        display();
        System.out.println("House score: " + h);
        System.out.println("Your score: " + u);
        
        if(h>21 && u<21 || u<=21 && u>h){
            System.out.println("You Win!");
        }
        else if(h==u){
            System.out.println("Its a tie but, You Lose!");
        }
        else if(u>21 || (h>u && h<21 && u<21)){
            System.out.println("You lose");
        }
        
    }

}
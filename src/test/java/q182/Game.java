package q182;

import java.util.ArrayList;
import java.util.List;

class Player{

}

interface Playable{
    public void play();//body yok; abstarct method;Abstraction
    public void setPlayers(List<Player> players);//body yok; abstarct method;Abstraction
}

class Game implements Playable{//inheritance
    private List<Player> players;
    public List <Player> getPlayers(){
        return players;
    }
    public void setPlayers(List<Player> players){//inheritance
        this.players = players;
    }
    public void play(){
        System.out.println("Played.");
    }//inheritance

    public static void main(String[] args) {
        Playable p = new Game();//Polymorphism;This allows the Game object to be treated as a Playable object, enabling polymorphic behavior.
        List<Player> players = new ArrayList<>();
        p.setPlayers(players);
        p.play();
    }
}
/*
Inheritance: The class Game implements the Playable interface,
inheriting its method signatures (play() and setPlayers(List<Player> players)).
This represents the concept of inheritance, where a class inherits
behavior from an interface.

Abstraction: The Playable interface declares abstract methods play() and
setPlayers(List<Player> players). These methods define a contract that
classes implementing the interface must adhere to. The Game class
implements these methods, providing their concrete implementations.
This represents the concept of abstraction, where behavior is defined
at a higher level of abstraction and implemented in concrete classes.

Polymorphism: The code demonstrates polymorphism through the following
line: Playable p = new Game();. Here, the Game object is assigned to
a variable of type Playable. This allows the Game object to be treated
as a Playable object, enabling polymorphic behavior.
 */
/*

Which statement is true about the implementation of Object-Oriented Programming concepts in the given code?
C. Polymorphism, inheritance, and abstraction are implemented.
Answer:
Played.
* */

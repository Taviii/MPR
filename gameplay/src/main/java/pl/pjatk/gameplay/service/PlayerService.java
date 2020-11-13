package pl.pjatk.gameplay.service;

import org.springframework.stereotype.Service;
import pl.pjatk.gameplay.model.Player;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlayerService {

    public List<Player> findAll(){
        return List.of(
                new Player("1", "Player 1", "100", "10", "5"  ),
                new Player("2", "Player 2", "100", "10", "5"  ),
                new Player("3", "Player 3", "100", "10", "5"  )
        );
    }
public Player finById(int id) {
        List<Player> players =new ArrayList<>();
        players.add(new Player(1, "Player 1", 100, 10, 5));
    players.add(new Player(1, "Player 1", 100, 10, 5));
    players.add(new Player(1, "Player 1", 100, 10, 5));

    players.stream().filter(player -> player.getId() == id).findFirst();

    for (Player player : players) {
        if (player.getId() == id) {
            return player;
        } else {
            return new Player();
        }
    }
}

    public Object findall() {
    }

    public Object findById() {
    }
}

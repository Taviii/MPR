package pl.pjatk.gameplay.service;

import org.springframework.stereotype.Service;
import pl.pjatk.gameplay.model.Player;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;  //stream.of

@Service
public class PlayerService {

    public List<Player> findAll(){

        return  List<String> list = Stream.of(new Player("1", "Player 1", 100, 10, 5)).collect(Collectors.toList());  //zamiast return list.of
        //return List.of(new Player( nickname "Player 1", health 100, attack 10, mana 5)); działa w wyższych jdk niż 8
    }
}

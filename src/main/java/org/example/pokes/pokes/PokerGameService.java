package org.example.pokes.pokes;


import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PokerGameService {

    private static List<PokerGame> PokerGames = new ArrayList<>();
    private static int count = 0;

    static{
        PokerGames.add(new PokerGame(LocalDate.now(), count++, "safa",
                20,40));
    }

    public List<PokerGame> findByUser(String username){
        return PokerGames;
    }


    public void addSession(LocalDate date, String username, float buyIn, float endNight){
        PokerGames.add(new PokerGame(date, count++, username, buyIn, endNight));
    }

    public void deleteById(int id){
        PokerGames.removeIf(predicate -> predicate.getId() == id);
    }
    public PokerGame findById(int id){
        PokerGame game = PokerGames.stream().filter(predicate -> predicate.getId() == id).findFirst().get();
        return game;
    }

//    public void updateSession(@Valid PokerGame game){
//        deleteById(game.getId());
//        PokerGames.add(game);
//    }
    public void updateSession(PokerGame game) {
        for (PokerGame existingGame : PokerGames) {
            if (existingGame.getId() == game.getId()) {
                existingGame.setDate(game.getDate());
                existingGame.setBuyIn(game.getBuyIn());
                existingGame.setEndNight(game.getEndNight());
                existingGame.setNetNight(game.getNetNight());
                existingGame.setUsername(game.getUsername());
                break;
            }
        }
}

}



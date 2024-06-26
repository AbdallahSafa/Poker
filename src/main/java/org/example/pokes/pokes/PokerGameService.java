package org.example.pokes.pokes;


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

}



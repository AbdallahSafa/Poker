package org.example.igogym.pokes;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class PokerGameService {

    private static List<PokerGame> PokerGames = new ArrayList<>();

    static{
        PokerGames.add(new PokerGame(LocalDate.now(), 1, "safa",
                20,40));
    }


    public List<PokerGame> findByUser(String username){
        return PokerGames;
    }

}



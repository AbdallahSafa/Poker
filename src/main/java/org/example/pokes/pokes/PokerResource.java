package org.example.pokes.pokes;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PokerResource {


    private PokerGameRespository pokerGameRespository;

    public PokerResource(PokerGameRespository pokerGameRespository) {
        this.pokerGameRespository = pokerGameRespository;
    }

    @GetMapping("/users/{username}/list-poker-games")
    public List<PokerGame> getPokerGames(@PathVariable String username) {
        return pokerGameRespository.findByUsername(username);

    }
}

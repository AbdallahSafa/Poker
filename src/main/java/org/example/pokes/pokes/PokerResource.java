package org.example.pokes.pokes;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
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

    @GetMapping("/users/{username}/list-poker-games/{id}")
    public PokerGame getPokerGameById(@PathVariable String username , @PathVariable int id )
    {
        return pokerGameRespository.findById(id).orElseThrow();
    }

    @DeleteMapping("/users/{username}/list-poker-games/{id}")
    public ResponseEntity<Void> deleteByID(@PathVariable String username , @PathVariable int id )
    {
        pokerGameRespository.deleteById(id);
        return ResponseEntity.noContent().build();
    }


}

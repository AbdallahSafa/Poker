package org.example.pokes.pokes;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PokerController {


    private PokerGameRespository pokerGameRespository;

    @GetMapping("/auth")
    public String authCheck(){
        return "Success";
    }


    public PokerController(PokerGameRespository pokerGameRespository) {
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

    @PutMapping("/users/{username}/list-poker-games/{id}")
    public PokerGame updateGame(@PathVariable String username , @PathVariable int id , @RequestBody PokerGame game) {
        game.setUsername(username);
        pokerGameRespository.save(game);
        return game;
    }

    @PostMapping("/users/{username}/list-poker-games")
    public PokerGame createGame(@PathVariable String username, @RequestBody PokerGame game) {
        return pokerGameRespository.save(game);
    }

    @GetMapping("/users/{username}/net")
    public Float getNetProfitLossByUser(@PathVariable String username) {
        return pokerGameRespository.getNetProfitLossByUser(username);
    }


}

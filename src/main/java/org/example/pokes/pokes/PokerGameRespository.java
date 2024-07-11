package org.example.pokes.pokes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PokerGameRespository extends JpaRepository<PokerGame, Integer> {

    public List<PokerGame> findByUsername(String username);

    @Query(value = "SELECT * from poker_game where username = :username", nativeQuery = true)
    public List<PokerGame> getListAllByUser(@Param("username") String username);

}

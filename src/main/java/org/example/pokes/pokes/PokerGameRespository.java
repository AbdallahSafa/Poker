package org.example.pokes.pokes;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PokerGameRespository extends JpaRepository<PokerGame, Integer> {

    public List<PokerGame> findByUsername(String username);


}

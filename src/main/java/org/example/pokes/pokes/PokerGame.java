package org.example.pokes.pokes;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PokerGame {
    @Id
    @GeneratedValue
    private int id;
    private String username;
    private float buyIn;
    private float endNight;
    private float netNight;
    @PastOrPresent(message = "Invalid Date")
    private LocalDate date;

    public PokerGame(LocalDate date, int id, String username, float buyIn, float endNight) {

        this.date = date;
        this.id = id;
        this.username = username;
        this.buyIn = buyIn;
        this.endNight = endNight;
        this.netNight = endNight - buyIn;
    }


    @Override
    public String toString() {
        return "pokesGame{" +
                "date=" + date +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", buyIn=" + buyIn +
                ", endNight=" + endNight +
                ", netNight=" + netNight +
                '}';
    }

}

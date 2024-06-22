package org.example.pokes.pokes;


import java.time.LocalDate;

public class PokerGame {
    private LocalDate date;
    private int id;
    private String username;
    private float buyIn;
    private float endNight;
    private float netNight;

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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public float getNetNight() {
        return netNight;
    }

    public void setNetNight(float netNight) {
        this.netNight = netNight;
    }

    public float getEndNight() {
        return endNight;
    }

    public void setEndNight(float endNight) {
        this.endNight = endNight;
    }

    public float getBuyIn() {
        return buyIn;
    }

    public void setBuyIn(float buyIn) {
        this.buyIn = buyIn;
    }
}

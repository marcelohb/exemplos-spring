package pt.mhb.example.domain;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class Vote {

    @Id
    private String id;
    private final LocalDateTime createdAt;
    private final int score;

    public Vote(int score) {
        this.score = score;
        this.createdAt = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Vote [id=" + id + ", createdAt=" + createdAt + ", score=" + score +"]";
    }
}

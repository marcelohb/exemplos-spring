package pt.mhb.example.domain;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "votes")
public class Vote {

    @Id
    private ObjectId id;

    @CreatedDate
    private final LocalDateTime createdAt;

    @Min(value = 1, message = "Score must be 1,2 or 3")
    @Max(value = 3, message = "Score must be 1,2 or 3")
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

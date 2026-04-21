package pt.mhb.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import pt.mhb.example.domain.Vote;

import java.time.LocalDateTime;
import java.util.List;

public interface VoteRepository extends MongoRepository<Vote, String> {

    List<Vote> findByScoreAndCreatedAtBetween(int score, LocalDateTime startDate, LocalDateTime endDate);
    
    List<Vote> findByScore(int score);
    
    List<Vote> findByCreatedAtBetween(LocalDateTime startDate, LocalDateTime endDate);

}

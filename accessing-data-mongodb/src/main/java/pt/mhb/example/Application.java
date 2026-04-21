package pt.mhb.example;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pt.mhb.example.domain.Vote;
import pt.mhb.example.repository.VoteRepository;

import java.time.LocalDate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	ApplicationRunner runner(VoteRepository voteRepository) {
		return args -> {
			voteRepository.save(new Vote(1));
			voteRepository.save(new Vote(2));
			voteRepository.save(new Vote(3));

			long count1 = voteRepository.findByScore(1).stream().count();
			System.out.println("Count of votes with score 1: " + count1);

			long count2 = voteRepository.findByScore(2).stream().count();
			System.out.println("Count of votes with score 2: " + count2);

			long count3 = voteRepository.findByScore(3).stream().count();
			System.out.println("Count of votes with score 3: " + count3);

			long countToday = voteRepository.findByCreatedAtBetween(LocalDate.now().atStartOfDay(), LocalDate.now().plusDays(1).atStartOfDay()).stream().count();
			System.out.println("Count of today votes: " + countToday);

			voteRepository.findAll().stream().forEach(System.out::println);
		};
	}

}

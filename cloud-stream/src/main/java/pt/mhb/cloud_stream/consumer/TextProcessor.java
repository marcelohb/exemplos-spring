package pt.mhb.cloud_stream.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class TextProcessor {

    @Bean
    public Consumer<String> textConsumer() {
        return text -> System.out.println("Received text: " + text);
    }
}

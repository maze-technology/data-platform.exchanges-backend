package tech.maze.data.exchanges.backend.api.eventstream;

import io.cloudevents.CloudEvent;
import java.util.function.Consumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.maze.commons.eventstream.MazeEventProperties;

/**
 * Event stream configuration for exchanges processing.
 */
@Configuration
@EnableConfigurationProperties(MazeEventProperties.class)
@Slf4j
public class ExchangesEventStreamConfiguration {
  /**
   * Handles exchange events delivered via the event stream.
   *
   * @return a consumer for CloudEvents
   */
  @Bean
  public Consumer<CloudEvent> exchangesConsumer() {
    return event -> {
      if (!ExchangeEventTypes.FIND_ONE_REQUEST.equals(event.getType())) {
        log.warn(
            "Skipping event type {} (expected {})",
            event.getType(),
            ExchangeEventTypes.FIND_ONE_REQUEST
        );
        return;
      }

      log.info("Received FindOne exchange event with id {}", event.getId());
    };
  }
}

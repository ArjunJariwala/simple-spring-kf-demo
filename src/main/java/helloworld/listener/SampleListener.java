package helloworld.listener;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

import static helloworld.Messaging.SAMPLE_EXC;

@Slf4j
@Component
public class SampleListener {

    @StreamListener(SAMPLE_EXC)
    public void receiveMsgFromListener(JsonNode msg) {
        log.info("Message received : [{}] ",msg);
    }
}

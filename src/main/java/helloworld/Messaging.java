package helloworld;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Messaging {
    String SAMPLE_EXC = "sample-exc";

    @Input(SAMPLE_EXC)
    SubscribableChannel getSampleEventChannel();
}

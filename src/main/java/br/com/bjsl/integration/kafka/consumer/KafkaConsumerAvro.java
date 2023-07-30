package br.com.bjsl.integration.kafka.consumer;

import br.com.bjsl.integration.kafka.models.MessageModel;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.handler.annotation.Payload;

public class KafkaConsumerAvro {

    @KafkaListener(topics = "topic",
            groupId = "group",
            containerFactory = "kafkaListenerContainerFactory")
    public void receiveMessage(@Payload MessageModel messageModel, Acknowledgment ack) {
        System.out.println("Received Message: " + messageModel);
        ack.acknowledge();
    }
}

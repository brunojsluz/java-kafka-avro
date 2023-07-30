package br.com.bjsl.integration.kafka.producer;

import br.com.bjsl.integration.kafka.models.MessageModel;
import org.springframework.kafka.core.KafkaTemplate;

public class KafkaProducerAvro {

    private String topic;

    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessage(MessageModel messageModel) {
        kafkaTemplate.send(topic, getKeyRecord(messageModel), messageModel);
    }

    private String getKeyRecord(MessageModel messageModel) {
        return "key";
    }
}

package br.com.alura.ecommerce.consumer;

import br.com.alura.ecommerce.Message;
import org.apache.kafka.clients.consumer.ConsumerRecord;

public interface ConsumerService<T> {

    // you may argue that a ConsumerException would be better,
    // and it's ok
    void parse(ConsumerRecord<String, Message<T>> consumerRecord) throws Exception;
    String getTopic();
    String getConsumerGroup();
}

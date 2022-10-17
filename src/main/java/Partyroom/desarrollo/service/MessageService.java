package Partyroom.desarrollo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Partyroom.desarrollo.model.Message;
import Partyroom.desarrollo.repository.MessageRepository;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getAll() {
        return messageRepository.getAll();
    }

    public Optional<Message> getMessage(int idMessage) {
        return messageRepository.getMessage(idMessage);
    }

    public Message save(Message message) {
        if (message.getIdMessage() == null) {
            return messageRepository.save(message);
        } else {
            Optional<Message> tmpMessage = messageRepository.getMessage(message.getIdMessage());
            if (tmpMessage.isEmpty()) {
                return messageRepository.save(message);
            } else {
                return message;
            }
        }
    }

    public Message update(Message message) {
        if (message.getIdMessage() != null) {
            Optional<Message> tmpMessage = messageRepository.getMessage(message.getIdMessage());
            if (!tmpMessage.isEmpty()) {
                return messageRepository.save(message);
            }
        }
        return message;
    }

    public boolean deleteMessage(int id) {
        Boolean result = getMessage(id).map(message -> {
            messageRepository.delete(message);
            return true;
        }).orElse(false);
        return result;
    }
}

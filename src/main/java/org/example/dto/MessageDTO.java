package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.util.User;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageDTO {
    private Long id;
    private String customerId;  // Changed from Long to String to match email
    private String content;
    private Long timestamp;
    private User user;

    public MessageDTO(String customerId, String content, Long timestamp, User user) {
        this.customerId = customerId;
        this.content = content;
        this.timestamp = timestamp;
        this.user = user;
    }
}


package org.example.entity;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.util.User;

@Data
@NoArgsConstructor  // Creates a no-argument constructor
@AllArgsConstructor
@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerId;  // Should match DTO

    @Lob
    private String content;     // Enable multiline storage
    private Long timestamp;

    @Enumerated(EnumType.STRING)
    private User user;
}

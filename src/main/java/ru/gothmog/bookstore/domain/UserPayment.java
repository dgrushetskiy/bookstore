package ru.gothmog.bookstore.domain;

import javax.persistence.*;

/**
 * @author d.grushetskiy
 */
@Entity
public class UserPayment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String type;
    private String cardName;
    private String cardNumber;
    private int expiryMonth;
    private int expiryYear;
    private int cvc;
    private String holderName;
    private boolean defaultPayment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}

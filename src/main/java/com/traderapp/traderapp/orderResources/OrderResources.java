package com.traderapp.traderapp.orderResources;

import com.sun.istack.NotNull;
import com.traderapp.traderapp.customer.Customer;
import com.traderapp.traderapp.orderStatus.OrderStatus;
import com.traderapp.traderapp.resources.Resources;
import com.traderapp.traderapp.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class OrderResources {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime created;

    private LocalDateTime updated;

    private String comments;

    @ManyToOne
    @NotNull
    private User user;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Resources resources;

    @ManyToOne
    private OrderStatus orderStatus;

    @PrePersist
    public void createDate() {
        created = LocalDateTime.now();
    }

    @PreUpdate
    public void updateDate() {
        updated =LocalDateTime.now();
    }

}

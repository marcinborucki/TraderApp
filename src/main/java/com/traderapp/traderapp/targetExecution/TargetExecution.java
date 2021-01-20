package com.traderapp.traderapp.targetExecution;

import com.traderapp.traderapp.target.Target;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class TargetExecution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String targetExecution;

    private Integer Day;

    @ManyToOne
    private Target target;
}

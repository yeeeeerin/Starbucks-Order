package com.example.starbucksorder.domain;


import com.example.starbucksorder.domain.status.CupSize;
import com.example.starbucksorder.domain.status.CupType;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "OPTION")
public class Option {

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OPTION_SEQ_GENERATOR")
    @Column(name = "OPTION_ID")
    @Id
    Long id;

    @Column
    Integer price;

    @Enumerated(EnumType.STRING)
    CupType cupType;

    @Enumerated(EnumType.STRING)
    CupSize cupSize;


    @ManyToOne
    @JoinColumn(name = "PERSONAL_OPTION_ID")
    PersonalOption personalOption;


}
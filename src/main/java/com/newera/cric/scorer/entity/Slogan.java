package com.newera.cric.scorer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "slogan", schema = "public")
@Getter
@Setter
public class Slogan {
    @Id
    private int id;
    private String slogan;
}

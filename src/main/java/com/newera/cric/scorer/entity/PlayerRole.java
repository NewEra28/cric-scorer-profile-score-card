package com.newera.cric.scorer.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "player_role_types", schema = "public")
@Data
public class PlayerRole{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String roleName;
    @Column
    private String description;
}

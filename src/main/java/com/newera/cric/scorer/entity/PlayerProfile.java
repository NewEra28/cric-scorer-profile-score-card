package com.newera.cric.scorer.entity;

import com.newera.cric.scorer.constants.CricScorerServiceConstants;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "user_profile", schema = CricScorerServiceConstants.PUBLIC_SCHEMA)
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PlayerProfile extends Base{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_details_id", referencedColumnName = "id")
    private UserDetail userDetailsId;
    private String nickname;
    private int jerseyNumber;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "player_role_id", referencedColumnName = "id")
    private PlayerRole playerRoleId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "batting_style_id", referencedColumnName = "id")
    private BattingStyle battingStyle;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bowling_style_id", referencedColumnName = "id")
    private BowlingStyle bowlingStyle;
    private String primaryBattingPosition;
    private String secondaryBattingPosition;
    private String primaryBowlingPosition;
    private String secondaryBowlingPosition;
    private String favouritePlayer;
    private String favouriteTeam;
    private String description;
    @Column(name = "is_profile_completed", nullable = false)
    private boolean isProfileCompleted = false;
}
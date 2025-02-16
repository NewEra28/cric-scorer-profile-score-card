package com.newera.cric.scorer.request;

import com.newera.cric.scorer.entity.BattingStyle;
import com.newera.cric.scorer.entity.BowlingStyle;
import com.newera.cric.scorer.entity.PlayerRole;
import com.newera.cric.scorer.entity.UserDetail;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlayerProfileRequest {
    private int id;
    private UserDetail userDetailsId;
    private String nickname;
    private int jerseyNumber;
    private PlayerRole playerRoleId;
    private BattingStyle battingStyle;
    private BowlingStyle bowlingStyle;
    private String primaryBattingPosition;
    private String secondaryBattingPosition;
    private String primaryBowlingPosition;
    private String secondaryBowlingPosition;
    private String favouritePlayer;
    private String favouriteTeam;
    private String description;
}

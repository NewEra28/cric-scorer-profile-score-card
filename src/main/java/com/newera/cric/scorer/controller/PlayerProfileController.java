package com.newera.cric.scorer.controller;

import com.newera.cric.scorer.constants.CricScorerServiceConstants;
import com.newera.cric.scorer.request.PlayerProfileRequest;
import com.newera.cric.scorer.response.PlayerProfileResponse;
import com.newera.cric.scorer.service.PlayerProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CricScorerServiceConstants.BASE_URL)
public class PlayerProfileController {

    @Autowired
    private PlayerProfileService playerProfileService;
    @PostMapping(CricScorerServiceConstants.PROFILE_CREATION_URL)
    public ResponseEntity<PlayerProfileResponse> profileCreation
            (@RequestBody PlayerProfileRequest request){
        return null;
    }
}

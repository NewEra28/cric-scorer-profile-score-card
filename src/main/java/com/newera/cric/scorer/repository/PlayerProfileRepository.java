package com.newera.cric.scorer.repository;

import com.newera.cric.scorer.entity.PlayerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerProfileRepository extends JpaRepository<PlayerProfile, Integer> {
}

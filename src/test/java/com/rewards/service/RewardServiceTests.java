package com.rewards.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardServiceTests {

    private final RewardService rewardService = new RewardService();

    @Test
    public void testCalculatePoints() {
        assertEquals(90, rewardService.calculatePoints(120), "Points for $120 should be 90");
        assertEquals(50, rewardService.calculatePoints(100), "Points for $100 should be 50");
        assertEquals(0, rewardService.calculatePoints(40), "Points for $40 should be 0");
    }
}

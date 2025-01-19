package com.rewards.controller;

import com.rewards.service.RewardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Controller for managing reward-related operations.
 * Handles HTTP requests related to calculating reward points.
 */
@RestController
public class RewardController {

    @Autowired
    private RewardService rewardService; // Service for reward point calculation

    // Handle the root path "/"
    @GetMapping("/")
    public String welcome() {
        return "Welcome to the Rewards Program API! Please use the /api/rewards/calculate endpoint to calculate reward points.";
    }
    /**
     * Endpoint to calculate reward points for a given transaction amount.
     * 
     * @param amount The amount spent in the transaction.
     * @return The calculated reward points.
     */
    @GetMapping("/api/rewards/calculate")
    public int calculateRewards(@RequestParam double amount) {
        return rewardService.calculatePoints(amount);
    }
}

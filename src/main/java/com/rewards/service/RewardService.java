package com.rewards.service;

import com.rewards.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service class responsible for calculating reward points based on the transaction amount.
 */
@Service
public class RewardService {
    @Autowired
    private TransactionRepository transactionRepository;
    /**
     * Calculate reward points based on the amount spent.
     * 
     * @param amount The transaction amount.
     * @return The calculated reward points.
     */
    public int calculatePoints(double amount) {
        int points = 0;
        // For every dollar spent above $100, award 2 points per dollar
        if (amount > 100) {
            points += (int) (2 * (amount - 100));
            amount = 100;
        }
        // For every dollar spent between $50 and $100, award 1 point per dollar
        if (amount > 50) {
            points += (int) (1 * (amount - 50));
        }
        return points;
    }
}

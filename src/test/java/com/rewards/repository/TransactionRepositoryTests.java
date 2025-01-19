package com.rewards.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest // Only this annotation is needed for testing the repository
public class TransactionRepositoryTests {

    @Autowired
    private TransactionRepository transactionRepository;

    @Test
    void testTransactionRepositoryIsNotNull() {
        assertThat(transactionRepository).isNotNull();
    }
}

package com.cake.domain;

import com.cake.application.exception.IllegalOrderStateException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    private Order order;

    @BeforeEach
    void setUp() {
        order = new Order("111", "my name", "my address st", "SMALL", "BACON");
    }

    @Test
    void firsStateIsCreated() {
        assertEquals("CREATED", order.getState());
    }

    @Test
    void updateStateToAccepted() {
        order.accept();
        assertEquals("ACCEPTED", order.getState());
    }

    @Test
    void acceptOnlyWhenStateIsCreated() {
        var previousState = order.getState();
        order.accept();
        var newState = order.getState();

        assertEquals("CREATED", previousState);
        assertEquals("ACCEPTED", newState);
    }

    @Test
    void throwExceptionWhenAccepted() {
        order.reject();
        assertThrows(IllegalOrderStateException.class, () -> order.accept());
    }

    @Test
    void updateStateToRejected() {
        order.reject();
        assertEquals("REJECTED", order.getState());
    }

    @Test
    void updateStateToPreparing() {
        order.preparing();
        assertEquals("PREPARING", order.getState());
    }

}
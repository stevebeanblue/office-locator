package com.solirius.hosehackathon.utilities;

import com.solirius.hosehackathon.domain.Office;
import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateTest {
    @Test
    void shouldReturnMatches() {
        Office o = new Office(
                -0.285419,
                50.828782,
                "Adur Estuary",
                false,
                true,
                false,
                true,
                true,
                true,
                true,
                false
        );

        assertEquals(true, Calculate.hasAttributes(o, 10));

    }


    @Ignore
    @Test
    void noDistance() {
        double distance = Calculate.distance(0,0, 0, 0);
        assertEquals(0, distance);
    }


    @Test
    void distanceBetweenLondonAndCambridge() {
        double distance = Calculate.distance(51.5072, 0.1276, 52.1951, 0.1313);
        assertEquals(47.53, distance, 0.01);
    }

    @Disabled
    @Test
    void speedZero() {
        double actual = Calculate.speed(0, Duration.ofMinutes(0));
        assertEquals(0, actual, 0.0);
    }

    @Disabled
    @Test
    void speedTen() {
        double actual = Calculate.speed(10, Duration.ofHours(1));
        assertEquals(10, actual, 0.0);
    }

    @Disabled
    @Test
    void speedThirty() {
        double actual = Calculate.speed(15, Duration.ofMinutes(30));
        assertEquals(30, actual, 0.0);
    }

    @Disabled
    @Test
    void speedFourHundred() {
        double actual = Calculate.speed(100, Duration.ofMinutes(15));
        assertEquals(400, actual, 0.0);
    }
}
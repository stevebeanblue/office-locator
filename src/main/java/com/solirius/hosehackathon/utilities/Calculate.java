package com.solirius.hosehackathon.utilities;

import com.solirius.hosehackathon.domain.Office;
import org.hibernate.cfg.NotYetImplementedException;

import java.time.Duration;

public class Calculate {

    /**
     *
     * @param milesDistance
     * @param duration
     * @return the resulting speed as milesDistance/hour
     */
    public static double speed(double milesDistance, Duration duration){
        //Calculate speed
        return 0;
    }

    public static double distance(double lat1, double lon1, double lat2, double lon2) {
        //Calculate distance
        return 0;
    }

    public static boolean hasAttributes(Office o, int attributesRequired) {
        throw new NotYetImplementedException();
    }
}

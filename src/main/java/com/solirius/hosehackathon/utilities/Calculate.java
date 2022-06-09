package com.solirius.hosehackathon.utilities;

import com.solirius.hosehackathon.domain.Office;
import org.hibernate.cfg.NotYetImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import com.solirius.hosehackathon.repository.OfficeRepository;

import java.time.Duration;

public class Calculate {

    @Autowired
    private OfficeRepository officeRepository;


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

    public static boolean hasAttributes(Office office, int attributesRequired)
    {
        int currentLocation = office.getBinaryTotal();
        Boolean match = (currentLocation & attributesRequired) == attributesRequired;

        return match;
    }
}

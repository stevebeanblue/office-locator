package com.solirius.hosehackathon.utilities;

import com.solirius.hosehackathon.domain.Office;
import org.locationtech.jts.algorithm.distance.DiscreteHausdorffDistance;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.PrecisionModel;
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
        Coordinate c1 = new Coordinate(lat1, lon1);
        Coordinate c2 = new Coordinate(lat2, lon2);

        Point p1 = new Point(c1, new PrecisionModel(), 4326);
        Point p2 = new Point(c2, new PrecisionModel(), 4326);

        DiscreteHausdorffDistance dhDistance = new DiscreteHausdorffDistance(p1, p2);

        double statuteMiles = dhDistance.distance() * 69;

        return statuteMiles;
    }

    public static boolean hasAttributes(Office office, int attributesRequired)
    {
        int currentLocation = office.getBinaryTotal();
        var a = "";
        Boolean match = (currentLocation & attributesRequired) == attributesRequired;

        return match;
    }
}

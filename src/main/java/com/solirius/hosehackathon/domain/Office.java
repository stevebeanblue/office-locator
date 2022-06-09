package com.solirius.hosehackathon.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Office {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private double latitude;
    private double longitude;

    private String name;

    private boolean wifi; //1

    private boolean extendedAccess; //2

    private boolean meetingRooms; //4

    private boolean kitchen; //8

    private boolean breakArea; //16

    private boolean petFriendly; //32

    private boolean printing; //64

    private boolean shower; //128

    public Office() {
    }

    public Office(double latitude, double longitude, String name, boolean wifi, boolean extendedAccess, boolean meetingRooms, boolean kitchen, boolean breakArea, boolean petFriendly, boolean printing, boolean shower) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.wifi = wifi;
        this.extendedAccess = extendedAccess;
        this.meetingRooms = meetingRooms;
        this.kitchen = kitchen;
        this.breakArea = breakArea;
        this.petFriendly = petFriendly;
        this.printing = printing;
        this.shower = shower;
    }

    public int getBinaryTotal(){
        int numberOfProps = this.getClass().getDeclaredFields().length - 4;
        int binaryVal = 1;

        for (int i = 1; i < numberOfProps; i++) {
            binaryVal =  binaryVal + binaryVal;
        }

        return binaryVal;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isExtendedAccess() {
        return extendedAccess;
    }

    public void setExtendedAccess(boolean extendedAccess) {
        this.extendedAccess = extendedAccess;
    }

    public boolean isMeetingRooms() {
        return meetingRooms;
    }

    public void setMeetingRooms(boolean meetingRooms) {
        this.meetingRooms = meetingRooms;
    }

    public boolean isKitchen() {
        return kitchen;
    }

    public void setKitchen(boolean kitchen) {
        this.kitchen = kitchen;
    }

    public boolean isBreakArea() {
        return breakArea;
    }

    public void setBreakArea(boolean breakArea) {
        this.breakArea = breakArea;
    }

    public boolean isPetFriendly() {
        return petFriendly;
    }

    public void setPetFriendly(boolean petFriendly) {
        this.petFriendly = petFriendly;
    }

    public boolean isPrinting() {
        return printing;
    }

    public void setPrinting(boolean printing) {
        this.printing = printing;
    }

    public boolean isShower() {
        return shower;
    }

    public void setShower(boolean shower) {
        this.shower = shower;
    }
}

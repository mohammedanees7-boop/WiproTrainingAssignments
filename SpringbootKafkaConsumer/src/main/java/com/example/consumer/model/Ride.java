package com.example.consumer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "rides")
public class Ride {

    @Id
    private Long id;

    private String driverName;
    private String passengerName;
    private String pickupLocation;
    private String dropLocation;
    private Double fare;

    @Transient
    private String operation; // transient for deserialization use only

    public Ride() {}

    // getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDriverName() { return driverName; }
    public void setDriverName(String driverName) { this.driverName = driverName; }

    public String getPassengerName() { return passengerName; }
    public void setPassengerName(String passengerName) { this.passengerName = passengerName; }

    public String getPickupLocation() { return pickupLocation; }
    public void setPickupLocation(String pickupLocation) { this.pickupLocation = pickupLocation; }

    public String getDropLocation() { return dropLocation; }
    public void setDropLocation(String dropLocation) { this.dropLocation = dropLocation; }

    public Double getFare() { return fare; }
    public void setFare(Double fare) { this.fare = fare; }

    public String getOperation() { return operation; }
    public void setOperation(String operation) { this.operation = operation; }
}

package com.Tracker.Satellite.model;

public class IssLocater {
//    {"timestamp": 1647068230,
//    "iss_position": {"latitude": "38.1340", "longitude": "-36.1829"},
//    "message": "success"}

    private long timestamp;
    private IssPosition iss_position;
    private String message;


    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public IssPosition getIss_position() {
        return iss_position;
    }

    public void setIss_position(IssPosition iss_position) {
        this.iss_position = iss_position;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "IssLocater{" +
                "timestamp=" + timestamp +
                ", iss_position=" + iss_position +
                ", message='" + message + '\'' +
                '}';
    }
}

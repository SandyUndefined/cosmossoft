package com.sandy.cosmossoft.data.model;

public class CircleModel {
    public String circle;
    public String circleCode;

    public CircleModel(String circle2, String circleCode2) {
        this.circle = circle2;
        this.circleCode = circleCode2;
    }

    public String getCircle() {
        return this.circle;
    }

    public void setCircle(String circle2) {
        this.circle = circle2;
    }

    public String getCircleCode() {
        return this.circleCode;
    }

    public void setCircleCode(String circleCode2) {
        this.circleCode = circleCode2;
    }
}

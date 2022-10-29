package com.sandy.cosmossoft.data.model;

public class PackageType {
    public String name;
    public long value;

    public PackageType(String name2, long value2) {
        this.name = name2;
        this.value = value2;
    }

    public long getValue() {
        return this.value;
    }

    public void setValue(long value2) {
        this.value = value2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name2) {
        this.name = name2;
    }

    public String toString() {
        return this.name;
    }
}

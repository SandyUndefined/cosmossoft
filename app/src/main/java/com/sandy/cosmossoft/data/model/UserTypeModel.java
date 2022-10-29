package com.sandy.cosmossoft.data.model;

public class UserTypeModel {
    public String authority;

    /* renamed from: id */
    public String f3439id;
    public String name;
    public String owner;
    public String owner_id;

    public UserTypeModel(String id, String name2, String owner2, String owner_id2, String authority2) {
        this.f3439id = id;
        this.name = name2;
        this.owner = owner2;
        this.owner_id = owner_id2;
        this.authority = authority2;
    }

    public String getId() {
        return this.f3439id;
    }

    public void setId(String id) {
        this.f3439id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name2) {
        this.name = name2;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner2) {
        this.owner = owner2;
    }

    public String getOwner_id() {
        return this.owner_id;
    }

    public void setOwner_id(String owner_id2) {
        this.owner_id = owner_id2;
    }

    public String getAuthority() {
        return this.authority;
    }

    public void setAuthority(String authority2) {
        this.authority = authority2;
    }

    public String toString() {
        return this.name;
    }
}

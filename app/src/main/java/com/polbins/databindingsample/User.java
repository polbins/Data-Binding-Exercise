package com.polbins.databindingsample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class User extends BaseObservable {
    private String firstName;
    private String lastName;
    private int points;

    public User(String firstName, String lastName, int points) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.points = points;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(com.polbins.databindingsample.BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(com.polbins.databindingsample.BR.lastName);
    }

    @Bindable
    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
        notifyPropertyChanged(com.polbins.databindingsample.BR.points);
    }
}

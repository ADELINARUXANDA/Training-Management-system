package com.sda.trainingmanagementsystem.model;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;

public class UserNotifications<Arraylist> {
    @OneToMany
    private Arraylist<Notification> readNotifications;
    @OneToMany
    private ArrayList<Notification> unreadNotifications;

    public Arraylist<Notification> getReadNotifications() {
        return readNotifications;
    }

    public void setReadNotifications(Arraylist<Notification> readNotifications) {
        this.readNotifications = readNotifications;
    }

    public ArrayList<Notification> getUnreadNotifications() {
        return unreadNotifications;
    }

    public void setUnreadNotifications(ArrayList<Notification> unreadNotifications) {
        this.unreadNotifications = unreadNotifications;
    }
}

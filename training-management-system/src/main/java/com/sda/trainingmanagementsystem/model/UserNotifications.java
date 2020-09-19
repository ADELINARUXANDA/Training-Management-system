package com.sda.trainingmanagementsystem.model;

public class UserNotifications {
    private Notification readNotifications;
    private Notification unreadNotifications;

    public Notification getReadNotifications() {
        return readNotifications;
    }

    public void setReadNotifications(Notification readNotifications) {
        this.readNotifications = readNotifications;
    }

    public Notification getUnreadNotifications() {
        return unreadNotifications;
    }

    public void setUnreadNotifications(Notification unreadNotifications) {
        this.unreadNotifications = unreadNotifications;
    }
}

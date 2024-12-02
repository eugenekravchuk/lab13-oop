package com.example;

import java.time.Instant;

public class MessageSender {
    public void send(String text, User user, String country) {
        if (!user.getCountry().equalsIgnoreCase(country)) {
            System.out.println("User is not in the specified country.");
            return;
        }

        long currentTime = Instant.now().getEpochSecond();
        if (currentTime - user.getLastActiveTime() > 3600) { 
            System.out.println("User has not been active in the last hour.");
            return;
        }

        System.out.printf("Sending message: '%s' to %s%n", text, user.getEmail());
    }
}


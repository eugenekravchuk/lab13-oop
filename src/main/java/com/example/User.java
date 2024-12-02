package com.example;

public interface User {
    String getEmail();
    String getCountry();
    long getLastActiveTime(); // UNIX timestamp
}

package com.example;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        TwitterUser twitterUser = new TwitterUser("twitter@example.com", "USA", Instant.now().getEpochSecond());
        FacebookUser facebookUser = new FacebookUser("facebook@example.com", "Canada", Instant.now().getEpochSecond() - 4000);

        User twitterAdapter = new TwitterUserAdapter(twitterUser);
        User facebookAdapter = new FacebookUserAdapter(facebookUser);

        MessageSender sender = new MessageSender();

        sender.send("Hello, Twitter!", twitterAdapter, "USA");
        sender.send("Hello, Facebook!", facebookAdapter, "Canada");
    }
}

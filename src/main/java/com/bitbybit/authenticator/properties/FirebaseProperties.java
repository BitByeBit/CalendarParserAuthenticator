package com.bitbybit.authenticator.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("firebase")
public class FirebaseProperties {
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}

package com.Capstone.AdminService.IDGenerator;

import java.security.SecureRandom;

public class IdGenerator {
	private static final String ALPHANUMERIC_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final SecureRandom RANDOM = new SecureRandom();
    
    public String generateAlphanumeric() {
        StringBuilder builder = new StringBuilder(16);
        // Generate the alphanumeric string by selecting random characters from the defined set
        for (int i = 0; i < 16; i++) {
            int randomIndex = RANDOM.nextInt(ALPHANUMERIC_CHARACTERS.length());
            builder.append(ALPHANUMERIC_CHARACTERS.charAt(randomIndex));
        }
        return builder.toString();
    }
}

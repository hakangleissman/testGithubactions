package org.example;

public class TextUtil {
    public String toNameFormat(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        // Convert the string to lowercase first and then capitalize the first letter
        String lowerCaseInput = input.toLowerCase();
        return Character.toUpperCase(lowerCaseInput.charAt(0)) + lowerCaseInput.substring(1);
    }
}

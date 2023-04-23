package io.arrogantprogrammer.domain;

public record RegisterAttendeeCommand(
        String email,
        String firstName,
        String lastName,
        boolean isStudent,
        String streetAddress1,
        String streetAddress2,
        String stateOrProvince,
        String postCode,
        MealPreference mealPreference) {
}

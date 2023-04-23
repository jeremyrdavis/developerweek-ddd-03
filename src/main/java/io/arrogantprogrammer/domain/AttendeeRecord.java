package io.arrogantprogrammer.domain;

import java.util.List;

public record AttendeeRecord(Long id, String email, String firstName, String lastName, boolean isStudent, List<ConferenceSession> conferenceSessions) {
}

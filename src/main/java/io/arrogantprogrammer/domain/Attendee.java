package io.arrogantprogrammer.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Attendee extends PanacheEntity {

    String email;

    String firstName;

    String lastName;

    boolean student;

    @OneToMany
    List<ConferenceSession> conferenceSessions;

    public Attendee() {
    }

    public Attendee(String email, String firstName, String lastName, List<ConferenceSession> conferenceSessions) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.conferenceSessions = conferenceSessions;
    }

    static AttendeeRegistrationEvent  registerAttendee(Attendee attendee) {

        return new AttendeeRegistrationEvent(
            attendee
        );

    }

    String getEmail() {
        return email;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    List<ConferenceSession> getConferenceSessions() {
        return conferenceSessions;
    }
}

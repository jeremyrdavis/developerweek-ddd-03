package io.arrogantprogrammer.domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ConferenceSession extends PanacheEntity {

    @ManyToOne
    @JoinColumn(name = "attendee_id")
    Attendee attendee;

    Long conferenceSessionId;

    public ConferenceSession() {
    }

    public ConferenceSession(Attendee attendee, Long conferenceSessionId) {
        this.attendee = attendee;
        this.conferenceSessionId = conferenceSessionId;
    }
}

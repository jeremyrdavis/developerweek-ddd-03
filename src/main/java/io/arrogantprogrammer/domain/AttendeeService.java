package io.arrogantprogrammer.domain;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AttendeeService {

    /*
        Provides a public API to the domain for use by adapters
     */

    public AttendeeRecord registerAttendee(RegisterAttendeeCommand registerAttendeeCommand) {

        Attendee attendee = new Attendee();
        attendee.email = registerAttendeeCommand.email();
        attendee.firstName = registerAttendeeCommand.firstName();
        attendee.lastName = registerAttendeeCommand.lastName();
        attendee.student = registerAttendeeCommand.isStudent();

        Attendee.registerAttendee(attendee);
    }
}

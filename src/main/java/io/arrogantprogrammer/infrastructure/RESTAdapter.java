package io.arrogantprogrammer.infrastructure;

import io.arrogantprogrammer.domain.AttendeeRecord;
import io.arrogantprogrammer.domain.AttendeeService;
import io.arrogantprogrammer.domain.RegisterAttendeeCommand;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("/attendees")
public class RESTAdapter {

    @Inject
    AttendeeService attendeeService;

    @GET
    public Response allAttendees(RegisterAttendeeCommand registerAttendeeCommand) {

        RegistrationConfirmation registrationConfirmation = attendeeService.registerAttendee(registerAttendeeCommand);
        return Response.created(URI.create("/attendees" + registrationConfirmation.id())).entity(registrationConfirmation).build();
    }
}

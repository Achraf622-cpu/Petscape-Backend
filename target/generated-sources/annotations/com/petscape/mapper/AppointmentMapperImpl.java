package com.petscape.mapper;

import com.petscape.dto.AppointmentResponse;
import com.petscape.entity.Animal;
import com.petscape.entity.Appointment;
import com.petscape.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-25T11:14:24+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class AppointmentMapperImpl implements AppointmentMapper {

    @Override
    public AppointmentResponse toResponse(Appointment a) {
        if ( a == null ) {
            return null;
        }

        AppointmentResponse.AppointmentResponseBuilder appointmentResponse = AppointmentResponse.builder();

        appointmentResponse.userId( aUserId( a ) );
        appointmentResponse.animalId( aAnimalId( a ) );
        appointmentResponse.animalName( aAnimalName( a ) );
        appointmentResponse.createdAt( a.getCreatedAt() );
        appointmentResponse.dateTime( a.getDateTime() );
        appointmentResponse.id( a.getId() );
        appointmentResponse.notes( a.getNotes() );
        appointmentResponse.status( a.getStatus() );

        appointmentResponse.userFullName( a.getUser().getFirstname() + " " + a.getUser().getLastname() );

        return appointmentResponse.build();
    }

    private Long aUserId(Appointment appointment) {
        if ( appointment == null ) {
            return null;
        }
        User user = appointment.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long aAnimalId(Appointment appointment) {
        if ( appointment == null ) {
            return null;
        }
        Animal animal = appointment.getAnimal();
        if ( animal == null ) {
            return null;
        }
        Long id = animal.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String aAnimalName(Appointment appointment) {
        if ( appointment == null ) {
            return null;
        }
        Animal animal = appointment.getAnimal();
        if ( animal == null ) {
            return null;
        }
        String name = animal.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}

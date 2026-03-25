package com.petscape.mapper;

import com.petscape.dto.AdoptionRequestResponse;
import com.petscape.entity.AdoptionRequest;
import com.petscape.entity.Animal;
import com.petscape.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-25T11:14:24+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class AdoptionRequestMapperImpl implements AdoptionRequestMapper {

    @Override
    public AdoptionRequestResponse toResponse(AdoptionRequest ar) {
        if ( ar == null ) {
            return null;
        }

        AdoptionRequestResponse.AdoptionRequestResponseBuilder adoptionRequestResponse = AdoptionRequestResponse.builder();

        adoptionRequestResponse.userId( arUserId( ar ) );
        adoptionRequestResponse.animalId( arAnimalId( ar ) );
        adoptionRequestResponse.animalName( arAnimalName( ar ) );
        adoptionRequestResponse.createdAt( ar.getCreatedAt() );
        adoptionRequestResponse.id( ar.getId() );
        adoptionRequestResponse.message( ar.getMessage() );
        adoptionRequestResponse.status( ar.getStatus() );

        adoptionRequestResponse.userFullName( ar.getUser().getFirstname() + " " + ar.getUser().getLastname() );

        return adoptionRequestResponse.build();
    }

    private Long arUserId(AdoptionRequest adoptionRequest) {
        if ( adoptionRequest == null ) {
            return null;
        }
        User user = adoptionRequest.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long arAnimalId(AdoptionRequest adoptionRequest) {
        if ( adoptionRequest == null ) {
            return null;
        }
        Animal animal = adoptionRequest.getAnimal();
        if ( animal == null ) {
            return null;
        }
        Long id = animal.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String arAnimalName(AdoptionRequest adoptionRequest) {
        if ( adoptionRequest == null ) {
            return null;
        }
        Animal animal = adoptionRequest.getAnimal();
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

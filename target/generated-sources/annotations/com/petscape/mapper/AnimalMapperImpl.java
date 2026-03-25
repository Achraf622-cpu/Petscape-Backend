package com.petscape.mapper;

import com.petscape.dto.AnimalRequest;
import com.petscape.dto.AnimalResponse;
import com.petscape.entity.Animal;
import com.petscape.entity.Species;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-25T11:14:24+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class AnimalMapperImpl implements AnimalMapper {

    @Override
    public AnimalResponse toResponse(Animal animal) {
        if ( animal == null ) {
            return null;
        }

        AnimalResponse.AnimalResponseBuilder animalResponse = AnimalResponse.builder();

        animalResponse.speciesId( animalSpeciesId( animal ) );
        animalResponse.speciesName( animalSpeciesName( animal ) );
        animalResponse.age( animal.getAge() );
        animalResponse.breed( animal.getBreed() );
        animalResponse.createdAt( animal.getCreatedAt() );
        animalResponse.description( animal.getDescription() );
        animalResponse.id( animal.getId() );
        List<String> list = animal.getImages();
        if ( list != null ) {
            animalResponse.images( new ArrayList<String>( list ) );
        }
        animalResponse.location( animal.getLocation() );
        animalResponse.name( animal.getName() );
        animalResponse.status( animal.getStatus() );
        animalResponse.updatedAt( animal.getUpdatedAt() );

        return animalResponse.build();
    }

    @Override
    public Animal toEntity(AnimalRequest request) {
        if ( request == null ) {
            return null;
        }

        Animal.AnimalBuilder animal = Animal.builder();

        animal.age( request.getAge() );
        animal.breed( request.getBreed() );
        animal.description( request.getDescription() );
        animal.location( request.getLocation() );
        animal.name( request.getName() );
        animal.status( request.getStatus() );

        return animal.build();
    }

    @Override
    public void updateEntityFromRequest(AnimalRequest request, Animal animal) {
        if ( request == null ) {
            return;
        }

        if ( request.getAge() != null ) {
            animal.setAge( request.getAge() );
        }
        if ( request.getBreed() != null ) {
            animal.setBreed( request.getBreed() );
        }
        if ( request.getDescription() != null ) {
            animal.setDescription( request.getDescription() );
        }
        if ( request.getLocation() != null ) {
            animal.setLocation( request.getLocation() );
        }
        if ( request.getName() != null ) {
            animal.setName( request.getName() );
        }
        if ( request.getStatus() != null ) {
            animal.setStatus( request.getStatus() );
        }
    }

    private Long animalSpeciesId(Animal animal) {
        if ( animal == null ) {
            return null;
        }
        Species species = animal.getSpecies();
        if ( species == null ) {
            return null;
        }
        Long id = species.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String animalSpeciesName(Animal animal) {
        if ( animal == null ) {
            return null;
        }
        Species species = animal.getSpecies();
        if ( species == null ) {
            return null;
        }
        String name = species.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}

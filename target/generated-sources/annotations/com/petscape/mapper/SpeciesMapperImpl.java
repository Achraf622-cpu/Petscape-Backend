package com.petscape.mapper;

import com.petscape.dto.SpeciesRequest;
import com.petscape.dto.SpeciesResponse;
import com.petscape.entity.Species;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-25T11:14:23+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class SpeciesMapperImpl implements SpeciesMapper {

    @Override
    public SpeciesResponse toResponse(Species species) {
        if ( species == null ) {
            return null;
        }

        SpeciesResponse.SpeciesResponseBuilder speciesResponse = SpeciesResponse.builder();

        speciesResponse.description( species.getDescription() );
        speciesResponse.id( species.getId() );
        speciesResponse.name( species.getName() );

        return speciesResponse.build();
    }

    @Override
    public Species toEntity(SpeciesRequest request) {
        if ( request == null ) {
            return null;
        }

        Species.SpeciesBuilder species = Species.builder();

        species.description( request.getDescription() );
        species.name( request.getName() );

        return species.build();
    }

    @Override
    public void updateEntityFromRequest(SpeciesRequest request, Species species) {
        if ( request == null ) {
            return;
        }

        if ( request.getDescription() != null ) {
            species.setDescription( request.getDescription() );
        }
        if ( request.getName() != null ) {
            species.setName( request.getName() );
        }
    }
}

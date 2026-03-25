package com.petscape.mapper;

import com.petscape.dto.AnimalReportResponse;
import com.petscape.entity.AnimalReport;
import com.petscape.entity.Species;
import com.petscape.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-25T11:14:24+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class AnimalReportMapperImpl implements AnimalReportMapper {

    @Override
    public AnimalReportResponse toResponse(AnimalReport report) {
        if ( report == null ) {
            return null;
        }

        AnimalReportResponse.AnimalReportResponseBuilder animalReportResponse = AnimalReportResponse.builder();

        animalReportResponse.userId( reportUserId( report ) );
        animalReportResponse.speciesId( reportSpeciesId( report ) );
        animalReportResponse.speciesName( reportSpeciesName( report ) );
        animalReportResponse.age( report.getAge() );
        animalReportResponse.breed( report.getBreed() );
        animalReportResponse.contactEmail( report.getContactEmail() );
        animalReportResponse.contactName( report.getContactName() );
        animalReportResponse.contactPhone( report.getContactPhone() );
        animalReportResponse.createdAt( report.getCreatedAt() );
        animalReportResponse.dateReported( report.getDateReported() );
        animalReportResponse.description( report.getDescription() );
        animalReportResponse.gender( report.getGender() );
        animalReportResponse.id( report.getId() );
        animalReportResponse.image( report.getImage() );
        animalReportResponse.isFound( report.getIsFound() );
        animalReportResponse.latitude( report.getLatitude() );
        animalReportResponse.location( report.getLocation() );
        animalReportResponse.longitude( report.getLongitude() );
        animalReportResponse.name( report.getName() );
        animalReportResponse.status( report.getStatus() );

        animalReportResponse.userFullName( report.getUser().getFirstname() + " " + report.getUser().getLastname() );

        return animalReportResponse.build();
    }

    private Long reportUserId(AnimalReport animalReport) {
        if ( animalReport == null ) {
            return null;
        }
        User user = animalReport.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long reportSpeciesId(AnimalReport animalReport) {
        if ( animalReport == null ) {
            return null;
        }
        Species species = animalReport.getSpecies();
        if ( species == null ) {
            return null;
        }
        Long id = species.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String reportSpeciesName(AnimalReport animalReport) {
        if ( animalReport == null ) {
            return null;
        }
        Species species = animalReport.getSpecies();
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

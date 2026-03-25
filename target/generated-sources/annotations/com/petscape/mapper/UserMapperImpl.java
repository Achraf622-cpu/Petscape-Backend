package com.petscape.mapper;

import com.petscape.dto.UserResponse;
import com.petscape.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-03-25T11:14:24+0100",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.45.0.v20260128-0750, environment: Java 21.0.9 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserResponse toResponse(User user) {
        if ( user == null ) {
            return null;
        }

        UserResponse.UserResponseBuilder userResponse = UserResponse.builder();

        userResponse.banComment( user.getBanComment() );
        if ( user.getBanReason() != null ) {
            userResponse.banReason( user.getBanReason().name() );
        }
        userResponse.banned( user.isBanned() );
        userResponse.bannedAt( user.getBannedAt() );
        userResponse.bannedUntil( user.getBannedUntil() );
        userResponse.createdAt( user.getCreatedAt() );
        userResponse.email( user.getEmail() );
        userResponse.firstname( user.getFirstname() );
        userResponse.id( user.getId() );
        userResponse.lastname( user.getLastname() );
        userResponse.phone( user.getPhone() );

        userResponse.role( user.getRole().name() );
        userResponse.emailVerified( user.getEmailVerifiedAt() != null );

        return userResponse.build();
    }
}

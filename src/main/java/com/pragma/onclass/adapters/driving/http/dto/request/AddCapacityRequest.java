package com.pragma.onclass.adapters.driving.http.dto.request;
import com.pragma.onclass.adapters.driving.http.util.DomainConstants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@AllArgsConstructor
@Getter
public class AddCapacityRequest {

        @NotBlank(message = DomainConstants.FIELD_NAME_NULL_MESSAGE)
        @Size(max = 50, message = DomainConstants.FIELD_NAME_SIZE_MESSAGE)
        private  final String name;

        @NotBlank(message = DomainConstants.FIELD_DESCRIPTION_NULL_MESSAGE)
        @Size(max = 90, message = DomainConstants.FIELD_DESCRIPTION_SIZE_MESSAGE)
        private final String description;


        @NotEmpty(message = DomainConstants.FIELD_TECHNOLOGIES_EMPTY_MESSAGE)
        @Size(max = 20,min = 3, message = DomainConstants.FIELD_TECHNOLOGIES_SIZE_MESSAGE)
        private final List<Long> technologies;

}

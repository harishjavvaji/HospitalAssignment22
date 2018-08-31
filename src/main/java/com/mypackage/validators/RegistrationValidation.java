package com.mypackage.validators;

import com.mypackage.models.Registration;
import org.springframework.validation.Errors;


public class RegistrationValidation implements org.springframework.validation.Validator {

    CharSequence charSequence = "!@#$%";

    public boolean supports(Class<?> aClass) {

        return Registration.class.equals(aClass);
    }

    public void validate(Object o, Errors errors) {

        Registration registration = (Registration)o;

        if (registration.firstName == null || registration.firstName.equals("")) {

            errors.rejectValue("firstName", "registration.firstName", "First Name is null or empty");
        }

        if (registration.lastName == null || registration.lastName.equals("")) {
            errors.rejectValue("lastName", "registration.lastName", "Last Name is null or empty");
        }

        if (registration.password.contains(charSequence)) {

            errors.rejectValue("password", "registration.password", "Password contains !@#$");
        }

    }
}

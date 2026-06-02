package com.eduhub.eduhub_backend.Exception;

//Custom Exception
//class Child extends Parent
public class ResourceNotFoundException extends RuntimeException {

    //constructor
        public ResourceNotFoundException(String resource, String field, String error) {

            // super:Calls parent class (RuntimeException) constructor.
            super(String.format( //Produces formatted string.
                    "%s not found with %s : %s",
                    resource,
                    field,
                    error
            ));
        }
}


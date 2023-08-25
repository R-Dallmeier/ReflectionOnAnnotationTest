package de.oth.ajp.annotations;

import  java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface PublishOnline {

    String value() default "http://othr.de/ajp/services/default";   //ohne default braucht jedes "@PublishOnline" einen String in Klammern/als Constructor

}

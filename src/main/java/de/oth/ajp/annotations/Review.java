package de.oth.ajp.annotations;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)

public @interface Review {

    String[] reviewers() default "ghgk";

    Criticality criticality();
}

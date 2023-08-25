package de.oth.ajp.annotations;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

import static de.oth.ajp.annotations.Criticality.*;




@Review(reviewers = {"John Doe", "Max Mustermann"}, criticality = SEVERE)

public class SampleAnnotatedClass {
    @PublishOnline("http://othr.de/ajp/services/testresult")
    public double getTestResultByStudentId(String studentId) {
        return 0.0;
    }

    @PublishOnline
    public String getHelpText() {
        // Method has to be reached on default URL:
        // http://othr.de/ajp/services/default
        return "helping text";
    }


    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> clazz = Class.forName("de.oth.ajp.annotations.SampleAnnotatedClass");


        System.out.println("Class annotations:");

        for(Annotation annotation : clazz.getDeclaredAnnotations()){

            System.out.println(annotation);

        }



        System.out.println();
        System.out.println("Method annotations:");

        for(Method method :clazz.getDeclaredMethods()){

            for(Annotation annotation : method.getDeclaredAnnotations()){

                System.out.println(method.getName() + ":    " + annotation);

            }

        }

        System.out.println("Annotations der Annotations:");

        for(Annotation a : clazz.getDeclaredAnnotations()){
            for(Annotation an: a.annotationType().getDeclaredAnnotations()){
                System.out.println(an);
            }
        }






    }


}




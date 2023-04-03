package org.gmalandrakis.deld.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Target({METHOD, TYPE})
@Retention(RUNTIME)
/**
     The methods using it must return AsyncResponse<T>.
**/
public @interface Async {

}

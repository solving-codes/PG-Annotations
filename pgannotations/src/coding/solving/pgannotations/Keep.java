package coding.solving.pgannotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PACKAGE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Keep an object from being removed and renamed.
 * <pre><code>
 * {@literal @}Keep
 * public class MyClassToKeep {
 *     {@literal @}Keep
 *     protected String myFieldToKeep;	
 *
 *     {@literal @}Keep
 *     public void myMethodToKeep() {
 *     }
 * }
 * </code></pre>
 */
@Retention(CLASS)
@Target(value={TYPE, CONSTRUCTOR, METHOD, FIELD}) //TODO: Add PACKAGE when we support it.
public @interface Keep {
}
package anotacao;

import java.lang.annotation.*;

/**
 * @author bruno
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}

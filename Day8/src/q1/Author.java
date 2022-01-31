package q1;

import java.lang.annotation.*;

@Target({ ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
	String name() default "unknown";
}
   
   
   
   
   
   
   
             
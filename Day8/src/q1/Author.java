package q1;

import java.lang.annotation.*;

<<<<<<< HEAD
@Target({ ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
	String name() default "unknown";
}
   
   
   
   
   
   
   
             
=======
@Target(value = { ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
	String name() default "unknown";
}
>>>>>>> 43069c38191d3a9993a12fcf23a9badf971f59d2

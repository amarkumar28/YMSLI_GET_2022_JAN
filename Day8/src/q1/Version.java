package q1;

<<<<<<< HEAD
import java.lang.annotation.*;
=======
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
>>>>>>> 43069c38191d3a9993a12fcf23a9badf971f59d2

@Target(value = { ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface Version {
	double number();
}
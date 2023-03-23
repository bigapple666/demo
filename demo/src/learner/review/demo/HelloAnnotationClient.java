package learner.review.demo;

import learner.review.entity.HelloAnnotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HelloAnnotationClient {

    @HelloAnnotation(value = "Simple custom Annotation example")
    public void sayHello(){
        System.out.println("Inside sayHello method..");
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HelloAnnotationClient helloAnnotationClient = new HelloAnnotationClient();
        Method sayHello = helloAnnotationClient.getClass().getMethod("sayHello");
        if (sayHello.isAnnotationPresent(HelloAnnotation.class)){
            HelloAnnotation helloAnnotation = sayHello.getAnnotation(HelloAnnotation.class);
            System.out.println("value: " + helloAnnotation.value());
            sayHello.invoke(helloAnnotationClient);
        }
    }
}

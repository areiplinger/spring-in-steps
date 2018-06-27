package com.in28minutes.spring.basic.springinsteps;

import com.in28minutes.spring.basic.springinsteps.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringInStepsBasicApplication {

    //What are the beans?
    //What are the dependencies for the beans?
    //Where to search for the beans? => Searches in the package

    public static void main(String[] args) {

        // Old method having to manually wire the dependency
        // (creating the object, but dynamically passing the (class)method to use)
        /*BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlg());*/

        // Spring application context
        // Gets the application context of beans
        ApplicationContext applicationContext =
                SpringApplication.run(SpringInStepsBasicApplication.class, args);

        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

        BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

        System.out.println(binarySearch);
        System.out.println(binarySearch1);

        int result = binarySearch.binarySearch(new int[] {12,4,6}, 3);
        System.out.println(result);

	}
}

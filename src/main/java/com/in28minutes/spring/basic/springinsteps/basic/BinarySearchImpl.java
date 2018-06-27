package com.in28minutes.spring.basic.springinsteps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

    // May be wired by name to class used,
    // or whichever class has the @Primary annotation,
    // with @Primary taking precedence
    // also, can use @Qualifier to label search
    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    // Setter for establishing the  interface class to use
/*    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }*/

    public int binarySearch(int[] numbers, int numberToSearch) {

        // Hard-instantiation of object
        //sortAlgorithm bblSortAlg = new sortAlgorithm();

        // Dynamic method selection
        int[] sortedNums = sortAlgorithm.sort(numbers);

        // print of sorting algorithm used
        System.out.println(sortAlgorithm);

        // Change to quicksort

        // To search an array

        // Return the index of the array

        return 3;
    }
}

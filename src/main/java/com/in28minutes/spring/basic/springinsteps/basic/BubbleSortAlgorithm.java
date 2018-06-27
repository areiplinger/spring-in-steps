package com.in28minutes.spring.basic.springinsteps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {

    public int[] sort(int[] numbers) {
        return numbers;
    }
}

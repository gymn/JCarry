package com.gymn;

import static java.util.stream.IntStream.range;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        range(1,10).map(n->n*n).forEach(n-> System.out.println(n));
    }
}

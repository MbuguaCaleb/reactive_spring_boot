package com.codewithcaleb.reactivedemo;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class MonoFluxTest {


    @Test
    //when i am dealing with a Single event i use Mono
    public void testMono(){

        //A mono is a Publisher
        //Mono just will publish the word "caleb-techie"

        //Mono <?> means type generic.
        //i can throw exceptions in a mono as well.
        Mono<?> monoString = Mono.just("caleb-techie")
                .then(Mono.error(new RuntimeException("Exception Occurred"))).log();

        //handling the exception
        monoString.subscribe(System.out::println,(e)-> System.out.println(e.getMessage()));
    }



    @Test
    //When publishing multiple events i use Flux
    public void testFlux(){

        //fluxString will publish the four events
        //onNext()Calls the next event in the line from the publisher
        //when i want to add something in myFlux,i use concat with
        Flux<String> fluxString = Flux.just("Spring", "Spring Boot", "Hibernate", "MicroService")
                                      .concatWithValues("AWS")
                                      .concatWith(Flux.error(new RuntimeException("Exception Occurred in Flux")))
                                      .concatWithValues("Cloud")
                                      .log();

        fluxString.subscribe(System.out::println,(e)-> System.out.println(e.getMessage()));

    }
}

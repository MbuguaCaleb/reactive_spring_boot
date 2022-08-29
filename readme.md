** Reactive Spring**

```yaml


Mono inherites from the Publisher.And therefore i can subscribe to it.


Mono<String> monoString = Mono.just("caleb-techie").log();
monoString.subscribe(System.out::println);

Mono.just is publishing the string "caleb-techie"
After it has published,i can subscribe/listen to it.
.log() shows the publisher subscriber flow.

```
package org.example.processors;

import org.example.Person;

import java.util.function.Function;

public class RemoveFriendProcessor implements Function<Person, Person> {

    @Override
    public Person apply(Person person) {
        person.setFriend(null);
        return person;
    }
}

package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...

    public String whileLoop() {
        StringBuilder result = new StringBuilder("");

        int counter = 0;
        // create a `counter`

        Person[] self = getPersonArray();
        // while `counter` is less than length of array
        // begin loop
        while (counter < self.length) {

            result.append(self[counter].toString());
            counter++;
        }
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable

        // end loop
        return result.toString();
    }


    public String forLoop() {
        StringBuilder result = new StringBuilder("");
        Person[] self = getPersonArray();
        // identify initial value
        // identify terminal condition
        // identify increment
        for (int i = 0; i < self.length; i++) {

            result.append(self[i].toString());
        }
        // use the above clauses to declare for-loop signature
        // begin loop
        // use `counter` to identify the `current Person` in the array
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop

        return result.toString();
    }


    public String forEachLoop() {
        StringBuilder result = new StringBuilder("");
        // identify array's type
        // identify array's variable-name
        Person[] self = getPersonArray();
        // use the above discoveries to declare for-each-loop signature
        // begin loop
        for (Person p : self) {
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop
            result.append(p.toString());


            }
            return result.toString();
        }


        public Person[] getPersonArray () {
            return personArray;
        }
    }



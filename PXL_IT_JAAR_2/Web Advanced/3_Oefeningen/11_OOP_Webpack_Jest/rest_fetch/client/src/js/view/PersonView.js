"use strict";
import View from './View';

export default class PersonView extends View {

    show(data) {
        let person = data.person;
        let output = person.id + " " + person.name + "\n";
        super.show(output);
    }
}

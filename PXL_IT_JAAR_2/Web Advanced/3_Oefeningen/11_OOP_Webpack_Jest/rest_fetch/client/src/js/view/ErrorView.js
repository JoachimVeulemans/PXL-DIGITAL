"use strict";
import View from './View';

export default class ErrorView extends View{
    show(data) {
        let error = data.error;
        super.show(error);
    }
}




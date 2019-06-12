"use strict";

import Point from './drawing/Point';
import ColorPoint from './drawing/ColorPoint';

let point=new Point(1,2);
let preElement=document.createElement("pre");
let textNode=document.createTextNode(point+"\n" );

let colorPoint=new ColorPoint(1,2,'red');
let textNode2=document.createTextNode(colorPoint);

preElement.appendChild(textNode) ;
preElement.appendChild(textNode2) ;
document.getElementById('output').appendChild(preElement);




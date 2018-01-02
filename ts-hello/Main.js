"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var point_1 = require("./point");
var point = new point_1.Point(10, true);
point.onClick();
console.log("Number of Like: " + point.likeCount + " Is Select: " + point.isClicked);
for (var i_1 = 0; i_1 < 5; i_1++) {
    console.log(i_1);
}
var i = 0;
while (i <= 5) {
    console.log(i);
    i++;
}

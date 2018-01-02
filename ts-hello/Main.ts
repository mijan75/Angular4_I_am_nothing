import {Point} from './point';

let point = new Point(10, true);
point.onClick();
console.log(`Number of Like: ${point.likeCount} Is Select: ${point.isClicked}`);
for(let i=0; i<5; i++){
    console.log(i);
}
let i = 0;
while(i <=5){
    console.log(i);
    i++;
}

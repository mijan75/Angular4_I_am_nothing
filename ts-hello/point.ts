export class Point{
    
    constructor(private _likeCount?:number, private _isClicked?:boolean){

    }

    onClick () {
        this._likeCount += (this._isClicked) ? -1:+1;
        this._isClicked = !this._isClicked;
    }

    get likeCount(){
        return this._likeCount;
    }

    get isClicked(){
        return this._isClicked;
    }
}
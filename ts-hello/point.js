"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Point = /** @class */ (function () {
    function Point(_likeCount, _isClicked) {
        this._likeCount = _likeCount;
        this._isClicked = _isClicked;
    }
    Point.prototype.onClick = function () {
        this._likeCount += (this._isClicked) ? -1 : +1;
        this._isClicked = !this._isClicked;
    };
    Object.defineProperty(Point.prototype, "likeCount", {
        get: function () {
            return this._likeCount;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Point.prototype, "isClicked", {
        get: function () {
            return this._isClicked;
        },
        enumerable: true,
        configurable: true
    });
    return Point;
}());
exports.Point = Point;

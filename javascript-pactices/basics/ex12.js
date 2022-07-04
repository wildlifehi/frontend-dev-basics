Array.prototype.remove = function(index) {
    this.splice(index, 1);
}

Array.prototype.insert = function(index, value){
    if(value instanceof Array) {
        // for(var i = 0; i < value.length; i++) {
        //     this.splice(index+i, 0, value[i]);
        // }

        // 오류!!!
        // 콜백 안의 this는 어휘상 this와 일치하지 않는다.
        //  value.forEach(function(e){
        //  this.splice(index++, 0, e);
        //  });
    } else {
        this.splice(index, 0, value);
    }
}

// List로 사용하기
var a = [1, 2, 4];

console.log(a);

a.insert(2, 3);
console.log(a);

a.remove(2);
console.log(a);

a.insert(2, ['a', 'b', 'c']); // 기대하는 값 : [1, 2, 'a', 'b', 'c', 4]
console.log(a);

let num = 11;
let factor =0;

for(let i=0;i<=num;i++){
    if(num % i == 0){
        factor++;
    }
}

if (factor==2){
    console.log(num,"is Prime");
}else {
    console.log("Not prime")
}
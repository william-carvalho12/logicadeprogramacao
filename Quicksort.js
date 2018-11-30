function pesquisabinaria(vetor, n) {
  var min = 0
  var max = vetor.length - 1;
  var media;

    while(min <= max) {
    
    media = parseInt((max + min) / 2); //acha o meio

        if(vetor[media] === n) { // se for o numero que estamos procurando OK retorna
            return media;
    }
    
        else if(vetor[media] < n) { // se for menor
      
      min = media + 1;
      
        } else {

      max = media - 1; //se for maior
      
        }
    }
    return -1;
}

var vetor = [];

console.log(pesquisabinaria(vetor, 97));
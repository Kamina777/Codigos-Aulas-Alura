const notas = [10, 6, 5.5, 7, 7.8];
const somaNotas =  notas[0] + notas[1] + notas[2] + notas[3] + notas[4];
console.log(`Soma na mão: ${somaNotas}`)
console.log(`Media na mão: ${somaNotas/notas.length}`)

let soma = 0;
for (let i = 0; i < notas.length; i++) {
    soma += notas[i];
}
console.log(`Soma por for: ${soma}`)
const media = soma/notas.length;
console.log(`Media por for: ${media}`);
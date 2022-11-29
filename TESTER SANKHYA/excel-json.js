const xlsx = require("xlsx");
const fs = require("fs");

/////////////READ EXCEL FILE///////////
//const wb = xlsx.readFile('C:\Users\Notebook\Desktop\Codigo-Aulas-Alura\TESTER SANKHYA\planilhas_testes\planilhas\teste_50.xlsx');
const wb = xlsx.readFile('./planilhas_testes/teste_25.xlsx');
//const wb = xlsx.readFile('./teste_25.xlsx' {cellDates: true});
//const wb = xlsx.readFile('./teste_25.xlsx', {dateNF: "mm/dd/yyyy"}); //caso tenha datas

//////////////////READ SHEET FROM THE WORKBOOK///////////
const ws = wb.Sheets['lista nova ST']; //escolhe a guia do arquivo xlsx
//console.log(ws);

////////////READ SHEET DATA AND CONVERT IT INTO JSON////////////
const data = xlsx.utils.sheet_to_json(ws);
//const data = xlsx.utils.sheet_to_json(ws, {raw: false}); //caso tenha datas
//console.log(data);

///////WRITE JSON DATA INTO JSON FILE BY STRINGFYING DATA/////////
fs.writeFileSync("./cypress/fixtures/testeJason_25.json",JSON.stringify(data, null, 2));

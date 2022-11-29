describe('testando sankhya',() => {
    beforeEach(() => {
        cy.visit('unapel.nuvemdatacom.com.br:9707/mge')

    })
    //const teste25 = require('../fixtures/testeJason_25.json');
    it('logando no sankhya - BASE DE TESTE JGV', () => {
        cy.get('input[placeholder="Usuário"]').type('SUP',{ delay: 20 });
        //y.get('input[placeholder="user"]').type('SUP',{ delay: 20 });
        cy.contains('button', 'Prosseguir').click();

        cy.get('input[placeholder="password"]').type('@Grupojgv2022*@',{ delay: 20 });
        cy.contains('button', 'Prosseguir').click();
        
        cy.get('input[placeholder="Pesquisar"]').click().type('Importar produtos',{ delay: 20 });


    })
})
describe('testando sankhya',() => {

    beforeEach(() => {
        cy.visit('alsolenergia.fmcdatacom.com.br:8492/mge')      
    })

    it('logando no sankhya - ALSOL TESTE 092', () => {
        cy.get('input[placeholder="Usuário"]').type(Cypress.env('loginAlsol'));
        cy.get('input[placeholder="Senha"]').type(Cypress.env('senhaAlsol'))      
        cy.contains('button', 'Entrar').click();
        cy.get('input[placeholder="Pesquisar"]').click().type('Usuario');
        cy.contains('td','Configurações » Controle de Acesso').click();
        //cy.get('input[placeholder="Digite o que você procura"]').type(Cypress.env('usuarioEspelho'))
        cy.get('input[placeholder="Digite o que você procura"]').type('teste')
        
    })
})
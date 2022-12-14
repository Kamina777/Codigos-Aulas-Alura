describe('Login e registro de usuarios alura pic', () => {

    beforeEach(() => {
        cy.visit('https://alura-fotos.herokuapp.com');
    })

    it('Verifica mensagens validacao', () => {
        cy.contains('a','Register now').click();
        cy.contains('button','Register').click();
        cy.contains('ap-vmessage','Email is required!').should('be.visible');
        cy.contains('button','Register').click();
        cy.contains('ap-vmessage','User name is required!').should('be.visible');
        cy.contains('ap-vmessage','Password is required!').should('be.visible');
        cy.contains('ap-vmessage','Full name is required!').should('be.visible');
    })
    it('Verifica mensagem de email invalido', () => {
        cy.contains('a','Register now').click();
        cy.contains('button','Register').click();
        cy.get('input[formcontrolname="email"]').type('algumacoisa');
        cy.contains('ap-vmessage','Invalid e-mail').should('be.visible');
    })

    it('Verifica se o nome completo tem menos de 2 caracteres', () => {
        cy.contains('a','Register now').click();
        cy.contains('button','Register').click();
        cy.get('input[formcontrolname="fullName"]').type('a');
        cy.contains('button','Register').click();
        cy.contains('ap-vmessage','Mininum length is 2').should('be.visible');     
    })

    it('Verifica se o nome tem mais de 40 caracteres', () => {
        cy.contains('a','Register now').click();
        cy.contains('button','Register').click();
        cy.get('input[formcontrolname="fullName"]').type('aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa');
        cy.contains('button','Register').click();
        cy.contains('ap-vmessage','Maximun length is 40').should('be.visible');     
    })

    it('Verifica se o nome de usuario tem menos de 2 caracteres', () => {
        cy.contains('a','Register now').click();
        cy.contains('button','Register').click();
        cy.get('input[formcontrolname="userName"]').type('a');
        cy.contains('button','Register').click();
        cy.contains('ap-vmessage','Mininum length is 2').should('be.visible');     
    })

    it('Verifica se o nome de usuario tem mais de 30 caracteres', () => {
        cy.contains('a','Register now').click();
        cy.contains('button','Register').click();
        cy.get('input[formcontrolname="userName"]').type('aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa');
        cy.contains('button','Register').click();
        cy.contains('ap-vmessage','Maximun length is 30').should('be.visible');     
    })

    it('Verifica se o nome de usuario tem mais de 30 caracteres', () => {
        cy.contains('a','Register now').click();
        cy.contains('button','Register').click();
        cy.get('input[formcontrolname="userName"]').type('AAAA');
        cy.contains('button','Register').click();
        cy.contains('ap-vmessage','Must be lower case').should('be.visible');     
    })

    it('Login de usuario valido', () => {
        cy.login(Cypress.env('userName'),Cypress.env('password'))
        cy.contains('a','(Logout)').should('be.visible');   
    })

    it('Login de usuario invalido', () => {
        cy.login('algumacoisa', 'asdfadf')
        cy.on('window:alert', (str  ) => {
            expect(str).to.equal('Invalid user name or password')
        })  
    })

    const usuarios = require('../../fixtures/usuarios.json');
    usuarios.forEach(usuario => {

        it.only('registra novo usuario' + usuario.userName, () => {
            cy.contains('a', 'Register now').click();
            cy.contains('button', 'Register').click();
            cy.get('input[formcontrolname="email"]').type(usuario.email);
            cy.get('input[formcontrolname="fullName"]').type(usuario.fullName);
            cy.get('input[formcontrolname="userName"]').type(usuario.userName);
            cy.get('input[formcontrolname="password"]').type(usuario.password);
            cy.contains('button','Register').click();
        })
    })

})
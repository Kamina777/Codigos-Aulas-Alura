GRANT EXECUTE ON ATUALIZAR_CLI_SEG_MERCADO TO user_app;
GRANT EXECUTE ON ATUALIZAR_FATURAMENTO_PREVISTO TO user_app;
GRANT EXECUTE ON EXCLUIR_CLIENTE TO user_app;
GRANT EXECUTE ON INCLUIR_CLIENTE TO user_app;

INSERT INTO CLIENTE
VALUES (5,'PADARIA XYZW', '22/222',1,TO_DATE('15/01/2022','DD/MM/YYYY'),80000,'MEDIO GRANDE');

SELECT * FROM CLIENTE ORDER BY ID;

ROLLBACK;

GRANT SELECT ON CLIENTE TO USER_APP;

GRANT EXECUTE ON INCLUINDO_PRODUTO TO user_app;
GRANT EXECUTE ON INCLUINDO_DADOS_VENDA TO user_app;
GRANT SELECT ON PRODUTO_EXERCICIO TO user_app;
GRANT SELECT ON PRODUTO_VENDA_EXERCICIO TO user_app;
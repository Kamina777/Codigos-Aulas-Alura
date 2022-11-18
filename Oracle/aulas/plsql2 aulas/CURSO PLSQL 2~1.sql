create or replace NONEDITIONABLE PROCEDURE EXCLUINDO_PRODUTO 
(p_COD produto_exercicio.cod%type)
IS
BEGIN
   DELETE FROM PRODUTO_EXERCICIO WHERE COD = P_COD;
   COMMIT;
END;

DECLARE
   v_PRODUTO produto_exercicio.cod%type:= 41232;
BEGIN
   EXCLUINDO_PRODUTO(v_PRODUTO);
END;
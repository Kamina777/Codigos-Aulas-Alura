SET SERVEROUTPUT ON;

DECLARE
    v_ID CLIENTE.ID%type;
    v_RAZAO CLIENTE.RAZAO_SOCIAL%type;
    CURSOR cur_CLIENTE IS SELECT ID, RAZAO_SOCIAL FROM CLIENTE;
BEGIN

END;
DECLARE
    v_ID_ATT CLIENTE.ID%type :=2;
    CONTADOR INTEGER;
BEGIN
    SELECT COUNT(*) INTO CONTADOR FROM CLIENTE;
    FOR v_ID IN 1.. CONTADOR LOOP
        ATUALIZAR_SEGMERCADO(v_ID,v_ID_ATT);
    END LOOP;
END;

SELECT * FROM CLIENTE;
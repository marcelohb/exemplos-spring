-- 1 ORDEM COLHEITA
Declare
  Docent   Pcg_Citrus.Tp_Cit_Doc_Ent;
  t_De_Var Pcg_Citrus.Tp_Tb_Cit_De_Var;
  n        Number;
Begin 
  docEnt.cod_empresa:= 1;
  docEnt.cod_filial:= 1;
  docEnt.cod_cadastro:= 170;
  docEnt.Flg_Cadastro:= 'A';
  docEnt.num_cont:= 1;
  docEnt.cod_cliente:= 103;
  docEnt.flg_cliente:= 'A';
  docEnt.cod_citrus:= 1;
  docEnt.dat_emissao:= TO_DATE( '14072016', 'dd/mm/yyyy' );
  docEnt.dat_entrada:= TO_DATE( '14072016', 'dd/mm/yyyy' );
  docEnt.qtd_produto:= NULL;
  docEnt.nom_talhao:= '1';
  docEnt.num_contrato:= 18;
  docEnt.num_nfp:= NULL;
  docEnt.nom_serie_nfp:= NULL;
  docEnt.dat_nfp:= NULL;
  docEnt.cod_entrega:= 103;
  docEnt.flg_entrega:= 'A';
  docEnt.flg_tp_negocio:= 'R';
  docEnt.cod_transportador:= 6;
  docEnt.flg_transportador:= 'D';
  docEnt.nom_placa:= 'BXF7122';
  docEnt.nom_placa_uf:= 'SP';
  docEnt.COD_TP_FRETE:= '9';
  docEnt.dat_ordem:= '14/07/2016';
  docEnt.num_cartao:= '1';
  t_de_var(1).cod_empresa:= 1;
  t_de_var(1).cod_filial:= 1;
  t_de_var(1).cod_citrus:= 1;
  t_de_var(1).cod_variedade:= 1;
  ------------------------------
  docEnt.num_doc_ent:= 1071801;
  docEnt.num_ordem:= 1071801;
  t_de_var(1).qtd_produto:= 130;
  ------------------------------
  t_de_var(1).val_produto:= 14.0000;
  Pcg_Citrus.ordem_colheita(docent, t_de_var);
  Select Pcg_Citrus.Retorna_Ultima_Ordem_Colheita Into n From Dual;
  Dbms_Output.Put_Line('> ' || n);
End;
/
Select * From Cit_Doc_Ent a Where a.Num_Doc_Ent >= 64;
Select * From Cit_De_Var a Where a.Num_Doc_Ent >= 64;

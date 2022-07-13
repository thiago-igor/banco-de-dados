--MARCA
INSERT INTO marca (descricao) VALUES ('Toyota');
INSERT INTO marca (descricao) VALUES ('Volks');
INSERT INTO marca (descricao) VALUES ('Hyundai');

--MARCA PNEU
INSERT INTO marca_pneu (descricao) VALUES ('goodyear');
INSERT INTO marca_pneu (descricao) VALUES ('pirelli');
INSERT INTO marca_pneu (descricao) VALUES ('michelin');
INSERT INTO marca_pneu (descricao) VALUES ('toyo');
INSERT INTO marca_pneu (descricao) VALUES ('dayton');
INSERT INTO marca_pneu (descricao) VALUES ('multi-mile');
INSERT INTO marca_pneu (descricao) VALUES ('kenda');
INSERT INTO marca_pneu (descricao) VALUES ('firestone');
INSERT INTO marca_pneu (descricao) VALUES ('gt radial');
INSERT INTO marca_pneu (descricao) VALUES ('marshal');
INSERT INTO marca_pneu (descricao) VALUES ('yokohama');

-- TIPO EIXO
INSERT INTO tipo_eixo (descricao) VALUES ('redondo');
INSERT INTO tipo_eixo (descricao) VALUES ('descricaoParaTeste');
INSERT INTO tipo_eixo (descricao) VALUES ('veio com defeito');
INSERT INTO tipo_eixo (descricao) VALUES ('eixo novinho');
INSERT INTO tipo_eixo (descricao) VALUES ('eixo desgastado');

-- BANDA
INSERT INTO banda (descricao, lado) VALUES ('teste, direito');
INSERT INTO banda (descricao, lado) VALUES ('testeLado, esquerdo');
INSERT INTO banda (descricao, lado) VALUES ('Banda do pneu OK, direito');
INSERT INTO banda (descricao, lado) VALUES ('Banda desgastada, esquerdo');
INSERT INTO banda (descricao, lado) VALUES ('Banda horrível, direito');

-- Veículo
INSERT INTO veiculo (descricao, id_marca) VALUES ('Esportivo', 1);
INSERT INTO veiculo (descricao, id_marca) VALUES ('Carro preto', 2);
INSERT INTO veiculo (descricao, id_marca) VALUES ('Carro vermelho', 3);
INSERT INTO veiculo (descricao, id_marca) VALUES ('Carro Branco', 1);
INSERT INTO veiculo (descricao, id_marca) VALUES ('Carro antigo', 2);

--EIXO
INSERT INTO eixo (descricao, posicao, id_tipo_eixo) VALUES ('Acabado', 1, 1);
INSERT INTO eixo (descricao, posicao, id_tipo_eixo) VALUES ('Novo', 2, 2);
INSERT INTO eixo (descricao, posicao, id_tipo_eixo) VALUES ('Em uso', 3, 3);
INSERT INTO eixo (descricao, posicao, id_tipo_eixo) VALUES ('À venda', 4, 4);
INSERT INTO eixo (descricao, posicao, id_tipo_eixo) VALUES ('Do estepe', 5, 5);

-- PNEU
INSERT INTO pneu (raio, perfil, largura, indice_carga, indice_velocidade, id_marca_pneu) VALUES (2, 'Novo', '215mm', '100kg', '95km/h' , 1);
INSERT INTO pneu (raio, perfil, largura, indice_carga, indice_velocidade, id_marca_pneu) VALUES (1, 'Acabado', '215mm', '100kg', '91km/h' , 2);
INSERT INTO pneu (raio, perfil, largura, indice_carga, indice_velocidade, id_marca_pneu) VALUES (3, 'Em uso', '215mm', '100kg', '95km/h' , 3);
INSERT INTO pneu (raio, perfil, largura, indice_carga, indice_velocidade, id_marca_pneu) VALUES (4, 'Novo', '215mm', '100kg', '93km/h' , 4);
INSERT INTO pneu (raio, perfil, largura, indice_carga, indice_velocidade, id_marca_pneu) VALUES (3, 'Em uso', '215mm', '100kg', '99km/h' , 5);

--PNEU-RESERVA
INSERT INTO pneu_reserva (observacao, id_veiculo, id_pneu) VALUES ('Veiculo 1', 1, 3);
INSERT INTO pneu_reserva (observacao, id_veiculo, id_pneu) VALUES ('Veiculo 2', 2, 1);
INSERT INTO pneu_reserva (observacao, id_veiculo, id_pneu) VALUES ('Veiculo 3', 3, 2);
INSERT INTO pneu_reserva (observacao, id_veiculo, id_pneu) VALUES ('Veiculo 4', 4, 4);
INSERT INTO pneu_reserva (observacao, id_veiculo, id_pneu) VALUES ('Veiculo 5', 5, 5);

--EIXO-VEICULO
INSERT INTO eixo_veiculo (id_veiculo, id_eixo, id_pneu) VALUES (1, 2, 3);
INSERT INTO eixo_veiculo (id_veiculo, id_eixo, id_pneu) VALUES (2, 1, 3);
INSERT INTO eixo_veiculo (id_veiculo, id_eixo, id_pneu) VALUES (3, 2, 1);
INSERT INTO eixo_veiculo (id_veiculo, id_eixo, id_pneu) VALUES (4, 3, 3);
INSERT INTO eixo_veiculo (id_veiculo, id_eixo, id_pneu) VALUES (5, 4, 5);

--VISTORIA_VEICULO
INSERT INTO vistoria_veiculo (observacao, data_vistoria, id_veiculo, username) VALUES ('vistoria na sexta-feira', timestamp '2022-06-26 18:40:23', 1, 'Alex');
INSERT INTO vistoria_veiculo (observacao, data_vistoria, id_veiculo, username) VALUES ('vistoria na segunda-feira', timestamp '2022-06-26 18:40:23', 2, 'Clara');
INSERT INTO vistoria_veiculo (observacao, data_vistoria, id_veiculo, username) VALUES ('vistoria na terça-feira', timestamp '2022-06-26 18:40:23', 3, 'Roberta');
INSERT INTO vistoria_veiculo (observacao, data_vistoria, id_veiculo, username) VALUES ('vistoria na quarta-feira', timestamp '2022-06-26 18:40:23', 4, 'Thiago');
INSERT INTO vistoria_veiculo (observacao, data_vistoria, id_veiculo, username) VALUES ('vistoria na quinta-feira', timestamp '2022-06-26 18:40:23', 5, 'Dog');

--VISTORIA_PNEU
INSERT INTO vistoria_pneu (data_cadastro, observacao, id_vistoria_veiculo, id_pneu) VALUES (timestamp '2022-06-26 18:40:23', 'vistoria pneu segunda-feira', 1, 1);
INSERT INTO vistoria_pneu (data_cadastro, observacao, id_vistoria_veiculo, id_pneu) VALUES (timestamp '2022-06-26 18:40:23', 'vistoria pneu terça-feira', 2, 2);
INSERT INTO vistoria_pneu (data_cadastro, observacao, id_vistoria_veiculo, id_pneu) VALUES (timestamp '2022-06-26 18:40:23', 'vistoria pneu quarta-feira', 3, 3);
INSERT INTO vistoria_pneu (data_cadastro, observacao, id_vistoria_veiculo, id_pneu) VALUES (timestamp '2022-06-26 18:40:23', 'vistoria pneu quinta-feira', 4, 4);
INSERT INTO vistoria_pneu (data_cadastro, observacao, id_vistoria_veiculo, id_pneu) VALUES (timestamp '2022-06-26 18:40:23', 'vistoria pneu sexta-feira', 5, 5);

--MEDICAO_VISTORIA
INSERT INTO medicao_vistoria (raio, perfil, largura, indice_carga, indice_velocidade, id_marca_pneu, id_vistoria) VALUES (2, 'Novo', '215mm', '100kg', '95km/h', 1, 1);
INSERT INTO medicao_vistoria (raio, perfil, largura, indice_carga, indice_velocidade, id_marca_pneu, id_vistoria) VALUES (3, 'Velho', '215mm', '100kg', '95km/h', 2, 2);
INSERT INTO medicao_vistoria (raio, perfil, largura, indice_carga, indice_velocidade, id_marca_pneu, id_vistoria) VALUES (4, 'Em uso', '215mm', '100kg', '65km/h', 3, 3);
INSERT INTO medicao_vistoria (raio, perfil, largura, indice_carga, indice_velocidade, id_marca_pneu, id_vistoria) VALUES (5, 'Usado', '215mm', '100kg', '92km/h', 4, 4);
INSERT INTO medicao_vistoria (raio, perfil, largura, indice_carga, indice_velocidade, id_marca_pneu, id_vistoria) VALUES (1, 'Acabado', '215mm', '100kg', '75km/h', 5, 5);

--PNEU_BANDA
INSERT INTO pneu_banda (observacao, id_pneu, ordem, id_banda) VALUES ('Estragado', 1, 1, 1);
INSERT INTO pneu_banda (observacao, id_pneu, ordem, id_banda) VALUES ('Novo', 2, 2, 2);
INSERT INTO pneu_banda (observacao, id_pneu, ordem, id_banda) VALUES ('Velho', 3, 3, 3);
INSERT INTO pneu_banda (observacao, id_pneu, ordem, id_banda) VALUES ('Usado', 4, 4, 4);
INSERT INTO pneu_banda (observacao, id_pneu, ordem, id_banda) VALUES ('Estepe', 5, 5, 5);

--MEDICAO_BANDA_VISTORIA
INSERT INTO medicao_banda_vistoria (valor, id_pneu_banda, id_medicao_vistoria) VALUES (2.75, 1, 1);
INSERT INTO medicao_banda_vistoria (valor, id_pneu_banda, id_medicao_vistoria) VALUES (7.15, 2, 2);
INSERT INTO medicao_banda_vistoria (valor, id_pneu_banda, id_medicao_vistoria) VALUES (4.25, 3, 3);
INSERT INTO medicao_banda_vistoria (valor, id_pneu_banda, id_medicao_vistoria) VALUES (435.34, 4, 4);
INSERT INTO medicao_banda_vistoria (valor, id_pneu_banda, id_medicao_vistoria) VALUES (934.45, 5, 5);

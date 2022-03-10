package com.leodomprdevs.turismojuizdefora.app.dao

import com.google.android.gms.maps.model.LatLng
import com.leodomprdevs.turismojuizdefora.app.model.Turismo

// CLASSE COM OS DADOS DO MODEL //

class DAO {
    fun entregLista() : List<Turismo> {
        val lista = listOf<Turismo>(
            Turismo(
                "Parque da Lajinha",
                "Terça à Sexta-Feira",
                "08:00h - 17:00h",
                "Grátis",
                "4.7",
                "https://media-cdn.tripadvisor.com/media/photo-s/11/d1/f5/a7/entrada.jpg",
                "Parque da Lajinha",
                LatLng(-21.792496401240907, -43.36665140738358),
                "Av. Deusdedith Salgado - Teixeiras",
                "https://www.google.com/maps/place/Parque+da+Lajinha/@-21.7924874,-43.368875,17z/data=!3m1!4b1!4m5!3m4!1s0x989b00f75c8195:0x593a6395333ff4d!8m2!3d-21.7924874!4d-43.3666863",
                "Ocupando a área onde ficava a Fazenda da Lajinha, desapropriada pela Prefeitura de Juiz de Fora, em 1978, o Parque da Lajinha foi oficialmente criado em julho de 2012, após a assinatura do Decreto n° 11.266.\n" +
                        "\n" +
                        "Um dos últimos pontos onde é possível encontrar áreas de Mata Atlântica intocada, o espaço ocupado tem uma cobertura verde excepcional. Na região, é possível encontrar espécimes da Floresta Estacional Semidecidual Montana, área de mata formada, anteriormente, pelo Campus Universitário, Fazenda Santa Cândida e Mata do Imperador.\n" +
                        "\n" +
                        "A presença de toda essa área verdade atrai uma fauna exuberante, composta por aves, peixes, mamíferos pequenos, répteis e artrópodes.\n" +
                        "\n" +
                        "Além da visitação pública, o local tem atraído especialistas que tem trabalhado no Plano de Manejo, para criar uma Unidade de Conservação, abrindo espaço para estudos científicos, culturais, de turismo e de lazer."

            ),

            Turismo(
                "Parque Municipal",
                "Terça à Sexta-Feira",
                "08:00H - 17:00h",
                "Grátis",
                "4.7",
                "https://tribunademinas.com.br/wp-content/uploads/2021/10/Coletiva-Parque-Muncipal-fernando-priamo-12-700x386.jpg",
                "Parque Municipal",
                LatLng(-21.793468720953765, -43.398251030829144),
                "R. do Contôrno, 8 - Nova Califórnia",
                "https://www.google.com/maps/place/Parque+Municipal+de+Juiz+de+Fora/@-21.7935321,-43.4004363,17z/data=!3m1!4b1!4m5!3m4!1s0x989b7e43af1731:0xb599699fa02f580a!8m2!3d-21.7935321!4d-43.3982423",
                "O local conta com 4 campos de futebol, 4 quadras, 1 ginásio poliesportivo, 2 bosques, 3 parques infantis, salão de jogo, parque aquático, 2 restaurantes, 4 churrasqueiras, pista de caminhada, estacionamento e 69 unidades habitacionais.\n" +
                        "\n" +
                        "A iniciativa do Parque Municipal surge como mais uma das alternativas à potencialização de atividades turísticas, culturais, esportivas e de lazer na cidade.\n" +
                        "\n" +
                        "Para entrar no local, as pessoas com idade igual ou superior a 12 anos devem apresentar carteira de vacinação ou do aplicativo ConectSUS, que comprove a aplicação da primeira, segunda ou terceira doses contra o coronavírus, de acordo com o calendário de cada faixa etária no município.\n" +
                        "\n" +
                        "As normas sanitárias incluem ainda aferição de temperatura na entrada do parque, uso de máscara durante todo o período de permanência no local, distanciamento mínimo de um metro e meio entre as pessoas e uso de álcool em gel. É terminantemente proibida a entrada de bebida alcoólica no local."

            ),
            Turismo(
                "Jardim Botânico", "Terça à Sexta-Feira",
                "08:00H - 17:00h",
                "Grátis",
                "4.5",
                "https://tribunademinas.com.br/wp-content/uploads/2019/03/jardim-bot%C3%A2nico2-fernando-priamo-arquivo.jpg",
                "Jardim Botânico",
                LatLng(-21.737588801670565, -43.369366457857296),
                "R. Cel. Almeida Novais, 246 - Santa Terezinha",
                "https://www.google.com/maps/place/Jardim+Botânico+da+UFJF/@-21.7377981,-43.3716141,17z/data=!3m1!4b1!4m5!3m4!1s0x989c5f9606bafb:0xedb1428ec273b9e3!8m2!3d-21.7377981!4d-43.3694201",
                "O Jardim Botânico da Universidade Federal de Juiz de Fora é um grande fragmento florestal de Mata Atlântica, onde, por meio de ações de educação ambiental, visitantes terão a oportunidade de trocar saberes sobre a sociobiodiversidade. Neste espaço de harmonia e beleza, o visitante terá contato com mais de 400 espécies nativas a Mata Atlântica e poderá compreender seus usos, suas relações ecológicas e dimensões culturais.\n" +
                        "\n" +
                        "A visitação é gratuita e aberta ao público em geral.\n" +

                        "Horário de visitação\n" +
                        "De terça a domingo, das 8h às 17h, com última entrada de visitantes às 16h.\n" +

                        "Fechado às segundas e feriados.\n" +

                        "Não há agendamento de visita.\n" +

                        "Obrigatória a apresentação do cartão de vacinação ou do Certificado Nacional de Vacinação de Covid-19 para entrar no Jardim.\n" +
                        "O Jardim Botânico abrirá todos os dias nestas duas últimas semanas de 2021, com exceção dos próximos fins de semana, que caem nos dias 25 e 26 de dezembro e 1º e 2 de janeiro, e das duas segundas-feiras, 20 e 27. O Jardim não abre mesmo ao público às segundas.\n" +
                        "\n" +
                        "Entre as medidas de preservação e conservação do Jardim Botânico, que é um remanescente de Mata Atlântica, bem como de biossegurança, em período de pandemia, foi estabelecido limite de presença simultânea de 150 visitantes no Jardim. Ou seja, quando o total de 150 pessoas for alcançado, será necessário esperar até que visitantes saiam para que novos possam entrar. O tempo de permanência estipulado é de duas horas."
            ),
            Turismo(
                "Mirante Morro do Cristo",
                "Sempre aberto",
                "07:00h às 22:00h",
                "Grátis",
                "4.5",
                "https://www.minasgerais.com.br/imagens/atracoes/15671065524TabpCUHr4.jpg",
                "Mirante Morro do Cristo",
                LatLng(-21.763599303646185, -43.357370188543),
                "Estr. Eng. Gentil Forn - São Pedro",
                "https://www.google.com/maps/place/Mirante+do+Morro+do+Cristo/@-21.7637986,-43.359532,17z/data=!3m1!4b1!4m5!3m4!1s0x989c82e2d0c51f:0x272f297a5fce0ac7!8m2!3d-21.7637986!4d-43.357338",
                "Morro do Imperador (conhecido popularmente como Morro do Cristo) é uma atração turística de Juiz de Fora.\n" +
                        "\n" +
                        "É um dos pontos mais altos da cidade, situado a 923 m do nível do mar, sendo assim denominado devido à visita, em 1861, de D. Pedro II a Juiz de Fora, que subiu o morro para apreciar a vista da cidade. Em comemoração à virada do século XIX para o século XX, foi construída ali uma capela, e, em 1906, um monumento ao Cristo Redentor.\n" +
                        "\n" +
                        "Defronte ao monumento está o Mirante Salles de Oliveira, com vista panorâmica para grande parte da cidade.\n" +
                        "\n" +
                        "Lá também encontra-se a primeira torre helicoidal na América do Sul, que proporcionou à extinta TV Industrial o pioneirismo em geração de imagens no interior de Minas Gerais."
            ),
            Turismo("Parque Halfeld",
            "Sempre aberto",
            "24h",
            "Grátis",
            "4.1",
            "https://live.staticflickr.com/3922/14861704210_6d4b95a084_b.jpg",
            "Parque Halfeld",
            LatLng(-21.76091964283821, -43.35027118669316),
                "R. Halfeld, 882-960 - Centro",
                "https://www.google.com/maps/place/Parque+Halfeld/@-21.7611588,-43.3525081,17z/data=!3m1!4b1!4m5!3m4!1s0x989c9fb8b7ae1d:0x488f0bb7436c2d13!8m2!3d-21.7611588!4d-43.3503141",
                "O Conjunto do Parque Halfeld foi tombado pela Prefeitura Municipal de Juiz de Fora-MG por sua importância cultural para a cidade.\n" +
                        "\n" +
                        "Prefeitura Municipal de Juiz de Fora-MG\n" +
                        "Nome atribuído: Conjunto do Parque Halfeld (3,3986ha)\n" +
                        "Localização: Juiz de Fora-MG\n" +
                        "Decreto de Tombamento: Decreto n° 4223/1989\n" +
                        "\n" +
                        "Descrição: O Parque Halfeld foi inaugurado em 15 de junho de 1902 e no decorrer dos anos passou por algumas mudanças. Por isso, nem sempre teve a estrutura que conhecemos hoje.\n" +
                        "\n" +
                        "O terreno em que foi construído o parque pertencia ao engenheiro Henrique Guilherme Fernando Halfeld, e foi adquirido pela câmara municipal em 1854. Antes de se tornar um dos principais ponto de encontro, este foi palco de várias ações como, espetáculos circenses e corridas de touros.\n" +
                        "\n" +
                        "Segundo, o prof. Marcos Olender\n" +
                        "“O espaço não tinha unicidade, servia para diferentes eventos, recebia circos e corrida de touros. As pessoas se reuniam. Na segunda metade do século XIX, os municípios começam a ter este tipo de postura, com o crescimento urbano muito acentuado, começa a ter necessidade de reservar uma área da cidade como um pulmão, uma área urbana”\n" +
                        "\n" +
                        "Atualmente, no centro do parque há uma área aberta onde crianças brincam e ocorrem diversas feiras e alguns eventos. Neste espaço, havia um prédio que abrigou a primeira biblioteca municipal e a primeira rádio da cidade.\n" +
                        "\n" +
                        "A sede da Biblioteca Municipal foi redesenhada pelo arquiteto Raphael Arcuri, em estilo art-déco e foi inaugurada em meados de 1930. Não há informações sobre a data precisa da demolição desta edificação.\n" +
                        "\n" +
                        "O Parque Halfeld foi tombado como Patrimônio Histórico Cultural Municipal em novembro de 1989, pelo Processo 5305/89. Decreto/ Data: 4223/10.11. 89. Em seu entorno estão prédios importantes para a composição da história da cidade como o Fórum Benjamim Colucci, a Câmara Municipal, a antiga Prefeitura que atualmente abriga a Fundação Alfredo Ferreira Lage (Funalfa) e a Igreja Católica dedicada a São Sebastião.\n" +
                        "Fonte: UFJF."
            )

        )
        return lista.toList()
    }
}
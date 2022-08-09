package br.com.appscorest.extensions

class FuncoesPlacar() {

    //TESTANDO...

    var pontosTime1: Int = 0
    var pontosTime2: Int = 0

    fun somarPontosTime1(qnt: Int) {

        pontosTime1 = pontosTime1 + qnt



    }

    fun subtrairPontosTime1(menos1: Int = 1) {

        if (pontosTime1 >= 1) {
            pontosTime1 = pontosTime1 - menos1


        }
    }

    fun somarPontosTime2(qnt: Int) {

        pontosTime2 = pontosTime2 + qnt



    }

    fun subtrairPontosTime2(menos1: Int = 1) {

        if (pontosTime2 >= 1) {
            pontosTime2 = pontosTime2 - menos1


        }
    }

    fun zerarPlacar() {
//        var pontosTime1 = 0
//        var pontosTime2 = 0
//       binding.trucoPntTime1.text = pontosTime1.toString()
//        binding.trucoPntTime2.text = pontosTime2.toString()

    }



}
package com.example.santander_dev_week.data.local

import com.example.santander_dev_week.data.Cartao
import com.example.santander_dev_week.data.Cliente
import com.example.santander_dev_week.data.Conta

class FakeData {

    fun getLocalData(): Conta {
        val cliente = Cliente("Nailson")
        val cartao = Cartao("42222222222")

        return Conta(
            "445655-4",
            "6552-4",
            "R$ 2450,80",
            "R$ 4.120,00",
            cliente,
            cartao
        )

    }
}
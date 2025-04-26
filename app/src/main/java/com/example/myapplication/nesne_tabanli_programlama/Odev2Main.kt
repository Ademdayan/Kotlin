package com.example.myapplication.nesne_tabanli_programlama

fun main() {
    val o2 = Odev2()

    println("1. İç açılar toplamı (6 kenarlı şekil): ${o2.icAciToplami(6)}")

    println("2. Maaş hesabı (20 gün çalışıldı): ${o2.maasHesapla(20)} ₺")

    println("3. Kota ücreti (60 GB): ${o2.kotaUcretiHesapla(60)} ₺")

    println("4. Dereceyi Fahrenheit'a çevir (30°C): ${o2.dereceToFahrenheit(30.0)}°F")

    println("5. Dikdörtgen çevresi (kısa kenar: 5, uzun kenar: 10): ${o2.dikdortgenCevre(5, 10)}")

    println("6. 5! = ${o2.faktoriyelHesapla(5)}")

    println("7. 'Ankara' kelimesinde kaç tane 'a' harfi var: ${o2.aHarfiSayisi("Ankara")}")
}

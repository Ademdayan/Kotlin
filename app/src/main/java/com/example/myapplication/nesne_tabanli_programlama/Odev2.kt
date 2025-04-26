package com.example.myapplication.nesne_tabanli_programlama

class Odev2 {

    // 1. Kenar sayısına göre iç açılar toplamı
    fun icAciToplami(kenarSayisi: Int): Int {
        return (kenarSayisi - 2) * 180
    }

    // 2. Gün sayısına göre maaş hesaplama
    fun maasHesapla(gunSayisi: Int): Int {
        val toplamSaat = gunSayisi * 8
        return if (toplamSaat <= 160) {
            toplamSaat * 10
        } else {
            val mesaiSaat = toplamSaat - 160
            (160 * 10) + (mesaiSaat * 20)
        }
    }

    // 3. Kota miktarına göre ücret hesaplama
    fun kotaUcretiHesapla(kota: Int): Int {
        return if (kota <= 50) {
            100
        } else {
            val asim = kota - 50
            100 + (asim * 4)
        }
    }

    // 4. Dereceyi fahrenheit'a çevirme
    fun dereceToFahrenheit(c: Double): Double {
        return c * 1.8 + 32
    }

    // 5. Dikdörtgenin çevresi
    fun dikdortgenCevre(kisaKenar: Int, uzunKenar: Int): Int {
        return 2 * (kisaKenar + uzunKenar)
    }

    // 6. Faktöriyel hesaplama
    fun faktoriyelHesapla(sayi: Int): Int {
        var sonuc = 1
        for (i in 1..sayi) {
            sonuc *= i
        }
        return sonuc
    }

    // 7. Kelime içinde kaç tane "a" harfi var
    fun aHarfiSayisi(kelime: String): Int {
        return kelime.count { it == 'a' || it == 'A' }
    }
}

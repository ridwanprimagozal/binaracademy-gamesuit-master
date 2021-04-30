package pemain

var seri : String = "DRAW!"
var menangPlayerSatu: String ="Pemain 1 MENANG!"
var menangPlayerDua : String ="Pemain 2 MENANG!"
var isiUlang : String = "Silahkan Suit Ulang"

class SuitPemain() {



    fun aksiPemainSatu(pemainSatu: String) {

        if (pemainSatu.equals("Gunting",true)) {
            seri
        } else if (pemainSatu.equals("Gunting" ,true)){
            menangPlayerSatu
        } else if (pemainSatu.equals("Gunting", true)){
            menangPlayerDua
        }

    }

    fun aksiPemainDua(pemainDua: String) {

        if (pemainDua.equals("Gunting",true)) {
            hasilSuitDraw("Draw")
        } else if (pemainDua.equals("Kertas", true)){
            hasilSuitDraw("PemainSatuMenang")
        } else if (pemainDua.equals("Batu",true)){
            hasilSuitDraw("PemainDuaMenang")
        }
    }


    fun hasilSuitDraw(hasil:String) {

        when (hasil) {
            "Draw" -> {
                PemainSatuDuaDraw().pemainSatuDuaDraw()
            }
            "PemainSatuMenang" -> {
                PemainSatuMenang().pemainSatuMenang()
            }
            "PemainDuaMenang" -> {
                PemainDuaMenang().pemainDuaMenang()
            }
            else -> {
                println("tidak ada")
            }
        }
    }
}










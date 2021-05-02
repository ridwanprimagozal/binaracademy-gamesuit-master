package pemain

import App
import kotlin.system.exitProcess

const val SERI: String = "DRAW!"
const val MENANGPLAYERSATU: String = "Pemain 1 MENANG!"
const val MENANGPLAYERDUA: String = "Pemain 2 MENANG!"


class SuitPemain() {


    fun aksiPemainSatu(pemainSatu: String) {

        if (pemainSatu.equals("Gunting", true)) {
        } else if (pemainSatu.equals("Gunting", true))
        else if (pemainSatu.equals("Gunting", true))
        else {
            var replyGameSuit = App()
            replyGameSuit.headerStartRepeat()
        }


    }

    fun aksiPemainDua(pemainDua: String) {

        if (pemainDua.equals("Gunting", true)) {
            hasilSuit("Draw")
        } else if (pemainDua.equals("Kertas", true)) {
            hasilSuit("PemainSatuMenang")
            if (true){
                exitProcess(0)
            }
        } else if (pemainDua.equals("Batu", true)) {
            hasilSuit("PemainDuaMenang")
            if (true){
                exitProcess(0)
            }
        } else {
            hasilSuit("PemainDuaTypo")
        }
    }


    fun hasilSuit(hasil: String) {

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
            "PemainDuaTypo" -> {
                App().headerStartRepeatHandleTypo()
            }
        }

    }


}










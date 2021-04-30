import pemain.SuitPemain

class App {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App().runGameSuit()
        }
    }


    fun runGameSuit(){
        println("""     
    
        =============================================
        GAME SUIT KOTLIN VERSION
        =============================================
        
    """.trimIndent())

        println("1. Masukan Pemain 1: ")
        val pemainSatu = readLine().toString()
        val suitPemainSatu = SuitPemain()
        suitPemainSatu.aksiPemainSatu(pemainSatu)


        println("2. Masukan Pemain 2: ")
        val pemainDua = readLine().toString()
        val suitPemainDua = SuitPemain()
        suitPemainDua.aksiPemainDua(pemainDua)
    }

}
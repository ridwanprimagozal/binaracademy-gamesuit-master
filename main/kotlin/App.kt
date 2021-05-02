import pemain.SuitPemain

class App {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            App().headerStart()
        }
    }


    fun headerStart(){
        println("""     
    
        =============================================
        GAME SUIT KOTLIN VERSION
        =============================================
        
    """.trimIndent())

        runGameSuit()
    }

    fun headerStartRepeat(){
        println("""     
    
        Masukan Pemain 1 HARUS!!: Gunting 
        =============================================
        GAME SUIT KOTLIN VERSION
        =============================================
        
    """.trimIndent())

        runGameSuit()
    }

    fun headerStartRepeatHandleTypo(){
        println("""     
   
        Masukan Pemain 1 HARUS!!: Gunting 
        Masukan Pemain 2 HARUS!! diantara: Gunting, Batu, Kertas
        =============================================
        GAME SUIT KOTLIN VERSION
        =============================================
        
    """.trimIndent())

        runGameSuit()
    }


    fun runGameSuit(){


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
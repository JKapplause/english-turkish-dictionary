package com.info.sozlukuygulamadb

import java.io.Serializable

data class Kelimeler(var kelime_id:Int, var ingilizce:String, var turkce:String) : Serializable {
}
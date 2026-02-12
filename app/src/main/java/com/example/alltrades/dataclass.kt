package com.example.alltrades



data class TradeInfo(
    val imageRes : Int,
    val name : String,
    val date : String,
    val time : String,
    val description : String,
    val sell : Int,
    val buy : Int,
    val Loss : Int,
    val suggestion : String
)

fun getList() : List<TradeInfo>{
    return listOf<TradeInfo>(
        TradeInfo(R.drawable.ic_launcher_foreground,"Tata Steel","23-04-2023","09:15","I am a seasoned trader with over 10 years of experience in the financial msrkets. My expertise lies in analyzing market trends, identifying profitable trading opportunities, and executing trades with precision" ,
                200, 220, 20, " I am a seasoned trader with over 10 years of experience in the financial markets."),
        TradeInfo(R.drawable.ic_launcher_foreground,"Tata Steel","23-04-2023","09:15","I am a seasoned trader with over 10 years of experience in the financial msrkets. My expertise lies in analyzing market trends, identifying profitable trading opportunities, and executing trades with precision" ,
            200, 220, 20, " I am a seasoned trader with over 10 years of experience in the financial markets."),
        TradeInfo(R.drawable.ic_launcher_foreground,"Tata Steel","23-04-2023","09:15","I am a seasoned trader with over 10 years of experience in the financial msrkets. My expertise lies in analyzing market trends, identifying profitable trading opportunities, and executing trades with precision" ,
            200, 220, 20, " I am a seasoned trader with over 10 years of experience in the financial markets."),
        TradeInfo(R.drawable.ic_launcher_foreground,"Tata Steel","23-04-2023","09:15","I am a seasoned trader with over 10 years of experience in the financial msrkets. My expertise lies in analyzing market trends, identifying profitable trading opportunities, and executing trades with precision" ,
            200, 220, 20, " I am a seasoned trader with over 10 years of experience in the financial markets."),
        TradeInfo(R.drawable.ic_launcher_foreground,"Tata Steel","23-04-2023","09:15","I am a seasoned trader with over 10 years of experience in the financial msrkets. My expertise lies in analyzing market trends, identifying profitable trading opportunities, and executing trades with precision" ,
            200, 220, 20, " I am a seasoned trader with over 10 years of experience in the financial markets."),
        TradeInfo(R.drawable.ic_launcher_foreground,"Tata Steel","23-04-2023","09:15","I am a seasoned trader with over 10 years of experience in the financial msrkets. My expertise lies in analyzing market trends, identifying profitable trading opportunities, and executing trades with precision" ,
            200, 220, 20, " I am a seasoned trader with over 10 years of experience in the financial markets.")
    )
}
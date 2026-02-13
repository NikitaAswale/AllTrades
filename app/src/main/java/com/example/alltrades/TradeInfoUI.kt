package com.example.alltrades

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TradeInfoUI(){
     val display = getList()

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "")
            Spacer(modifier = Modifier.width(6.dp))
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "",
                Modifier.background(color = Color.Gray, shape = CircleShape).size(50.dp)
            )
            Column(modifier = Modifier.padding(12.dp)) {
                Text(
                    "Nikita Aswale",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = Color.Black
                )
                Text(
                    "@nikitaswale",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color(0xFF87CEEb)
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(imageVector = Icons.Default.Settings, contentDescription = "")
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            "All trades",
            fontStyle = FontStyle.Normal,
            textDecoration = TextDecoration.Underline,
            fontSize = 14.sp,
            color = Color.Black,
            fontWeight = FontWeight.Bold
        )

        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Row() {
                Row(
                    modifier = Modifier.padding(18.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(imageVector = Icons.Default.ShoppingCart, contentDescription = "")
                    Column(modifier = Modifier.padding(8.dp)) {
                        Text(
                            "200",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            color = Color.Black
                        )
                        Text(
                            "Trades",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Gray
                        )
                    }
                }
                Row(
                    modifier = Modifier.padding(18.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(imageVector = Icons.Default.Warning, contentDescription = "")
                    Column(modifier = Modifier.padding(8.dp)) {
                        Text(
                            "70%",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            color = Color.Black
                        )
                        Text(
                            "Profit",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Gray
                        )
                    }
                }
                Row(
                    modifier = Modifier.padding(18.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(imageVector = Icons.Default.ShoppingCart, contentDescription = "")
                    Column(modifier = Modifier.padding(8.dp)) {
                        Text(
                            "30%",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            color = Color.Black
                        )
                        Text(
                            "Lossless",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Gray
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        LazyColumn(content = {
            itemsIndexed(display, itemContent = { index, user ->
                ScreenUI(user = user)
            })
        })
    }
}

@Composable
fun ScreenUI(user: TradeInfo){
    Card(modifier = Modifier.fillMaxSize(),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(4.dp)) {
        Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
            Row(modifier = Modifier.padding(12.dp), horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically) {
                Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "",
                    Modifier.background(color = Color.Gray, shape = CircleShape).size(50.dp))

                Spacer(modifier = Modifier.width(12.dp))
                Text("Tata Steel",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black)

                Row(modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically) {

                    Text("23-04-2023",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray)

                    Spacer(modifier = Modifier.width(12.dp))

                    Text("09:15",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Normal,
                        color = Color.Gray)
                }
            }

            Text("Overtrading",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black)

            Spacer(modifier = Modifier.height(12.dp))

            Text("I am a seasoned trader with over 10 years of experience in the financial markets. My experties lies in analyzing market trends, identifying profitable trading opportunities, and executing trades with precision ",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray)

            Row(modifier = Modifier.fillMaxWidth().padding( 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically) {
                Text(
                    "Trade type",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                Spacer(modifier = Modifier.weight(1.0f))

                Button(onClick = {}, colors = ButtonDefaults.buttonColors(containerColor = Color.White),
                    border = BorderStroke(1.dp, color = Color.Gray)) {
                    Text("Long Trade",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color.Gray)
                }

            }

            Card(modifier = Modifier.fillMaxWidth().padding(16.dp),
                elevation = CardDefaults.cardElevation(4.dp),
                shape = RoundedCornerShape(16.dp),
                border = BorderStroke(2.dp, color = Color.Gray),
                colors = CardDefaults.cardColors(containerColor = Color.White)) {
                Row(modifier = Modifier.padding(16.dp).fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically) {
                    Column(modifier = Modifier,
                        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("Sell",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                        Text("200",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Gray
                        )
                    }
                    Column(modifier = Modifier,
                        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("Buy",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                        Text("220",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Gray
                        )
                    }
                    Column(modifier = Modifier,
                        verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                        Text("Loss",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                        Text("20",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Gray
                        )
                    }
                }
            }

            Text("Suggestion",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black)

            Spacer(modifier = Modifier.height(12.dp))

            Text("I am a seasoned trader with over 10 years of  experience in the financial markets.",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray)
        }
    }

    Spacer(modifier = Modifier.height(20.dp))
}
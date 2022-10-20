package com.example.birthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycard.ui.theme.BirthdayCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BirthdayWish(name = "Vicky", wish = "Many Many Happy And Healthy Returns Of The Day.\nStay Blessed!"
                        , from = "Aditya" )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun BirthdayWish(name:String,wish:String,from:String){
    Box() {
        val image= painterResource(id = R.drawable.androidparty)
        Image(painter = image, contentDescription = null, modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
        Column {
            Text(text = "Happy Birthday! $name", modifier = Modifier.padding(start = 25.dp, top = 16.dp).wrapContentHeight(align = Alignment.Top),
                color = Color.Black, fontSize = 26.sp , fontWeight = FontWeight.Bold)
            Text(text = wish, modifier = Modifier.padding(16.dp), color = Color.Black, fontStyle = FontStyle.Normal)
            Text(text = "From, $from", modifier = Modifier.padding(start = 234.dp).wrapContentWidth(align = Alignment.End)
                ,color = Color.Black, fontWeight = FontWeight.Bold, fontStyle = FontStyle.Italic)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BirthdayCardTheme {
        BirthdayWish(name = "Vicky", wish = "Many Many Happy And Healthy Returns Of The Day.\nStay Blessed!", from = "Ashish" )
    }
}
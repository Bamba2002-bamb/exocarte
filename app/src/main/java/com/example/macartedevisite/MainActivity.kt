package com.example.projet_mobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projet_mobile.ui.theme.ProjetMobileTheme
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjetMobileTheme {

                ShoppingCard()

            }
        }
    }



    @Composable
    fun ShoppingCard() {

        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                val imge1 = painterResource(R.drawable.android_logo)

                Image(
                    painter = imge1,
                    contentDescription = "ProfilePic",
                    modifier = Modifier.size(185.dp)
                )
                Spacer(modifier = Modifier.height(15.dp))

                Text(
                    text = "BAMBA MOHAMED MALICK",
                    fontSize = 22.sp, fontWeight = FontWeight.W500,
                    color = Color.DarkGray
                )
                // titre carte de visite
                Text (
                    text = "CARTE DE VISITE",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.W700

                )
            }
            Spacer(modifier = Modifier.height(50.dp))

            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(4.dp)
                )
                //icon telephone et text
                {
                    Icon(
                        imageVector = Icons.Default.Phone,
                        contentDescription = "tel",
                        modifier = Modifier.size(24.dp),

                        )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(text = "+255 0779526020 ",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.W500
                    )
                }
                Spacer(modifier = Modifier.height(15.dp))

                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(4.dp)

                )
                //icon personne et text
                {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "Nom",
                        modifier = Modifier.size(24.dp),
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text( text = "BAMBA MOHAMED MALICK", fontSize = 20.sp, fontWeight = FontWeight.W500)
                }

                Spacer(modifier = Modifier.height(15.dp))

                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(4.dp)
                )
                //icon email et text
                {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "Email",
                        modifier = Modifier.size(24.dp),
                    )

                    Spacer(modifier = Modifier.width(12.dp))
                    Text(text = "bambabamb2002@gmail.com", fontSize = 20.sp, fontWeight = FontWeight.W500)
                }
            }
        }
    }

    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun CardPreview() {
        ProjetMobileTheme {

            ShoppingCard()

        }
    }
}
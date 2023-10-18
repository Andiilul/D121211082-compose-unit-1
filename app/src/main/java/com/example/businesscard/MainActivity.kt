    package com.example.businesscard

    import android.os.Bundle
    import androidx.activity.ComponentActivity
    import androidx.activity.compose.setContent
    import androidx.compose.foundation.Image
    import androidx.compose.foundation.background
    import androidx.compose.foundation.layout.Arrangement
    import androidx.compose.foundation.layout.Box
    import androidx.compose.foundation.layout.Column
    import androidx.compose.foundation.layout.IntrinsicSize
    import androidx.compose.foundation.layout.Row
    import androidx.compose.foundation.layout.Spacer
    import androidx.compose.foundation.layout.fillMaxSize
    import androidx.compose.foundation.layout.fillMaxWidth
    import androidx.compose.foundation.layout.height
    import androidx.compose.foundation.layout.padding
    import androidx.compose.foundation.layout.width
    import androidx.compose.material3.MaterialTheme
    import androidx.compose.material3.Surface
    import androidx.compose.material3.Text
    import androidx.compose.runtime.Composable
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.graphics.Color
    import androidx.compose.ui.res.painterResource
    import androidx.compose.ui.text.font.FontWeight
    import androidx.compose.ui.text.style.TextAlign
    import androidx.compose.ui.tooling.preview.Preview
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.unit.sp
    import com.example.businesscard.ui.theme.BusinessCardTheme

    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                BusinessCardTheme {
                    // A surface container using the 'background' color from the theme
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                    ) {
                        Column {
                            BusinessCard("Andiilul Asyam", "Jr. Front-End Developer", "+62 853-4367-5435","@Andiilul","andiilul728@gmail.com")
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun BusinessCard(name: String, expertise: String, phoneText: String, shareText: String, mailText: String, modifier: Modifier = Modifier) {
        val image = painterResource(R.drawable.android_logo)
        val bgColor = Color(0xFF073042)
        val phoneBackgroundColor = Color(0xFFd2e8d4)
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = phoneBackgroundColor)
        ) {
            Column(
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally,

                modifier = Modifier
                    .fillMaxSize()
                    .padding(36 .dp)
            ) {

                //first Section
                Spacer(modifier = Modifier.height(8.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = image,
                            contentDescription = null,
                            modifier = Modifier
                                .width(100.dp)
                                .height(100.dp)
                                .background(bgColor)
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = name,
                            modifier = modifier,
                            fontSize = 38.sp,
                            fontWeight = FontWeight.Light
                        )
                        Text(
                            text = expertise,
                            modifier = modifier,
                            fontSize = 18.sp,
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold,
                            color = bgColor
                        )
                    }
                }


                //Second Section
                Column(
                    modifier = Modifier.padding(top = 16.dp)
                ) {
                    val phoneIcon = painterResource(R.drawable.phone_icon)
                    val shareIcon = painterResource(R.drawable.share_icon)
                    val mailIcon = painterResource(R.drawable.email_icon)
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = phoneIcon,
                            contentDescription = null,
                            modifier = Modifier
                                .height(22.dp)
                                .padding(end = 14.dp)
                        )
                        Text(
                            text = phoneText,
                            modifier = modifier,
                            fontSize = 14.sp
                        )
                    }
                    Spacer(modifier = Modifier.height(12.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = shareIcon,
                            contentDescription = null,
                            modifier = Modifier
                                .height(22.dp)
                                .padding(end = 14.dp)
                        )
                        Text(
                            text = shareText,
                            modifier = modifier,
                            fontSize = 14.sp
                        )
                    }
                    Spacer(modifier = Modifier.height(12.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = mailIcon,
                            contentDescription = null,
                            modifier = Modifier
                                .height(22.dp)
                                .padding(end = 14.dp)
                        )
                        Text(
                            text = mailText,
                            modifier = modifier,
                            fontSize = 14.sp
                        )
                    }
                }
            }
        }
    }


    @Preview(showBackground = true, showSystemUi = true)
    @Composable
    fun MyPreviews() {
        BusinessCardTheme {
            BusinessCard("Andiilul Asyam", "Jr. Front-End Developer", "+62 853-4367-5435","@Andiilul","andiilul728@gmail.com")
        }
    }

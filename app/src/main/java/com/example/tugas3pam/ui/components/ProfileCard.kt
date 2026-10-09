package com.example.tugas3pam.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.tugas3pam.R

@Composable
fun ProfileCard(
    name: String,
    alamat: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier,
    nim: String? = null,
    nameFontStyle: FontStyle = FontStyle.Normal,
    nameFontWeight: FontWeight = FontWeight.Bold,
    nameColor: Color = colorResource(R.color.card_text_white),
    nimColor: Color = colorResource(R.color.card_text_cyan),
    alamatColor: Color = colorResource(R.color.card_text_white),
    logoResId: Int = R.drawable.logo_umy
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = backgroundColor
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
}
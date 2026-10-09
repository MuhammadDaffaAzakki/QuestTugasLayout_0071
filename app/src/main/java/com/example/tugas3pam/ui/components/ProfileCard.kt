package com.example.tugas3pam.ui.components

import androidx.compose.runtime.Composable

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
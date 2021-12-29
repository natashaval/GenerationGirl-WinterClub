package com.example.generationgirl

import android.app.SearchManager
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class ProfileActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_profile)

    val buttonWebsite = findViewById<Button>(R.id.buttonWebsite)
    val buttonSearch = findViewById<Button>(R.id.buttonSearch)
    val buttonEmail = findViewById<Button>(R.id.buttonEmail)
    val buttonYoutube = findViewById<Button>(R.id.buttonYoutube)

    // https://developer.android.com/guide/components/intents-common#ViewUrl
    buttonWebsite.setOnClickListener {
      val url: Uri = Uri.parse("https://www.generationgirl.org/home-english")
      val webIntent = Intent(Intent.ACTION_VIEW, url)
      startActivity(webIntent)
    }

    // https://developer.android.com/guide/components/intents-common#SearchWeb
    buttonSearch.setOnClickListener {
      val searchIntent = Intent(Intent.ACTION_WEB_SEARCH)
      searchIntent.putExtra(SearchManager.QUERY, "Generation Girl")

      if (intent.resolveActivity(packageManager) != null) {
        startActivity(searchIntent)
      }
    }

    // https://developer.android.com/guide/components/intents-common#Email
    buttonEmail.setOnClickListener {
      val sendIntent = Intent(Intent.ACTION_SENDTO).apply {
        data = Uri.parse("mailto:")
        putExtra(Intent.EXTRA_EMAIL, arrayOf("contactus@generationgirl.org"))
        putExtra(Intent.EXTRA_SUBJECT, "Generation Girl Winter Club 2021")
        putExtra(Intent.EXTRA_TEXT,
          "Hi GenG team, I am very grateful that I have the opportunity to attend Winter Club 2021 :)")
      }
      if (intent.resolveActivity(packageManager) != null) {
        startActivity(sendIntent)
      } else {
        Log.e("MainActivity", "Failed to launch intent")
      }
    }

    // https://stackoverflow.com/questions/574195/android-youtube-app-play-video-intent
    buttonYoutube.setOnClickListener {
      val youtubeUrl = Uri.parse("vnd.youtube:" + "VzGtU7fQANQ")
      val webUrl: Uri = Uri.parse("https://www.youtube.com/channel/UCgt9vviOO8sNc72fnK57YXA/featured")
      try {
        startActivity(Intent(Intent.ACTION_VIEW, youtubeUrl))
      } catch (e: ActivityNotFoundException) {
        startActivity(Intent(Intent.ACTION_VIEW, webUrl))
      }
    }
  }
}
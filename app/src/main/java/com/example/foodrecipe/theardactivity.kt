package com.example.foodrecipe

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class theardactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_theardactivity)
        val imageView1: ImageView =findViewById(R.id.imageView1)
        val imageView2: ImageView =findViewById(R.id.imageView2)
        val imageView3: ImageView =findViewById(R.id.imageView3)
        val imageView4: ImageView =findViewById(R.id.imageView4)
        val imageView5: ImageView =findViewById(R.id.imageView5)
        val imageView6: ImageView =findViewById(R.id.imageView6)
        imageView1.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://recipes.timesofindia.com/recipes/pizza/rs56933159.cms")
            startActivity(intent)
        }

        imageView2.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.foodnetwork.com/how-to/packages/food-network-essentials/how-to-make-pasta")
            startActivity(intent)
        }

        imageView3.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.delish.com/cooking/recipe-ideas/g2972/chicken-weeknight-dinners/")
            startActivity(intent)
        }
        imageView4.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://natashaskitchen.com/perfect-burger-recipe/")
            startActivity(intent)
        }

        imageView5.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.allrecipes.com/recipe/106030/kofta-kebabs/")
            startActivity(intent)
        }
        imageView6.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://taste.co.za/recipes/chicken-and-paneer-butter-masala/")
            startActivity(intent)
        }
    }
}
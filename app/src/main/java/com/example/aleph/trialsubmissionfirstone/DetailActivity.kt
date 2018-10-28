package com.example.aleph.trialsubmissionfirstone

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_list.*
import kotlinx.android.synthetic.main.item_list.view.*
import org.jetbrains.anko.*

class DetailActivity : AppCompatActivity() {

    private var name: String = ""
    lateinit var nameTextView: TextView

    private var detail: String = ""
    lateinit var detailTextView: TextView

    private var image: Int = 0
    lateinit var imageViews: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = intent

        verticalLayout(){
            padding = dip(16)
            nameTextView = textView()
            detailTextView = textView()
            imageViews = imageView().lparams(width= matchParent)
            {
                padding = dip(20)
                margin = dip(15)
            }
        }


        name = intent.getStringExtra("name")
        nameTextView.text = name
        detail = intent.getStringExtra("detail")
        detailTextView.text = detail
        image = intent.getIntExtra("image", 0)
        imageViews.setImageResource(image)
    }
}

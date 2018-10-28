package com.example.aleph.trialsubmissionfirstone


import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity


class MainActivity : AppCompatActivity() {

    private var items: MutableList<Item> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()

        club_list.layoutManager = LinearLayoutManager(this)
        club_list.adapter = RecyclerViewAdapter(this, items){

            startActivity<DetailActivity>("name" to "${it.name}",
                "detail" to "${it.detail}", "image" to it.image)

//            val intent = Intent(this, DetailActivity::class.java)
//            intent.putExtra("name", "Dicoding")
//            startActivity(intent)
        }
    }

    private fun initData(){
        val name = resources.getStringArray(R.array.club_name)
        val image = resources.obtainTypedArray(R.array.club_image)
        val detail = resources.getStringArray(R.array.club_detail)
        items.clear()
        for (i in name.indices) {
            items.add(
                Item(
                    name[i],
                    image.getResourceId(i, 0),
                    detail[i]
                )
            )
        }

        //Recycle the typed array
        image.recycle()
    }
}

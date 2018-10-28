package com.example.aleph.trialsubmissionfirstone

import android.content.Context
import android.os.Parcelable
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import kotlinx.android.parcel.Parcelize
import kotlinx.android.synthetic.main.item_list.view.*

@Parcelize
data class Item (val name: String?, val image: Int?, val detail: String?): Parcelable


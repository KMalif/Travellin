package com.mohamad_rizal.travellin.models

import com.mohamad_rizal.travellin.R

object NearestData {

    private val tourName = arrayOf(
        "Off Road",
        "Penangkaran",
        "Gunung Slamet",
        "Bukit",
        "Beach",
        "Food hunt",
        "Semedo",
        "Historical",
        "Agro Tour",
        "Religion"
    )

    private val tourContent = arrayOf(
        "Adventures",
        "Eco Tourism",
        "Mountain",
        "Nature",
        "Beach",
        "Food hunt",
        "Edu Tour",
        "Historical",
        "Agro Tour",
        "Religion"
    )
    private val tourImage = arrayOf(
        R.drawable.adventure,
        R.drawable.ecotour,
        R.drawable.gunung,
        R.drawable.alam,
        R.drawable.pantai,
        R.drawable.food,
        R.drawable.museum,
        R.drawable.sejarah,
        R.drawable.pertanian,
        R.drawable.religi


    )

    val listTour : ArrayList<Nearest>
        get() {
            val list = arrayListOf<Nearest>()
            for (position in tourName.indices){
                val nearestTour = Nearest()
                nearestTour.tourImage = tourImage[position]
                nearestTour.tourName = tourName[position]
                nearestTour.tourContent = tourContent[position]
                list.add(nearestTour)
            }
            return list
        }

}
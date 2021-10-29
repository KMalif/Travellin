package com.mohamad_rizal.travellin.models

import com.mohamad_rizal.travellin.R

object CategoriesData {
    private val categoryName = arrayOf(
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

    private val categoryDesc = arrayOf(
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
    private val categoryImage = arrayOf(
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

    val listCategories : ArrayList<Categories>
        get() {
            val list = arrayListOf<Categories>()
            for (position in categoryName.indices){
                val categories = Categories()
                categories.categoriesName = categoryName[position]
                categories.categoriesDesc = categoryDesc[position]
                categories.categoriesImage = categoryImage[position]
                list.add(categories)
            }
            return list
        }

}
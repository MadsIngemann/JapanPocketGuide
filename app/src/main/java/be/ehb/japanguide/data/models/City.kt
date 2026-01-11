package be.ehb.japanguide.data.models

data class City(
    val id: String,
    val name: String,
    val tagline: String,
    val imageResId: Int,
    val intro: String,
    val topAttractionIds: List<String>
)

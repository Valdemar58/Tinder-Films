package com.example.tinderfilms.classes

class User(val id: String, val phoneNumber: Int, val name: String, val birth: String, val sex: Boolean, var showMe: Int){
    var school: String = ""
    var interestedIn: Array<String> = emptyArray()
    var photo: String = ""
    var about: String = ""


    fun updateShowMe(showMeNew: Int){
        showMe = showMeNew
    }
    fun updateSchool(schoolNew: String){
        school = schoolNew
    }
    fun updateInterestedIn(interestedInNew: Array<String>) {
        interestedIn = interestedInNew
    }
    fun updatePhoto(photoNew: String){
        photo = photoNew
    }
    fun updateAbout(aboutNew: String){
        about = aboutNew
    }

    /*fun getProfileInfo():MutableList{
        return mutableListOf(id)
    } */

}
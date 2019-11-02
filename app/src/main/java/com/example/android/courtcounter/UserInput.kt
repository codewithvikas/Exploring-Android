package com.example.android.courtcounter

import android.os.Parcel
import android.os.Parcelable

data class UserInput(val name:String,val roll_no:Int):Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readInt()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeInt(roll_no)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<UserInput> {
        override fun createFromParcel(parcel: Parcel): UserInput {
            return UserInput(parcel)
        }

        override fun newArray(size: Int): Array<UserInput?> {
            return arrayOfNulls(size)
        }
    }
}
package com.shaadi.test.shadditest;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.databinding.BaseObservable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Id extends BaseObservable implements Parcelable {

	@SerializedName("name")
	@Expose
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@SerializedName("value")
	@Expose
	private String value;

	protected Id(Parcel in) {
		name = in.readString();
		value = in.readString();
	}

	public static final Creator<Id> CREATOR = new Creator<Id>() {
		@Override
		public Id createFromParcel(Parcel in) {
			return new Id(in);
		}

		@Override
		public Id[] newArray(int size) {
			return new Id[size];
		}
	};

	public String getName(){
		return name;
	}

	public String getValue(){
		return value;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel parcel, int i) {
		parcel.writeString(name);
		parcel.writeString(value);
	}
}

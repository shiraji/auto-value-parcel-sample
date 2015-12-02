package com.github.shiraji.auto_value_parcel_sample;

import android.os.Parcelable;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class AutoValueParcelSample implements Parcelable {

    public abstract String bar();

    public abstract int foo();

    public static AutoValueParcelSample create(String bar, int foo) {
        return new AutoValue_AutoValueParcelSample(bar, foo);
    }
}

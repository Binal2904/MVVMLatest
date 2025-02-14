// Generated by view binder compiler. Do not edit!
package com.demo.advanced.daggerhilt.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.demo.advanced.daggerhilt.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutWeatherAdditionalInfoBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView tvHumidityLabel;

  @NonNull
  public final TextView tvHumidityValue;

  @NonNull
  public final ImageView tvPressureIcon;

  @NonNull
  public final TextView tvPressureLabel;

  @NonNull
  public final TextView tvPressureValue;

  @NonNull
  public final ImageView tvPressureVisibility;

  @NonNull
  public final TextView tvVisibilityLabel;

  @NonNull
  public final TextView tvVisibilityValue;

  private LayoutWeatherAdditionalInfoBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView imageView, @NonNull TextView tvHumidityLabel,
      @NonNull TextView tvHumidityValue, @NonNull ImageView tvPressureIcon,
      @NonNull TextView tvPressureLabel, @NonNull TextView tvPressureValue,
      @NonNull ImageView tvPressureVisibility, @NonNull TextView tvVisibilityLabel,
      @NonNull TextView tvVisibilityValue) {
    this.rootView = rootView;
    this.imageView = imageView;
    this.tvHumidityLabel = tvHumidityLabel;
    this.tvHumidityValue = tvHumidityValue;
    this.tvPressureIcon = tvPressureIcon;
    this.tvPressureLabel = tvPressureLabel;
    this.tvPressureValue = tvPressureValue;
    this.tvPressureVisibility = tvPressureVisibility;
    this.tvVisibilityLabel = tvVisibilityLabel;
    this.tvVisibilityValue = tvVisibilityValue;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutWeatherAdditionalInfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutWeatherAdditionalInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_weather_additional_info, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutWeatherAdditionalInfoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.tvHumidityLabel;
      TextView tvHumidityLabel = ViewBindings.findChildViewById(rootView, id);
      if (tvHumidityLabel == null) {
        break missingId;
      }

      id = R.id.tvHumidityValue;
      TextView tvHumidityValue = ViewBindings.findChildViewById(rootView, id);
      if (tvHumidityValue == null) {
        break missingId;
      }

      id = R.id.tvPressureIcon;
      ImageView tvPressureIcon = ViewBindings.findChildViewById(rootView, id);
      if (tvPressureIcon == null) {
        break missingId;
      }

      id = R.id.tvPressureLabel;
      TextView tvPressureLabel = ViewBindings.findChildViewById(rootView, id);
      if (tvPressureLabel == null) {
        break missingId;
      }

      id = R.id.tvPressureValue;
      TextView tvPressureValue = ViewBindings.findChildViewById(rootView, id);
      if (tvPressureValue == null) {
        break missingId;
      }

      id = R.id.tvPressureVisibility;
      ImageView tvPressureVisibility = ViewBindings.findChildViewById(rootView, id);
      if (tvPressureVisibility == null) {
        break missingId;
      }

      id = R.id.tvVisibilityLabel;
      TextView tvVisibilityLabel = ViewBindings.findChildViewById(rootView, id);
      if (tvVisibilityLabel == null) {
        break missingId;
      }

      id = R.id.tvVisibilityValue;
      TextView tvVisibilityValue = ViewBindings.findChildViewById(rootView, id);
      if (tvVisibilityValue == null) {
        break missingId;
      }

      return new LayoutWeatherAdditionalInfoBinding((ConstraintLayout) rootView, imageView,
          tvHumidityLabel, tvHumidityValue, tvPressureIcon, tvPressureLabel, tvPressureValue,
          tvPressureVisibility, tvVisibilityLabel, tvVisibilityValue);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

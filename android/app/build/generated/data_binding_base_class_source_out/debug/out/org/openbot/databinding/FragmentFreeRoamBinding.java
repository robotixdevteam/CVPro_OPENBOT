// Generated by view binder compiler. Do not edit!
package org.openbot.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.anastr.speedviewlib.SpeedView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.openbot.R;

public final class FragmentFreeRoamBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ProgressBar battery;

  @NonNull
  public final ConstraintLayout constraintLayout;

  @NonNull
  public final ControlButtonsBinding controllerContainer;

  @NonNull
  public final TextView driveGear;

  @NonNull
  public final ImageView indicatorLeft;

  @NonNull
  public final ImageView indicatorRight;

  @NonNull
  public final ProgressBar sonar;

  @NonNull
  public final TextView sonarInfo;

  @NonNull
  public final SpeedView speed;

  @NonNull
  public final ImageView steering;

  @NonNull
  public final CheckBox usbToggle;

  @NonNull
  public final TextView voltageInfo;

  private FragmentFreeRoamBinding(@NonNull ConstraintLayout rootView, @NonNull ProgressBar battery,
      @NonNull ConstraintLayout constraintLayout,
      @NonNull ControlButtonsBinding controllerContainer, @NonNull TextView driveGear,
      @NonNull ImageView indicatorLeft, @NonNull ImageView indicatorRight,
      @NonNull ProgressBar sonar, @NonNull TextView sonarInfo, @NonNull SpeedView speed,
      @NonNull ImageView steering, @NonNull CheckBox usbToggle, @NonNull TextView voltageInfo) {
    this.rootView = rootView;
    this.battery = battery;
    this.constraintLayout = constraintLayout;
    this.controllerContainer = controllerContainer;
    this.driveGear = driveGear;
    this.indicatorLeft = indicatorLeft;
    this.indicatorRight = indicatorRight;
    this.sonar = sonar;
    this.sonarInfo = sonarInfo;
    this.speed = speed;
    this.steering = steering;
    this.usbToggle = usbToggle;
    this.voltageInfo = voltageInfo;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFreeRoamBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFreeRoamBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_free_roam, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFreeRoamBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.battery;
      ProgressBar battery = ViewBindings.findChildViewById(rootView, id);
      if (battery == null) {
        break missingId;
      }

      ConstraintLayout constraintLayout = (ConstraintLayout) rootView;

      id = R.id.controllerContainer;
      View controllerContainer = ViewBindings.findChildViewById(rootView, id);
      if (controllerContainer == null) {
        break missingId;
      }
      ControlButtonsBinding binding_controllerContainer = ControlButtonsBinding.bind(controllerContainer);

      id = R.id.driveGear;
      TextView driveGear = ViewBindings.findChildViewById(rootView, id);
      if (driveGear == null) {
        break missingId;
      }

      id = R.id.indicatorLeft;
      ImageView indicatorLeft = ViewBindings.findChildViewById(rootView, id);
      if (indicatorLeft == null) {
        break missingId;
      }

      id = R.id.indicatorRight;
      ImageView indicatorRight = ViewBindings.findChildViewById(rootView, id);
      if (indicatorRight == null) {
        break missingId;
      }

      id = R.id.sonar;
      ProgressBar sonar = ViewBindings.findChildViewById(rootView, id);
      if (sonar == null) {
        break missingId;
      }

      id = R.id.sonar_info;
      TextView sonarInfo = ViewBindings.findChildViewById(rootView, id);
      if (sonarInfo == null) {
        break missingId;
      }

      id = R.id.speed;
      SpeedView speed = ViewBindings.findChildViewById(rootView, id);
      if (speed == null) {
        break missingId;
      }

      id = R.id.steering;
      ImageView steering = ViewBindings.findChildViewById(rootView, id);
      if (steering == null) {
        break missingId;
      }

      id = R.id.usbToggle;
      CheckBox usbToggle = ViewBindings.findChildViewById(rootView, id);
      if (usbToggle == null) {
        break missingId;
      }

      id = R.id.voltage_info;
      TextView voltageInfo = ViewBindings.findChildViewById(rootView, id);
      if (voltageInfo == null) {
        break missingId;
      }

      return new FragmentFreeRoamBinding((ConstraintLayout) rootView, battery, constraintLayout,
          binding_controllerContainer, driveGear, indicatorLeft, indicatorRight, sonar, sonarInfo,
          speed, steering, usbToggle, voltageInfo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

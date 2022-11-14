// Generated by view binder compiler. Do not edit!
package org.openbot.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.openbot.R;

public final class ControlButtonsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView controlInfo;

  @NonNull
  public final ImageButton controlMode;

  @NonNull
  public final TextView controlModeTitle;

  @NonNull
  public final ImageButton driveMode;

  @NonNull
  public final TextView driveModeTitle;

  @NonNull
  public final TextView speedInfo;

  @NonNull
  public final ImageButton speedMode;

  @NonNull
  public final TextView speedModeTitle;

  private ControlButtonsBinding(@NonNull ConstraintLayout rootView, @NonNull TextView controlInfo,
      @NonNull ImageButton controlMode, @NonNull TextView controlModeTitle,
      @NonNull ImageButton driveMode, @NonNull TextView driveModeTitle, @NonNull TextView speedInfo,
      @NonNull ImageButton speedMode, @NonNull TextView speedModeTitle) {
    this.rootView = rootView;
    this.controlInfo = controlInfo;
    this.controlMode = controlMode;
    this.controlModeTitle = controlModeTitle;
    this.driveMode = driveMode;
    this.driveModeTitle = driveModeTitle;
    this.speedInfo = speedInfo;
    this.speedMode = speedMode;
    this.speedModeTitle = speedModeTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ControlButtonsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ControlButtonsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.control_buttons, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ControlButtonsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.control_info;
      TextView controlInfo = ViewBindings.findChildViewById(rootView, id);
      if (controlInfo == null) {
        break missingId;
      }

      id = R.id.controlMode;
      ImageButton controlMode = ViewBindings.findChildViewById(rootView, id);
      if (controlMode == null) {
        break missingId;
      }

      id = R.id.controlModeTitle;
      TextView controlModeTitle = ViewBindings.findChildViewById(rootView, id);
      if (controlModeTitle == null) {
        break missingId;
      }

      id = R.id.driveMode;
      ImageButton driveMode = ViewBindings.findChildViewById(rootView, id);
      if (driveMode == null) {
        break missingId;
      }

      id = R.id.driveModeTitle;
      TextView driveModeTitle = ViewBindings.findChildViewById(rootView, id);
      if (driveModeTitle == null) {
        break missingId;
      }

      id = R.id.speed_info;
      TextView speedInfo = ViewBindings.findChildViewById(rootView, id);
      if (speedInfo == null) {
        break missingId;
      }

      id = R.id.speedMode;
      ImageButton speedMode = ViewBindings.findChildViewById(rootView, id);
      if (speedMode == null) {
        break missingId;
      }

      id = R.id.speedModeTitle;
      TextView speedModeTitle = ViewBindings.findChildViewById(rootView, id);
      if (speedModeTitle == null) {
        break missingId;
      }

      return new ControlButtonsBinding((ConstraintLayout) rootView, controlInfo, controlMode,
          controlModeTitle, driveMode, driveModeTitle, speedInfo, speedMode, speedModeTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

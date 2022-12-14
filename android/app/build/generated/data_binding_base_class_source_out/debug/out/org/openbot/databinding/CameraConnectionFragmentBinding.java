// Generated by view binder compiler. Do not edit!
package org.openbot.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.openbot.R;
import org.openbot.customview.AutoFitTextureView;
import org.openbot.customview.OverlayView;
import org.openbot.customview.RecognitionScoreView;

public final class CameraConnectionFragmentBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final OverlayView debugOverlay;

  @NonNull
  public final RecognitionScoreView results;

  @NonNull
  public final AutoFitTextureView texture;

  private CameraConnectionFragmentBinding(@NonNull RelativeLayout rootView,
      @NonNull OverlayView debugOverlay, @NonNull RecognitionScoreView results,
      @NonNull AutoFitTextureView texture) {
    this.rootView = rootView;
    this.debugOverlay = debugOverlay;
    this.results = results;
    this.texture = texture;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CameraConnectionFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CameraConnectionFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.camera_connection_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CameraConnectionFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.debug_overlay;
      OverlayView debugOverlay = ViewBindings.findChildViewById(rootView, id);
      if (debugOverlay == null) {
        break missingId;
      }

      id = R.id.results;
      RecognitionScoreView results = ViewBindings.findChildViewById(rootView, id);
      if (results == null) {
        break missingId;
      }

      id = R.id.texture;
      AutoFitTextureView texture = ViewBindings.findChildViewById(rootView, id);
      if (texture == null) {
        break missingId;
      }

      return new CameraConnectionFragmentBinding((RelativeLayout) rootView, debugOverlay, results,
          texture);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

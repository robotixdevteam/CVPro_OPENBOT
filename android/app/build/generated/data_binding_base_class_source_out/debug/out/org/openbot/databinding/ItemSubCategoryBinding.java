// Generated by view binder compiler. Do not edit!
package org.openbot.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.openbot.R;

public final class ItemSubCategoryBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ShapeableImageView image;

  @NonNull
  public final TextView title;

  private ItemSubCategoryBinding(@NonNull RelativeLayout rootView,
      @NonNull ShapeableImageView image, @NonNull TextView title) {
    this.rootView = rootView;
    this.image = image;
    this.title = title;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemSubCategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemSubCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_sub_category, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemSubCategoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.image;
      ShapeableImageView image = ViewBindings.findChildViewById(rootView, id);
      if (image == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new ItemSubCategoryBinding((RelativeLayout) rootView, image, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

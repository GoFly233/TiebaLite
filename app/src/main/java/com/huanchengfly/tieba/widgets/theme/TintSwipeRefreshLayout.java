package com.huanchengfly.tieba.widgets.theme;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.huanchengfly.theme.interfaces.Tintable;
import com.huanchengfly.theme.utils.ThemeUtils;
import com.huanchengfly.tieba.post.R;

public class TintSwipeRefreshLayout extends SwipeRefreshLayout implements Tintable {
    public TintSwipeRefreshLayout(@NonNull Context context) {
        this(context, null);
    }

    public TintSwipeRefreshLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        if (isInEditMode()) {
            return;
        }
        applyTintColor();
    }

    private void applyTintColor() {
        setColorSchemeColors(ThemeUtils.getColorByAttr(getContext(), R.attr.colorAccent));
        setProgressBackgroundColorSchemeColor(ThemeUtils.getColorByAttr(getContext(), R.attr.color_swipe_refresh_layout_background));
    }

    @Override
    public void tint() {
        applyTintColor();
    }
}

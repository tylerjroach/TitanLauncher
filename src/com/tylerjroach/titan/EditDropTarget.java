package com.tylerjroach.titan;

import android.content.Context;
import android.util.AttributeSet;

public class EditDropTarget extends ButtonDropTarget {

    public EditDropTarget(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public EditDropTarget(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        // Get the hover color
        mHoverColor = getResources().getColor(R.color.edit_target_hover_tint);

        setDrawable(R.drawable.ic_mode_edit_white_24dp);
    }

    public static boolean supportsDrop(Object info) {
        return (info instanceof ShortcutInfo)
            || (info instanceof AppInfo);
    }

    @Override
    protected boolean supportsDrop(DragSource source, Object info) {
        return source.supportsEditDropTarget() && supportsDrop(info);
    }

    @Override void completeDrop(final DragObject d) {

    }



    /**
     * Interface defining an object that can provide uninstallable drag objects.
     */
    public static interface EditSource {

    }
}

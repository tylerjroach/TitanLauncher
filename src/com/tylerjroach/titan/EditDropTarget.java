package com.tylerjroach.titan;

import android.content.ComponentName;
import android.content.Context;
import android.util.AttributeSet;
import com.tylerjroach.titan.compat.UserHandleCompat;

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

    public static void startEditFragment(Object info, Launcher launcher) {
        ComponentName componentName = null;
        if (info instanceof AppInfo) {
            componentName = ((AppInfo) info).componentName;
        } else if (info instanceof ShortcutInfo) {
            componentName = ((ShortcutInfo) info).intent.getComponent();
        } else if (info instanceof PendingAddItemInfo) {
            componentName = ((PendingAddItemInfo) info).componentName;
        }
        final UserHandleCompat user;
        if (info instanceof ItemInfo) {
            user = ((ItemInfo) info).user;
        } else {
            user = UserHandleCompat.myUserHandle();
        }

        if (componentName != null) {
            launcher.startApplicationEditFragment(componentName, user);
        }
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
        startEditFragment(d.dragInfo, mLauncher);
    }



    /**
     * Interface defining an object that can provide uninstallable drag objects.
     */
    public static interface EditSource {

    }
}

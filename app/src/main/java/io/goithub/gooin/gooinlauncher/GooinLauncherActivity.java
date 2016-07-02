package io.goithub.gooin.gooinlauncher;

import android.support.v4.app.Fragment;

public class GooinLauncherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return GooinLauncherFragment.newInstance();

    }


}

package net.tlalka.kts.example.view.extension

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

fun FragmentManager.safeCommit(@IdRes resId: Int, fragment: Fragment) {
    if (findFragmentByTag(fragment::class.java.name) == null) {
        beginTransaction()
            .add(resId, fragment, fragment::class.java.name)
            .commit()
    }
}

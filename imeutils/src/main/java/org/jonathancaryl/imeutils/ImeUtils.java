package org.jonathancaryl.imeutils;

import android.content.Context;
import android.os.ResultReceiver;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

/* Based on
 * https://github.com/nickbutcher/plaid/blob/master/app/src/main/java/io/plaidapp/util/ImeUtils.java
 */
public class ImeUtils {
    private final WeakReference<View> viewWeakReference;
    private final InputMethodManager inputMethodManager;

    private ImeUtils(@NonNull View view) {
        viewWeakReference = new WeakReference<>(view);
        inputMethodManager = (InputMethodManager)view.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
    }

    @NonNull
    public static ImeUtils from(@NonNull View view) {
        return new ImeUtils(view);
    }

    public ImeUtils showIme() {
        // the public methods don't seem to work for me, so… reflection.
        try {
            Method showSoftInputUnchecked = InputMethodManager.class.getMethod(
                    "showSoftInputUnchecked", int.class, ResultReceiver.class);
            showSoftInputUnchecked.setAccessible(true);
            showSoftInputUnchecked.invoke(inputMethodManager, 0, null);
        } catch (Exception e) {
            // ho hum
        }
        return this;
    }

    public ImeUtils hideIme() {
        final View view = viewWeakReference.get();
        if (view != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        return this;
    }
}

package org.shubhamLearning.Factory;

import org.shubhamLearning.VendorClasses.Light.Light;

public interface Factory {
    public abstract Object getObject(String str);
}

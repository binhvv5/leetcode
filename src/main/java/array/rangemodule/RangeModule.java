package main.java.array.rangemodule;

import java.util.ArrayList;

public class RangeModule {
    ArrayList<Integer> data = null;

    public RangeModule() {
        this.data = new ArrayList<>();
    }

    public void addRange(int left, int right) {
        for (int i = left; i < right; i++) {
            this.data.add(i);
        }
    }

    public boolean queryRange(int left, int right) {
        for (int i = left; i < right; i++) {
            if (!this.data.contains(i)) {
                return false;
            }
        }
        return true;
    }

    public void removeRange(int left, int right) {
        if (this.data.contains(left)) {
            for (int i = left; i <= right; i++) {
                int index = data.indexOf(i);
                this.data.remove(index);
            }
        }
    }
}

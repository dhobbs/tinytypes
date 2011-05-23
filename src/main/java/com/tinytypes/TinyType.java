package com.tinytypes;

public class TinyType<T> implements Comparable<TinyType<T>> {
    public final T value;

    public TinyType(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;

        if (!(o.getClass().equals(this.getClass()))) return false;

        TinyType that = (TinyType) o;

        return !(value != null ? !value.equals(that.value) : that.value != null);
    }


    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public int compareTo(TinyType<T> other) {
        if (other == null) return 0;
        if (!(other.getClass().equals(this.getClass()))) return 0;
        if (!(value instanceof Comparable)) {
            return 0;
        } else {
            return ((Comparable) value).compareTo(other.value);
        }
    }
}


import java.util.Objects;

public class Teapot {
    double volume;
    String color;

    public Teapot(double volume, String color) {
        this.volume = volume;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Teapot{" +
                "volume=" + volume +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teapot teapot = (Teapot) o;
        return Double.compare(volume, teapot.volume) == 0 && Objects.equals(color, teapot.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume, color);
    }
}

import java.util.Objects;
public class Counter {
    private int minValue;
    private int maxValue;
    private int count;

    public Counter() {
        this.minValue = 0;
        this.maxValue = 15;
        this.count = 0;
    }

    public Counter(int minValue, int maxValue, int count) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.count = count;

        if (minValue > maxValue) {
            int temp = this.maxValue;
            this.maxValue = this.minValue;
            this.minValue = temp;
        }

        if (this.count < this.minValue)
            this.count = this.minValue;
        if (this.count > this.maxValue)
            this.count = this.maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public  int showCounter() {
        return getCount();
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, maxValue, minValue);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Counter other = (Counter) obj;
        return count == other.count && maxValue == other.maxValue && minValue == other.minValue;
    }

    @Override
    public String toString() {
        return "Counter [minValue=" + minValue + ", maxValue=" + maxValue + ", count=" + count + "]";
    }
    public int increase(int minValue, int maxValue, int count) {
        count++;

        if (count > maxValue) {
            count = minValue;
        }
        return count;
    }
    public int decrease(int minValue, int maxValue, int count) {
        count--;
        if (count < minValue) {
            count = maxValue;
        }
        return count;
    }
    public void printСurrentСounterValue(String str, int currentValue) {
        System.out.println(str + currentValue);
    }
}

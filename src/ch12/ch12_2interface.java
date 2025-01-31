package src.ch12;

public interface ch12_2interface {
        abstract boolean isEven(int n);
}
class EvenCheck implements ch12_2interface {
        public boolean isEven(int n) {
                if (n%2 == 0)
                        return true;
                else
                        return false;
        }
}
